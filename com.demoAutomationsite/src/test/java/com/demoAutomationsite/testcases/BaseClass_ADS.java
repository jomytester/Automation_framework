package com.demoAutomationsite.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.demoAutomationsite.pages.com_ADS_Register_pages;
import com.demoAutomationsite.pages.com_ADS_WebTable_pages;
import com.demoAutomationsite.pages.com_ADS_alerts_pages;
import com.demoAutomationsite.utility.Configuration;
import com.demoAutomationsite.utility.Dataread;
import com.demoAutomationsite.utility.browserFactory_demoSite;

public class BaseClass_ADS {
	
	
	public WebDriver driver;
	
	public com_ADS_Register_pages register_page;
	public Configuration configuration;
	public browserFactory_demoSite browser;
    public Dataread dr;
    public com_ADS_WebTable_pages Tables;;
    public com_ADS_alerts_pages alert_handle;
	
	@BeforeSuite
	public void method_initial() throws Exception {
		
		register_page = new com_ADS_Register_pages(driver);
		configuration = new Configuration();
		browser = new browserFactory_demoSite();
		dr = new Dataread();
		Tables = new com_ADS_WebTable_pages(driver);
		alert_handle = new com_ADS_alerts_pages(driver);
	}
	
	
	@BeforeMethod
	public void browser_starts() {
		
		
		driver = browserFactory_demoSite.Browser_selection(configuration.setup_browser(),configuration.Url_passing());
		register_page = PageFactory.initElements(driver, com_ADS_Register_pages.class);
		Tables = PageFactory.initElements(driver,com_ADS_WebTable_pages.class);
		alert_handle = PageFactory.initElements(driver, com_ADS_alerts_pages.class);
	}

	
	
	
}
