package HelixSenseTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import HelixSensePages.AssetRegistryActionsPage;



public class AssetRegistryActionsTest extends HelixSenseTestBase {
	
	AssetRegistryActionsPage assetRegistryActionsPage;

	@Test(priority = 1)
	public void verifyAssetRegistryActions() throws InterruptedException
	{	
		assetRegistryActionsPage=new AssetRegistryActionsPage(driver);
		assetRegistryActionsPage.moveToAssetOperative();
		String text1=assetRegistryActionsPage.getText();
		System.out.println(text1);
		assetRegistryActionsPage.verifyAssetIsPresent();
		String text2=assetRegistryActionsPage.getVerifiedText();
		System.out.println(text2);
		Assert.assertEquals(text1, text2,"ERROR! failed");
		testReport.info("Validate AssetRegistry Is Moving To Operativeasset");
		
	}
	@Test(priority = 2)
	public void verifyAssetRegistryStoreWareHouse() throws InterruptedException
	{
		assetRegistryActionsPage=new AssetRegistryActionsPage(driver);
		assetRegistryActionsPage.moveToWareHouse();
		boolean status=assetRegistryActionsPage.getStatus();
		Assert.assertTrue(status,"ERROR!failed");
		testReport.info("Validate AssetRegistry Is Moving To Warehouse");
		
			}
	@Test(priority = 3)
	public void verifyAssetRegistryBreakdown() throws InterruptedException
	{
		assetRegistryActionsPage=new AssetRegistryActionsPage(driver);
		assetRegistryActionsPage.Breakdown();
		boolean status1=assetRegistryActionsPage.getStatusBreakdown();
		Assert.assertTrue(status1,"ERROR!failed");
		testReport.info("Validate AssetRegistry Is Moving To Breakdown");
		
			}
	@Test(priority = 4)
	public void verifyAssetRegistryScrap() throws InterruptedException
	{
		assetRegistryActionsPage=new AssetRegistryActionsPage(driver);
		assetRegistryActionsPage.Scrap();
		boolean status2=assetRegistryActionsPage.getStatusScrap();
		Assert.assertTrue(status2,"ERROR!failed");
		testReport.info("Validate AssetRegistry Is Moving To Scrapped");
	}
	
	
}
