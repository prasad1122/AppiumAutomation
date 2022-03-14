package HelixSensePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import  io.appium.java_client.PerformsTouchActions; 
import io.appium.java_client.TouchAction; 

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class IncidentRaiseTicketPage extends HelixsensePageBase {
	
	
	String description1="TestChairTicket";
	
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[9]/android.widget.LinearLayout/android.widget.TextView")
    WebElement incidentManagement;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan by QR Code']")
    WebElement clickOnSearchqrcode;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Accident']")
    WebElement clickOnAccident;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Furniture & Fitting']")
    WebElement clickOnFitting;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Broken Chair']")
    WebElement clickOnBrokeChair;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Select']")
    WebElement clickOnSelect;
	
	@AndroidFindBy (id = "com.app.hsense.compass/edt_desc")
    WebElement description;
	

	@AndroidFindBy (xpath = "//android.widget.Button[@text='Submit']")
    WebElement clickOnSubmit;

	@AndroidFindBy (xpath = "//android.widget.Button[@text='Ok']")
    WebElement clickOnOk;

	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> options;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Fire']")
    WebElement clickOnFire;
	
	public IncidentRaiseTicketPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	public void addIncident() throws InterruptedException {
		
		
		scrollToExactElement("Incident Management");
		
		Thread.sleep(3000);
		driver.findElementById("com.app.hsense.compass/report_incidents_btn").click();
		clickOnSearchqrcode.click();
		Thread.sleep(5000);
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