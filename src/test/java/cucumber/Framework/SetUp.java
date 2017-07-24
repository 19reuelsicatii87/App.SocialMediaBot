package cucumber.Framework;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class SetUp extends Helper {
	
	static String ScenarioName;
	static String ScenarioID;


	
	@Before
	public void setup(Scenario scenario) throws IOException, InterruptedException
	{		
		ScenarioName = scenario.getName();
		ScenarioID = scenario.getId();	
		
		switch (scenario.getName())
		{		
			case "COMSMOKETEST_TS01": 
				CallAPI("http://dev.app.compass/tests/delete_test_automation_data");		 
	        break;
			
			case "COMSMOKETEST_TS02":  
				CallAPI("http://dev.app.compass/tests/delete_test_automation_data");
			break;
			
			case "COMSMOKETEST_TS03": 
				CallAPI("http://dev.app.compass/tests/delete_test_automation_data");
	        break;
			
			case "COMSMOKETEST_TS04": 
				CallAPI("http://dev.app.compass/tests/delete_tasks");
				CallAPI("http://dev.app.compass/tests/insert_tasks");
	        break;       

		
		}
		
		log.info("Execution started"
				+ "\n Scenario Name: " + scenario.getName()
				+ "\n Scenario ID: " + scenario.getId()		
				);	
		
		log.info("Execution is started from First Runner Test - Before Annotation");
		GetDriverObject();

		
	}
	
	
	@Before
	static public String getScenarioName() throws IOException, InterruptedException
	{
		return ScenarioName;
	}
	
	@Before
	static public String getScenarioID() throws IOException, InterruptedException
	{
		return ScenarioID;
	}
	
	
	
	
}
