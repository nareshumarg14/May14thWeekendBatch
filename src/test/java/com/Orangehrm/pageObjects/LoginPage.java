package com.Orangehrm.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.baseTest.BaseClass;


public class LoginPage extends BaseClass{
	
	//1
	public WebDriver driver;
	
	//2 Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//3. Locator for Username field
	@FindBy(id="txtUsername")
	WebElement txtUname;
	
	//4. Locator for Password field
	@FindBy(name="txtPassword")
	WebElement txtPwd;
	
	//5. Locator for Login Button
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnlogin;
	
	//Locator for Forgot your password?
	@FindBy(id="forgotPasswordLink")
	WebElement forgotYourPasswordLnk;
		
		
	//6. Method to enter value in Username field.
	public void setUsername(String uname) {
		txtUname.clear();
		txtUname.sendKeys(uname);
		String val = txtUname.getAttribute("value");
		//System.out.println("Username entered is - " + val);
		logger.info("Username entered is - " + val);
		
	}
	
	//7. Method to enter value in Password field.
	public void setPassword(String pwd) {
		txtPwd.clear();
		txtPwd.sendKeys(pwd);
		String val = txtPwd.getAttribute("value");
		//System.out.println("Password entered is - " + val);
		logger.info("Password entered is - " + val);
	}
	
	//8. Click on Login button
	public void clickLoginButton() {
		btnlogin.click();
		//System.out.println("Clicked on Login button");
		logger.info("Clicked on Login button");
	}
	
	public boolean forgotYourPasswordLinkStatus() {
		boolean status = forgotYourPasswordLnk.isDisplayed();
		return status;
	}
	

}
