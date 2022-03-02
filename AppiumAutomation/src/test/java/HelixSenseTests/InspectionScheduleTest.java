package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.InspectionSchedulePage;

public class InspectionScheduleTest extends HelixSenseTestBase
{
	InspectionSchedulePage inspectionSchedulePage;
	
	@Test
	public void verifyInspectionSchedule() throws InterruptedException
	{
		
		inspectionSchedulePage=new InspectionSchedulePage(driver);
		
		inspectionSchedulePage.addInspection();
		boolean status=inspectionSchedulePage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate QR Code ");	
	}
	
	

}
