package webApp.Seoreseller;

import org.junit.Assert;
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
	
	@Then("^Ill see the SEO010_SignUp Page$")
	public void ill_see_the_signup_page() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, CreateYourAccount_Text.isDisplayed());
	}
	
	@Then("^Ill see \"2 minute setup to get started with SEOReseller right away. Grow your agency by outsourcing your SEO, Web Design, Social Media, Link Building and more!\"$")
	public void ill_see_the_twominute_setup_message() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, TwoMinutesSetupToGetStarted_Text.isDisplayed());
	}
	
	@Then("^Ill see the SEO010_SignInWithGoogle button$")
	public void ill_see_the_signin_with_google_message() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, SignInWithGoogle_Button.isDisplayed());
	}
	
	@Then("^Ill see the SEO010_FirstName textfield$")
	public void ill_see_the_firstname_textfield() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, FirstName_Textfield.isDisplayed());
	}
	
	@Then("^Ill see the SEO010_LastName textfield$")
	public void ill_see_the_lastname_textfield() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, LastName_Textfield.isDisplayed());
	}
	
	@Then("^Ill see the SEO010_EmailAddress textfield$")
	public void ill_see_the_email_textfield() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, EmailAddress_Textfield.isDisplayed());
	}
	
	@Then("^Ill see the SEO010Password textfield$")
	public void ill_see_the_password_textfield() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, Password_Textfield.isDisplayed());
	}
	
	@Then("^Ill see the SEO010_TermsAndPrivacy text$")
	public void ill_see_the_terms_and_privacy_text() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, TermsOfUseAndPrivacyPolicyVerbiage_Text.isDisplayed());
	}

	@Then("^Ill see \"Already have an account\"$")
	public void ill_see_the_already_have_an_account_text() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, AlreadyhaveAnAccount_Text.isDisplayed());
	}
	
	@Then("^Ill see the Create Account button$")
	public void ill_see_the_create_account_button() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, CreateAccount_Button.isDisplayed());
	}
	
	
	@When("^I populate the SEO010_FirstName textfield with ([^\"]*)$")
	public void i_populate_firstname_field_with_firstname_value(String firstName) throws Throwable, UnhandledAlertException {
		FirstName_Textfield.sendKeys(firstName);
        Thread.sleep(3000);
	}
	
	@Then("^I populate the SEO010_LastName textfield with ([^\"]*)$")
	public void i_populate_lastname_field_with_lastname_value(String lastName) throws Throwable, UnhandledAlertException {
		LastName_Textfield.sendKeys(lastName);
        Thread.sleep(3000);
	}
	
	@Then("^I populate the SEO010_Email textfield with ([^\"]*)$")
	public void i_populate_email_field_with_email_value(String email) throws Throwable, UnhandledAlertException {
		EmailAddress_Textfield.sendKeys(email);
        Thread.sleep(3000);
	}
	
	@Then("^I populate the SEO010_Password textfield with ([^\"]*)$")
	public void i_populate_password_field_with_password_value(String password) throws Throwable, UnhandledAlertException {
		Password_Textfield.sendKeys(password);
        Thread.sleep(3000);
	}
	
	@Then("^I click SEO010_CreateAccount button$")
	public void i_click_create_account_button() throws Throwable, UnhandledAlertException {
		CreateAccount_Button.click();
        Thread.sleep(50000);
        
	}
	
	@When("^I click the SEO010_SignInWithGoogle button$")
	public void i_click_the_signin_with_google_message() throws Throwable, UnhandledAlertException {
	    SignInWithGoogle_Button.click();
	    Thread.sleep(3000);
	}
	
}
