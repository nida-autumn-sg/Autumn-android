package com.testautomation.StepDef;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;


import com.testautomation.Listeners.BaseUtil;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class Hooks extends BaseUtil{
	

@Before
public void LaunchApp() {
	

	  DesiredCapabilities caps = new DesiredCapabilities();
	   caps.setCapability("deviceName", "MyDevice");
	   caps.setCapability("udid", "RR8MB0F87QD");
	   caps.setCapability("platformName", "Android");
	   caps.setCapability("platformVersion", "9");
	   caps.setCapability("appPackage", "sg.autumn.tech.qa");
	   caps.setCapability("appActivity", "com.autumn.MainActivity");
	   caps.setCapability("BROWSER_NAME", "Chrome");
	   caps.setCapability("chromeDriverExecutable", "C:/Users/Nida/Downloads/NewChromeDriver/chromedriver_win32");
	   caps.setCapability("unicodeKeyboard", true);
	   caps.setCapability("resetKeyboard", true);
	 
	
			try {
				driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	
}


@After
public void TearDown() {
	
	
	driver.quit();
	
}



	    		}
