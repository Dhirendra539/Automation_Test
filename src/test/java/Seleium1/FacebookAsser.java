package Seleium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class FacebookAsser {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }
     
    @Test
    public void GetUrl(){
        String expected  = "https://www.facebook.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Text should match");        
    }

    @Test
    public void GetTitle(){
        String expected = "Facebook – log in or sign up";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Text should match");
        
    }

    @Test
    public void DisplayedEmail(){
       WebElement enabled =  driver.findElement(By.xpath("//input[@id='email']"));
       Assert.assertTrue(enabled.isDisplayed(), "Input field is displayed");

    }

    @Test
    public void DisplayedPassword(){
       WebElement enabled =  driver.findElement(By.xpath("//input[@id='pass']"));
       Assert.assertTrue(enabled.isDisplayed(), "Password field is displayed");

    }

    @Test
    public void EnabledLoginButton(){
       WebElement enabled =  driver.findElement(By.xpath("//button[@name='login']"));
       Assert.assertTrue(enabled.isEnabled(), "LogIn button is enabled");

    }

    @Test
    public void EnabledCreateNew(){
       WebElement enabled =  driver.findElement(By.xpath("//div[@Class='_6ltg']//a"));
       Assert.assertTrue(enabled.isEnabled(), "Create New Account button is enabled");
       driver.quit();

    }

    
    
    
}
