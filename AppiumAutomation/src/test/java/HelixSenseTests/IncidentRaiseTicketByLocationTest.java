package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.IncidentRaiseTicketByLocationPage;
import HelixSensePages.IncidentRaiseTicketPage;

public class IncidentRaiseTicketByLocationTest extends HelixSenseTestBase{

	IncidentRaiseTicketByLocationPage incidentByLocation;
 @Test
 public void verifyIncidentManagementRaiseTicket() throws InterruptedException
 {
	 incidentByLocation=new IncidentRaiseTicketByLocationPage(driver);
	 
	 incidentByLocation.addIncident();
	 boolean status=incidentByLocation.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate IncidentManagement By Location");
	 
}
}
