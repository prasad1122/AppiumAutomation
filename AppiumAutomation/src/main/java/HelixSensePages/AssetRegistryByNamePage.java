package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssetRegistryByNamePage extends HelixsensePageBase {
	
	String element;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to Operative Assets']")
    WebElement clickOnOperativeAssets;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='AC']")
    WebElement  getTextAcc;
	
	

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
    WebElement  searchField;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='ACC']")
    WebElement  clickedOnACC;
	
	public AssetRegistryByNamePage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void getText() {
		waitForVisible(driver,clickOnAssetRegistry);
		clickOnAssetRegistry.click();
		clickOnOperativeAssets.click();
		 element=getTextAcc.getText();
	}

	public void addAssetByName() {
		
		clickOnAssetRegistry.click();
		searchField.sendKeys("ACC");
		clickedOnACC.click();
	
	}

	public boolean getStatus() {
		// TODO Auto-generated method stub
		return clickedOnACC.isDisplayed();
	}

}
