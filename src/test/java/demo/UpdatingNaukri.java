package demo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.LoginPage;

import utils.ExcelReader;

public class UpdatingNaukri extends BaseTest {
	
		WebDriver driver;
		
		
		ExcelReader excel = new ExcelReader();
		
		@Test
		public void LoginNaukri() {
		LoginPage lp = new LoginPage(driver);
		
		
			lp.EmailId("dmhr539@gmail.com");
			lp.Pswrd("Naukri@539");
			lp.Loginclick();
			Assert.assertFalse(true, "Login Successfully");
			
		}
		
		
		
	

}
