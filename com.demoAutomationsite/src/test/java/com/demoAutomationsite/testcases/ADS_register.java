package com.demoAutomationsite.testcases;

import org.testng.annotations.Test;

public class ADS_register extends BaseClass_ADS {
	
	
	@Test
	public void register_ads() throws InterruptedException {
	
		
		register_page.Register("Jomy", "George");

        
	}

}
 