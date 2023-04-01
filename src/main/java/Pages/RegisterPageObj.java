package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class RegisterPageObj extends BasePage {

	public WebDriver driver;
	public ElementUtilities utils;

	public RegisterPageObj(WebDriver driver) {
		this.driver = driver;
		utils = new ElementUtilities(driver);
	}

	By pageHeader = By.xpath("//h1[text()='Register Account']");
	By firstNametxtbx = By.id("input-firstname");
	By lastNametxtbx = By.id("input-lastname");
	By emailTxtbx = By.id("input-email");
	By telephoneTxtBx = By.id("input-telephone");
	By passwordTxtbx = By.id("input-password");
	By confirmPasswordtxtbx = By.id("input-confirm");
	By subscribeYes = By.xpath("//label[@class='radio-inline'][1]");
	By subscribeNo = By.xpath("//label[@class='radio-inline'][2]");
	By agreechkbx = By.xpath("//input[@name='agree']");
	By continurBtn = By.xpath("//input[@value='Continue']");

	public String verifyRegisterPageTitle() {
		return utils.getPageTitle();
	}

	public boolean verifyHeaderText() {

		return utils.isElementDisplay(pageHeader);
	}

	public void registerPage(String firstName, String lastName, String email, String mobileNumberm, String password,
			String cnfrmPassword, String subscribe) {
		
		utils.sendKeys(firstNametxtbx, firstName);
		utils.sendKeys(lastNametxtbx, lastName);
		utils.sendKeys(emailTxtbx, email);
		utils.sendKeys(telephoneTxtBx, mobileNumberm);
		utils.sendKeys(passwordTxtbx, password);
		utils.sendKeys(confirmPasswordtxtbx, cnfrmPassword);
		
		if(subscribe.equalsIgnoreCase("Yes"))
		{
			utils.clickEle(subscribeYes);
		}
		else
		{
			utils.clickEle(subscribeNo);
		}
		utils.clickEle(agreechkbx);
		utils.clickEle(continurBtn);

	}

}
