package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.IncidentRaiseTicketPage;

public class IncidentRaiseTicketTest extends HelixSenseTestBase{
	
	
	IncidentRaiseTicketPage incidentRaiseTicket;
 @Test
 public void verifyIncidentManagementRaiseTicket() throws InterruptedException
 {
	 incidentRaiseTicket=new IncidentRaiseTicketPage(driver);
	 
	 incidentRaiseTicket.addIncident();
	 boolean status=incidentRaiseTicket.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate IncidentManagement RaiseTicket");
	 
	 
	 
	 
 }
	

}
