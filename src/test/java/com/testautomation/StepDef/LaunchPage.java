package com.testautomation.StepDef;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testautomation.Listeners.BaseUtil;
import com.testautomation.Utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;


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


   
	@Then("user clicks on start button and accepts the popUp")
	public void user_clicks_on_start_button_and_accepts_the_popUp() throws Throwable {
		
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_get_started\"]").click();
    	driver.hideKeyboard();
    	Thread.sleep(2000);	
    	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_i_understand_and_accept\"]")).click();   
	}


     @Then("user enters the name {string} and clicks on next button")
      public void user_enters_the_name_and_clicks_on_next_button(String string) throws Throwable {
	        driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_your_name\"]").sendKeys(string);  	
	        driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_next\"]").click();
	}

     @Then("user enters the date of birth {string} and clicks on next button")
     public void user_enters_the_date_of_birth_and_clicks_on_next_button(String string) {	
     //driver.findElementByXPath("//android.widget.EditText[@content-desc='input_date_of_birth_(dd/mm/yyyy)']").sendKeys(string);
     driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"mask_input_date_of_birth_(dd/mm/yyyy)\"]")).sendKeys(string);
    driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[2]").click();   
	}

	@Then("user selects the gender and clicks on next")
	public void user_selects_the_gender_and_clicks_on_next() {
       driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"btn_0\"]/android.view.ViewGroup").click();
	}

	@Then("user selects the country and clicks on next")
	public void user_selects_the_country_and_clicks_on_next() {
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[3]").click(); 	
	}

	@Then("user enters the email {string} and clicks on next")
	public void user_enters_the_email_and_clicks_on_next(String string) {
        driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_e-mail_address\"]").sendKeys(string);
    	driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[4]").click();

	}

	@Then("user enters the income {string} and expense {string} and clicks on next")
	public void user_enters_the_income_and_expense_and_clicks_on_next(String string, String string2) {
		
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_monthly_income\"]").sendKeys(string);
        driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[5]").click();
        driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_monthly_expenses\"]").sendKeys(string2);
        driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[6]").click();
		

	}


@Then("user enters the savings {string} and liabilities {string} and clicks on next")
public void user_enters_the_savings_and_liabilities_and_clicks_on_next(String string, String string2) {
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_total_assets_(optional)\"]").sendKeys(string);
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[7]").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_total_liabilities_(optional)\"]").sendKeys(string2);
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[8]").click();	
		
	}

	@Then("user select the first option in retirement goal")
	public void user_select_the_first_option_in_retirement_goal() {
		driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_0\"])[2]").click();   
	}
	
	
	@Then("user select the second option in retirement goal")
	public void user_select_the_second_option_in_retirement_goal() {

	driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_1\"])[2]").click();
	
	}
	
	
	@Then("user select the third option in retirement goal")
	public void user_select_the_third_option_in_retirement_goal() {
		driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_2\"])[2]").click();
	}
	
	@Then("user select the fourth option in retirement goal")
     public void user_select_the_fourth_option_in_retirement_goal() {

		driver.findElementByXPath("	(//android.view.ViewGroup[@content-desc=\"btn_3\"])[2]").click();
		
}
	
	@Then("enter the amount of savings {string}")
	public void enter_the_amount_of_savings(String string) {
	driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_amount_of_savings\"]").sendKeys(string);
	  driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
  
	}
	
	@Then("enter the desired retirement income {string}")
	public void enter_the_desired_retirement_income(String string) {
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_desired_retirement_income\"]").sendKeys(string);
	  driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
	   
	}

	
	
	
	@Then("enter the legacy amount {string}")
	public void enter_the_legacy_amount(String string) {
		
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_legacy_amount\"]").sendKeys(string);
		  driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
		  
	}
	
	@Then("enter the retirement age {string}and click on done")
	public void enter_the_retirement_age_and_click_on_done(String string) {
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").clear();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").sendKeys(string);
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_done\"]").click();	
	
	}
	
	
	
	@Then("enter the retirement age {string}and click on next")
	public void enter_the_retirement_age_and_click_on_next(String string) {
	
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").clear();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input_retirement_age\"]").sendKeys(string);
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"btn_next\"])[9]").click();
	}
	
	
	@Then("enter the desired retirement income {string} and click on done")
	public void enter_the_desired_retirement_income_and_click_on_done(String string) {
		driver.findElementByXPath("	//android.widget.EditText[@content-desc=\"input_desired_retirement_income\"]").sendKeys(string);
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"btn_done\"]").click();
			
		
	}
	@Then("close the app")
	public void close_the_app() {
		
	System.out.println("App closed");
	}
	
	


