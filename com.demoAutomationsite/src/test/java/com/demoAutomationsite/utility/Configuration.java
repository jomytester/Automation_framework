package com.demoAutomationsite.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {

	Properties pro;
	
	public Configuration() throws Exception {
		
		File src = new File("./Config/config_demo.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			 System.out.println("Unable to configure the data" +e.getMessage());
			
		}
		

	}
	
	
	public String  setup_browser() {
		
		return pro.getProperty("Browser");
	}
	
	public String Url_passing() {
		
		return pro.getProperty("URL");
	}
}
