package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.HelpDeskSearchAssetByLocationPage;

public class HelpDeskSearchAssetByLocationTest extends HelixSenseTestBase {
	
	HelpDeskSearchAssetByLocationPage helpdesk;
	
	@Test(dataProvider = "dataProvider")
	public void HelpDeskSearchAssetByLocation(String building,String space)
	{
		helpdesk=new HelpDeskSearchAssetByLocationPage(driver);
		helpdesk.addAssetByLocation(building,space);
		boolean status=helpdesk.getStatus();
		Assert.assertTrue(status,"ERROR!  failed");
		testReport.info("Validate Helpdesk Using SearchAssetByLocation ");
		
	}

}
