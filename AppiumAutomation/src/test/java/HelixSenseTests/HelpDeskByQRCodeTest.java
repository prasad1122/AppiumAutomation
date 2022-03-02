package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.HelpDeskByQRCodePage;

public class HelpDeskByQRCodeTest extends HelixSenseTestBase{
	
	HelpDeskByQRCodePage helpDeskQRCode;

	@Test
	
	public void verifyHelpDeskByQRCode() throws InterruptedException
	{
		helpDeskQRCode=new HelpDeskByQRCodePage(driver);
		helpDeskQRCode.AddQAScreen();
		String Actual=helpDeskQRCode.getStatus();
		String Excepted=helpDeskQRCode.getExcepted();
		Assert.assertEquals(Actual, Excepted,"ERROR!HelpDesk QR Code failed");
		testReport.info("Validate HelpDesk Using QRCode");
	}
}
