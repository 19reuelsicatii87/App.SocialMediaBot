package webApp.Compass;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class COM04_ClientsBucket118839CampaignsCreatecampaign extends Helper{
	
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
	

	

		
	public COM04_ClientsBucket118839CampaignsCreatecampaign() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@When("^I populate COM04_CampaignName with \"([^\"]*)\"$")
	public void i_populate_CampaignName_with(String arg1) throws Throwable, UnhandledAlertException {
		CampaignName_textfield.sendKeys(arg1);
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
	public void i_select_over_Category_dropdown(String arg1) throws Throwable, UnhandledAlertException {
	
		Select S=new Select(Category_dropbox);
		S.selectByVisibleText(arg1);
	    
	}

	@When("^I populate COM04_ProductandServiceOverview textfield with \"([^\"]*)\"$")
	public void i_populate_ProductandServiceOverview_textfield_with(String arg1) throws Throwable, UnhandledAlertException {
		ProductandServiceOverview_textfield.sendKeys(arg1);
	}
	
	@When("^I click COM04_Submit button$")
	public void i_click_Submit_button() throws Throwable, UnhandledAlertException {
		
		action
		.moveToElement(Submit_button)
		.click()
		.build()
		.perform();
		
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
	



	


}
