package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssetRegistryByLocationPage extends HelixsensePageBase {

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Search Asset by Location']")
    WebElement clickOnSearchLocation;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Building']")
    WebElement clickOnBuilding;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Space B1']")
    WebElement clickOnSpaceB1;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Next']")
    WebElement clickedOnNext;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Furniture']")
    WebElement clickOnFurniture;
	
	public AssetRegistryByLocationPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addAssetByLocation() throws InterruptedException {
		
		waitForVisible(driver,clickOnAssetRegistry);
		clickOnAssetRegistry.click();
		Thread.sleep(3000);
		waitForVisible(driver,clickOnSearchLocation);
		clickOnSearchLocation.click();
		clickOnBuilding.click();
		clickOnSpaceB1.click();
		clickedOnNext.click();
		clickOnFurniture.click();
		
	}

	public boolean getStatus() {
		// TODO Auto-generated method stub
		return clickOnFurniture.isDisplayed();
	}

}
