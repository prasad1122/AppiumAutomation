package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InspectionSchedulePage extends HelixsensePageBase{

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Inspection Schedule']")
    WebElement clickOnInspectionSchedule;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan QR to Perform Inspection']")
    WebElement clickOnScanQRtoPerformInspection;
	
	@AndroidFindBy (id = "com.app.hsense.compass:id/layout_starts_in")
    WebElement clickOnButton;
	
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Yes']")
    List<WebElement> clickOnradio;
	
	@AndroidFindBy (className = "android.widget.EditText")
    WebElement editText;
	
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Submit to complete inspection']")
    WebElement clickOnSubmitInspection;
	
	
	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> testChairTicket;
	
	public InspectionSchedulePage(AndroidDriver driver)
	{
		super(driver);
		
		
	}

	public void addInspection() throws InterruptedException {
		clickOnInspectionSchedule.click();
		clickOnScanQRtoPerformInspection.click();
		clickOnButton.click();
		clickOnradio.get(0).click();
		clickOnradio.get(1).click();
		clickOnradio.get(2).click();
		clickOnradio.get(3).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Comment\").instance(0))");
		clickOnradio.get(4).click();
		clickOnradio.get(5).click();
	
		editText.sendKeys("text");
		
		clickOnSubmitInspection.click();
		Thread.sleep(2500);
	}

	public boolean getStatus() {
		// TODO Auto-generated method stub
		return testChairTicket.get(2).isDisplayed();
	}
	
	
	
	

}
