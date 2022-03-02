package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ValidateAssestsPage extends HelixsensePageBase {

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to Operative Assets']")
    WebElement clickOnOperativeAssests;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='OPERATIVE ASSETS']")
    WebElement operativeAssests;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to Under Maintenance']")
    WebElement clickOnUnderMaintainenece;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='UNDER MAINTENANCE']")
    WebElement underMaintaience;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to In Scrapped Assets']")
    WebElement clickOnScrappedAssests;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='SCRAPPED ASSETS']")
    WebElement scrappedAssests;
	
	public ValidateAssestsPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void verifyOperativeAsset() {
		clickOnAssetRegistry.click();
		clickOnOperativeAssests.click();
		
	}

	public boolean getoperativestatus() {
		
		return operativeAssests.isDisplayed();
	}

	public void verifyunderMaintence() {
		driver.navigate().back();
		clickOnUnderMaintainenece.click();
	}

	public boolean getmaintenenecetatus() {
		// TODO Auto-generated method stub
		return underMaintaience.isDisplayed();
	}

	public void verifyScrappedAsset() {
		driver.navigate().back();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Go to In Scrapped Assets\").instance(0))");
		clickOnScrappedAssests.click();
		
	}

	public boolean getScrappedstatus() {
		// TODO Auto-generated method stub
		return scrappedAssests.isDisplayed();
	}

}
