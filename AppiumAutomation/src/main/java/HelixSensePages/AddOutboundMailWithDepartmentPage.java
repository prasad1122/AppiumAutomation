package HelixSensePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AddOutboundMailWithDepartmentPage extends HelixsensePageBase {

	String senderInformation="DurgaPrasad,ph:8501954946";

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Mail Room Management']")
    WebElement MailRoomManagement;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Outbound']")
    WebElement clickonNew;
	

	@AndroidFindBy (className = "android.widget.Spinner")
    WebElement clickOnspinner;
	

	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Department']")
    WebElement department;

	@AndroidFindBy (className = "android.widget.AutoCompleteTextView")
    List<WebElement> edittext;
	
	@AndroidFindBy (className = "android.widget.EditText")
    List<WebElement> edittextfield;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Medium']")
    WebElement selectMedium;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Register Outbound']")
    WebElement clickonRegisterInbound;
	
	@AndroidFindBy (id = "com.app.hsense.compass:id/edt_notes")
    WebElement description;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Alex']")
    WebElement selectalex;
	
	

	@AndroidFindBy (xpath= "//android.widget.TextView[@text='Outbound Registered']")
    WebElement emp;
	
	@AndroidFindBy (xpath= "//android.widget.Button[@text='OK']")
    WebElement clickOnOk;

	@AndroidFindBy (xpath= "//android.widget.TextView[@text='View all Inbound Mails']")
    WebElement ViewsallInboundMails;

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
     WebElement textview;
	
	@AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout")
    WebElement Dropdown;
	
	@AndroidFindBy (id= "com.app.hsense.compass:id/spn_department")
    WebElement dropdownid;
	
	@AndroidFindBy (id= "com.app.hsense.compass:id/layout_employee")
    WebElement dropdownidemp;
	
	@AndroidFindBy (id= "com.app.hsense.compass:id/edt_shelf")
    WebElement storageLocation;
	
	
	
	
	public AddOutboundMailWithDepartmentPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	public void addOutbounddetails() throws InterruptedException {
		
		MailRoomManagement.click();
		clickonNew.click();
		
		clickOnspinner.click();
		department.click();
		
		Thread.sleep(2000);
		
		
		dropdownid.click();
		edittext.get(0).sendKeys("IT");
		
		TouchAction action = new TouchAction(driver);
		
		int xTapped = edittext.get(0).getLocation().getX() +  edittext.get(0).getSize().getWidth() / 2;
	    int yTapped = edittext.get(0).getLocation().getY() +  edittext.get(0).getSize().getHeight() ;
		
	    System.out.println(xTapped);
	    System.out.println(yTapped);
	       action.tap(PointOption.point(xTapped,yTapped)).perform();
		
		driver.hideKeyboard();
		
		Thread.sleep(2000);
		
		dropdownidemp.click();
		edittext.get(1).sendKeys("pushpalatha");
		
		driver.pressKeyCode(AndroidKeyCode.SPACE);


		
		
		int xTappeded = edittext.get(1).getLocation().getX() +  edittext.get(1).getSize().getWidth() / 2;
	    int yTappeded = edittext.get(1).getLocation().getY() +  edittext.get(1).getSize().getHeight() ;
		
	    System.out.println(xTapped);
	    System.out.println(yTapped);
	       action.tap(PointOption.point(xTappeded,yTappeded)).perform();
		
		driver.hideKeyboard();
		
		Thread.sleep(2000);
		
		edittext.get(2).sendKeys("FedEx India");
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter description\").instance(0))");
		edittextfield.get(0).sendKeys("madhapur,near durgamcheruvu metrostation");
		
		edittextfield.get(1).sendKeys(senderInformation);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter description\").instance(0))");
		storageLocation.sendKeys("Near reception");
		
		
		selectMedium.click();
		
		description.sendKeys("Parcel By motivitylabs  company");
		
		
		clickonRegisterInbound.click();
		
		Thread.sleep(4000);
	}
	
	



	public boolean getStatus() {
		
		return emp.isDisplayed();
		
	}



	public void Inboundverify() {
		
		MailRoomManagement.click();// TODO Auto-generated method stub
		ViewsallInboundMails.click();
	}



	public String getTextcode() {
		// TODO Auto-generated method stub
		return senderInformation;
	}


	public String getTextName() {
		// TODO Auto-generated method stub
		String MyString=textview.getText();
		 MyString = MyString.substring(0,5) + MyString.substring(5+1);
		return MyString.replace("From:","");
	}

	public void clickokay() throws InterruptedException {
		Thread.sleep(4000);
		clickOnOk.click();
	}
	
}
