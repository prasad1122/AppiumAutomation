package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssetRegistryByFilterPage extends HelixsensePageBase{
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Search Asset by Filter']")
    WebElement clickOnSearchAssetByFilter;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan Asset by QR Code']")
    WebElement clickOnSearchqrcode;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Maintenance']")
    WebElement clickOnMaintenance;
	

	@AndroidFindBy (id = "com.app.hsense.compass:id/btn_apply_asset_filter")
    WebElement clickOnApplyButton;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Space B1']")
    WebElement clickOnSpaceB1;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]")
    WebElement clickOnAssetList;
	
	
	public AssetRegistryByFilterPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public void addAssetByFilter() {
		waitForVisible(driver,clickOnAssetRegistry);
		clickOnAssetRegistry.click();
		//clickOnSearchqrcode.click();
		clickOnSearchAssetByFilter.click();
		clickOnMaintenance.click();
		clickOnApplyButton.click();
		clickOnSpaceB1.click();
	}


	public boolean getStatus() {
		waitForVisible(driver,clickOnMaintenance);
		return clickOnMaintenance.isDisplayed();
	}

}
