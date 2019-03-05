package com.demoAutomationsite.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class com_ADS_alerts_pages {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
	WebElement switchto_click;
	@FindBy(xpath = "//a[contains(text(),'Alerts')]")
	WebElement switchto_Alert;
	@FindBy(id = "OKTab")
	WebElement AlertWithOk;
	@FindBy(xpath = "//a[contains(text(),'Alert with OK & Cancel')]")
	WebElement Alertokcancel_tab;
	@FindBy(id = "CancelTab")
	WebElement Alertokcancel_click;

	@FindBy(id = "demo")
	WebElement message_okCancel;
	
	@FindBy(xpath="//a[contains(text(),'Alert with Textbox')]") WebElement alertTextbox_tab;
	@FindBy(xpath ="//div[@class='Textbox']//button") WebElement Alertwithtext_click;

	public com_ADS_alerts_pages(WebDriver driver) {

		this.driver = driver;

	}

	public void alert_ok() {

		switchto_click.click();

		Actions moveTo_alert = new Actions(driver);
		moveTo_alert.moveToElement(switchto_Alert).click().build().perform();
		AlertWithOk.click();

		Alert alert_ok = driver.switchTo().alert();

		alert_ok.accept();

		

	}
	
	public void alert_okCancel(){
		
		Alertokcancel_tab.click();

		Alertokcancel_click.click();

		Alert Okcancel_Alert_ok = driver.switchTo().alert();
		Okcancel_Alert_ok.dismiss();
		String actual = message_okCancel.getText();
		String Expected = "You Pressed Cancel";

		Assert.assertEquals(Expected, actual);

		Alertokcancel_click.click();
		Okcancel_Alert_ok.accept();

		String actual1 = message_okCancel.getText();
		String Expected1 = "You pressed Ok";

		Assert.assertEquals(Expected1, actual1);
		
	}
	
	public void alert_textbox() {
		
		alertTextbox_tab.click();
		Alertwithtext_click.click();
	}
}
