package webApp.Seoreseller;

import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO09_Resetpassword extends Helper{
	
	@FindBy(xpath="//div//img")
	WebElement SrsBanner_Image;
	
	@FindBy(xpath="//div[@class='form-group']/input[@id='password']")
	WebElement Password_Textfield;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit_Button;
	
	@FindBy(xpath="//p/a[text()='Back to Login page']")
	WebElement BackToLogin_Link;
	
	@FindBy(xpath="//i[@class='fa fa-eye toggle-password-visibility']")
	WebElement TogglePasswordVisibility_I;	
	
	@FindBy(xpath="//p[text()='The Password field must be at least 8 characters in length.']")
	WebElement PasswordAtleast8Characters_Paragraph;	
	
	
	public SEO09_Resetpassword() {
		PageFactory.initElements(driver, this);
		
	}
	
	@Then("^Ill see the Reset Password Page$")
	public void ill_see_the_you_are_almost_in_your_account() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(Password_Textfield));
		Assert.assertEquals(true, Password_Textfield.isDisplayed());
	}
	
	@Then("^Ill see the Verbiage \'Should be at least 8 characters\'$")
	public void ill_see_the_password_verbiage() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Password_Textfield.getAttribute("placeholder").contains("Should be at least 8 characters"));
	}
	
	@Then("^Ill see the toggle for visibility$")
	public void ill_see_the_toggle_for_visibility() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, TogglePasswordVisibility_I.isDisplayed());
	}
	
	@Then("^Ill see the Back to Login page Link$")
	public void ill_see_the_back_to_login() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, BackToLogin_Link.isDisplayed());
	}
	
	@When("^I enter ([^\"]*) in the SEO09_Password textfield$")
	public void i_enter_new_valid_password_value_in_password_field(String arg1) throws Throwable, UnhandledAlertException {
		Password_Textfield.sendKeys(arg1);
        Thread.sleep(10000);
	}
	
	@When("^I click the SEO09_Submit button$")
	public void i_click_submit_button_of_reset_pass_page() throws Throwable, UnhandledAlertException {
		Submit_Button.click();
	}
	
	@Then("^Ill see the \'The Password field must be at least 8 characters in length.\' Message$")
	public void ill_see_the_atleast_eight_characters_message() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, PasswordAtleast8Characters_Paragraph.isDisplayed());
	}
	
	@When("^I click the Back to Login page Link$")
	public void i_click_the_back_to_login_link() throws Throwable, UnhandledAlertException {
		BackToLogin_Link.click();
	}
}
