/**
 *
 */

package com.rockpaper.storefront.controllers.cms;

import de.hybris.platform.cms2.servicelayer.services.CMSComponentService;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rockpaper.core.model.components.WishlistComponentModel;
import com.rockpaper.facades.User.CustomUserFacade;
import com.rockpaper.facades.wishlist.WishlistFacade;
import com.rockpaper.storefront.controllers.ControllerConstants;


/**
 * @author smarokky
 *
 */
@Controller("WishlistComponentController")

@RequestMapping(value = ControllerConstants.Actions.Cms.WishlistComponent)
public class WishlistComponentController extends AbstractAcceleratorCMSComponentController<WishlistComponentModel>
{

	@Resource(name = "WishlistFacade")
	private WishlistFacade wishlistFacade;

	@Resource(name = "cmsComponentService")
	private CMSComponentService cmsComponentService;

	@Resource(name = "customUserFacade")
	private CustomUserFacade userfacade;

	private final Logger LOG = Logger.getLogger("WishlistComponentController.class");

	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final WishlistComponentModel component)
	{
		LOG.info("Component controller fill model");
		LOG.info("--name" + component.getName());

		final List<ProductData> products = new ArrayList<>();


		final boolean anonymousUser = userfacade.isUserAnonymous();
		if (anonymousUser)
		{
			products.addAll(collectDefaultProducts());
		}
		else
		{
			products.addAll(collectLinkedProducts());
		}
		model.addAttribute("name", component.getName());
		model.addAttribute("productData", products);

	}

	/**
	 * @return
	 */
	private Collection<? extends ProductData> collectLinkedProducts()
	{
		return wishlistFacade.getProductsForUser();
	}

	private Collection<? extends ProductData> collectDefaultProducts()
	{
		return wishlistFacade.getDefaultProducts();
	}

}
