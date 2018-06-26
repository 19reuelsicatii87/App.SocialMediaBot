package webApp.Seoreseller;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.Helper;

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
	
}
