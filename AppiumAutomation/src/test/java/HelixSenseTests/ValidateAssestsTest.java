package HelixSenseTests;

import org.testng.annotations.Test;

import HelixSensePages.ValidateAssestsPage;

public class ValidateAssestsTest extends HelixSenseTestBase {
	
	ValidateAssestsPage validateAssestPage;
	
	
	@Test
	public void ValidateAssests()
	{
		validateAssestPage=new ValidateAssestsPage(driver);
		validateAssestPage.verifyOperativeAsset();
		boolean status=validateAssestPage.getoperativestatus();
		validateAssestPage.verifyunderMaintence();
		boolean status1=validateAssestPage.getmaintenenecetatus();
		validateAssestPage.verifyScrappedAsset();
		boolean status2=validateAssestPage.getScrappedstatus();
		testReport.info("validate the Assests pages");
		
	}

}
