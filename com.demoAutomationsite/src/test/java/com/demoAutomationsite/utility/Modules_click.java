package com.demoAutomationsite.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Modules_click {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
	WebElement switchto_click;

	@FindBy(xpath = "//a[contains(text(),'Alerts')]")
	WebElement switchto_Alert;
	
	@FindBy(xpath="//a[contains(text(),'Register')]") WebElement register_click;
	public Modules_click(WebDriver driver) {
		
		this.driver=driver;
	
	}
	
	
	public void clickon_register() {
		
		register_click.click();
	}

	
	
    public void clickon_switchedToalert() {
		
		
		switchto_click.click();

		Actions moveTo_alert = new Actions(driver);
		moveTo_alert.moveToElement(switchto_Alert).click().build().perform();
		
	}
}
