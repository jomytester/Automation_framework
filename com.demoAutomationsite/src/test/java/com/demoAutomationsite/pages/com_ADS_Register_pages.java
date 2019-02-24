package com.demoAutomationsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class com_ADS_Register_pages {
	
	WebDriver driver;
	

	@FindBy(xpath="//input[@placeholder='First Name']") WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']") WebElement lastname;
	

	public com_ADS_Register_pages(WebDriver driver) {
		
		this.driver= driver;
		
	}

	   public void Register(String first_name,String last_name) {
		
		firstname.sendKeys(first_name);
		lastname.sendKeys(last_name);
		
	}
	
	
	
	
	
}
