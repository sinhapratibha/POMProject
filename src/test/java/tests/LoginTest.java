package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;

import util.BrowserFactory;

public class LoginTest {
	
	//declare the global variable webDriver driver to match the driver that is returned in init method
	
	WebDriver driver;
	//To do the test, you have to write the annotations 
	@Test
	
	public void validUserShouldBeAbleToLogin() {
		
		//How do we call a method from another class/package (example -methods for browser 
		//and login page features) - by creating objects from each method in pages package
		//using Inheritance (but for inheritance, we have to have the methods in the same package)
		//calling the methods by the name of the class
		//before using BrowserFactory init method, you need to make init method static there
		//and that will require static in front of webdriver too
		
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		
		BrowserFactory.teardown();
	}
	
//@AfterMethod
	//public void WebpageTeardown() {
		//driver = BrowserFactory.teardown();
		
		//}
		
	
}
