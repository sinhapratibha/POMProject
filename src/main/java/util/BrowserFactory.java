package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver init() {
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.techfios.com/billing/?ng=login/");
	return driver;
	}

	public static WebDriver teardown()
	{
		driver.close();
		driver.quit();
		return driver;
	}
}
