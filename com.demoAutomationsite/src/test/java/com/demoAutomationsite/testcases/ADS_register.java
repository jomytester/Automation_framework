package com.demoAutomationsite.testcases;

import org.testng.annotations.Test;

import com.demoAutomationsite.utility.Dataread;

public class ADS_register extends BaseClass_ADS {
	
	
	@Test
	public void register_ads() throws Exception {
	
		
		Dataread dr = new Dataread();
		register_page.Register(dr.ReadDat(0, 0), dr.ReadDat(0, 1),dr.ReadDat(0, 2));
	
	}

}
 