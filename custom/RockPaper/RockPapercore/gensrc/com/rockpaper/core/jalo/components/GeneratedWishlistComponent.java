/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 20, 2018 3:00:21 PM                     ---
 * ----------------------------------------------------------------
 */
package com.rockpaper.core.jalo.components;

import com.rockpaper.core.constants.RockPaperCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.rockpaper.core.jalo.components.WishlistComponent WishlistComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedWishlistComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>WishlistComponent.isPresent</code> attribute **/
	public static final String ISPRESENT = "isPresent";
	/** Qualifier of the <code>WishlistComponent.wishlistProduct</code> attribute **/
	public static final String WISHLISTPRODUCT = "wishlistProduct";
	/** Qualifier of the <code>WishlistComponent.wishlistUser</code> attribute **/
	public static final String WISHLISTUSER = "wishlistUser";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ISPRESENT, AttributeMode.INITIAL);
		tmp.put(WISHLISTPRODUCT, AttributeMode.INITIAL);
		tmp.put(WISHLISTUSER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.isPresent</code> attribute.
	 * @return the isPresent - It is used to check if the product is present in wishlist.
	 */
	public Boolean isIsPresent(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedWishlistComponent.isIsPresent requires a session language", 0 );
		}
		return (Boolean)getLocalizedProperty( ctx, ISPRESENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.isPresent</code> attribute.
	 * @return the isPresent - It is used to check if the product is present in wishlist.
	 */
	public Boolean isIsPresent()
	{
		return isIsPresent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @return the isPresent - It is used to check if the product is present in wishlist.
	 */
	public boolean isIsPresentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsPresent( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @return the isPresent - It is used to check if the product is present in wishlist.
	 */
	public boolean isIsPresentAsPrimitive()
	{
		return isIsPresentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @return the localized isPresent - It is used to check if the product is present in wishlist.
	 */
	public Map<Language,Boolean> getAllIsPresent(final SessionContext ctx)
	{
		return (Map<Language,Boolean>)getAllLocalizedProperties(ctx,ISPRESENT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @return the localized isPresent - It is used to check if the product is present in wishlist.
	 */
	public Map<Language,Boolean> getAllIsPresent()
	{
		return getAllIsPresent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @param value the isPresent - It is used to check if the product is present in wishlist.
	 */
	public void setIsPresent(final SessionContext ctx, final Boolean value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedWishlistComponent.setIsPresent requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ISPRESENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @param value the isPresent - It is used to check if the product is present in wishlist.
	 */
	public void setIsPresent(final Boolean value)
	{
		setIsPresent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @param value the isPresent - It is used to check if the product is present in wishlist.
	 */
	public void setIsPresent(final SessionContext ctx, final boolean value)
	{
		setIsPresent( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @param value the isPresent - It is used to check if the product is present in wishlist.
	 */
	public void setIsPresent(final boolean value)
	{
		setIsPresent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @param value the isPresent - It is used to check if the product is present in wishlist.
	 */
	public void setAllIsPresent(final SessionContext ctx, final Map<Language,Boolean> value)
	{
		setAllLocalizedProperties(ctx,ISPRESENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.isPresent</code> attribute. 
	 * @param value the isPresent - It is used to check if the product is present in wishlist.
	 */
	public void setAllIsPresent(final Map<Language,Boolean> value)
	{
		setAllIsPresent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.wishlistProduct</code> attribute.
	 * @return the wishlistProduct
	 */
	public List<Product> getWishlistProduct(final SessionContext ctx)
	{
		List<Product> coll = (List<Product>)getProperty( ctx, WISHLISTPRODUCT);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.wishlistProduct</code> attribute.
	 * @return the wishlistProduct
	 */
	public List<Product> getWishlistProduct()
	{
		return getWishlistProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.wishlistProduct</code> attribute. 
	 * @param value the wishlistProduct
	 */
	public void setWishlistProduct(final SessionContext ctx, final List<Product> value)
	{
		setProperty(ctx, WISHLISTPRODUCT,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.wishlistProduct</code> attribute. 
	 * @param value the wishlistProduct
	 */
	public void setWishlistProduct(final List<Product> value)
	{
		setWishlistProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.wishlistUser</code> attribute.
	 * @return the wishlistUser
	 */
	public User getWishlistUser(final SessionContext ctx)
	{
		return (User)getProperty( ctx, WISHLISTUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WishlistComponent.wishlistUser</code> attribute.
	 * @return the wishlistUser
	 */
	public User getWishlistUser()
	{
		return getWishlistUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.wishlistUser</code> attribute. 
	 * @param value the wishlistUser
	 */
	public void setWishlistUser(final SessionContext ctx, final User value)
	{
		setProperty(ctx, WISHLISTUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WishlistComponent.wishlistUser</code> attribute. 
	 * @param value the wishlistUser
	 */
	public void setWishlistUser(final User value)
	{
		setWishlistUser( getSession().getSessionContext(), value );
	}
	
}
