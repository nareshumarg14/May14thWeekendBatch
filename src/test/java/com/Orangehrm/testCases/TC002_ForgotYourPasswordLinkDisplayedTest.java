package com.Orangehrm.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orangehrm.baseTest.BaseClass;
import com.Orangehrm.pageObjects.LoginPage;

public class TC002_ForgotYourPasswordLinkDisplayedTest extends BaseClass{
	
	@Test
	public void forgotYourPasswordTest() {
		LoginPage lp = new LoginPage(driver);
		boolean retVal = lp.forgotYourPasswordLinkStatus();
		Assert.assertTrue(retVal,"Forgot your password? link is missing");
		//System.out.println("Forgot your password? link is existing");
		logger.info("Forgot your password? link is existing");
		
	}

}
