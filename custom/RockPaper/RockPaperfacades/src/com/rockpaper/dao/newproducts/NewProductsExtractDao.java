/**
 *
 */
package com.rockpaper.dao.newproducts;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author smarokky
 *
 */
public class NewProductsExtractDao
{
	@Autowired
	private FlexibleSearchService flexibleSearch;


	private SearchResult searchResult;

	public SearchResult executeQuery(final String queryString)
	{

		return flexibleSearch.search(queryString);
	}
}