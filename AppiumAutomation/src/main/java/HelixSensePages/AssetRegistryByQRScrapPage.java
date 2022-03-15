package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssetRegistryByQRScrapPage extends HelixsensePageBase {

	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan Asset by QR Code']")
    WebElement clickOnSearchqrcode;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")
    WebElement clickOnArrow;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scrap']")
    WebElement clickOnScrap;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='CONTINUE']")
    WebElement clickOnButton;


	@AndroidFindBy (id = "com.app.hsense.compass:id/btn_asset_ok_operation")
    WebElement clickOnOk;

	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scrapped']")
    WebElement clickOnScrappedAssests;

	public AssetRegistryByQRScrapPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addScrap() throws InterruptedException {
		
		waitForVisible(driver,clickOnAssetRegistry);
		clickOnAssetRegistry.click();
		clickOnSearchqrcode.click();
		
		Thread.sleep(4000);
		waitForVisible(driver,clickOnArrow);
		clickOnArrow.click();
		
		clickOnScrap.click();
		clickOnButton.click();
		clickOnOk.click();
		
		// TODO Auto-generated method stub
		
	}

	public boolean getStatus() throws InterruptedException {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		return clickOnScrappedAssests.isDisplayed();
	}

}
