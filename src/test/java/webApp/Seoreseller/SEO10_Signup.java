package webApp.Seoreseller;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO10_Signup extends Helper{
	
	@FindBy(xpath="//div[@id='signup-box-title-container']/h3/strong[text()='Create Your Account']")
	WebElement CreateYourAccount_Text;

	@FindBy(xpath="//div[@id='signup-box-title-container']/small[text()='2 minute setup to get started with SEOReseller right away. "
			+ "Grow your agency by outsourcing your SEO, Web Design, Social Media, Link Building and more!']")
	WebElement TwoMinutesSetupToGetStarted_Text;
	
	@FindBy(xpath="//button[@id='google-signup-btn']")
	WebElement SignInWithGoogle_Button;	
	
	@FindBy(xpath="//div/input[@id='signup-first-name']")
	WebElement FirstName_Textfield;
	
	@FindBy(xpath="//div/input[@id='signup-last-name']")
	WebElement LastName_Textfield;	
	
	@FindBy(xpath="//div/input[@id='signup-email-address']")
	WebElement EmailAddress_Textfield;		
	
	@FindBy(xpath="//div/input[@id='signup-password']")
	WebElement Password_Textfield;		
	
	@FindBy(xpath="//div[@id='signup-box-info-fineprint']/small[contains(.,'By signing up, you agree to SEOReseller')]")
	WebElement TermsOfUseAndPrivacyPolicyVerbiage_Text;

	@FindBy(xpath="//div/button[@id='signup-box-info-action-button']")
	WebElement CreateAccount_Button;	
	
	@FindBy(xpath="//div/small[text()='Already have an account? ']")
	WebElement AlreadyhaveAnAccount_Text;
	
	@FindBy(xpath="//div/small/a[text()='Log in']")
	WebElement Login_Link;
	
	@FindBy(xpath="//div/small/a[text()='Terms of Use']")
	WebElement TermsOfUse_Link;
	
	@FindBy(xpath="//div/small/a[text()='Privacy Policy']")
	WebElement PrivacyPolicy_Link;
	
	
	
	public SEO10_Signup() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@Then("^I see the SEO10_SignUp page$")
	public void i_see_the_SEO10_SignUp_page() throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@Then("^I see \"([^\"]*)\"$")
	public void i_see_value(String arg1) throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@When("^I populate the SEO10_FirstName textfield with ([^\"]*)$")
	public void i_populate_the_FirstName_textfield_with_variable(String arg1) throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@When("^I populate the SEO10_LastName textfield with ([^\"]*)$")
	public void i_populate_the_LastName_textfield_with_variable(String arg1) throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@When("^I populate the SEO10_Email textfield with ([^\"]*)$")
	public void i_populate_the_Email_textfield_with_variable(String arg1) throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	
	@When("^I populate the SEO10_Password textfield with ([^\"]*)$")
	public void i_populate_the_Password_textfield_with_variable(String arg1) throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@Then("^I click SEO10_CREATEACCOUNT button$")
	public void i_click_SEO10_CREATEACCOUNT_button() throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	
}
