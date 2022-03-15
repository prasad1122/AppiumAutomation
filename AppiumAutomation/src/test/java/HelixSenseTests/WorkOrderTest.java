package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.WorkOrderPage;

public class WorkOrderTest extends HelixSenseTestBase
{
	
	WorkOrderPage workOrderPage;
	@Test
	public void verifyWorkOrderModule()
	{
		workOrderPage=new WorkOrderPage(driver);
		workOrderPage.clickOnNewOrders();
		boolean status=workOrderPage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate Work Order Module");
	}
	
	@Test
	public void verifyStartedOrderModule()
	{
		workOrderPage=new WorkOrderPage(driver);
		workOrderPage.clickOnStartedOrders();
		boolean status=workOrderPage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate Started Order Module");
	}

}
