package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryByQRScrapPage;

public class AssetRegistryByQRScrapTest extends HelixSenseTestBase{
	

	AssetRegistryByQRScrapPage assertRegistryScrap;
	@Test
public void verifyAssetRegistryByScrap() throws InterruptedException {
		
		assertRegistryScrap =new AssetRegistryByQRScrapPage(driver);
		assertRegistryScrap.addScrap();
		boolean status=assertRegistryScrap.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate AssetRegistry Using QRScrap");
	}

}
