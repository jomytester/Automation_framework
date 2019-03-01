package com.demoAutomationsite.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class com_ADS_Register_pages {

	WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy(xpath = "//*[@id=\"eid\"]/input")
	WebElement Mail_id;

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	WebElement phone_num;

	@FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']//label")
	List<WebElement> gender;

	@FindBy(tagName = "input")
	List<WebElement> hobbies;

	@FindBy(id = "Skills")
	WebElement Skills;

	@FindBy(xpath = "//select[@id='Skills']//option")
	List<WebElement> Skills_list;

	@FindBy(id = "countries")
	WebElement country;

	@FindBy(xpath = "//select[@id='countries']//option")
	List<WebElement> country_choose;

	@FindBy(xpath = "//span[@class ='select2-selection select2-selection--single']")
	WebElement country_search;
	@FindBy(className = "select2-search__field")
	WebElement search_country;

	@FindBy(id = "yearbox")
	WebElement year_select;

	@FindBy(id = "imagesrc")
	WebElement upload;

	@FindBy(id = "submitbtn")
	WebElement submit_btn;

	@FindBy(id = "Button1")
	WebElement refersh_btn;

	@FindBy(xpath = "//select[@placeholder= 'Month']//option")
	WebElement month_select;

	public com_ADS_Register_pages(WebDriver driver) {

		this.driver = driver;

	}

	public void Register(String first_name, String last_name, String emailid) throws InterruptedException {

		firstname.sendKeys(first_name);
		lastname.sendKeys(last_name);
		Mail_id.sendKeys(emailid);
		phone_num.sendKeys("9876543217");

		for (int i = 0; i < gender.size(); i++) {

			if (gender.get(i).getText().equalsIgnoreCase("male"))

			{
				gender.get(i).click();
			}
		}

		for (int i = 0; i < hobbies.size(); i++) {

			if (hobbies.get(i).getAttribute("type").trim().equalsIgnoreCase("checkbox")) {
				if ((hobbies.get(i).getAttribute("value").trim().equals("Movies"))) {
					hobbies.get(i).click();
				}

			}

		}

		Skills.click();

		for (int i = 0; i < Skills_list.size(); i++) {

			if (Skills_list.get(i).getText().equalsIgnoreCase("Analytics")) {

				Skills_list.get(i).click();

			}
		}

		Select dropdown_country = new Select(country);
		dropdown_country.selectByVisibleText("India");

		/*
		 * for (int i = 0; i < country_choose.size(); i++) {
		 * 
		 * if (country_choose.get(i).getText().equalsIgnoreCase("indiA")) {
		 * 
		 * country_choose.get(i).click();
		 * 
		 * } }
		 */

		country_search.click();
		search_country.sendKeys("india");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("select2-country-results"))).click().build().perform();

		Select year_selection = new Select(year_select);
		year_selection.selectByVisibleText("1995");
		
		/*Select month_selection = new Select(month_select);
		month_selection.selectByVisibleText(arg0);*/

		// refersh_btn.click();

		upload.sendKeys("C:\\Users\\innobot-win-user-2\\Downloads\\1. Preview Page.png");

		submit_btn.click();

	}

}
