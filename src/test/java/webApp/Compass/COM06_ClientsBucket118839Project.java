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

public class COM06_ClientsBucket118839Project extends Helper{
	
	@FindBy(xpath=".//a[@id='products_button']")
	WebElement Product_tab;
	
	@FindBy(xpath=".//a[text()='Project Management ']")
	WebElement ProjectManagement_tab;
	
	@FindBy(xpath=".//div[@id='pcont']//a[@id='subprojects_button']")
	WebElement Project_dropdown;	
		
	public COM06_ClientsBucket118839Project() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@When("^I click COM06_Products tab$")
	public void i_click_Products_tab() throws Throwable, UnhandledAlertException {
		Product_tab.click();
	}
	
	@When("^I hover COM06_ProjectManagement tab$")
	public void i_hover_ProjectManagement_tab() throws Throwable, UnhandledAlertException {
		
		
		WD.until(ExpectedConditions.elementToBeClickable(ProjectManagement_tab));
        action.moveToElement(ProjectManagement_tab) 
        .build()
        .perform();         
        Thread.sleep(2000);
        
        
        
	}

	@When("^I click COM06_Project dropdown$")
	public void i_click_Project_dropdown() throws Throwable, UnhandledAlertException {
        
		action.moveToElement(Project_dropdown) 
        .click()
        .build()
        .perform(); 
		
		
	}

	
	


}
