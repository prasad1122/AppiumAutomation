package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RaiseATicketForAssetPage extends HelixsensePageBase {

String description1="TestChairTicket";
	
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
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Carpet']")
    WebElement clickOnCarpet;
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[@text='Carpet'])[2]")
    WebElement clickOntheCarpet;
	
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='AC']")
    WebElement clickOnAC;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Furniture & Fitting']")
    WebElement clickOnFitting;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Broken Chair']")
    WebElement clickOnBrokeChair;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Select']")
    WebElement clickOnSelect;
	
	@AndroidFindBy (id = "com.hsensefm.live:id/edt_desc")
    WebElement description;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='Submit']")
    WebElement clickOnSubmit;

	@AndroidFindBy (xpath = "//android.widget.Button[@text='Ok']")
    WebElement clickOnOk;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to New Tickets']")
    WebElement clickOnNewTickets;
	
	@AndroidFindBy (id = "com.hsensefm.live:id/filter_search")
    WebElement search;
	 
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    WebElement searchFiledbox;
	
	@AndroidFindBy (xpath = "(//android.widget.ImageView[@content-desc=\"HSense\"])[5]")
    WebElement clickOnbutton;
	
	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> testChairTicket;
	


	
	public RaiseATicketForAssetPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void addAssetByName() {
		clickOnHelpdesk.click();
		clickOnSearchLocation.click();
		clickOnBuilding.click();
		clickOnSpaceB1.click();
		clickedOnNext.click();
		clickOnRaiseaTicket.click();
		clickOnCarpet.click();
		clickOntheCarpet.click();
		
		clickOnAC.click();
		clickOnSelect.click();
		clickOnFitting.click();
		clickOnBrokeChair.click();
		clickOnSelect.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter description *\").instance(0))");
		
		description1=randomTicketName(description1);
		description.sendKeys(description1);
		clickOnSubmit.click();
		clickOnOk.click();
		clickOnNewTickets.click();
		search.click();
		waitForVisible(driver,searchFiledbox);
	
		searchFiledbox.sendKeys(description1);
		clickOnbutton.click();
	}

	public String getStatus() {
				
		
		return testChairTicket.get(2).getText();
	}

	public String getExcepted() {
		
		return description1;
	}
	
	
	
}
