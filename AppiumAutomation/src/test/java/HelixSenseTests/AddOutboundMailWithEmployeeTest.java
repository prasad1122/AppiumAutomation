package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AddOutboundMailWithEmployeePage;

public class AddOutboundMailWithEmployeeTest extends HelixSenseTestBase
{
	
	AddOutboundMailWithEmployeePage addOutboundMailWithEmployeePage;
	
	@Test(priority=1)
	public void verifyAddOutboundMailWithEmployee() throws InterruptedException
	{
		addOutboundMailWithEmployeePage =new AddOutboundMailWithEmployeePage(driver);
		
		addOutboundMailWithEmployeePage.addOutbounddetails();
		
		boolean status=addOutboundMailWithEmployeePage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		addOutboundMailWithEmployeePage.clickokay();
		testReport.info("Validate Add Outbound Mail With Employee");
		
	}
	@Test(priority=2)
	public void verifyWhetherOutboundisCreated() throws InterruptedException
	{
		addOutboundMailWithEmployeePage =new AddOutboundMailWithEmployeePage(driver);
		
		addOutboundMailWithEmployeePage.Inboundverify();
		boolean status=addOutboundMailWithEmployeePage.getStatusCode();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate Whether Outbound is Created");
	
	}
	
	@Test(priority=3)
	public void verifyChangeStatusReadytoDispatch() throws InterruptedException
	{
		addOutboundMailWithEmployeePage =new AddOutboundMailWithEmployeePage(driver);
		
		addOutboundMailWithEmployeePage.ChangeStatus();
		
		boolean status1=addOutboundMailWithEmployeePage.getInboundStatus();
		Assert.assertTrue(status1,"ERROR!failed");
		addOutboundMailWithEmployeePage.clickokay();
		testReport.info("Validate Change Status Ready to Dispatch");
	}

}
