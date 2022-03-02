package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryByQRCodePage;

public class AssetRegistryByQRCodeTest extends HelixSenseTestBase

{
	AssetRegistryByQRCodePage assetRegistryqrcode;
	
	@Test
	public void VerifyAssetRegistryByQRCode() throws InterruptedException
	{
		assetRegistryqrcode=new AssetRegistryByQRCodePage(driver);
		assetRegistryqrcode.AddQRCode();
		String status1=assetRegistryqrcode.getStatuscode();
		String status=assetRegistryqrcode.getStatus();
		Assert.assertEquals(status1, status,"ERROR!");
		testReport.info("Validate Helpdesk Using QR Code");
	}
}
