package com.Automation.PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class JabaTalksPageObject {

	
	
	public static WebDriver driver;
	
	public static final By selectLanguage = By.xpath("//div[@id='language']"); 
	public static final By english = By.xpath("//a/div[text()='English']"); 
	public static final By dutch = By.xpath("//a/div[text()='Dutch']"); 
	public static final By fullName = By.id("name"); 
	public static final By orgName = By.id("orgName"); 
	public static final By email = By.id("singUpEmail"); 
	public static final By agreeCheckbox = By.xpath("//input[@type='checkbox']//following::span[1]"); 
	public static final By getstartedbtn = By.xpath("//button[text()='Get Started']");



	public void LoginIntoJaba() {
	
	driver.findElement(selectLanguage).click();
	
    String English = driver.findElement(english).getText();
    String Dutch = driver.findElement(dutch).getText();

    Assert.assertEquals(English, "English");
    System.out.println(English +"  Language is displayed ");
    Assert.assertEquals(Dutch, "Dutch");
    System.out.println(Dutch +"  Language is displayed ");

    
    //Enter Full name
    driver.findElement(fullName).sendKeys("Nikita Aiwale");

    //Enter Org name
    driver.findElement(orgName).sendKeys("Jade Global Software");

    //Enter Email
    driver.findElement(email).sendKeys("nikitaaiwale@gmail.com");
    
    //Click on Agree checkbox
	driver.findElement(agreeCheckbox).click();
	
    //Click on Get started
    driver.findElement(getstartedbtn).submit();


	
	}
	
	

}
