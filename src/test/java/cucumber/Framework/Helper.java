package cucumber.Framework;



import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utilities.CustomLogger;
import com.Utilities.ReadBrowserStack;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


public class Helper{
	

	public static WebDriver driver=null;
	public static AndroidDriver ADdriver=null;
	public static WebDriverWait WD=null;
	public static String winHandleBefore;
	public static JavascriptExecutor JS=null;
	public static ReUsablesKeywords ReUsablesKeyword=new ReUsablesKeywords();
	public static CommonSteps CommonStep= new CommonSteps();	
	public static Logger log = CustomLogger.log(Helper.class);
	public static AppiumServer appiumServer=null;
	public static Process process;
	public static Properties properties;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static Actions action=null;
	public static Alert alert;


		 

	static String BrowserType;
	static int I_wait=60;
	static int S_wait=60;
	static int WD_wait=60;
	static int PG_wait=60;
	
	
		 
	public static String GetPropertValue(String Path, String Key)
	 {
		 
		properties = new Properties();
		FileInputStream fis;
			try {
				fis = new FileInputStream(Path);
				 properties.loadFromXML(fis);
				}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}	
			
		return properties.getProperty(Key);
		 
	 }
	
	 
	public static void GetDriverObject() 
	{
		
		System.out.println("Helper - ScnearioName: " + SetUp.ScenarioName);
		
		switch (SetUp.ScenarioName)
		{		
			case "COMSMOKETEST_TS06": 
				BrowserType = "FIREFOX";	 
	        break;
			
			case "COMSMOKETEST_TS07":  
				BrowserType = "FIREFOX";
			break;
			
			case "COMSMOKETEST_TS08": 
				BrowserType = "FIREFOX";
	        break;
			
			case "COMSMOKETEST_TS09": 
				BrowserType = "FIREFOX";
	        break;

			default: 
				BrowserType = GetPropertValue("Data/TestProperties.xml","BrowserType");		        
			break;
		
		}
		
		
		

		
		
		log.info("Execution will be begin on Browser name " + BrowserType );
		String Environment = GetPropertValue("Data/TestProperties.xml","Environment");
		log.info("Execution will be begin on Environment: " + Environment );
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		try 
		{
			log.info("Execute TASK KILL");
			//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
		} catch (IOException e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(driver==null)
		{
			if(BrowserType.equalsIgnoreCase("IE")) 
			{			

				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				
				System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver(capabilities);				
				driver.manage().window().maximize();
				
			}
			
			
			else if(BrowserType.equalsIgnoreCase("CHROME")) 
			{				
								
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setBinary(System.getProperty("user.dir") + "\\Browsers\\CH64_v53\\chrome.exe");	
				driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				log.info("Initiate CHROME v53");
			}
			
			else if(BrowserType.equalsIgnoreCase("FIREFOX")) 
			{

				System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
				FirefoxBinary FfBinary = new FirefoxBinary(new File (System.getProperty("user.dir") + "\\Browsers\\FF64_v46\\firefox.exe"));
				FirefoxProfile firefoxProfile = new FirefoxProfile(); 
				driver=new FirefoxDriver(FfBinary, firefoxProfile);
				driver.manage().window().maximize();
				log.info("Initiate FIREFOX v46");
				
			}

			
			

			else if(BrowserType.equalsIgnoreCase("HTMLUNIT")) 
			{
				LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log",
						"org.apache.commons.logging.impl.NoOpLog");
				java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit")
						.setLevel(Level.OFF);
				java.util.logging.Logger.getLogger("org.apache.commons.httpclient")
						.setLevel(Level.OFF);
				driver = new HtmlUnitDriver();
			
			
			}
			
		 
		}
		
	
		driver.manage().timeouts().implicitlyWait(I_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(S_wait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PG_wait, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		WD=new WebDriverWait(driver, WD_wait);
		JS=(JavascriptExecutor) driver;
        action = new Actions(driver);  
		
	}
	
	
	public static void CallAPI(String Endpoint) throws IOException, InterruptedException
	{
		
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
		  .url(Endpoint)
		  .build();
		
		Response response = client.newCall(request).execute();
			if(response.code()==200)
	    	{
	    		System.out.println("URL link Resopnse Code 200");	    		
	    	}
			
			else
			{
				System.out.println("URL link Resopnse Code not 200");
			}		
		
		
	}
	
	
	}
