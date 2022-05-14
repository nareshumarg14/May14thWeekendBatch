package com.Orangehrm.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Orangehrm.baseTest.BaseClass;
import com.Orangehrm.pageObjects.DashboardPage;
import com.Orangehrm.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_UserLogin extends BaseClass{
		
	@Test
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		
		lp.setUsername(prop.getProperty("appusername"));
		lp.setPassword(prop.getProperty("apppassword"));
		lp.clickLoginButton();
		
		boolean status = dp.dashboardLinkDisplayedStatus();
		Assert.assertEquals(status, true,"User did not logged into application successfully");
		//System.out.println("User has logged into application successfully");
		logger.info("User has logged into application successfully");
		
	}
	
	
}
