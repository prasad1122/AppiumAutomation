package HelixSenseTests;
import static java.lang.Thread.sleep;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import HelixSensePages.HelixSenseLoginPage;
import io.appium.java_client.MobileElement;


public class LoginTest extends HelixSenseTestBase {
	
	HelixSenseLoginPage loginpage;
	@Test
	 public void HelixSenseLogIn() throws InterruptedException, IOException {
		loginpage=new HelixSenseLoginPage(driver);
		boolean status=loginpage.getStatus();
		Assert.assertTrue(status,"ERROR!Log in failed");
		testReport.info("User Email id"+":"+testConfig.getProperty("username"));
		testReport.info("User Password"+ ":"+testConfig.getProperty("password"));
		testReport.info("User Login Successful");
		testReport.info("Validate HelixsenseApplogin ");
}
}
