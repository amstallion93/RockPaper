/**
 *
 */
package com.rockpaper.core.platform.servicelayer.web;

import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.media.MediaSource;
import de.hybris.platform.servicelayer.media.MediaPermissionService;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.util.MediaUtil;
import de.hybris.platform.util.MediaUtil.SecureMediaURLRenderer;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.filter.GenericFilterBean;


/**
 * @author smarokky
 *
 */
public class RockPaperSecureMediaFilter extends GenericFilterBean
{
	private static final Logger LOG = Logger.getLogger(RockPaperSecureMediaFilter.class);
	private MediaPermissionService mediaPermissionService;
	private ModelService modelService;
	private UserService userService;
	private MediaService mediaService;
	private String secureMediaToken = "securemedias";


	/**
	 * @param request
	 * @param response
	 * @param chain
	 * @throws IOException
	 * @throws ServletException
	 */
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
			throws IOException, ServletException
	{
		if (request instanceof HttpServletRequest && response instanceof HttpServletResponse)
		{
			final HttpServletRequest httpRequest = (HttpServletRequest) request;
			final HttpServletResponse httpResponse = (HttpServletResponse) response;
			final String resourcePath = this.getResourcePath(httpRequest);

			try
			{
				this.setSecureURLRendererForThread(httpResponse);
				if (StringUtils.contains(resourcePath, this.secureMediaToken))
				{
					final String mediaPKStr = httpRequest.getParameter("mediaPK");

					MediaModel mediaModel;
					try
					{
						mediaModel = (MediaModel) this.modelService.get(PK.parse(mediaPKStr));
					}
					catch (final Exception arg12)
					{
						this.logMediaLookupError(mediaPKStr, arg12);
						httpResponse.sendError(404);
						return;
					}

					if (!this.isAccessGranted(mediaModel))
					{
						this.setForbiddenResponseStatus(httpResponse);
						if (LOG.isDebugEnabled())
						{
							LOG.debug("No access for the resource: " + resourcePath);
						}

						httpResponse.sendError(403);
					}
					else
					{
						final int mediaSize = mediaModel.getSize() == null ? 0 : mediaModel.getSize().intValue();
						httpResponse.setHeader("Content-Disposition", "attachment; filename=\"" + mediaModel.getRealFileName() + "\"");
						this.sendData(httpResponse, this.mediaService.getStreamFromMedia(mediaModel), mediaSize);
					}
				}
				else
				{
					chain.doFilter(request, response);
				}
			}
			finally
			{
				this.clearSecureURLRendererForThread();
			}
		}
		else
		{
			throw new ServletException("SecureMediaFilter just supports HTTP requests");
		}
	}

	protected void logMediaLookupError(final String mediaPKStr, final Exception e)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Invalid or outdated secure media pk " + mediaPKStr, e);
		}
		else
		{
			LOG.info("Invalid or outdated secure media pk");
		}

	}

	private void clearSecureURLRendererForThread()
	{
		MediaUtil.unsetCurrentSecureMediaURLRenderer();
	}

	private void setSecureURLRendererForThread(final HttpServletResponse httpResponse)
	{
		final String urlEncoded = httpResponse.encodeURL(this.secureMediaToken);
		MediaUtil.setCurrentSecureMediaURLRenderer(new SecureMediaURLRenderer()
		{
			public String renderSecureMediaURL(final MediaSource media)
			{
				return urlEncoded + "?mediaPK=" + media.getMediaPk();
			}
		});
	}

	/**
	 * @param httpResponse
	 * @param mediaStream
	 * @param length
	 * @throws IOException
	 */
	private void sendData(final HttpServletResponse httpResponse, final InputStream mediaStream, final int length)
			throws IOException
	{
		httpResponse.setContentLength(length);
		BufferedInputStream bis = null;

		try
		{
			bis = new BufferedInputStream(mediaStream);
			final ServletOutputStream out = httpResponse.getOutputStream();
			this.writeOutput(bis, out);
		}
		finally
		{
			if (bis != null)
			{
				bis.close();
			}

			if (mediaStream != null)
			{
				mediaStream.close();
			}

		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("MediaFile: " + mediaStream.toString() + " found and loaded");
		}

	}

	/**
	 * @param bis
	 * @param out
	 * @throws IOException
	 */
	private void writeOutput(final InputStream bis, final OutputStream out) throws IOException
	{
		final byte[] buffer = new byte[4096];
		final boolean read = false;

		int read1;
		while ((read1 = bis.read(buffer)) != -1)
		{
			out.write(buffer, 0, read1);
		}

		out.flush();
	}

	protected String getResourcePath(final HttpServletRequest httpRequest)
	{
		String resourcePath = httpRequest.getServletPath();
		if (resourcePath == null || resourcePath.trim().isEmpty())
		{
			final String reqURI = httpRequest.getRequestURI();
			final String ctxPath = httpRequest.getContextPath();
			resourcePath = reqURI.replace(ctxPath, "");
		}

		return resourcePath;
	}

	protected InputStream getResourceAsStream(final String resourceName)
	{
		return Media.class.getResourceAsStream(resourceName);
	}

	private void setForbiddenResponseStatus(final HttpServletResponse httpResponse)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Access forbidden for given media...");
		}

		httpResponse.setStatus(403);
	}

	private boolean isAccessGranted(final MediaModel mediaModel)
	{
		final boolean result = this.mediaPermissionService.isReadAccessGranted(mediaModel, this.userService.getCurrentUser());
		if (LOG.isDebugEnabled())
		{
			final String readAccessText = result ? " is granted to read the media" : " has NO read access for the media";
			LOG.debug("The Principal " + this.userService.getCurrentUser().getName() + readAccessText + mediaModel.getCode());
		}

		return result;
	}

	@Required
	public void setMediaPermissionService(final MediaPermissionService mediaPermissionService)
	{
		this.mediaPermissionService = mediaPermissionService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	@Required
	public void setMediaService(final MediaService mediaService)
	{
		this.mediaService = mediaService;
	}

	public void setSecureMediaToken(final String secureMediaToken)
	{
		if (StringUtils.isNotBlank(secureMediaToken))
		{
			this.secureMediaToken = secureMediaToken;
		}

	}
}
