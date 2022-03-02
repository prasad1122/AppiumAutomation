package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AddOutboundMailWithDepartmentPage;

public class AddOutboundMailWithDepartmentTest extends HelixSenseTestBase
{
	
	AddOutboundMailWithDepartmentPage addOutboundMailWithDepartmentPage;
	@Test
	public void verifyAddOutboundMailWithDepartment() throws InterruptedException
	{
		addOutboundMailWithDepartmentPage =new AddOutboundMailWithDepartmentPage(driver);
		addOutboundMailWithDepartmentPage.addOutbounddetails();
		boolean status=addOutboundMailWithDepartmentPage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		addOutboundMailWithDepartmentPage.clickokay();
		testReport.info("Validate Add OutboundMail With Department");
	}
}
