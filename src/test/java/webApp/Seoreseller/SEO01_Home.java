package webApp.Seoreseller;

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

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO01_Home extends Helper{
	
	@FindBy(xpath=".//a[@href='/new-campaign/wizard']")
	WebElement AddCampaign_button;
	
	@FindBy(xpath=".//input[@id='business_url']")
	WebElement DomainUrl_textfield;
	
	@FindBy(xpath=".//button[@id='new-business-create-btn']")
	WebElement CheckDomain_button;
	
	@FindBy(xpath=".//button[@id='new-business-save-btn']")
	WebElement CreateCampaign_button;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement ClickToGetStarted_button;
	


		
	public SEO01_Home() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@When("^I click SEO01_AddCampaign button$")
	public void i_click_SEO01_AddCampaign_button() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(AddCampaign_button));
		AddCampaign_button.click();
	}
	
	
	@When("^I populate the SEO01_DomainUrl textfield with \"([^\"]*)\"$")
	public void i_populate_the_SEO__DomainUrl_textfield_with(String arg1) throws Throwable {
		DomainUrl_textfield.sendKeys(arg1);
	}

	
	


}
