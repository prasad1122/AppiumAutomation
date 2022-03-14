package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HelpDeskSearchAssetByLocationPage extends HelixsensePageBase{

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Helpdesk']")
    WebElement clickOnHelpdesk;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Search by Location']")
    WebElement clickOnSearchLocation;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Building']")
    WebElement clickOnBuilding;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Space B1']")
    WebElement clickOnSpaceB1;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Next']")
    WebElement clickedOnNext;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='I want to Raise a ticket for the Asset']")
    WebElement clickOnRaiseaTicket;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Furniture']")
    WebElement clickOnFurniture;
	
	public HelpDeskSearchAssetByLocationPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addAssetByLocation() {
		
		clickOnHelpdesk.click();
		clickOnSearchLocation.click();
		clickOnBuilding.click();
		clickOnSpaceB1.click();
		clickedOnNext.click();
		clickOnRaiseaTicket.click();
		clickOnFurniture.click();
	}

	public boolean getStatus() {
		// TODO Auto-generated method stub
		return clickOnFurniture.isDisplayed();
	}
	

}
