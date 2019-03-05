package com.demoAutomationsite.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class browserFactory_demoSite {


	static WebDriver driver;
	
	
	public static WebDriver Browser_selection(String browsername , String URL) {
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
		
		
		
	}
	
	
	public static void browser_quit() {
		
		driver.quit();
	}
	
	public static void browser_close() {
		
		driver.close();
	}
}
