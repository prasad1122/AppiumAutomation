package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VisitorManagamentCheckInPage extends HelixsensePageBase
{
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Visitor Management']")
    WebElement   clickonVisitorManagement;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='New Visitor']")
    WebElement   clickonNewVisitor;
	
	
	@AndroidFindBy (className ="android.widget.EditText")
   List<WebElement>    edittext;
	

	public VisitorManagamentCheckInPage(AndroidDriver driver) {
		super(driver);
		
	}

	public void AddCheckIn() {
		
		clickonVisitorManagement.click();
		
		clickonNewVisitor.click();
		
		edittext.get(0).sendKeys("pushpalatha");
		edittext.get(1).sendKeys("8309394674");
		edittext.get(2).sendKeys("prasad@gmail.com");
	}
	
	

}
