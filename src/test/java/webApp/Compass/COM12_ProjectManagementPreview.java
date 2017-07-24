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

public class COM12_ProjectManagementPreview extends Helper{
	

	@FindBy(xpath=".//input[@name='month_num']")
	WebElement MonthNo_textfield;
	
	@FindBy(xpath=".//button[text()='DEPLOY NOW!']")
	WebElement DeployNow_button;
	

		
	public COM12_ProjectManagementPreview() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
		
	@When("^I populate COM12_MonthNo with \"([^\"]*)\"$")
	public void i_populate_MonthNo_with(String arg1) throws Throwable, UnhandledAlertException {
		MonthNo_textfield.sendKeys(arg1);
	}
	
	@When("^I click COM12_DeployNow button$")
	public void i_click_Deploy_button() throws Throwable, UnhandledAlertException {
		
		JS.executeScript("arguments[0].scrollIntoView();", DeployNow_button);
		WD.until(ExpectedConditions.elementToBeClickable(DeployNow_button));
		DeployNow_button.click();
		
	}
	
	
	@Then("^Ill see ([^\"]*) is deployed over COMDEV_Queue$")
	public void ill_see_Product_is_deployed_over_COMDEV_Queue(String arg1) throws Throwable, UnhandledAlertException {
	
		Thread.sleep(20000);
		assertEquals("Tasks were deployed successfully! Do you want to manage the milestone?",
				driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();	
			
	}
	

	
	
}
