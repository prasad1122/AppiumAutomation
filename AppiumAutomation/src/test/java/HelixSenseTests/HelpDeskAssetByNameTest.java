package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.HelpDeskAssetByNamePage;

public class HelpDeskAssetByNameTest extends HelixSenseTestBase{
		
	HelpDeskAssetByNamePage assetByNamePage;

	@Test
	public void verifyHelpDeskAssetByName() throws InterruptedException
	{
		assetByNamePage=new HelpDeskAssetByNamePage(driver);
		assetByNamePage.addAssetByName();
		String Actual=assetByNamePage.getStatus();
		String Excepted=assetByNamePage.getExcepted();
		Assert.assertEquals(Actual, Excepted,"ERROR!New Ticket is not created and it is failed");
		testReport.info("Validate HelpDesk Using SearchAssetByName");
		
		
	}
	

}
