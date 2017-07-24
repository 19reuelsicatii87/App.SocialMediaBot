package webApp.Compass;

import javax.xml.xpath.XPath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class COM08_ClientsBucket118839ProjectSubproject extends Helper{
	
	@FindBy(xpath=".//button[@id='subproject-add-button']")
	WebElement AddAProject_Button;
	
	@FindBy(xpath=".//*[@id='subproject_name']")
	WebElement NameTheProject_textfield;
	
	@FindBy(xpath=".//select[@name='product_id']")
	WebElement SelectAProduct_dropdown;
	
	@FindBy(xpath=".//button[text()='Save Project']")
	WebElement SaveProject_button;
	

		
	public COM08_ClientsBucket118839ProjectSubproject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	


	@When("^I click COM08_AddAProject button$")
	public void i_click_AddAProject_button() throws Throwable {
		AddAProject_Button.click();
	}

	@When("^I populate COM08_NameTheProject textfield with \"([^\"]*)\"$")
	public void i_populate_NameTheProject_textfield_with(String arg1) throws Throwable {
		NameTheProject_textfield.sendKeys(arg1);
	}
	
	@When("^I select ([^\"]*) over COM08_SelectAProduct dropdown$")
	public void i_select_Product_over_COM08_SelectAProduct_dropdown(String arg1) throws Throwable {
	    	
			Select S=new Select(SelectAProduct_dropdown);
			S.selectByIndex(1);
	}
	
	
	@When("^I click COM08_SaveProject button$")
	public void i_click_SaveProject_button() throws Throwable {
		Thread.sleep(5000);
		SaveProject_button.click();
	}
	
	
	@Then("^I see the product associated with the project$")
	public void i_see_the_product_associated_with_the_project() throws Throwable {
		
		//Temporary code block until COM-178 & COM-179 is delivered
		Thread.sleep(5000);		

		
		
	}
	


}
