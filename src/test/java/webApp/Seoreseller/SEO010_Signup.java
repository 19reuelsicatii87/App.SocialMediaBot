package webApp.Seoreseller;

import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;

public class SEO010_Signup extends Helper{
	
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
	
	
	
	public SEO010_Signup() {
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
	
	@Then("^Ill see the SEO010_SignInWithGoogle Button$")
	public void ill_see_the_signin_with_google_message() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, SignInWithGoogle_Button.isDisplayed());
	}
	
	@Then("^Ill see the SEO010_FirstName Text Field$")
	public void ill_see_the_firstname_textfield() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, FirstName_Textfield.isDisplayed());
	}
	
	@Then("^Ill see the SEO010_LastName Text Field$")
	public void ill_see_the_lastname_textfield() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, LastName_Textfield.isDisplayed());
	}
}
