package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryActionsPage;
import HelixSensePages.SmartLoggerPage;

public class SmartLoggerTest extends HelixSenseTestBase{
	SmartLoggerPage smartLoggerPage;
	
	AssetRegistryActionsPage assetRegistryActionsPage;
@Test
public void verifySmartLoggerUsingQR()
{
	smartLoggerPage=new SmartLoggerPage(driver);
	
	smartLoggerPage.EnterIncidentValues();
	smartLoggerPage.enterValues();
	boolean status=smartLoggerPage.getStatus();
	Assert.assertTrue(status,"ERROR!failed");
	smartLoggerPage.gotoHome();
	testReport.info("Validate  SmartLogger Using QR Code");
			
	
	
	
}

@Test
public void verifyAssetRegistryMoveToAnotherLocation() throws InterruptedException
{
	assetRegistryActionsPage=new AssetRegistryActionsPage(driver);
	assetRegistryActionsPage.MovetoLocation();
	boolean status3=assetRegistryActionsPage.getStatusOperative();
	Assert.assertTrue(status3,"ERROR!failed");
	testReport.info("Validate AssetRegistry Move To Another Location");
	
}

@Test
public void verifyAssetRegistryIsReplaced() throws InterruptedException
{
	assetRegistryActionsPage=new AssetRegistryActionsPage(driver);
	assetRegistryActionsPage.Replace();
	boolean status5=assetRegistryActionsPage.getStatusReplace();
	Assert.assertTrue(status5,"ERROR!failed");
	assetRegistryActionsPage.clickOkButton();
	testReport.info("Validate AssetRegistry Is Replaced");
}

}
