package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ValidateQACodePage extends HelixsensePageBase{
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Asset Registry']")
    WebElement clickOnAssetRegistry;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan Asset by QR Code']")
    WebElement clickOnSearchqrcode;
	

	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> testChairTicket;
	
	
	public ValidateQACodePage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addQR() throws InterruptedException {
		Thread.sleep(5000);
		clickOnAssetRegistry.click();
		clickOnSearchqrcode.click();
		Thread.sleep(9000);
		// TODO Auto-generated method stub
		
	}

	public boolean getStatus() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		waitForListVisible(driver,testChairTicket);
		return testChairTicket.get(3).isDisplayed();
	}

}
