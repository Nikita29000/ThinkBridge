package com.JabaTalksTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automation.PageObject.JabaTalksPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends JabaTalksPageObject {
	JabaTalksPageObject jaba = new JabaTalksPageObject();
	
	@BeforeMethod
	public void setProperty() {
		WebDriverManager.chromedriver().setup();
	}
	

	@BeforeTest
	public void launchUrl() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void TestLogin() {
		
		jaba.LoginIntoJaba();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}
	
	@AfterMethod
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}



}
