package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AddInboundMailWithEmployeePage;

public class AddInboundMailWithEmployeeTest extends HelixSenseTestBase
{
	
	
	AddInboundMailWithEmployeePage addInboundMailWithEmployeePage;
	
	@Test(priority=1)
	public void verifyAddInboundMailWithEmployee() throws InterruptedException
	{
		addInboundMailWithEmployeePage =new AddInboundMailWithEmployeePage(driver);
		
		addInboundMailWithEmployeePage.addInbounddetails();
		boolean status=addInboundMailWithEmployeePage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		addInboundMailWithEmployeePage.clickokay();
		testReport.info("Validate Add InboundMail With Employee");
	
	}
	
	@Test(priority=2)
	public void verifyWhetherInboundisCreated() throws InterruptedException
	{
		addInboundMailWithEmployeePage =new AddInboundMailWithEmployeePage(driver);
		
		addInboundMailWithEmployeePage.Inboundverify();
		String status1=addInboundMailWithEmployeePage.getTextcode();
		String status=addInboundMailWithEmployeePage.getTextName();
		System.out.println(status1);
		System.out.println(status);
		Assert.assertEquals(status1, status,"ERROR!");
		testReport.info("Validate Whether Inbound is Created");
	
	}
	
	@Test(priority=3)
	public void verifyChangeStatusRegistrytoDelivery() throws InterruptedException
	{
		addInboundMailWithEmployeePage =new AddInboundMailWithEmployeePage(driver);
		
		addInboundMailWithEmployeePage.ChangeStatus();
		boolean status1=addInboundMailWithEmployeePage.getInboundStatus();
		Assert.assertTrue(status1,"ERROR!failed");
		addInboundMailWithEmployeePage.clickokay();
		testReport.info("Validate Change Status Registry to Delivery");
	
	}

}
