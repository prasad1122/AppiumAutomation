package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.RaiseATicketForAssetPage;


public class RaiseATicketForAssetTest extends HelixSenseTestBase {

	
	RaiseATicketForAssetPage raiseByTicketPage;
	
	@Test
	public void verifyHelpdeskRaiseTicketByLocation() throws InterruptedException
	{
		raiseByTicketPage=new RaiseATicketForAssetPage(driver);
		raiseByTicketPage.addAssetByName();
		String Actual=raiseByTicketPage.getStatus();
		String Excepted=raiseByTicketPage.getExcepted();
		Assert.assertEquals(Actual, Excepted,"ERROR!New Ticket is not created and it is failed");
		testReport.info("Validate HelpDesk Using SearchAssetByName");
		
		
	}
}
