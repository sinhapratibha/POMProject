
	package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.testng.Assert;



	public class DashboardPage {
		WebDriver driver;
		
		public DashboardPage(WebDriver driver) {
			this.driver = driver;
			
		}

		@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
		
		public void validateDashboardPage(String validationText) {
			
			Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), validationText,"Dashboard is not available");
			//We do not hard code which means we can't write "Dashboard" after getText()
			//We use a variable in line 15 and 17, validationText, to pass the string value
			
		}
	

}
