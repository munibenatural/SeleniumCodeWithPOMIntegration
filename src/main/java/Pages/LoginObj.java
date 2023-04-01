package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class LoginObj extends BasePage {
	
	public WebDriver driver;
	public ElementUtilities util;

	
	public LoginObj(WebDriver driver)
	{
		this.driver=driver;
		util=new ElementUtilities(driver);
		
	}
	By NewCustomerHeader=By.xpath("//h2[text()='New Customer']");
	By continueButton=By.xpath("//a[text()='Continue']");
	By returningCustomer=By.xpath("//h2[text()='Returning Customer']");
	By emailIDLabel=By.xpath("//label[text()='E-Mail Address']");
	By passwordLabel=By.xpath("//label[text()='Password']");
	By emailIDTextBox=By.id("input-email");
	By passwordTextBox=By.id("input-password");
	By forgotPassword=By.xpath("//a[text()='Forgotten Password']");
	By loginButton=By.xpath("//input[@class='btn btn-primary']");
	By LoginWarningMsg=By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");
	
	public String loginPageTitle()
	{
		return util.getPageTitle();
	}
	public boolean verifyNewCustomHeader()
	{
		return util.isElementDisplay(NewCustomerHeader);
	}
	public boolean verifycontinuebutton()
	{
		return util.isElementDisplay(continueButton);
	}
	public boolean verifyReturningCustomer()
	{
		return util.isElementDisplay(returningCustomer);
	}
	public boolean verifyEmailIDLabel()
	{
		return util.isElementDisplay(emailIDLabel);
	}

	public boolean verifyPasswordLabel()
	{
		return util.isElementDisplay(passwordLabel);
	}
	public boolean verifyForgotPassword()
	{
		return util.isElementDisplay(forgotPassword);
	}
	public boolean verifyLoginbtn()
	{
		return util.isElementDisplay(loginButton);
	}
	public boolean verifyEmailIDTextbox()
	{
		return util.isElementDisplay(emailIDTextBox);
	}
	public boolean verifyPasswordTxtbox()
	{
		return util.isElementDisplay(passwordTextBox);
	}
	public void doLogin(String username,String password)
	{
		util.implicitwait(10, TimeUnit.SECONDS);
		util.sendKeys(emailIDTextBox, username);
		util.sendKeys(passwordTextBox, password);
		util.clickEle(loginButton);
	}
	public boolean verifyLogInWarningMessage()
	{
		return util.isElementDisplay(LoginWarningMsg);
	}
	
	

}