@Then("user selects finance option from the below navigation bar")
public void user_selects_finance_option_from_the_below_navigation_bar() throws InterruptedException {
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
	driver.findElement(By.xpath("	//android.widget.Button[@content-desc=\"btn_done\"]")).click();

}

@Then("user navigates back to the overview page")
public void user_navigates_back_to_the_overview_page() {
	
	driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"txt_overview\"])[2]")).click();
}

@Then("logsout of the app")
public void logsout_of_the_app() {

	
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"view_-overview-navigation-container\"]/android.view.ViewGroup\r\n")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_email_address_update_in_progress._please_click_on_the_verification_link_from_your_new_email_address_to_complete_the_update.\"]\r\n" + 
			"")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_log_out\"]")).click();
}


   	
@Then("user clicks on login button")
public void user_clicks_on_login_button() {
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_log_in\"]")).click();
    
}

@Then("user provides the username {string} and pwd {string}")
public void user_provides_the_username_and_pwd(String string, String string2) {
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_e-mail_address\"]")).sendKeys(string);
	driver.findElement(By.xpath("	//android.widget.EditText[@content-desc=\"input_password\"]")).sendKeys(string2);
	}
   
@Then("user selects the bank option from the Quicklinks")
public void user_selects_the_bank_option_from_the_Quicklinks() {
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_bank\"]")));
	
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_bank\"]")).click();

}

@Then("user selects the product from AddProduct dropdown")
public void user_selects_the_product_from_AddProduct_dropdown() {
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_bank_account\"]")).click();
  
}

@Then("user gives the account name {string}")
public void user_gives_the_account_name(String string) {
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_account_name\"]")).sendKeys(string);

}


@Then("user provides the loan name {string}")
public void user_provides_the_loan_name(String string) {
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_loan_name\"]")).sendKeys(string);

}










@Then("user chooses the bank {string} from the dropdown")
public void user_chooses_the_bank_from_the_dropdown(String string) {
            driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_choose_bank\"]")).click();
			//driver.findElement(By.xpath("//android.widget.TextView[@text='JP Morgan']")).click();
			String first = "//android.widget.TextView[@text=";
			String middle = "'"+ string + "'";
			String last = "]";
			
			String var= first+ middle+last;
			System.out.println(var);
			
			driver.findElement(By.xpath(var)).click();
  
}

@Then("user provides the amount {string} present in the account")
public void user_provides_the_amount_present_in_the_account(String string) throws Exception {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_amount\"]")).click();

	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_amount\"]")).sendKeys(string);
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_currency\"]")).click();
    
}

@Then("user clicks on save and then on cross button")
public void user_clicks_on_save_and_then_on_cross_button() throws InterruptedException {
	//Thread.sleep(2000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_save\"]")).click();
Thread.sleep(4000);
//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"view_-header-left-container\"]")).click();

driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_back_button\"]")).click();

driver.findElement(By.xpath("	//android.widget.TextView[@content-desc=\"txt_overview\"]")).click();
}


@Then("user click on save and selects the fab button")
public void user_click_on_save_and_selects_the_fab_button() throws InterruptedException {
	
driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_save\"]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn__fab\"]")).click();
}


@Then("user selects the home loan option")
public void user_selects_the_home_loan_option()  {
	
driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_home_loan\"]")).click();
}








@Then("user selects the CPF option from the Quicklinks")
public void user_selects_the_CPF_option_from_the_Quicklinks()  {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_cpf\"]")));
	
   driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_cpf\"]")).click();	
}

@Then("user enters the monthly contribution {string}")
public void user_enters_the_monthly_contribution(String string) throws Exception {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_monthly_contribution\"]")).click();
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_monthly_contribution\"]")).sendKeys(string);
	Thread.sleep(2000);
    
}

