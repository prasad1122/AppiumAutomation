package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.HelpDeskTicketsPage;

public class HelpDeskTicketsTest extends HelixSenseTestBase{
	
	HelpDeskTicketsPage helpDeskTickets;
	@Test
	public void VerifyHelpDeskTickets()
	{
		helpDeskTickets=new HelpDeskTicketsPage(driver);
		helpDeskTickets.verifyNewTicket();
		boolean status=helpDeskTickets.getNewTicketstatus();
		Assert.assertTrue(status,"ERROR!failed");
		
		helpDeskTickets.verifyInProgress();
		boolean status1=helpDeskTickets.getProgressStatus();
		Assert.assertTrue(status1,"ERROR!failed");
		
		helpDeskTickets.verifyOnHold();
		boolean status2=helpDeskTickets.getOnHoldStatus();
		Assert.assertTrue(status2,"ERROR!failed");
		
		helpDeskTickets.verifyClosed();
		boolean status3=helpDeskTickets.getClosedtatus();
		Assert.assertTrue(status3,"ERROR!failed");
		testReport.info("validate the Helpdesk Tickets");
		
	}

}
