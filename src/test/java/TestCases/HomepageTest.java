package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constants;

public class HomepageTest extends BaseTest {
	
	
	@Test
	public void verifyPageTitle()
	{
		String title=home.getHomePageTitle();
	Assert.assertEquals(title, Constants.homePageTitle);
	}
	
	@Test
	
	public void verifySearchBox()
	{
		boolean search=home.isSearchBoxDisplayed();
		Assert.assertTrue(search);
	}
	
	@Test
	
	public void verifySearchbutton() {
		
		boolean searchButton=home.isSearchBoxDisplayed();
		Assert.assertTrue(searchButton);
		
	}
	@Test
	
	public void verifyMyAccountIsDisplayed()
	{
		boolean b=home.verifyclickOnLogin();
		Assert.assertTrue(b);
	}
	

}
