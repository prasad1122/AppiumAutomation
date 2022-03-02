package HelixSensePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssetRegistryActionsPage extends HelixsensePageBase {

	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to Operative Assets']")
    WebElement clickOnOperativeAssests;
	
	@AndroidFindBy (xpath = "(//android.widget.ImageView[@content-desc=\"HSense\"])[6]")
    WebElement clickOnImage;
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")
    WebElement clickOnArrow;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Make Asset Operative']")
    WebElement clickOnMakeAssetOperative;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Store in Warehouse']")
    WebElement clickOnStoreinWarehouse;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Warehouse']")
    WebElement Warehouse;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='CONTINUE']")
    WebElement clickOnButton;


	@AndroidFindBy (id = "com.hsensefm.live:id/btn_asset_ok_operation")
    WebElement clickOnOk;
	
	@AndroidFindBy (className= "android.widget.TextView")
   List< WebElement> Text;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Mark as Breakdown']")
    WebElement clickOnBreakDown;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Breakdown']")
    WebElement BreakDown;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scrap']")
    WebElement clickOnscrapeed;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scrapped']")
    WebElement scrapped;
	
	public AssetRegistryActionsPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public void moveToAssetOperative() {
		// TODO Auto-generated method stub
		
		clickOnAssetRegistry.click();
		clickOnOperativeAssests.click();
		clickOnImage.click();
		clickOnArrow.click();
		clickOnMakeAssetOperative.click();
		clickOnButton.click();
		clickOnOk.click();
		
	}
	public String getText() {
		// TODO Auto-generated method stub
		return Text.get(3).getText();
	}


	public void verifyAssetIsPresent() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.id("com.hsensefm.live:id/img_asset_details_back")).click();
		clickOnImage.click();
		
	}


	public String getVerifiedText() {
		// TODO Auto-generated method stub
		return Text.get(3).getText();
	}


	public void moveToWareHouse() {
		clickOnAssetRegistry.click();
		clickOnOperativeAssests.click();
		clickOnImage.click();
		clickOnArrow.click();
		clickOnStoreinWarehouse.click();
		clickOnButton.click();
		clickOnOk.click();
	}


	public boolean getStatus() {
		// TODO Auto-generated method stub
		return Warehouse.isDisplayed();
	}


	public void Breakdown() {
		// TODO Auto-generated method stub
		clickOnAssetRegistry.click();
		clickOnOperativeAssests.click();
		clickOnImage.click();
		clickOnArrow.click();
		clickOnBreakDown.click();
		clickOnButton.click();
		clickOnOk.click();
	}


	public boolean getStatusBreakdown() {
		// TODO Auto-generated method stub
		return BreakDown.isDisplayed();
	}


	public void Scrap() {
		// TODO Auto-generated method stub
		clickOnAssetRegistry.click();
		clickOnOperativeAssests.click();
		clickOnImage.click();
		clickOnArrow.click();
		clickOnscrapeed.click();
		clickOnButton.click();
		clickOnOk.click();
		
	}


	public boolean getStatusScrap() {
		// TODO Auto-generated method stub
		return scrapped.isDisplayed();
	}

}
