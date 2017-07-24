package webApp.Compass;

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
import webApp.Seoreseller.SEO05_Invoices;

public class COM03_ClientsBucket118839Campaigns extends Helper{
	
	@FindBy(xpath=".//*[@id='create_project_btn']")
	WebElement COM_CreateCampaign_button;

	

		
	public COM03_ClientsBucket118839Campaigns() {
		
		PageFactory.initElements(driver, this);
		
	}	

	@When("^I click COM03_CreateCampaign button$")
	public void i_click_COM_CreateCampaign_button() throws Throwable, UnhandledAlertException {
		COM_CreateCampaign_button.click();
	}
	
	
	@When("^I click \"([^\"]*)\" link$")
	public void i_click_link(String arg1) throws Throwable, UnhandledAlertException {
		
		driver.findElement(By.xpath(".//a[text()='"+ arg1 +"']")).click();
	}
	


}
