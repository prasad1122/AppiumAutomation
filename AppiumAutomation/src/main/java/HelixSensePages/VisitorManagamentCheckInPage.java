package HelixSensePages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VisitorManagamentCheckInPage extends HelixsensePageBase
{
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Visitor Management']")
    WebElement   clickonVisitorManagement;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='New Visitor']")
    WebElement   clickonNewVisitor;
	

	public VisitorManagamentCheckInPage(AndroidDriver driver) {
		super(driver);
		
	}

	
	public void AddCheckIn() {
		
		clickonVisitorManagement.click();
		
		clickonNewVisitor.click();
		
	}
	
	

}
