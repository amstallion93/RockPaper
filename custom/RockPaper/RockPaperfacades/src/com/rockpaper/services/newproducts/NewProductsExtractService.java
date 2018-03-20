/**
 *
 */
package com.rockpaper.services.newproducts;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.rockpaper.dao.newproducts.NewProductsExtractDao;


/**
 * @author smarokky
 *
 */
public class NewProductsExtractService
{
	private static final Logger LOG = Logger.getLogger(NewProductsExtractService.class);


	private SearchResult<ProductModel> searchResult;


	private ProductModel productModel;

	@Autowired
	private NewProductsExtractDao productsDao;

	public List<ProductModel> getNewProducts()
	{
		List<ProductModel> productList = null;
		final String queryString = "SELECT {P.PK} FROM {Product as P} where {P.newProductIndicator}='TRUE'";
		searchResult = productsDao.executeQuery(queryString);
		if (searchResult != null)
		{
			productList = searchResult.getResult();
		}
		else
		{
			LOG.warn("No new Products found");
		}
		return productList;
	}
}
