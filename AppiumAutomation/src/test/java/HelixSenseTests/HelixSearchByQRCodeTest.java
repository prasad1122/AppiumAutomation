package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.HelixSearchByQRCodePage;

public class HelixSearchByQRCodeTest extends HelixSenseTestBase 

{
	
	HelixSearchByQRCodePage helixSearchByQR;
	@Test
	public void verifyHelixSenseSearchByQR() throws InterruptedException
	{
		helixSearchByQR=new HelixSearchByQRCodePage(driver);
		
		helixSearchByQR.addSerachByQR();
		
		boolean status=helixSearchByQR.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate HelixSenseapp with Search By QRCode");
		
		
	}
	
	
	

}
