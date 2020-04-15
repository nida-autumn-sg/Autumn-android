package com.testautomation.Listeners;


import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseUtil {
	
	public static  AndroidDriver<WebElement> driver;
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static WebDriver Driver;
		public ExtentReports extent;
	    public static ExtentTest scenarioDef;
	    public static ExtentTest features;
	    public static String reportlocation ="./Autumn_Automation/Reports";

}
