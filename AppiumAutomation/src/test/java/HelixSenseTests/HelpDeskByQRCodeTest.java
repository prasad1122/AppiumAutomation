package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.HelpDeskByQRCodePage;

public class HelpDeskByQRCodeTest extends HelixSenseTestBase{
	
	HelpDeskByQRCodePage helpDeskQRCode;

	
	@Test
	public void verifyHelpDeskRaiseTicketyUsingQRCode() throws InterruptedException
	{
		helpDeskQRCode=new HelpDeskByQRCodePage(driver);
		helpDeskQRCode.RaiseaTicketByQR();
		String Actual=helpDeskQRCode.getActual();
		String Excepted=helpDeskQRCode.getExcepted();
		Assert.assertEquals(Actual, Excepted,"ERROR!HelpDesk Raise a Ticket Using QR Code failed");
		testReport.info("Validate HelpDesk Raise a Ticket Using QRCode");
	}
	
}
