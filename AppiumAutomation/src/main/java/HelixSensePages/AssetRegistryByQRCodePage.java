package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssetRegistryByQRCodePage extends HelixsensePageBase{
	
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan Asset by QR Code']")
    WebElement clickOnSearchqrcode;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")
    WebElement clickOnArrow;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Make Asset Operative']")
    WebElement clickOnMakeAssetOperative;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='CONTINUE']")
    WebElement clickOnButton;


	@AndroidFindBy (id = "com.app.hsense.compass/btn_asset_ok_operation")
    WebElement clickOnOk;

	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> testChairTicket;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to Operative Assets']")
    WebElement clickOnOperativeAssests;
	
	public AssetRegistryByQRCodePage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void AddQRCode() throws InterruptedException {
		waitForVisible(driver,clickOnAssetRegistry);
		clickOnAssetRegistry.click();
		clickOnSearchqrcode.click();
		
		
		Thread.sleep(4000);
		waitForVisible(driver,clickOnArrow);
		clickOnArrow.click();
		clickOnMakeAssetOperative.click();
		clickOnButton.click();
		clickOnOk.click();
		driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"HSense\"])[4]").click();
		clickOnOperativeAssests.click();
		driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"HSense\"])[6]").click();
		// TODO Auto-generated method stub
		
	}

	public String getStatus() throws InterruptedException {
		Thread.sleep(4000);
		return testChairTicket.get(3).getText();
	}

	public String getStatuscode() throws InterruptedException {
		Thread.sleep(4000);
		// TODO Auto-generated method stub
		return testChairTicket.get(3).getText();
	}

}
