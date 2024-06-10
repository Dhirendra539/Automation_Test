package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Jobseeker Login']")
	WebElement JobseekerLogin;
																	//Locators
	
	@FindBy(xpath="//input[contains(@placeholder, 'Enter your active')]")
	WebElement Email;
	
	@FindBy(xpath= "//input[contains(@placeholder, 'Enter your password')]")
	WebElement Password;
	
	
	@FindBy(xpath="//button[text() = 'Login']")
	WebElement Login;
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;										//PageFactory to initialize the values of webElements whenever it is called
		PageFactory.initElements(driver , this);						// to do Lazy Initialization 
	}
	
	public void EmailId(String id) {								//Methods 
		Email.sendKeys(id);
	}
	
	public void Pswrd(String pswd) {
		Password.sendKeys(pswd);
	}
	
	public void Loginclick() {
		Login.click();
	}
	
		
	
	
}