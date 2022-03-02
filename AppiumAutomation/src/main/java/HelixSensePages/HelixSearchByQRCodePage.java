package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HelixSearchByQRCodePage extends HelixsensePageBase {

	
	@AndroidFindBy (id = "com.hsensefm.live:id/float_universal_search")
    WebElement clickOnSearchButton;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan QR Code']")
    WebElement clickOnSearchqrcode;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='View Details']")
    WebElement clickOndetails;
	
	@AndroidFindBy (className = "android.widget.TextView")
    List<WebElement> testChairTicket;
	
	
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

}
