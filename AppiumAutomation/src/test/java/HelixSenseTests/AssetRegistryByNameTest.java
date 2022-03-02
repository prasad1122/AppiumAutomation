package HelixSenseTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryByFilterPage;
import HelixSensePages.AssetRegistryByNamePage;
import HelixSensePages.HelixsensePageBase;
import io.appium.java_client.AppiumDriver;

public class AssetRegistryByNameTest extends HelixSenseTestBase {

	AssetRegistryByNamePage assetRegistryByName;
	
	
	@Test
	
	public void AssetRegistryByNameTest()
	{
		assetRegistryByName=new AssetRegistryByNamePage(driver);
		assetRegistryByName.addAssetByName();
		boolean status=assetRegistryByName.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate AssetRegistry Using SearchAssetByName");
	}
	

}
