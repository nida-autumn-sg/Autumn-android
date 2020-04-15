package com.testautomation.Utility;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utility {
	
	public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
	    Dimension size = driver.manage().window().getSize();
	    int anchor = (int) (size.height * anchorPercentage);
	    int startPoint = (int) (size.width * startPercentage);
	    int endPoint = (int) (size.width * finalPercentage);
	   // new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint, anchor).release().perform();
	    new TouchAction(driver).
	    longPress(PointOption.point(startPoint, anchor)).
	    waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).
	    moveTo(PointOption.point(endPoint-startPoint,0)).release().perform(); 
	    
	}

	
	
	public static void swipeVertical(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
	    Dimension size = driver.manage().window().getSize();
	    int anchor = (int) (size.width * anchorPercentage);
	    int startPoint = (int) (size.height * startPercentage);
	    int endPoint = (int) (size.height * finalPercentage);
	    new TouchAction(driver).
	    press(PointOption.point(anchor, startPoint)).
	    waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).
	    moveTo(PointOption.point(anchor, endPoint)).release().perform();

	   
	}
	
	
	
	
	
	
}
