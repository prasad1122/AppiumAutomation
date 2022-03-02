package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MailRoomWithQRCodePage extends HelixsensePageBase{

	
	
	@AndroidFindBy (xpath = "(//android.widget.ImageView[@content-desc=\"HSense\"])[19]")
    WebElement MailRoomManagement;
	
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Scan QR Code']")
    WebElement clickonQRCode;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Recipient Details']")
    WebElement RecipientDetails;

	public MailRoomWithQRCodePage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void scanCode() throws InterruptedException {
		
		waitForVisible(driver,MailRoomManagement);
		MailRoomManagement.click();
		clickonQRCode.click();
		Thread.sleep(4000);
		
	}

	public boolean getStatus() {
		// TODO Auto-generated method stub
		return RecipientDetails.isDisplayed();
	}

}
