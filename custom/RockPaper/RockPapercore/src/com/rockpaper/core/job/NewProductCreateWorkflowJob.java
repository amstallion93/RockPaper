/**
 *
 */
/*
 * package com.rockpaper.core.job;
 * 
 * import de.hybris.platform.core.model.product.ProductModel; import de.hybris.platform.cronjob.enums.CronJobResult;
 * import de.hybris.platform.cronjob.enums.CronJobStatus; import de.hybris.platform.cronjob.model.CronJobModel; import
 * de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable; import
 * de.hybris.platform.servicelayer.cronjob.PerformResult;
 * 
 * import java.util.List;
 * 
 * import org.apache.log4j.Logger; import org.springframework.beans.factory.annotation.Autowired;
 * 
 * import com.rockpaper.facades.newproducts.NewProductExtractFacade;
 * 
 * 
 *//**
	 * @author smarokky
	 *
	 *//*
		 * public class NewProductCreateWorkflowJob extends AbstractJobPerformable { private static final Logger LOG =
		 * Logger.getLogger(NewProductCreateWorkflowJob.class);
		 * 
		 * @Autowired private NewProductExtractFacade productFacade;
		 * 
		 * (non-Javadoc)
		 *
		 * @see de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable#perform(de.hybris.platform.cronjob.model.
		 * CronJobModel)
		 * 
		 * 
		 * @Override public PerformResult perform(final CronJobModel arg0) { // YTODO Auto-generated method stub final
		 * List<ProductModel> ProductList = productFacade.getNewProducts(); for (final ProductModel product : ProductList) {
		 * LOG.info(product.getName()); } return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED); }
		 * 
		 * }
		 */