package HelixSenseTests;


import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryByFilterPage;



public class AssetRegistryByFilterTest extends HelixSenseTestBase {
	AssetRegistryByFilterPage assetRegistryByFilter;
	@Test
	public void AssetRegistrySearchByFilter()
	{
		assetRegistryByFilter=new AssetRegistryByFilterPage(driver);
		assetRegistryByFilter.addAssetByFilter();
		boolean status=assetRegistryByFilter.getStatus();
		Assert.assertTrue(status,"ERROR!");
		testReport.info("Validate AssetRegistry Using SearchAssetByFilter");
		
	}

}
