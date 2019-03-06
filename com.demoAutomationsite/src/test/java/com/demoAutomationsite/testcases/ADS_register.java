package com.demoAutomationsite.testcases;

import org.testng.annotations.Test;

import com.demoAutomationsite.utility.Dataread;
import com.gargoylesoftware.htmlunit.AlertHandler;

public class ADS_register extends BaseClass_ADS {

	@Test
	public void register_ads() throws Exception {

		/*register_page.Register(dr.ReadDat(2, 0), dr.ReadDat(2, 1), dr.ReadDat(2, 2));
		Tables.Table_view();*/
		
		module.clickon_switchedToalert(); 
		//alert_handle.alert_ok();
		alert_handle.alert_okCancel();
		//alert_handle.alert_textbox();

	}

}
