package com.testautomation.StepDef;







import org.openqa.selenium.By;

import com.testautomation.Listeners.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LaunchPage extends BaseUtil {

	
	
	
		
	@Given("user launches the Autumn Application")
	public void user_launches_the_Autumn_Application() throws Throwable{
		
	System.out.println("AppLaunched");
				
			/*	 try {
					 
					   DesiredCapabilities caps = new DesiredCapabilities();
					   caps.setCapability("deviceName", "MyDevice");
					   caps.setCapability("udid", "RR8MB0F87QD");
					   caps.setCapability("platformName", "Android");
					   caps.setCapability("platformVersion", "9");
					   caps.setCapability("appPackage", "com.autumn");
					   caps.setCapability("appActivity", "com.autumn.MainActivity");
					   caps.setCapability("BROWSER_NAME", "Chrome");
					   caps.setCapability("chromeDriverExecutable", "C:/Users/Nida/Downloads/NewChromeDriver/chromedriver_win32");
					   caps.setCapability("unicodeKeyboard", true);
					   caps.setCapability("resetKeyboard", true);
					 
						driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
						
						
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
				 
				*/
		  	  
	}


   
	@Then("user clicks on start button and reads the test data")
	public void user_clicks_on_start_button_and_reads_the_test_data() throws Throwable {
		
		//ExtentTest logInfo=null;

		//try {
			
			//test = extent.createTest(Feature.class, "To verify the four options of retirement goal");							
			//test=test.createNode(Scenario.class, "To verify the four options of retirement goal");						
			//logInfo=test.createNode(new GherkinKeyword("Given"), "user_launches_the_Autumn_Application");

		//logInfo=test.createNode(new GherkinKeyword("Then"), "user_clicks_on_start_button_and_reads_the_test_data");
		
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_get_started\"]").click();
    	driver.hideKeyboard();
    	Thread.sleep(2000);	
    	
    	//logInfo.pass("Clicked on start button");
    	//logInfo.addScreenCaptureFromPath(captureScreenShot(driver));

		

	//} catch (AssertionError | Exception e) {

		//testStepHandle("FAIL",driver,logInfo,e);			

	//}
    	
	    
	}


     @Then("user enters the name {string} and clicks on next button")
      public void user_enters_the_name_and_clicks_on_next_button(String string) throws Throwable {
    	 
    	/* ExtentTest logInfo=null;

 		try {
 			logInfo=test.createNode(new GherkinKeyword("Then"), "user_enters_the_name_and_clicks_on_next_button");*/
		
    	 
    	 
	        driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_your_name\"]").sendKeys(string);  	
	        driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_next\"]").click();
	    	
	       /* logInfo.pass("Enter the name");
	        logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

		} catch (AssertionError | Exception e) {

			testStepHandle("FAIL",driver,logInfo,e);			

		}*/

	}

     @Then("user enters the date of birth {string} and clicks on next button")
     public void user_enters_the_date_of_birth_and_clicks_on_next_button(String string) {
    	 
    	 
    	 
    	/* ExtentTest logInfo=null;

 		try {									

 			logInfo=test.createNode(new GherkinKeyword("Then"), "user_enters_the_date_of_birth_and_clicks_on_next_button");*/
		
     driver.findElementByXPath("//android.widget.EditText[@content-desc='input_date_of_birth_(dd/mm/yyyy)']").sendKeys(string);
    driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[2]").click();
    
  /*  logInfo.pass("Enter the date of birth");
    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

} catch (AssertionError | Exception e) {

	testStepHandle("FAIL",driver,logInfo,e);			

}*/

	   
	}

	@Then("user selects the gender and clicks on next")
	public void user_selects_the_gender_and_clicks_on_next() {
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "user_selects_the_gender_and_clicks_on_next");
	    */
		
       driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"btn_0\"]/android.view.ViewGroup").click();
    	
      /* logInfo.pass("Selects the gender");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
    	

	}

	@Then("user selects the country and clicks on next")
	public void user_selects_the_country_and_clicks_on_next() {
		

   	/* ExtentTest logInfo=null;

		try {									

			logInfo=test.createNode(new GherkinKeyword("Then"), "user_selects_the_country_and_clicks_on_next");*/
		
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[3]").click(); 
		
		/*logInfo.pass("Selects the country");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
			
		
	}

	@Then("user enters the email {string} and clicks on next")
	public void user_enters_the_email_and_clicks_on_next(String string) {
		
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "user_enters_the_email_and_clicks_on_next");*/
		
		
        driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_e-mail_address\"]").sendKeys(string);
    	driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[4]").click();
    	
    	
    	/*logInfo.pass("Enters the email");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/

	}

	@Then("user enters the income {string} and expense {string} and clicks on next")
	public void user_enters_the_income_and_expense_and_clicks_on_next(String string, String string2) {
		
	/*	ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "user_enters_the_income_and_expense_and_clicks_on_next");*/
		
		
		
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_monthly_income\"]").sendKeys(string);

		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[5]").click();

		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_monthly_expenses\"]").sendKeys(string2);

		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[6]").click();
		
		
		
		/*logInfo.pass("Enters the income and expense");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/

	}


@Then("user enters the savings {string} and liabilities {string} and clicks on next")
public void user_enters_the_savings_and_liabilities_and_clicks_on_next(String string, String string2) {
	/*ExtentTest logInfo=null;
	try {									
	logInfo=test.createNode(new GherkinKeyword("Then"), "user_enters_the_savings_and_liabilities_and_clicks_on_next");*/
	
	
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_total_assets_(optional)\"]").sendKeys(string);
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[7]").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_total_liabilities_(optional)\"]").sendKeys(string2);
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[8]").click();
		
		
		/*logInfo.pass("Enter the savings and liabilities");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
		
		
	}

	@Then("user select the first option in retirement goal")
	public void user_select_the_first_option_in_retirement_goal() {
		
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "user_select_the_first_option_in_retirement_goal");*/
		
		
		driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_0\"])[2]").click();
		
		/*logInfo.pass("Selects the retirement goal first option");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/

	    
	}
	
	
	@Then("user select the second option in retirement goal")
	public void user_select_the_second_option_in_retirement_goal() {
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "user_select_the_second_option_in_retirement_goal");*/
		
		
		driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_1\"])[2]").click();
		
		/*logInfo.pass("Selects the second option in retirement goal");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
	
	}
	
	
	@Then("user select the third option in retirement goal")
	public void user_select_the_third_option_in_retirement_goal() {
	/*	ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "user_select_the_third_option_in_retirement_goal");*/
		
		driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_2\"])[2]").click();
		
		/*logInfo.pass("Selects the third option of retirement goal");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
	}
	
	@Then("user select the fourth option in retirement goal")
     public void user_select_the_fourth_option_in_retirement_goal() {
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "user_select_the_fourth_option_in_retirement_goal");*/
		
		driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_3\"])[2]").click();
		
		/*logInfo.pass("Selects the fourth option in retirement goal");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/	
		
	}
	
	@Then("enter the amount of savings {string}")
	public void enter_the_amount_of_savings(String string) {
		
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "enter_the_amount_of_savings");*/
		
		
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_amount_of_savings\"]").sendKeys(string);
	  driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
	  
	 /* logInfo.pass("Enters the amount of saving");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	} */
	  
	}
	
	@Then("enter the desired retirement income {string}")
	public void enter_the_desired_retirement_income(String string) {
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "enter_the_desired_retirement_income");*/
	
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_desired_retirement_income\"]").sendKeys(string);
	  driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
	  
	 /* logInfo.pass("Enters the desired retirement income");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
	  
	  
	}

	
	
	
	@Then("enter the legacy amount {string}")
	public void enter_the_legacy_amount(String string) {
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "enter_the_legacy_amount");*/
		
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_legacy_amount\"]").sendKeys(string);
		  driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
		  
		 /* logInfo.pass("Enters the legacy amount");
		    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

		} catch (AssertionError | Exception e) {

			testStepHandle("FAIL",driver,logInfo,e);			

		} */ 
		  
	}
	
	
	
	
	
	@Then("enter the retirement age {string}and click on done")
	public void enter_the_retirement_age_and_click_on_done(String string) {
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "enter_the_retirement_age_and_click_on_done");*/
		
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").clear();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").sendKeys(string);
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_done\"]").click();
		
		/*logInfo.pass("Enters the retirment age and select done");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
		
		
		
	
	}
	
	
	
	@Then("enter the retirement age {string}and click on next")
	public void enter_the_retirement_age_and_click_on_next(String string) {
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "enter_the_retirement_age_and_click_on_next");
		*/
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").clear();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").sendKeys(string);
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
		
		/*logInfo.pass("Enter the retirement age and click on next");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}
	*/
	}
	
	
	@Then("enter the desired retirement income {string} and click on done")
	public void enter_the_desired_retirement_income_and_click_on_done(String string) {
		
		
		/*ExtentTest logInfo=null;
		try {									
		logInfo=test.createNode(new GherkinKeyword("Then"), "enter_the_desired_retirement_income_and_click_on_done");*/
		
	
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_desired_retirement_income\"]").sendKeys(string);
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_done\"]").click();
		
		/*logInfo.pass("Enter desired retirement income and click on done");
	    logInfo.addScreenCaptureFromPath(captureScreenShot(driver));	

	} catch (AssertionError | Exception e) {

		testStepHandle("FAIL",driver,logInfo,e);			

	}*/
			
		
	}
	@Then("close the app")
	public void close_the_app() {
		
	System.out.println("App closed");
	}
	
	


@Then("user selects finance option from the below navigation bar")
public void user_selects_finance_option_from_the_below_navigation_bar() throws InterruptedException {
	
	//driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(2000);
   driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_finance\"]")).click();
}

@Then("user enters the pwd {string}")
public void user_enters_the_pwd(String string) {
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_create_password\"]")).sendKeys(string);

}

@Then("selects the registerAccount button")
public void selects_the_registerAccount_button() throws InterruptedException {
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_register_account\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("	//android.widget.Button[@content-desc=\"btn_continue\"]")).click();

}

@Then("user navigates back to the overview page")
public void user_navigates_back_to_the_overview_page() {
	
	driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"txt_overview\"])[2]")).click();
	
	

}

@Then("logsout of the app")
public void logsout_of_the_app() {
	
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"view_-overview-navigation-container\"]/android.view.ViewGroup\r\n")).click();
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_log_out\"]")).click();

}


    	
 
   



}


	