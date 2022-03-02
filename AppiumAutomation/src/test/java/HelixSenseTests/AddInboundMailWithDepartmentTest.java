package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AddInboundMailWithDepartmentPage;
import HelixSensePages.AddInboundMailWithEmployeePage;

public class AddInboundMailWithDepartmentTest extends HelixSenseTestBase
{
	
	
	AddInboundMailWithDepartmentPage addInboundMailWithDepartmentPage;
	
	@Test
	public void verifyAddInboundMailWithDepartment() throws InterruptedException
	{
		addInboundMailWithDepartmentPage =new AddInboundMailWithDepartmentPage(driver);
		
		addInboundMailWithDepartmentPage.addInbounddetails();
		boolean status=addInboundMailWithDepartmentPage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		addInboundMailWithDepartmentPage.clickokay();
		testReport.info("Validate Add InboundMail With Department");
	
	}
	
	

}
