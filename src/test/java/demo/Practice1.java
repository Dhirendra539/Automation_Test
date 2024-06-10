package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Practice1 {
	WebDriver driver;
	
	@BeforeTest
	public void facebook() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void getTitle() {
		String exp = "Facebook – log in or sign up";
		String actual = driver.getTitle();
		Assert.assertEquals(actual,exp , "Title is matched");
	}
	
	@Test
	public void email() {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
	}
	
	@Test
	public void Login() {
		Assert.assertTrue(driver.findElement(By.xpath("//button[@name='login']")).isEnabled(), "True");
	}
}
