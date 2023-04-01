package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;
	Properties prop;

	public WebDriver inIt(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

		} else {
			System.out.println("Enter correct browser name");
		}
		return driver;
	}

	public Properties init_Properties() {
		prop = new Properties();
		String path = "C:\\Users\\Hemanth S\\eclipse-workspace\\POMIntegration\\src\\main\\java\\ConfigProperties\\Config.properties";
		try {
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
