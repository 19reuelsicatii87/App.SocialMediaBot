package webApp.WilliamHill;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WL_harnessracing extends Helper{
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	 WebElement CreateNewFSR;
	@FindBy(id="userAccountName")
	WebElement userAccountName;
	@FindBy(linkText="Log Out")
	WebElement Logout;
	
	@FindBy(id="fsrCanvasGroup")
	WebElement CreateFSRValidation;
	
	
	public WL_harnessracing() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	


}
