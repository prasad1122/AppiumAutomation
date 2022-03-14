package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HelixSearchByQRCodePage extends HelixsensePageBase {

	
	String description1="TestChairTicket";
	
	@AndroidFindBy (id = "com.app.hsense.compass:id/float_universal_search")
    WebElement clickOnSearchButton;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan QR Code']")
    WebElement clickOnSearchqrcode;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='View Details']")
    WebElement clickOndetails;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Raise a Ticket']")
    WebElement clickOnRaiseaTicket;
	
	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> testChairTicket;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='I want to Raise a ticket for this Space']")
    WebElement clickOnRaiseaTicketForSpace;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Furniture & Fitting']")
    WebElement clickOnFitting;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Broken Chair']")
    WebElement clickOnBrokeChair;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Select']")
    WebElement clickOnSelect;
	
	@AndroidFindBy (id = "com.app.hsense.compass:id/edt_desc")
    WebElement description;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='Submit']")
    WebElement clickOnSubmit;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Ok']")
    WebElement clickOnOk;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to New Tickets']")
    WebElement clickOnNewTickets;
	
	@AndroidFindBy (id = "com.app.hsense.compass:id/filter_search")
    WebElement search;
	 
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    WebElement searchFiledbox;
	
	@AndroidFindBy (xpath = "(//android.widget.ImageView[@content-desc=\"HSense\"])[5]")
    WebElement clickOnbutton;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='The ticket has been created successfully']")
    WebElement conformation;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='View Pending Work Orders']")
    WebElement PendingWorkOrders;
	
	public HelixSearchByQRCodePage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addSerachByQR() throws InterruptedException {
		waitForVisible(driver,clickOnSearchButton);
		clickOnSearchButton.click();
		
		Thread.sleep(8000);
		waitForVisible(driver,clickOnSearchqrcode);
		clickOnSearchqrcode.click();
		Thread.sleep(6000);
		waitForVisible(driver,clickOndetails);
		clickOndetails.click();
		
		Thread.sleep(2000);
	}

	public boolean getStatus() throws InterruptedException {
		Thread.sleep(2000);
		waitForListVisible(driver,testChairTicket);
		return testChairTicket.get(3).isDisplayed();
	}

	public void addGlobalSearchQR() throws InterruptedException {
		
		waitForVisible(driver,clickOnSearchButton);
		clickOnSearchButton.click();
		
		Thread.sleep(8000);
		waitForVisible(driver,clickOnSearchqrcode);
		clickOnSearchqrcode.click();
		Thread.sleep(6000);
		clickOnRaiseaTicket.click();
		//clickOnRaiseaTicketForSpace.click();
		clickOnFitting.click();
		clickOnBrokeChair.click();
		clickOnSelect.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter description *\").instance(0))");
		
		description1=randomTicketName(description1);
		description.sendKeys(description1);
		clickOnSubmit.click();
		//clickOnNewTickets.click();
		//search.click();
		//waitForVisible(driver,searchFiledbox);
	
		//searchFiledbox.sendKeys(description1);
		//clickOnbutton.click();
		// TODO Auto-generated method stub
		
	}
	
	
public boolean getStatusCode() {
				
	waitForVisible(driver,conformation);
		return conformation.isDisplayed();
		
	}

	public void getExcepted() throws InterruptedException {
		Thread.sleep(2000);
		clickOnOk.click();
	}

	public void addPendingList() throws InterruptedException {
		waitForVisible(driver,clickOnSearchButton);
		clickOnSearchButton.click();
		
		Thread.sleep(4000);
		waitForVisible(driver,clickOnSearchqrcode);
		clickOnSearchqrcode.click();
		
		PendingWorkOrders.click();
		// TODO Auto-generated method stub
		
	}

	public boolean getStatusPending() throws InterruptedException {
		Thread.sleep(2000);
		return testChairTicket.get(3).isDisplayed();
	}

}
