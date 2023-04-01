package Utilities;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class ElementUtilities extends BasePage {
	
	WebDriver driver;
	
	public ElementUtilities(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//get WebElement
	public WebElement getWebElement(By Locator)
	{
		WebElement element=driver.findElement(Locator);
		return element;
	}
	//do click
	public void clickEle(By Locator)
	{
		getWebElement(Locator).click();
	}
	//do sendkeys
	public void sendKeys(By Locator,String value)
	{
		getWebElement(Locator).sendKeys(value);
	}
	//getPageTitle
	public String getPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	//getText
	public String getText(By Locator)
	{
		String text=getWebElement(Locator).getText();
		
		return text;
		
		
	}
	//get attribute
	public String getElementAttribute(By Locator,String value)
	{
		String attribute=getWebElement(Locator).getAttribute(value);
		return attribute;
	}
	//element display
	public boolean isElementDisplay(By Locator)
	{
		boolean b=getWebElement(Locator).isDisplayed();
		return b;
	}
	//element enabled
	
	public boolean isEnabled(By Locator)
	{
		boolean b=getWebElement(Locator).isDisplayed();
		return b;
	}
	
	public List<WebElement> getWebElements(By Locator)
	{
		List<WebElement> elements=driver.findElements(Locator);
		return elements;
	}
	public void alerAccept()
	{
		driver.switchTo().alert().accept();
	}
	public void alertdismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	//select value in dropdown by selectbyvisibletext
	
	public void selectByVisibleText(By Locator,String value)
	{
		WebElement element=getWebElement(Locator);
		Select sl=new Select(element);
		sl.selectByVisibleText(value);
	}
	public void selectByIndex(By Locator,int index)
	{
		WebElement element=getWebElement(Locator);
		Select sl=new Select(element);
		sl.selectByIndex(index);
	}
	public Timeouts implicitwait(long time,TimeUnit unit)
	{
		return driver.manage().timeouts().implicitlyWait(time, unit);
		
	}
	public void switchToWindow(WebDriver driver, String windowTitle) {
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String handle : windowHandles) {
	        driver.switchTo().window(handle);
	        String title = driver.getTitle();
	        if (title.equals(windowTitle)) {
	            break;
	        }
	    }
	}

	
	//select value in dropdown by selectvalue method
	//do alert close
	//Enter text from alert
	//get text from alert
	//do click with action
	//do sendkeys with action class
	//do right click 
	//do double click 
	//do mouse hover
	//do drag and drop
	//handle multiple windows
	//handle multiple tabs
	//
	


}
