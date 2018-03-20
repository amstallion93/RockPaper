/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 27, 2018 12:37:18 PM                    ---
 * ----------------------------------------------------------------
 */
package com.rockpaper.core.jalo;

import com.rockpaper.core.constants.RockPaperCoreConstants;
import com.rockpaper.core.jalo.ApparelProduct;
import com.rockpaper.core.jalo.ApparelSizeVariantProduct;
import com.rockpaper.core.jalo.ApparelStyleVariantProduct;
import com.rockpaper.core.jalo.ElectronicsColorVariantProduct;
import com.rockpaper.core.jalo.actions.WishlistAction;
import com.rockpaper.core.jalo.components.WishlistComponent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>RockPaperCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRockPaperCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("salesType", AttributeMode.INITIAL);
		tmp.put("productMinSalesQuantity", AttributeMode.INITIAL);
		tmp.put("productLine", AttributeMode.INITIAL);
		tmp.put("newProductIndicator", AttributeMode.INITIAL);
		tmp.put("productState", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RockPaperCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RockPaperCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RockPaperCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RockPaperCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public WishlistAction createWishlistAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RockPaperCoreConstants.TC.WISHLISTACTION );
			return (WishlistAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating WishlistAction : "+e.getMessage(), 0 );
		}
	}
	
	public WishlistAction createWishlistAction(final Map attributeValues)
	{
		return createWishlistAction( getSession().getSessionContext(), attributeValues );
	}
	
	public WishlistComponent createWishlistComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RockPaperCoreConstants.TC.WISHLISTCOMPONENT );
			return (WishlistComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating WishlistComponent : "+e.getMessage(), 0 );
		}
	}
	
	public WishlistComponent createWishlistComponent(final Map attributeValues)
	{
		return createWishlistComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return RockPaperCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProductIndicator</code> attribute.
	 * @return the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public Boolean isNewProductIndicator(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.isNewProductIndicator requires a session language", 0 );
		}
		return (Boolean)item.getLocalizedProperty( ctx, RockPaperCoreConstants.Attributes.Product.NEWPRODUCTINDICATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProductIndicator</code> attribute.
	 * @return the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public Boolean isNewProductIndicator(final Product item)
	{
		return isNewProductIndicator( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProductIndicator</code> attribute. 
	 * @return the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public boolean isNewProductIndicatorAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isNewProductIndicator( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProductIndicator</code> attribute. 
	 * @return the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public boolean isNewProductIndicatorAsPrimitive(final Product item)
	{
		return isNewProductIndicatorAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProductIndicator</code> attribute. 
	 * @return the localized newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public Map<Language,Boolean> getAllNewProductIndicator(final SessionContext ctx, final Product item)
	{
		return (Map<Language,Boolean>)item.getAllLocalizedProperties(ctx,RockPaperCoreConstants.Attributes.Product.NEWPRODUCTINDICATOR,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.newProductIndicator</code> attribute. 
	 * @return the localized newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public Map<Language,Boolean> getAllNewProductIndicator(final Product item)
	{
		return getAllNewProductIndicator( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProductIndicator</code> attribute. 
	 * @param value the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public void setNewProductIndicator(final SessionContext ctx, final Product item, final Boolean value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setNewProductIndicator requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, RockPaperCoreConstants.Attributes.Product.NEWPRODUCTINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProductIndicator</code> attribute. 
	 * @param value the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public void setNewProductIndicator(final Product item, final Boolean value)
	{
		setNewProductIndicator( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProductIndicator</code> attribute. 
	 * @param value the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public void setNewProductIndicator(final SessionContext ctx, final Product item, final boolean value)
	{
		setNewProductIndicator( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProductIndicator</code> attribute. 
	 * @param value the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public void setNewProductIndicator(final Product item, final boolean value)
	{
		setNewProductIndicator( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProductIndicator</code> attribute. 
	 * @param value the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public void setAllNewProductIndicator(final SessionContext ctx, final Product item, final Map<Language,Boolean> value)
	{
		item.setAllLocalizedProperties(ctx,RockPaperCoreConstants.Attributes.Product.NEWPRODUCTINDICATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.newProductIndicator</code> attribute. 
	 * @param value the newProductIndicator - The indicator to distinguish new products without a workflow
	 */
	public void setAllNewProductIndicator(final Product item, final Map<Language,Boolean> value)
	{
		setAllNewProductIndicator( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productLine</code> attribute.
	 * @return the productLine - The product line of product
	 */
	public Integer getProductLine(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getProductLine requires a session language", 0 );
		}
		return (Integer)item.getLocalizedProperty( ctx, RockPaperCoreConstants.Attributes.Product.PRODUCTLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productLine</code> attribute.
	 * @return the productLine - The product line of product
	 */
	public Integer getProductLine(final Product item)
	{
		return getProductLine( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productLine</code> attribute. 
	 * @return the productLine - The product line of product
	 */
	public int getProductLineAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getProductLine( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productLine</code> attribute. 
	 * @return the productLine - The product line of product
	 */
	public int getProductLineAsPrimitive(final Product item)
	{
		return getProductLineAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productLine</code> attribute. 
	 * @return the localized productLine - The product line of product
	 */
	public Map<Language,Integer> getAllProductLine(final SessionContext ctx, final Product item)
	{
		return (Map<Language,Integer>)item.getAllLocalizedProperties(ctx,RockPaperCoreConstants.Attributes.Product.PRODUCTLINE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productLine</code> attribute. 
	 * @return the localized productLine - The product line of product
	 */
	public Map<Language,Integer> getAllProductLine(final Product item)
	{
		return getAllProductLine( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productLine</code> attribute. 
	 * @param value the productLine - The product line of product
	 */
	public void setProductLine(final SessionContext ctx, final Product item, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setProductLine requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, RockPaperCoreConstants.Attributes.Product.PRODUCTLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productLine</code> attribute. 
	 * @param value the productLine - The product line of product
	 */
	public void setProductLine(final Product item, final Integer value)
	{
		setProductLine( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productLine</code> attribute. 
	 * @param value the productLine - The product line of product
	 */
	public void setProductLine(final SessionContext ctx, final Product item, final int value)
	{
		setProductLine( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productLine</code> attribute. 
	 * @param value the productLine - The product line of product
	 */
	public void setProductLine(final Product item, final int value)
	{
		setProductLine( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productLine</code> attribute. 
	 * @param value the productLine - The product line of product
	 */
	public void setAllProductLine(final SessionContext ctx, final Product item, final Map<Language,Integer> value)
	{
		item.setAllLocalizedProperties(ctx,RockPaperCoreConstants.Attributes.Product.PRODUCTLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productLine</code> attribute. 
	 * @param value the productLine - The product line of product
	 */
	public void setAllProductLine(final Product item, final Map<Language,Integer> value)
	{
		setAllProductLine( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productMinSalesQuantity</code> attribute.
	 * @return the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public Integer getProductMinSalesQuantity(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getProductMinSalesQuantity requires a session language", 0 );
		}
		return (Integer)item.getLocalizedProperty( ctx, RockPaperCoreConstants.Attributes.Product.PRODUCTMINSALESQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productMinSalesQuantity</code> attribute.
	 * @return the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public Integer getProductMinSalesQuantity(final Product item)
	{
		return getProductMinSalesQuantity( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @return the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public int getProductMinSalesQuantityAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getProductMinSalesQuantity( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @return the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public int getProductMinSalesQuantityAsPrimitive(final Product item)
	{
		return getProductMinSalesQuantityAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @return the localized productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public Map<Language,Integer> getAllProductMinSalesQuantity(final SessionContext ctx, final Product item)
	{
		return (Map<Language,Integer>)item.getAllLocalizedProperties(ctx,RockPaperCoreConstants.Attributes.Product.PRODUCTMINSALESQUANTITY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @return the localized productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public Map<Language,Integer> getAllProductMinSalesQuantity(final Product item)
	{
		return getAllProductMinSalesQuantity( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @param value the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public void setProductMinSalesQuantity(final SessionContext ctx, final Product item, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setProductMinSalesQuantity requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, RockPaperCoreConstants.Attributes.Product.PRODUCTMINSALESQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @param value the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public void setProductMinSalesQuantity(final Product item, final Integer value)
	{
		setProductMinSalesQuantity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @param value the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public void setProductMinSalesQuantity(final SessionContext ctx, final Product item, final int value)
	{
		setProductMinSalesQuantity( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @param value the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public void setProductMinSalesQuantity(final Product item, final int value)
	{
		setProductMinSalesQuantity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @param value the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public void setAllProductMinSalesQuantity(final SessionContext ctx, final Product item, final Map<Language,Integer> value)
	{
		item.setAllLocalizedProperties(ctx,RockPaperCoreConstants.Attributes.Product.PRODUCTMINSALESQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productMinSalesQuantity</code> attribute. 
	 * @param value the productMinSalesQuantity - The Minimum sales quantity of the product
	 */
	public void setAllProductMinSalesQuantity(final Product item, final Map<Language,Integer> value)
	{
		setAllProductMinSalesQuantity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productState</code> attribute.
	 * @return the productState - The current state of the product
	 */
	public EnumerationValue getProductState(final SessionContext ctx, final Product item)
	{
		return (EnumerationValue)item.getProperty( ctx, RockPaperCoreConstants.Attributes.Product.PRODUCTSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productState</code> attribute.
	 * @return the productState - The current state of the product
	 */
	public EnumerationValue getProductState(final Product item)
	{
		return getProductState( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productState</code> attribute. 
	 * @param value the productState - The current state of the product
	 */
	public void setProductState(final SessionContext ctx, final Product item, final EnumerationValue value)
	{
		item.setProperty(ctx, RockPaperCoreConstants.Attributes.Product.PRODUCTSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productState</code> attribute. 
	 * @param value the productState - The current state of the product
	 */
	public void setProductState(final Product item, final EnumerationValue value)
	{
		setProductState( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.salesType</code> attribute.
	 * @return the salesType - The sales type of the product
	 */
	public EnumerationValue getSalesType(final SessionContext ctx, final Product item)
	{
		return (EnumerationValue)item.getProperty( ctx, RockPaperCoreConstants.Attributes.Product.SALESTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.salesType</code> attribute.
	 * @return the salesType - The sales type of the product
	 */
	public EnumerationValue getSalesType(final Product item)
	{
		return getSalesType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.salesType</code> attribute. 
	 * @param value the salesType - The sales type of the product
	 */
	public void setSalesType(final SessionContext ctx, final Product item, final EnumerationValue value)
	{
		item.setProperty(ctx, RockPaperCoreConstants.Attributes.Product.SALESTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.salesType</code> attribute. 
	 * @param value the salesType - The sales type of the product
	 */
	public void setSalesType(final Product item, final EnumerationValue value)
	{
		setSalesType( getSession().getSessionContext(), item, value );
	}
	
}
