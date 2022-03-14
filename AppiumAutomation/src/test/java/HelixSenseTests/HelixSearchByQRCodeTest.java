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
	
	@Test
	public void verifyRaiseATicketByGlobalSearchUsingQR() throws InterruptedException
	{
		helixSearchByQR=new HelixSearchByQRCodePage(driver);
		helixSearchByQR.addGlobalSearchQR();	
		boolean status=helixSearchByQR.getStatusCode();
		Assert.assertTrue(status,"ERROR!failed");
		helixSearchByQR.getExcepted();
		testReport.info("Validate Raise A Ticket By GlobalSearch Using QRCode");
	
	}
	
	@Test
	public void verifyPendingWorkOrdersScanQR() throws InterruptedException
	{
		helixSearchByQR=new HelixSearchByQRCodePage(driver);
		helixSearchByQR.addPendingList();
		boolean status=helixSearchByQR.getStatusPending();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate Pending work orders Using QRCode");
	}
	
}
