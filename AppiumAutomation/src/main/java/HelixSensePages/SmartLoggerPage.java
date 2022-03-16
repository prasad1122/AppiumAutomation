package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SmartLoggerPage extends HelixsensePageBase{

	int n=4;
	@AndroidFindBy (id= "com.app.hsense.compass:id/img_menu_action")
    WebElement details;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Smart Logger']")
    WebElement clickOnSmartLogger;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan QR Code']")
    WebElement clickOnQRCode;
	
	@AndroidFindBy (className= "android.widget.EditText")
   List< WebElement> editText;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='SUBMIT']")
    WebElement submit;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OK']")
    WebElement clickOK;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Smart logger submitted successfully.']")
    WebElement confromation;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='GO TO SMARTLOGGER HOME']")
    WebElement home;
	
	public SmartLoggerPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public void EnterIncidentValues() {
		// TODO Auto-generated method stub
		details.click();
		clickOnSmartLogger.click();
		
		clickOnQRCode.click();
		
		
		
	}


	public void enterValues() {
		
		editText.get(0).sendKeys("24");
		editText.get(1).sendKeys("25");
		editText.get(2).sendKeys("26");
		editText.get(3).sendKeys("27");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SUBMIT\").instance(0))");
		editText.get(4).sendKeys("28");
		submit.click();
		clickOK.click();
	}


	public boolean getStatus() {
		// TODO Auto-generated method stub
		return confromation.isDisplayed();
	}


	public void gotoHome() {
		home.click();
	}
	
	

}
