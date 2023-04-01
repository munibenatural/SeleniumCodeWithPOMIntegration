package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class AccountCreationSuccessPageObj extends BasePage {
	
	WebDriver driver;
	ElementUtilities utilities;
	
	public AccountCreationSuccessPageObj(WebDriver driver)
	{
		this.driver=driver;
		utilities=new ElementUtilities(driver);
	}
	//By successmsg=By.xpath("//h1[text()='Your Account Has Been Created!']");

	public String verifyAccountcreationTitle()
	
	{
		return utilities.getPageTitle();
	}
	public String verifySuccessMessage()
	{
		return utilities.getPageTitle();
	}
	/*
	 * public String verifywindowswitching() { return
	 * utilities.switchToWindow(driver,); }
	 */
}
