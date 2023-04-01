package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constants;

public class RagisterPageTest extends BaseTest {
	
	@Test
	public void verifyPageTitle()
	{
		home.clickOnMyAccount();
		home.clickOnRegister();
		String pageTitle=regi.verifyRegisterPageTitle();
		Assert.assertEquals(pageTitle, Constants.RegisterPageTitle);
		
	}
	@Test
	public void verifyHeaderText()
	{
		home.clickOnMyAccount();
		home.clickOnRegister();
		boolean bl=regi.verifyHeaderText();
		Assert.assertTrue(bl);
	
		
	}
	@Test
	
	public void verifyUserRegistration()
	{
		home.clickOnMyAccount();
		home.clickOnRegister();
		regi.registerPage("Test", "Test", "test1@gmail.com", "9876543217", "Test@123","Test@123","Yes");
		
		Assert.assertEquals(act.verifySuccessMessage(), Constants.SuccessPage);
	}

}
