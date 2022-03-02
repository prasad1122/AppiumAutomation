package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.ValidateQACodePage;

public class ValidateQRCodeTest extends HelixSenseTestBase {
	
	
	ValidateQACodePage verifyqr;
	
	
	@Test
	public void verifyQRCode() throws InterruptedException
	{
		verifyqr=new ValidateQACodePage(driver);
		verifyqr.addQR();
		boolean status=verifyqr.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate QR Code ");	
	}
}
