/**
 *
 */
package com.rockpaper.facades.newproducts;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rockpaper.services.newproducts.NewProductsExtractService;


/**
 * @author smarokky
 *
 */
public class NewProductExtractFacade
{

	@Autowired
	private NewProductsExtractService newProductService;

	public List<ProductModel> getNewProducts()
	{
		return newProductService.getNewProducts();

	}

}
