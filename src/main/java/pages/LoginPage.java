package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		//in the statement above this.driver has the driver from line 10 and = driver is the driver from line 13
		//basically driver from Browserfactory class(line 11) gets stored in driver in LoginTest class(line17) 
		//which then gets used in line 19 driver which in turn is connected to driver in LoginPage class (line 13)
		//we connect it to this.driver in line 15 and store it in driver from line 11 of LoginPage class
		//this all means now driver from LoginPage class line 11 is the same as driver in BrowserFactory class drive line 11
		//also notice that all these drivers are written in blue
	}
	
	//Below is the method we used before to test the web elements on a website using testng
	//WebElement UserNameElement = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By UserNameField = By.xpath("//*[@id=\"username\"]")
	
	//Below is what industry standard is to test elements on a web page in Page Object Model
	//Always use findby
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//To enter values we can use the following methods (you can enter values in independent methods lines 26-36)  
	//or enter values in one method like in lines 38-42
	
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
		
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	public void performLogin(String userName, String password ) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
	}
}
