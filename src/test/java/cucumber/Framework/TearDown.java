package cucumber.Framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.*;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class TearDown extends Helper {
	
	
	//public static Scenario scenario;

	@After
	public void teardown(Scenario scenario) throws IOException 
	{
		
		if (scenario.isFailed()) 
		{	
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_hhmmssa");
			String timeStamp = sdf.format(date);
			String filename = System.getProperty("user.dir") + "\\target\\screenshots\\" + scenario.getName() + "_" + timeStamp + ".png";
			
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(filename));
		    //scenario.embed(screenshot, System.getProperty("user.dir") + "image/png");		      
		    log.warn("Execution got failed for " + scenario.getName() +" and screenshot got save to " + filename);
		    
		    
		      
		 }
		


		
		log.info("Execution is ended from First Runner Test - After Annotation");
		driver.quit();
		
		try {
			log.info("Execute TASK KILL");
			//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("Execution Completed and Browser was quit");	
	    driver=null;
	}

	
	
}
