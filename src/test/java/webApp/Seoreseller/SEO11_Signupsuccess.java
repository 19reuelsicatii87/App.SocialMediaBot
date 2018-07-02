package webApp.Seoreseller;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO11_Signupsuccess extends Helper{
	
	//@FindBy(xpath="//div[@id='signup-box-title-container']/h3/strong[text()='Create Your Account']")
	//WebElement CreateYourAccount_Text;

	@FindBy(xpath="//div[@class='container-header']/img")
	WebElement SrsBanner_image;
			
	@FindBy(xpath="//div[@class='content-section']/h1")
	WebElement Welcome_heading;
	
	@FindBy(xpath="//div[@class='icon-container']/img")
	WebElement Mailbox_image;

	@FindBy(xpath="//p[text()='Congratulations! You are just one step away to access all features of your free account.']")
	WebElement Congratulations_text;
	
	@FindBy(xpath="//p[text()='Please verify your account by clicking on the confirmation link sent to your email.']")
	WebElement PleaseVerifyAccount_text;
	
	@FindBy(xpath="//a[contains(.,'Go to')]")
	WebElement GoToMailbox_button;
	
	@FindBy(xpath="//p[contains(.,'resend verification email')]")
	WebElement ClickHereToResend_text;
	
	@FindBy(xpath="//a[text()='here']")
	WebElement Here_link;
	
	
	@FindBy(xpath="//a[@data-g-label='Sign in']")
	WebElement GoogleHomeSignIn_Link;
	
	
	public SEO11_Signupsuccess() {
		PageFactory.initElements(driver, this);
		
	}
	
	@Then("^I be redirected to Welcome page$")
	public void i_be_redirected_to_Welcome_page() throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@Then("^I see the message \"([^\"]*)\"$")
	public void i_see_the_message_value(String arg1) throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@When("^I navigate back to SRS Welcome page$")
	public void i_navigate_back_to_SRS_Welcome_page() throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@When("^I click the SEO11_resend link$")
	public void i_click_the_SEO11_resend_link() throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@When("^I click the SEO011_GoToMailbox button for my ([^\"]*) Account$")
	public void i_click_go_to_mail_button(String domain) throws Throwable, UnhandledAlertException {
		if(domain.equals("google")){
			GoToMailbox_button.click();
			Thread.sleep(3000);
			ReUsablesKeyword.switchWindowTab(1);
			Thread.sleep(3000);
		}else if(domain.equals("zoho")){
			driver.get("https://accounts.zoho.com/signin?servicename=VirtualOffice&signupurl=https://workplace.zoho.com/orgsignup.do");
		}
	}
}
