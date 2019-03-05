package com.demoAutomationsite.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class com_ADS_WebTable_pages {
	
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//div[@class='ui-grid-canvas']//div//div" ) List<WebElement> Table_data;
	
	
	
	public com_ADS_WebTable_pages(WebDriver driver) {
		
		
		this.driver = driver;
	}
	
	
	
	public void Table_view() {
		
		
		for(int i=0;i<Table_data.size();i++)
		{
			
			if(Table_data.get(i).getText().contains("j@mailinator.com"))
			{
			    String val = Table_data.get(i).getText();
			
			 System.out.println(val);
			
			}
		}
		
		
	}

}
