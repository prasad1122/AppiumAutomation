package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryByLocationPage;

public class AssetRegistryByLocationTest extends HelixSenseTestBase {
	
	
	AssetRegistryByLocationPage assetbylocationpage;
	
	@Test
	public void AssetRegistrySearchByLocation() throws InterruptedException
	{
		
		assetbylocationpage=new AssetRegistryByLocationPage(driver);
		assetbylocationpage.addAssetByLocation();
		boolean status=assetbylocationpage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate AssetRegistry Using SearchAssetByLocation ");
		
	}

}
