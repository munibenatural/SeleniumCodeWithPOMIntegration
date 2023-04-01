package Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.AccountCreationSuccessPageObj;
import Pages.HomePageObj;
import Pages.LoginObj;
import Pages.RegisterPageObj;

public class BaseTest {

	public WebDriver driver;
	public BasePage base1;
	public Properties prop;
	public HomePageObj home;
	public LoginObj login;
	public RegisterPageObj regi;
	public AccountCreationSuccessPageObj act;
	@BeforeMethod
	public void doSetUp()
	{
		base1=new BasePage();
		prop=base1.init_Properties();
		driver=base1.inIt(prop.getProperty("browser"));
		home=new HomePageObj(driver);
		login=new LoginObj(driver);
		regi=new RegisterPageObj(driver);
		act=new AccountCreationSuccessPageObj(driver);
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
