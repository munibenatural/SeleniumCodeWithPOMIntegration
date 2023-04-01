package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constants;

public class LoginpageTest extends BaseTest {
	
	@Test
	public void verifyPageTitle()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		String pageTitle=login.loginPageTitle();
		Assert.assertEquals(pageTitle, Constants.loginPageTitle);
	}
	@Test
	public void verifyHeaderText()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyNewCustomHeader();
		Assert.assertTrue(ht);
	}
	@Test
	public void verifyContinueButton()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifycontinuebutton();
		Assert.assertTrue(ht);
	}
	@Test
	public void verifyReturningCustomer()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyReturningCustomer();
		Assert.assertTrue(ht);
	}
	@Test
	public void verifyEmaillabel()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyEmailIDLabel();
		Assert.assertTrue(ht);
	}
	@Test
	public void verifyForgotPasswordLink()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyForgotPassword();
		Assert.assertTrue(ht);
	}
	@Test
	public void verifyLoginbtn()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyLoginbtn();
		Assert.assertTrue(ht);
	}
	
	@Test
	public void verifyEmailIDTextBox()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyEmailIDTextbox();
		Assert.assertTrue(ht);
	}
	@Test
	public void verifyPasswordLabel()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyPasswordLabel();
		Assert.assertTrue(ht);
	}
	@Test
	public void verifyPasswordTextBox()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		boolean ht=login.verifyPasswordTxtbox();
		Assert.assertTrue(ht);
	}
	@Test
	public void Login()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		
		login.doLogin(prop.getProperty("Validusername"), prop.getProperty("Validpassword"));
	}
	@Test
	public void LoginWithInvalidUsernameandPassword()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		
		login.doLogin(prop.getProperty("Invalidusername"), prop.getProperty("Invalidpassword"));
	Assert.assertTrue(login.verifyLogInWarningMessage());
	}
	@Test
	public void LoginWithvalidUsernameandInvalidPassword()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		
		login.doLogin(prop.getProperty("Validusername"), prop.getProperty("Invalidpassword"));
	Assert.assertTrue(login.verifyLogInWarningMessage());
	}
	@Test
	public void LoginWithInvalidUsernameandvalidPassword()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		
		login.doLogin(prop.getProperty("Invalidusername"), prop.getProperty("Validpassword"));
	Assert.assertTrue(login.verifyLogInWarningMessage());
	}
	@Test
	public void LoginWithvalidUsernameandEmptyPassword()
	{
		home.clickOnMyAccount();
		home.clickOnLogin();
		
		login.doLogin(prop.getProperty("Validusername"), prop.getProperty(""));
	Assert.assertTrue(login.verifyLogInWarningMessage());
	}

}
