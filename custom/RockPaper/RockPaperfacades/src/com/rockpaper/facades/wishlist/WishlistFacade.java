/**
 *
 */
package com.rockpaper.facades.wishlist;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.wishlist2.Wishlist2Service;
import de.hybris.platform.wishlist2.enums.Wishlist2EntryPriority;
import de.hybris.platform.wishlist2.model.Wishlist2EntryModel;
import de.hybris.platform.wishlist2.model.Wishlist2Model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author smarokky
 *
 */
@Component("WishlistFacade")
public class WishlistFacade
{
	@Autowired
	private Wishlist2Service wishlistService;

	@Autowired
	private ProductService productService;

	@Autowired
	private UserService userService;

	@Autowired
	private ModelService modelService;

	private Converter<ProductModel, ProductData> productConverter;

	private static final Logger LOG = Logger.getLogger(WishlistFacade.class);

	/**
	 * @return the productConverter
	 */
	public Converter<ProductModel, ProductData> getProductConverter()
	{
		return productConverter;
	}

	/**
	 * @param productConverter
	 *           the productConverter to set
	 */
	public void setProductConverter(final Converter<ProductModel, ProductData> productConverter)
	{
		this.productConverter = productConverter;
	}

	public List<ProductData> getProductsForUser()
	{

		LOG.info("Facade get products method");
		final UserModel userModel = userService.getCurrentUser();
		if (noWishlistExists(userModel))
		{
			createWishlist(userModel);
		}
		final Wishlist2Model wishlistModel = wishlistService.getDefaultWishlist(userModel);
		final List<Wishlist2EntryModel> wishlistEntry = wishlistModel.getEntries();
		final List<ProductModel> productList = new ArrayList<ProductModel>();
		for (final Wishlist2EntryModel entryModel : wishlistEntry)
		{
			productList.add(entryModel.getProduct());
		}
		return Converters.convertAll(productList, getProductConverter());
	}


	public List<ProductData> processWishlist(final String productCode)
	{

		LOG.info("Facade process wishlist method");
		final UserModel userModel = userService.getCurrentUser();
		if (noWishlistExists(userModel))
		{
			createWishlist(userModel);
		}
		final Wishlist2Model wishlistModel = wishlistService.getDefaultWishlist(userModel);
		final List<Wishlist2EntryModel> wishlistEntry = wishlistModel.getEntries();
		final ProductModel productModel = productService.getProductForCode(productCode);
		final boolean productPresentInWishlist = checkProductInWishlist(wishlistEntry, productModel);
		if (!productPresentInWishlist)
		{
			addProductToWishlist(wishlistModel, productModel);
		}
		else
		{
			removeProductFromWishlist(wishlistModel, productModel);
		}
		modelService.save(wishlistModel);
		return getProductsForUser();
	}

	/**
	 * @param wishlistModel
	 * @param productModel
	 */
	private void addProductToWishlist(final Wishlist2Model wishlistModel, final ProductModel productModel)
	{
		// YTODO Auto-generated method stub
		wishlistService.addWishlistEntry(productModel, new Integer(1), Wishlist2EntryPriority.MEDIUM, "Add product to wishlist");
	}

	/**
	 * @param wishlistModel
	 * @param productModel
	 */
	private void removeProductFromWishlist(final Wishlist2Model wishlistModel, final ProductModel productModel)
	{
		wishlistService.removeWishlistEntryForProduct(productModel, wishlistModel);
	}

	/**
	 * @param wishlistEntry
	 * @param productModel
	 * @return
	 */
	private boolean checkProductInWishlist(final List<Wishlist2EntryModel> wishlistEntry, final ProductModel productModel)
	{
		if (wishlistEntry == null)
		{
			return false;
		}
		for (final Wishlist2EntryModel entryModel : wishlistEntry)
		{
			if (entryModel.getProduct().getCode().equals(productModel.getCode()))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * @return
	 */
	public List<ProductData> getDefaultProducts()
	{
		// YTODO Auto-generated method stub
		LOG.info("Facade default products method");
		final List<ProductModel> productList = new ArrayList<ProductModel>();
		final ProductModel product = productService.getProductForCode("0001");
		if (product != null)
		{
			LOG.info("Product Name------------>" + product.getName());
			productList.add(product);
		}
		return Converters.convertAll(productList, getProductConverter());
	}


	/**
	 * @param userModel
	 */
	private void createWishlist(final UserModel userModel)
	{
		// YTODO Auto-generated method stub
		wishlistService.createDefaultWishlist(userModel, "Default Wishlist of user" + userModel.getName(), "The default Wishlist");
	}

	/**
	 * @return
	 */
	private boolean noWishlistExists(final UserModel userModel)
	{
		// YTODO Auto-generated method stub
		if (wishlistService.getDefaultWishlist(userModel) == null)
		{
			return true;
		}
		return false;
	}
}
