package com.testautomation.Listeners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.google.common.io.Files;
import com.testautomation.StepDef.LaunchPage;



public class ExtentReportUtil extends BaseUtil{


   
    
    String fileName = reportlocation + "extentreport.html";
    
    public void ExtentReport() {
    	extent =  new ExtentReports();
    	
    	ExtentHtmlReporter htmlReporter =  new ExtentHtmlReporter(fileName);
    	htmlReporter.config().setTheme(Theme.DARK);
    	htmlReporter.config().setDocumentTitle("TestReport for Appium Testing");
    	htmlReporter.config().setEncoding("utf-8");
    	htmlReporter.config().setReportName("Test Report");
    	
    	extent.attachReporter(htmlReporter);
    }
    
    
    public void ExtentReportScreenShot() throws IOException{
    	
    	TakesScreenshot ts=(TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    	Files.copy(((File) ts).toPath(), new File(reportlocation + "screenshot.png").toPath());
    	
    	 scenarioDef.fail("details").addScreenCaptureFromPath(reportlocation + "screenshot.png");
    }
    
    public void FlushReport(){
        extent.flush();
    }
    
}
	