package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
	
	protected WebDriver driver;
	
	
	
	public void setUp(){
		
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	
	public void QuitDriver() {
		if(driver != null) {
		driver.quit();
		}
	}

}
