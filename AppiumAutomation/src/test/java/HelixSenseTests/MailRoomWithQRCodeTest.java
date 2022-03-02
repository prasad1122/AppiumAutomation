package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.MailRoomWithQRCodePage;

public class MailRoomWithQRCodeTest extends HelixSenseTestBase{
	
	MailRoomWithQRCodePage mailRoomWithQRCodePage;
	
	@Test
	public void verifyMailRoomWithQRCode() throws InterruptedException
	{
		
		
		mailRoomWithQRCodePage=new MailRoomWithQRCodePage(driver);
		
		mailRoomWithQRCodePage.scanCode();
		
		boolean status=mailRoomWithQRCodePage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		
		testReport.info("Validate Mail Room With QRCode");
	
		
	}

}
