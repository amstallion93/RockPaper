package com.rockpaper.storefront.controllers.misc;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.AbstractController;
import de.hybris.platform.cms2.servicelayer.services.CMSComponentService;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rockpaper.facades.User.CustomUserFacade;
import com.rockpaper.facades.wishlist.WishlistFacade;


/*
   @author smarokky

  */
@Controller
public class WishlistController extends AbstractController
{

	@Resource(name = "WishlistFacade")
	private WishlistFacade wishlistFacade;

	@Resource(name = "customUserFacade")
	private CustomUserFacade userFacade;

	@Resource(name = "cmsComponentService")
	private CMSComponentService cmsComponentService;

	private final Logger LOG = Logger.getLogger("WishlistController.class");

	@RequestMapping(value = "/wishlist/process", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<ProductData> getWishlistComponent(@RequestParam("productCodePost") final String code)
	{
		LOG.info("Post method wishlist controller");
		LOG.info("Code is" + code);
		return wishlistFacade.processWishlist(code);
	}

	@RequestMapping(value = "/wishlist/processcode", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<ProductData> postWishlistComponent(@RequestBody final String code)
	{
		LOG.info("Post method wishlist controller");
		LOG.info("Code is" + code);
		return wishlistFacade.processWishlist(code);
	}

	@RequestMapping(value = "/wishlist/getProducts", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<ProductData> getProducts()
	{
		return wishlistFacade.getProductsForUser();
	}

}