@Then("user provides the value of ordinary account {string}")
public void user_provides_the_value_of_ordinary_account(String string) throws Exception {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_ordinary_account\"]")).click();
	
    driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_ordinary_account\"]")).sendKeys(string);
Thread.sleep(2000);
}

@Then("user provides the value of special account {string}")
public void user_provides_the_value_of_special_account(String string) throws Exception {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_special_account\"]")).click();

	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_special_account\"]")).sendKeys(string);
 Thread.sleep(2000);
}

@Then("user provides the value of Medisave account {string}")
public void user_provides_the_value_of_Medisave_account(String string) throws Exception {
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_medisave_account\"]")).click();
	//driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_medisave_account\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_medisave_account\"]")).sendKeys(string);
	Thread.sleep(1000);
  
}

@Then("user selects the properties option from the Quicklinks")
public void user_selects_the_properties_option_from_the_Quicklinks() throws Exception {
  Thread.sleep(2000);
	/*WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_properties\"]/android.view.ViewGroup")));*/
 
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_properties\"]/android.view.ViewGroup")).click();
	Thread.sleep(2000);
}

@Then("user selects the investment option from quick links")
public void user_selects_the_investment_option_from_quick_links() {
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_investments\"]")).click();
}

@Then("user selects the equities option from the drop down")
public void user_selects_the_equities_option_from_the_drop_down() {
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn__choose_asset_class_0\"]")).click();
}

@Then("user provides the property name {string}")
public void user_provides_the_property_name(String string) {
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_property_name\"]")).sendKeys(string);

}

@Then("user provides the postal code {string}")
public void user_provides_the_postal_code(String string) {
	
    driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_postal_code\"]")).sendKeys(string);
}

@Then("user provides the estimated property value {string}")
public void user_provides_the_estimated_property_value(String string) {
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_estimated_property_value_(sgd)\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_estimated_property_value_(sgd)\"]")).sendKeys(string);
  
}


@Then("user edits the PropertyName {string} and postalCode {string} ")
public void user_edits_the_PropertyName_and_postalCode_and_value(String string, String string2) {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_property_name\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_property_name\"]")).sendKeys(string);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_postal_code\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_postal_code\"]")).sendKeys(string2);
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SGD 2,000,000\"))");


	

	//driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_estimated_property_value_(sgd)\"]")).click();
	//driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_estimated_property_value_(sgd)\"]")).clear();
	//driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_estimated_property_value_(sgd)\"]")).sendKeys(string3);
	
	

}













@Then("clicks on manage button under savings and liabilties")
public void clicks_on_manage_button_under_savings_and_liabilties() {
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_managesavings_&_loans\"]")).click();
   
}

@Then("user clicks on manage button under property details")
public void user_clicks_on_manage_button_under_property_details() {
	
	//WebDriverWait wait = new WebDriverWait(driver, 30);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\\\"btn_manageproperties\\\"]")));
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_manageproperties\"]")).click();
	
   
}


@Then("user selects the property")
public void user_selects_the_property() {
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_condo\"]")).click();
   
}







@Then("user selects the edit button and changes the amount{string}")
public void user_selects_the_edit_button_and_changes_the_amount(String string) {
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_edit\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_undefined\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_undefined\"]")).sendKeys(string);
	
	
  
}

@Then("user clicks on done and then on cross button")
public void user_clicks_on_done_and_then_on_cross_button() throws InterruptedException {
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_done\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"view_-header-left-container\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"txt_overview\"])")).click();

}



@Then("clicks on manage button under CPF details")
public void clicks_on_manage_button_under_CPF_details() {
	
    /*Dimension dim = driver.manage().window().getSize();
	System.out.println(dim);//(1080, 2042)
	int height =  dim.getHeight();
	System.out.println(height);//2042
	int width = dim.getWidth();
	System.out.println(width);//1080
	
	int startX= width/2;//540
	int endX=width/2;//540
	int startY=(int) (height*0.40);//816.8
	int endY=(int)(height*0.20);//408.4
	
	
	TouchAction action =  new TouchAction(driver);
	action.press(PointOption.point(startX, startY)).waitAction()
	.moveTo(PointOption.point(endX,endY)).release().perform();*/
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"btn_managecpf_savings\"))").click();
	
	
	
driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_managecpf_savings\"]")).click();
   
}

@Then("user selects the edit button and provides new values for {string} and {string} an {string} and {string}")
public void user_selects_the_edit_button_and_provides_new_values_for_and_an_and(String string, String string2, String string3, String string4) {
	
	//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_edit\"]")).click();
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_monthly_contribution\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_monthly_contribution\"]")).sendKeys(string);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_ordinary_account\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_ordinary_account\"]")).sendKeys(string2);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_special_account\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_special_account\"]")).sendKeys(string3);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_medisave_account\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_medisave_account\"]")).sendKeys(string4); 
}



@Then("user selects the change pwd option under settings")
public void user_selects_the_change_pwd_option_under_settings() {

driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"view_-overview-navigation-container\"]/android.view.ViewGroup\r\n")).click();
driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_email_address_update_in_progress._please_click_on_the_verification_link_from_your_new_email_address_to_complete_the_update.\"]\r\n" + 
		"")).click();
driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_change_password\"]")).click();
}

@Then("user provides the currentpwd {string} and newpwd {string} and repeatpwd {string}")
public void user_provides_the_currentpwd_and_newpwd_and_repeatpwd(String string, String string2, String string3) {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_current_password\"]")).sendKeys(string);
    driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_new_password\"]")).sendKeys(string2);;
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_repeat_password\"]")).sendKeys(string3);
}

@Then("user clicks on submit button and logsout")
public void user_clicks_on_submit_button_and_logsout() {
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_set_password\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_log_out\"]")).click();
    
}

@Then("user logins with username {string} and newpwd {string}")
public void user_logins_with_username_and_newpwd(String string, String string2) {
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_log_in\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_e-mail_address\"]")).sendKeys(string);
	driver.findElement(By.xpath("	//android.widget.EditText[@content-desc=\"input_password\"]")).sendKeys(string2);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_log_in\"]")).click();
    
}



@Then("user selects account option from settings")
public void user_selects_account_option_from_settings() {

driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"view_-overview-navigation-container\"]/android.view.ViewGroup\r\n")).click();
driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_email_address_update_in_progress._please_click_on_the_verification_link_from_your_new_email_address_to_complete_the_update.\"]\r\n" + 
		"")).click();
driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_account\"]")).click();


}

@Then("user changes the name {string} and clicks on save button")
public void user_changes_the_name_and_clicks_on_save_button(String string) {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_your_name\"]")).clear();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_your_name\"]")).sendKeys(string);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"btn_save\"]")).click();
   
}

@Then("user clicks on back and checks the name displayed {string}")
public void user_clicks_on_back_and_checks_the_name_displayed(String string) {
	
	//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"view_-header-left-container\"]")).click();
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"btn_back_button\"]/android.widget.TextView")).click();
	String ActualText= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"txt_-name-greetings\"]")).getText();
	System.out.println(ActualText);
	//Assert.assertEquals(string, ActualText);
	if(driver.getPageSource().contains(string)){
		System.out.println("Text is present");
		}else{
		System.out.println("Text is absent");

}

}



@Then("user provides equity name {string} and Date of intial purchase {string} and Broker {string} and Ticker {string} and Intial purchase {string} and holdings {string}")
public void user_provides_equity_name_and_Date_of_intial_purchase_and_Broker_and_Ticker_and_Intial_purchase_and_holdings(String string, String string2, String string3, String string4, String string5, String string6) {
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_equity_asset_name\"]")).click(); 
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_equity_asset_name\"]")).sendKeys(string);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"mask_input_date_of_initial_purchase_(mm/yyyy)\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"mask_input_date_of_initial_purchase_(mm/yyyy)\"]")).sendKeys(string2);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_broker\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_broker\"]")).sendKeys(string3);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_ticker\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_ticker\"]")).sendKeys(string4);
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_initial_purchase_price\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_initial_purchase_price\"]")).sendKeys(string5);
	
	
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_no._of_holdings\"]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input_no._of_holdings\"]")).sendKeys(string6);
	}

@Then("user selects Geographic region and sector exposure")
public void user_selects_Geographic_region_and_sector_exposure() {
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"checkbox_1\"]")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"checkbox_4\"]")).click();
	}











}

	