package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class HomePageObj extends BasePage {
	WebDriver driver;
	ElementUtilities utilities;
	
	public HomePageObj(WebDriver driver)
	{
		this.driver=driver;
		utilities=new ElementUtilities(driver);
	}
	By searchBox=By.name("search");
	By searchButton=By.xpath("//button[@class='btn btn-default btn-lg']");
	By  cart=By.xpath("//span[@id='cart-total']");
	By currency=By.xpath("//span[text()='Currency']");
	
	By Register=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']");
	By Login=By.xpath("//a[text()='Login']");
	
	By myAccount=By.xpath("//span[text()='My Account']");
	public String getHomePageTitle()
	{
		return utilities.getPageTitle();
	}
	
	public boolean isSearchBoxDisplayed()
	{
		return utilities.isElementDisplay(searchBox);
	}
	public void entertextinsearchbox(String value)
	{
		 utilities.sendKeys(searchBox, value);
	}
	public boolean isSearcButtonDisplayed()
	{
		return utilities.isElementDisplay(searchButton);
	}
	public void clickOnSearcButton()
	{
		utilities.clickEle(searchButton);
	}
	public void clickOnRegister()
	{
		utilities.clickEle(Register);
	}
	public void clickOnLogin()
	{
		utilities.clickEle(Login);
	}
	public void clickOnMyAccount()
	{
		utilities.clickEle(myAccount);
	}
	public boolean verifyclickOnLogin()
	{
		return utilities.isElementDisplay(Login);
	}



}
