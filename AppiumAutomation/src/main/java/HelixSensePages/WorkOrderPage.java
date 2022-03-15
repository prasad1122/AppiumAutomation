package HelixSensePages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;



public class WorkOrderPage extends HelixsensePageBase {

	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to New Work Orders']")
    WebElement clickOnGoToNewWorkOrders;
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Go to Started Work Orders']")
    WebElement clickOnGoToStartedWorkOrders;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Work Orders']")
    WebElement clickOnWorkOrders;
	
	public WorkOrderPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnNewOrders() {
		
		clickOnWorkOrders.click();
		clickOnGoToNewWorkOrders.click();

		
		// TODO Auto-generated method stub
		
	}

	public boolean getStatus() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		return clickOnWorkOrders.isDisplayed();
	}

	public void clickOnStartedOrders() {
		clickOnWorkOrders.click();
		// TODO Auto-generated method stub
		clickOnGoToStartedWorkOrders.click();
	}

	

}
