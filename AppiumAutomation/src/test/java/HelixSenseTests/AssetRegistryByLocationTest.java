package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryByLocationPage;

public class AssetRegistryByLocationTest extends HelixSenseTestBase {

	AssetRegistryByLocationPage assetbylocationpage;
	
	@Test(dataProvider = "dataProvider")
	public void AssetRegistrySearchByLocation(String building,String space) throws InterruptedException
	{
		assetbylocationpage=new AssetRegistryByLocationPage(driver);
		
		assetbylocationpage.addAssetByLocation(building,space);
		
		boolean status=assetbylocationpage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate AssetRegistry Using SearchAssetByLocation ");	
	}
}
