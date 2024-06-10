package demo;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseTest_GitPush {
	
	private WebDriver driver;
	
	
	@Test
	public void Login() throws Exception {
		
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		
		
		File src = new File("C:\\Users\\272242\\OneDrive\\Desktop\\Selenium Testing\\demo\\src\\main\\resources\\Excel\\Test Data.xlsx");
		
		FileInputStream wbook = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(wbook);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		String id = sheet.getRow(1).getCell(0).getStringCellValue();
		String pswrd = sheet.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Enter your active')]")).sendKeys(id);
		
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Enter your password')]")).sendKeys(pswrd);

		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
		
		
		
	}

}
