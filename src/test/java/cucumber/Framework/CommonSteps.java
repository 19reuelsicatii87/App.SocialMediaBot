package cucumber.Framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CommonSteps extends Helper {

	String Url = null;	
	
	
	@When("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to_URL_variable(String arg1) throws Throwable {
		
			
		switch (arg1)
		{
		
			case "INTROVIO": 
				Url=GetPropertValue("Data/TestProperties.xml","IntrovioDEVURL");
				log.info("User Navigate to the IntrovioDEVURL "+ arg1.toUpperCase());			 
	        break;
			
			case "COMDEV_Login": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassDEVURL_Login");
				log.info("User Navigate to the CompassDEVURL_Login "+ arg1.toUpperCase());
			break;
			
			case "COMDEV_Logout": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassDEVURL_Logout");
				log.info("User Navigate to the CompassDEVURL_Login "+ arg1.toUpperCase());
			break;
			
			case "COMDEV_Client": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassDEVURL_Client");
				log.info("User Navigate to the CompassDEVURL_Client "+ arg1.toUpperCase());
	        break;
			
			case "COMDEV_Deployment": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassDEVURL_Deployment");
				log.info("User Navigate to the CompassDEVURL_Client "+ arg1.toUpperCase());
	        break;
	        
			case "COMDEV_Queue": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassDEVURL_Queue");
				log.info("User Navigate to the CompassDEVURL_Client "+ arg1.toUpperCase());
	        break;
	        
			case "COMDEV_Invoices": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassDEVURL_Invoices");
				log.info("User Navigate to the CompassDEVURL_Client "+ arg1.toUpperCase());
	        break;
	        
			case "COMDEV_Task": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassDEVURL_Task");
				log.info("User Navigate to the CompassDEVURL_Client "+ arg1.toUpperCase());
	        break;
	        
			case "COMSTG_Login": 
				Url=GetPropertValue("Data/TestProperties.xml","CompassSTGURL_Login");
				log.info("User Navigate to the CompassSTGURL_Login "+ arg1.toUpperCase());
			break;
	        
			case "SEODEV_Store": 
				Url=GetPropertValue("Data/TestProperties.xml","SeoresellerDEVURL_Store");
				log.info("User Navigate to the CompassDEVURL_Client "+ arg1.toUpperCase());
	        break;
	        
			case "SEODEV_Login": 
				Url=GetPropertValue("Data/TestProperties.xml","SeoresellerDEVURL_Login");
				log.info("User Navigate to the SeoresellerDEVURL_Login "+ arg1.toUpperCase());
	        break;
	        
			case "SEOSTG_Login": 
				Url=GetPropertValue("Data/TestProperties.xml","SeoresellerSTGURL_Login");
				log.info("User Navigate to the SeoresellerSTGURL_Login "+ arg1.toUpperCase());
	        break;
	        
			case "PPCDEV_Login": 
				Url=GetPropertValue("Data/TestProperties.xml","PaypercontentDEVURL_Login");
				log.info("User Navigate to the CompassDEVURL_Login "+ arg1.toUpperCase());
			break;
			
			case "PPCDEV_Home": 
				Url=GetPropertValue("Data/TestProperties.xml","PaypercontentDEVURL_Home");
				log.info("User Navigate to the CompassDEVURL_Client "+ arg1.toUpperCase());
	        break;
	        
			default: 
				Url=arg1;
				System.out.println("Please enter valid URL name");
				log.warn("Please enter valid URL name");		        
			break;
		
		}
		
		Thread.sleep(5000);
		driver.get(Url);
	  
	}
	
	@When("^I navigate back to \"([^\"]*)\"$")
	public void i_navigate_back_to_URL_variable(String arg1) throws Throwable {
		
			
		switch (arg1)
		{
		        
			case "SEOSTG_Welcome": 
				Url=GetPropertValue("Data/TestProperties.xml","SeoresellerSTGURL_Welcome");
				log.info("User Navigate to the SeoresellerSTGURL_Welcome "+ arg1.toUpperCase());
	        break;
			
			default: 
				Url=arg1;
				System.out.println("Please enter valid URL name");
				log.warn("Please enter valid URL name");		        
			break;
		
		}
		
		Thread.sleep(5000);
		driver.get(Url);
	  
	}
	
	
	@When("^User click the \"([^\"]*)\"$")
	public void user_click_the_Object(String arg1) throws Throwable {
	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		try{
			ReUsablesKeyword.ClickonObject(ReUsablesKeyword.FindObject(arg1));
		}
		catch(Exception e)
		{
			Assert.fail(e.toString());
			log.error("Exception got occured at User click the object ::" + e.toString());
		}
				
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		ReUsablesKeyword.WaitforPageLoad();
	
	} 
		
	@Then("^User Application should be navigated to the \"([^\"]*)\" Page$")
	public void user_Application_should_be_navigated_to_the_Page(String arg1) throws Throwable {
		try{
		WD.until(ExpectedConditions.titleContains(arg1));
		}
		
		catch (Exception e) {
			System.out.println(driver.getTitle());
			log.error("Page Title Validation got failed for Page Name::" +arg1+ " Actual ::"+driver.getTitle());
			Assert.fail("Page Title Validation got failed for Page Name::" +arg1+ " Actual ::"+driver.getTitle());
			
		}
		
	}

	@Then("^User is able to see the \"([^\"]*)\" from Page$")
	public void user_is_able_to_see_the_from_Page(String arg1) throws Throwable {
	/*	try{
		WD.until(ExpectedConditions.presenceOfElementLocated(By.xpath(XpathBuilder(arg1))));
		}
		catch (Exception e) {
			Assert.fail("Field Validation got failed for field" +arg1);
		}
		*/
		
		if (!driver.findElement(By.tagName("html")).getText().toLowerCase().contains(arg1.toLowerCase().trim())) {
            System.out.println("verifyTextPresent failed expected ::"+arg1.toLowerCase().trim());
            //System.out.println(driver.findElement(By.tagName("html")).getText().toLowerCase());
            log.error("verifyTextPresent in a page failed expected ::"+arg1.toLowerCase().trim());
            Assert.fail("verifyTextPresent in a page failed expected ::"+arg1.toLowerCase().trim());
        }
	}

	@When("^User click the links$")
	public void user_click_Events(List<String>  name) throws Throwable {
		for(String S:name)
		{
			System.out.println(S);
			user_click_the_Object(S);
		}
		
	}
	
	@Given("^User navigate to the application exact ([^\"]*)$")
	public void user_navigate_to_the_application_exact_URL(String URL) throws Throwable {
		driver.get(URL);
		log.info("User navigate to the application exact URL " + URL);

	}
	
}
