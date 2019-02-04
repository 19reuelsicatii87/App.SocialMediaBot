package webApp.Seoreseller;

import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Then;

public class SEO23_SettingsUsersUserId extends WEBHelper{
	@FindBy(xpath="//h3[text()='Profile Information']")
	WebElement ProfileInformation_header;
	
	@FindBy(xpath="//h3[text()='Profile Information']/ancestor::div[@class='widget']//button[text()='Save']")
	WebElement Save_button;
	
	public SEO23_SettingsUsersUserId() {
		PageFactory.initElements(driver, this);
	}
	
	
	@Then("Ill see the SEO23_ProfileInformation header")
	public void ill_see_profile_information_header() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(Save_button));
 		Assert.assertEquals(true, ProfileInformation_header.isDisplayed());
	}
	

}
