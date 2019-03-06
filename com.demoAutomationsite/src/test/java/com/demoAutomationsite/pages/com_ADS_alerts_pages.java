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
	Alert globalAlertswitch;

	

	@FindBy(id = "OKTab")
	WebElement AlertWithOk;

	@FindBy(xpath = "//a[contains(text(),'Alert with OK & Cancel')]")
	WebElement Alertokcancel_tab;

	@FindBy(id = "CancelTab")
	WebElement Alertokcancel_click;

	@FindBy(id = "demo")
	WebElement message_okCancel;

	@FindBy(xpath = "//a[contains(text(),'Alert with Textbox')]")
	WebElement alertTextbox_tab;

	@FindBy(xpath = "//button[@onclick='promptbox()']")
	WebElement Alertwithtext_click;

	@FindBy(id = "demo1")
	WebElement message_promptbox;

	public com_ADS_alerts_pages(WebDriver driver) {

		this.driver = driver;

	}

	
	
	public void alert_ok() {

	
		
		AlertWithOk.click();
		globalAlertswitch = driver.switchTo().alert();

		globalAlertswitch.accept();

	}

	public void alert_okCancel() {

		Alertokcancel_tab.click();

		Alertokcancel_click.click();

		globalAlertswitch = driver.switchTo().alert();
		globalAlertswitch.dismiss();

		String actual = message_okCancel.getText();
		String Expected = "You Pressed Cancel";
		Assert.assertEquals(Expected, actual);

		Alertokcancel_click.click();
		globalAlertswitch.accept();

		String actual1 = message_okCancel.getText();
		String Expected1 = "You pressed Ok";

		Assert.assertEquals(Expected1, actual1);

	}

	public void alert_textbox() {

		alertTextbox_tab.click();

		Alertwithtext_click.click();

		globalAlertswitch = driver.switchTo().alert();

		globalAlertswitch.dismiss();

		Alertwithtext_click.click();

		globalAlertswitch.sendKeys("jomy george");

		
		String expected = "jomy george";

		globalAlertswitch.accept();

		String actual = message_promptbox.getText();
		
		System.out.println(actual);

		if (actual.contains(expected)) {

			System.out.println("Condition passed");
		} else {

			System.out.println("Condition Failed");
		}

	}
}
