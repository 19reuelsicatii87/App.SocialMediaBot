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

public class SEO06_Login extends Helper{
	
	@FindBy(xpath="//div//img")
	WebElement SrsBanner_Image;
	
	@FindBy(xpath="//div[@class='form-group']/input[@id='email']")
	WebElement EmailAddress_Textfield;
	
	@FindBy(xpath="//div[@class='form-group']/input[@id='password']")
	WebElement Password_Textfield;
	
	@FindBy(xpath="//div[@id='remember-me-formgroup']/input[@name='remember']")
	WebElement RememberMe_Checkbox;
	
	@FindBy(xpath="//span[@id='forgot-password-span']/a")
	WebElement ForgotYourPassword_Link;
	
	@FindBy(xpath="//button[@class='login_button btn btn-primary text-uppercase']")
	WebElement LoginToYourDashBoard_Button;
	
	@FindBy(xpath="//button[@id='google-signin']")
	WebElement SignInWithGoogle_Button;
	
	@FindBy(xpath="//span[@id='dont-have-acct-span']/following-sibling::a")
	WebElement SignUp_Link;
	
	@FindBy(xpath="//div[@class='alert alert-info text-center']/p")
	WebElement UsernamePasswordRequired_Alert;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	WebElement IncorrectEmailPassCombination_Alert;
	
	@FindBy(xpath="//div[@class='terms-condition-container']")
	WebElement TermsOfUseAndPrivacyPolicyVerbiage_Text;
	
	public SEO06_Login() {
		PageFactory.initElements(driver, this);
		
	}
	
	@Then("^Ill see the Email Address Field$")
	public void ill_see_the_email_address_field() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, EmailAddress_Textfield.isDisplayed());
	}
	
	@When("^Ill see the Password Field$")
	public void ill_see_the_password_address_field() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Password_Textfield.isDisplayed());
	}
	
	@When("^Ill see the Log In to you Dashboard button$")
	public void ill_see_the_login_to_dashboard_button() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, LoginToYourDashBoard_Button.isDisplayed());
	}
	
	@When("^Ill see the Sign in with Google button$")
	public void ill_see_the_signin_with_google_button() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, SignInWithGoogle_Button.isDisplayed());
	}
	
	@When("^I enter ([^\"]*) in the Email Address Field$")
	public void i_enter_email_value_in_emailaddress_field(String arg1) throws Throwable, UnhandledAlertException {
		EmailAddress_Textfield.sendKeys(arg1);
			
	}
	
	@When("^I enter ([^\"]*) in the Password Field$")
	public void i_enter_password_value_in_password_field(String arg1) throws Throwable, UnhandledAlertException {
		Password_Textfield.sendKeys(arg1);
        Thread.sleep(3000);
	}
	
	@When("^I click the Log in to your Dashboard button$")
	public void i_click_the_login_to_your_dashboard_button() throws Throwable, UnhandledAlertException {
		LoginToYourDashBoard_Button.click();
	}
	
	@When("^Ill see the Error ([^\"]*)$")
	public void ill_see_the_error(String arg1) throws Throwable, UnhandledAlertException {
		if(arg1.equals("Incorrect")){
			Assert.assertEquals(true, IncorrectEmailPassCombination_Alert.isDisplayed());
		}else{
			Assert.assertEquals(true, UsernamePasswordRequired_Alert.isDisplayed());
		}
	}
	
	@When("^I click the Sign in with Google button$")
	public void i_click_the_sign_in_with_google() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(SignInWithGoogle_Button));
		SignInWithGoogle_Button.click();
	}
	
	@When("^I click the Forgot Password Link$")
	public void i_click_the_forgot_password_link() throws Throwable, UnhandledAlertException {
		ForgotYourPassword_Link.click();
	}
	
	@When("^Ill see the Terms of Use and Privacy Policy Verbiage$")
	public void i_see_the_terms_of_use_and_privacy_policy_verbiage() throws Throwable, UnhandledAlertException {
		TermsOfUseAndPrivacyPolicyVerbiage_Text.click();
	}
	
	@Then("^Ill see the SEO06_SeoReseller Banner$")
	public void ill_see_the_seoreseller_banner() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, SrsBanner_Image.isDisplayed());
	}
	
	@When("^I click the SEO06_SignUp Link$")
	public void i_click_the_signup_link() throws Throwable, UnhandledAlertException {
		SignUp_Link.click();
	}
	
}
