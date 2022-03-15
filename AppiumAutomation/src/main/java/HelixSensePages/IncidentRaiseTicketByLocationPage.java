package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class IncidentRaiseTicketByLocationPage extends HelixsensePageBase {

String description1="TestChairTicket";
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[9]/android.widget.LinearLayout/android.widget.TextView")
    WebElement incidentManagement;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Search by Location']")
    WebElement clickOnSearchbyLocation;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Accident']")
    WebElement clickOnAccident;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Building']")
    WebElement clickOnBuilding;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Space B1']")
    WebElement clickOnSpaceB1;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Next']")
    WebElement clickedOnNext;
	
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

	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> options;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Fire']")
    WebElement clickOnFire;
	
	public IncidentRaiseTicketByLocationPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void addIncident() throws InterruptedException {
		
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Incident Management\").instance(0))").click();
		Thread.sleep(4000);
		//waitForVisible(driver,incidentManagement);
		//incidentManagement.click();
		driver.findElementById("com.app.hsense.compass:id/report_incidents_btn").click();
		clickOnSearchbyLocation.click();
		Thread.sleep(5000);
		clickOnBuilding.click();
		clickOnSpaceB1.click();
		clickedOnNext.click();
		clickOnAccident.click();
		clickOnAccident.click();
		clickOnFire.click();
		clickOnSelect.click();
			//clickOnFitting.click();
		//clickOnBrokeChair.click();
		//clickOnSelect.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter description *\").instance(0))");
		
		description1=randomTicketName(description1);
		description.sendKeys(description1);
		clickOnSubmit.click();
		clickOnOk.click();
}

	public boolean getStatus() {
		for(int i=0;i<options.size();i++) {
			
		    if (options.get(i).getText().equals(description1)) {
		 
		    	return true;
		    }
		}
		return false;
		
	}
	

	

}
