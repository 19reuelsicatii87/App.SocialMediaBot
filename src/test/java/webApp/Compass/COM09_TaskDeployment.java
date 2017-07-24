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

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class COM09_TaskDeployment extends Helper{
	
	@FindBy(xpath=".//input[@value='Campaign']")
	 WebElement Campaign_txtfield;
	
	@FindBy(xpath=".//table[@id='deployments-table']/tbody/tr[1]//span")
	WebElement Deployment_button;
	
	@FindBy(xpath=".//input[@name='month_num']")
	WebElement MonthNo_textfield;
	
	@FindBy(xpath=".//button[text()='Deploy!']")
	WebElement Deploy_button;
	

		
	public COM09_TaskDeployment() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@When("^I populate COM09_Campaign textfield with \"([^\"]*)\"$")
	public void i_populate_Campaign_textfield_with(String arg1) throws Throwable, UnhandledAlertException {
		Campaign_txtfield.sendKeys(arg1);
	}
	
	@When("^I click COM09_Deployment button$")
	public void i_click_Deployment_button() throws Throwable, UnhandledAlertException {
		Deployment_button.click();
	}
	
	

	
	
}
