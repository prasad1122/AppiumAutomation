package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.HelpDeskSearchAssetByLocationPage;

public class HelpDeskSearchAssetByLocationTest extends HelixSenseTestBase {
	
	HelpDeskSearchAssetByLocationPage helpdesk;
	
	@Test
	public void HelpDeskSearchAssetByLocation()
	{
		helpdesk=new HelpDeskSearchAssetByLocationPage(driver);
		helpdesk.addAssetByLocation();
		boolean status=helpdesk.getStatus();
		Assert.assertTrue(status,"ERROR!  failed");
		testReport.info("Validate Helpdesk Using SearchAssetByLocation ");
		
	}

}
