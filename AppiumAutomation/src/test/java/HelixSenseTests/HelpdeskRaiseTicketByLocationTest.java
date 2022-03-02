package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;


import HelixSensePages.HelpdeskRaiseTicketByLocationPage;

public class HelpdeskRaiseTicketByLocationTest extends HelixSenseTestBase  {

	
	HelpdeskRaiseTicketByLocationPage raiseByLocationPage;
	
	@Test
	public void verifyHelpdeskRaiseTicketByLocation() throws InterruptedException
	{
		raiseByLocationPage=new HelpdeskRaiseTicketByLocationPage(driver);
		raiseByLocationPage.addAssetByName();
		String Actual=raiseByLocationPage.getStatus();
		String Excepted=raiseByLocationPage.getExcepted();
		Assert.assertEquals(Actual, Excepted,"ERROR!New Ticket is not created and it is failed");
		testReport.info("Validate HelpDesk Using SearchAssetByName");
		
		
	}
}
