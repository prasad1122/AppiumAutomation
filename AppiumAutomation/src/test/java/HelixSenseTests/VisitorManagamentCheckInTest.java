package HelixSenseTests;

import org.testng.annotations.Test;

import HelixSensePages.VisitorManagamentCheckInPage;

public class VisitorManagamentCheckInTest extends  HelixSenseTestBase

{
	
	VisitorManagamentCheckInPage visitorManagamentCheckInPage;
	
	@Test
	public void verifyVisitorCheckIn()
	{
		visitorManagamentCheckInPage=new VisitorManagamentCheckInPage(driver);
		visitorManagamentCheckInPage.AddCheckIn();
		
		
	}

}
