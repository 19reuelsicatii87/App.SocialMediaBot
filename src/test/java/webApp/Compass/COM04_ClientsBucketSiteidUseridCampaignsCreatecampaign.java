package webApp.Compass;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.SetUp;
import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class COM04_ClientsBucketSiteidUseridCampaignsCreatecampaign extends WEBHelper{
	
	@FindBy(xpath=".//*[@id='projects_button']")
	 WebElement Campaigns_tab;
	
	@FindBy(xpath=".//*[@id='create_project_btn']")
	WebElement COM_CreateCampaign_button;
	
	@FindBy(xpath=".//input[contains(@name, 'project_name')]")
	WebElement CampaignName_textfield;
	
	@FindBy(xpath=".//input[@id='brand_name']")
	WebElement BrandName_textfield;
	
	@FindBy(xpath=".//input[contains(@name, 'project_url')]")
	WebElement CampaignURL_textfield;
	
	@FindBy(xpath=".//textarea[contains(@name, 'project_description')]")
	WebElement CampaignDesccription_textfield;
	
	@FindBy(xpath=".//select[contains(@name, 'category')]")
	WebElement Category_dropbox;
	
	@FindBy(xpath=".//textarea[@id='service_overview']")
	WebElement ProductandServiceOverview_textfield;
	
	@FindBy(xpath=".//button[text()='Submit']")
	WebElement Submit_button;
	
	@FindBy(xpath="//input[@name='business_name']")
	WebElement BusinessName_textfield;
	
	@FindBy(xpath="//input[@id='business_email']")
	WebElement BusinessEmail_textfield;
		
	public COM04_ClientsBucketSiteidUseridCampaignsCreatecampaign() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@When("^I populate COM04_CampaignName with \"([^\"]*)\"$")
	public void i_populate_CampaignName_with(String arg1) throws Throwable, UnhandledAlertException {
		String dateIdentifier = null;
        String scenario = SetUp.getScenarioName();
		
		if(scenario.contains("LocalSEO")){
			dateIdentifier = readTextfile("webApp.Compass\\LocalSEO_Date.txt");	 

		}else if(scenario.contains("OrganicSEO")){
			dateIdentifier = readTextfile("webApp.Compass\\OrganicSEO_Date.txt");	 

		}else if(scenario.contains("WebDesign")){
			dateIdentifier = readTextfile("webApp.Compass\\WebDesign_Date.txt");	 

		}
		
		CampaignName_textfield.sendKeys(arg1+"_"+dateIdentifier);

	}
	
	@When("^I populate COM04_BrandName with \"([^\"]*)\"$")
	public void i_populate_BrandName_with(String arg1) throws Throwable, UnhandledAlertException {
		BrandName_textfield.sendKeys(arg1);
	}

	@When("^I populate COM04_CampaignURL with \"([^\"]*)\"$")
	public void i_populate_CampaignURL_with(String arg1) throws Throwable, UnhandledAlertException {
		CampaignURL_textfield.sendKeys(arg1);
	}

	@When("^I populate COM04_Description textfield with \"([^\"]*)\"$")
	public void i_populate_Description_textfield_with(String arg1) throws Throwable, UnhandledAlertException {
		CampaignDesccription_textfield.sendKeys(arg1);
	}

	@When("^I select \"([^\"]*)\" over COM04_Category dropdown$")
	public void i_select_over_Category_dropdown(String category) throws Throwable, UnhandledAlertException {
		String categoryId = null;
		
		switch (category)
		{		
			case "Art, Design & Media": 
				categoryId = "92";		 
	        break;
			
			case "Automotive & Local Transportation": 
				categoryId = "93";		 
	        break;
	        
			case "Business Services & Finance": 
				categoryId = "94";		 
	        break;
	        
			case "Construction & Home Services": 
				categoryId = "95";		 
	        break;
	        
			case "Education & Training": 
				categoryId = "96";		 
	        break;
	        
			case "Fashion & Lifestyle": 
				categoryId = "97";		 
	        break;
	        
			case "Government, Non Profit & Community": 
				categoryId = "98";		 
	        break;
	        
			case "Law & Paralegal": 
				categoryId = "99";		 
	        break;
	        
			case "Medicine, Health & Wellness": 
				categoryId = "100";		 
	        break;
	        
			case "Outdoors, Plants & Pets": 
				categoryId = "101";		 
	        break;
	        
			case "Real Estate": 
				categoryId = "102";		 
	        break;
	        
			case "Science, Digital & Technology": 
				categoryId = "103";		 
	        break;
	        
			case "Sports & Leisure": 
				categoryId = "104";		 
	        break;
	        
			case "Travel & Hospitality": 
				categoryId = "105";		 
	        break;
		
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('category')[0].value='"+categoryId+"';");
		Thread.sleep(2000);
	    
	}
	
	@When("^I populate COM04_BusinessEmail textfield with ([^\"]*)$")
	public void i_popualate_business_email_textfield_with_value(String businessEmail) throws Throwable, UnhandledAlertException {
		BusinessEmail_textfield.sendKeys(businessEmail);
	    
	}	
	

	@When("^I populate COM04_ProductandServiceOverview textfield with \"([^\"]*)\"$")
	public void i_populate_ProductandServiceOverview_textfield_with(String arg1) throws Throwable, UnhandledAlertException {
		ProductandServiceOverview_textfield.sendKeys(arg1);
	}
	
	@When("^I click COM04_Submit button$")
	public void i_click_Submit_button() throws Throwable, UnhandledAlertException {
		WindowScrollAndClick(Submit_button);
	}

	@Then("^Ill see campaign successfully created$")
	public void ill_see_campaign_successfully_created() throws Throwable {
		
		Thread.sleep(5000);	
		try {
			
			assertEquals("Project successfully created.",
					driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@When("^I populate COM04_BusinessName with \"([^\"]*)\"$")
	public void i_populate_businessName_with(String businessName) throws Throwable, UnhandledAlertException {
		BusinessName_textfield.sendKeys(businessName);
	}


}
