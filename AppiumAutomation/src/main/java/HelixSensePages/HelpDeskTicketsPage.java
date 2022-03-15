package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HelpDeskTicketsPage extends HelixsensePageBase {

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Helpdesk']")
    WebElement clickOnHelpdesk;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to New Tickets']")
    WebElement clickOnNewTickets;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='New Tickets']")
    WebElement NewTickets;

	@AndroidFindBy (id= "com.app.hsense.compass:id/go_to_ip_ticket")
    WebElement clickOnInprogress;
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='In progress Tickets']")
    WebElement progressTickets;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to On Hold Tickets']")
    WebElement clickOnGotoonHoldTickets;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='On Hold Tickets']")
    WebElement onHoldTickets;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to Closed Tickets']")
    WebElement clickOnGotoclosedTickets;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Closed Tickets']")
    WebElement closedTickets;
	

	public HelpDeskTicketsPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public void verifyNewTicket() {
		clickOnHelpdesk.click();
		clickOnNewTickets.click();
	}


	public boolean getNewTicketstatus() {
		// TODO Auto-generated method stub
		return NewTickets.isDisplayed();
	}


	public void verifyInProgress() {
		driver.navigate().back();
		clickOnInprogress.click();
		
	}


	public boolean getProgressStatus() {
		// TODO Auto-generated method stub
		return progressTickets.isDisplayed();
	}


	public void verifyOnHold() {
		driver.navigate().back();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Go to On Hold Tickets\").instance(0))");
		 clickOnGotoonHoldTickets.click();
	}


	public boolean getOnHoldStatus() {
		// TODO Auto-generated method stub
		return onHoldTickets.isDisplayed();
	}


	public void verifyClosed() {
		driver.navigate().back();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Go to Closed Tickets\").instance(0))");
		 clickOnGotoclosedTickets.click();
	}


	public boolean getClosedtatus() {
		// TODO Auto-generated method stub
		return closedTickets.isDisplayed();
	}

}
