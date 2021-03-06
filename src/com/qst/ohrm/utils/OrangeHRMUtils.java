package com.qst.ohrm.utils;

import org.openqa.selenium.WebDriver;


public class OrangeHRMUtils extends ConfigFileReader {
	/**
	 * @author aravinda
	 * @param url
	 */
	
	public static void launchApp(WebDriver driver , String url) {
		Log.info("Launching the applicaiton ..." + url);
		driver.get(url);
		
		Log.info("Application Launched Successfully..");
	}
	public static void launchRemoteApp(WebDriver driver , String url) {
		Log.info("Launching the applicaiton ..." + url);
		driver.navigate().to(url);
		
		Log.info("Application Launched Successfully..");
	}
	
	public static void startTest(WebDriver driver, String testname){
		ConfigFileReader config = new ConfigFileReader();
		Log.startReport(testname);
		OrangeHRMUtils.launchApp(driver,config.getApplicationUrl());
		
	}
}
