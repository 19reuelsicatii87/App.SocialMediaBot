package webApp.Seoreseller;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO00_CommonSteps extends WEBHelper{
	@FindBy(xpath="//nav[@id='main-menu']//li/a[text()='Home']")
	WebElement SrsHome_link;
	
	@FindBy(xpath="//div//img")
	WebElement SrsBanner_Image;
	
	@FindBy(xpath="//button[@class='login_button btn btn-primary text-uppercase']")
	WebElement LoginToYourDashBoard_Button;
	
	@FindBy(xpath="//div[contains(.,'Link will only be valid for 24 hours')]")
	WebElement LinkValidFor2Hrs_Text;
	
	@FindBy(xpath="//div//a[text()='Reset your Password']")
	WebElement ResetYourPassword_Button;
	
	@FindBy(xpath="//span[text()='Ignore, I trust this message']")
	WebElement GoogleIgnoreMessage_Alert;
	
	@FindBy(xpath="//div[text()='This message is to confirm that you changed your password. Please see details:']")
	WebElement ConfirmPasswordIsChange_Text;
	
	@FindBy(xpath="//div[@class='ii gt']//div/a[contains(text(),'account')]")
	WebElement ResetYourPassword_Link;
	
	@FindBy(xpath="//a[text()='Agency Tools']")
	WebElement AgencyTools_link;
	
	@FindBy(xpath="//a[text()='CRM']")
	WebElement CRM_link;
	
	@FindBy(xpath="//a[text()='Web Audit']")
	WebElement WebAudit_link;
	
	@FindBy(xpath="//a[text()='Proposal Builder']")
	WebElement ProposalBuilder_link;
	
	@FindBy(xpath="//a[text()='Affiliates']")
	WebElement Affiliates_link;
	
	@FindBy(xpath="//a[text()='Reputation Management']")
	WebElement ReputationManagement_link;
	
	@FindBy(xpath="//a[text()='Lead Generator']")
	WebElement LeadGenerator_link;
	
	@FindBy(xpath="//a[text()='Marketing Automation']")
	WebElement MarketingAutomation_link;
	
	@FindBy(xpath="//a[text()='Landing Pages']")
	WebElement LandingPage_link;
	
	
	@FindBy(xpath="(//i[@class='fa fa-paper-plane-o btn-send-email'])[1]")
	WebElement WebAuditPaperPlane_button;
	
	@FindBy(xpath="//i[@class='fa fa-paper-plane-o']")
	WebElement ProposalPaperPlane_button;
	
	@FindBy(xpath="(//button[contains(.,'View Leads')])[1]")
	WebElement ViewLeads_button;
	
	@FindBy(xpath="(//button[@data-content='Send Email'])[1]")
	WebElement LeadGenEmail_button;
	
	@FindBy(xpath="(//button[@data-content='Run Automation'])[1]")
	WebElement LeadGenRunAutomation_button;
	
	@FindBy(xpath="(//i[@class='fa fa-paper-plane-o'])[1]")
	WebElement CRMPaperPlane_button;
	
	@FindBy(xpath="//button[@title='Activate Sequence']")
	WebElement CRMActivateEmailSequence_button;
	
	@FindBy(xpath="(//div[@class='company']//h5)[1]")
	WebElement CRMContact_button;
	
	@FindBy(xpath="//p[contains(.,'By May 15')]")
	List<WebElement>  ByMayFifteen_text;
	
	@FindBy(xpath="//button[text()='Do it later']")
	WebElement DoItLater_button;
	
	@FindBy(xpath="//h1[text()='Send Email']")
	WebElement SendEmailModal_header;
	
	@FindBy(xpath="(//div[@class='bootstrap-tagsinput']/input)[1]")
	WebElement SendEmailTo_textfield;
	
	@FindBy(xpath="//div/input[@id='report_email_subject']")
	WebElement SendEmailSubject_textfield;
	
	@FindBy(xpath="//button[@id='send_report_btn']")
	WebElement SendEmailSend_button;
	
	@FindBy(xpath="//div[text()='Message sent']")
	WebElement  MessageSentNotif_text;
	
	
	public SEO00_CommonSteps() {
		PageFactory.initElements(driver, this);
		
	}
	
	@Given("^Im an existing Partner$")
	public void im_an_existing_Partner() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Given("^Im a new Partner$")
	public void im_a_new_Partner() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Then("^Ill see the SEO00_Dashboard page$")
	public void ill_see_the_dashboard_page() throws Throwable {
        Thread.sleep(3000);
		Assert.assertEquals(true, SrsHome_link.isDisplayed());
	}
	
	@When("^Ill not see the SEO00_Dashboard page")
	public void ill_not_be_redirected_to_dashboard() throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		Assert.assertEquals(true, SrsBanner_Image.isDisplayed());
		
	}
	
	@Then("^Ill see the SEO00_LogIn page")
	public void ill_see_the_login_page() throws Throwable, UnhandledAlertException {
        Thread.sleep(3000);
		Assert.assertEquals(true, LoginToYourDashBoard_Button.isDisplayed());
	}	


	
	@Then("^Ill see the \'Hi Partner, To reset your password please click on the button below. Link will only be valid for 24 hours:\' Message")
	public void ill_see_the_link_valid_for_24_hours_message() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, LinkValidFor2Hrs_Text.isDisplayed());
	}
	
	@Then("^Ill see the Reset Your Password button")
	public void ill_see_the_reset_password_button() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, ResetYourPassword_Button.isDisplayed());
	}
	
	@When("^I click the Reset ([^\"]*)$")
	public void i_click_the_reset_password_button(String resetRedirect) throws Throwable, UnhandledAlertException {
				Thread.sleep(3000);
				if(resetRedirect.equals("Reset Your Password")){
					ResetYourPassword_Button.click();
				}else if(resetRedirect.equals("Reset Password Link")){
					ResetYourPassword_Link.click();
				}
				Thread.sleep(3000);
				ReUsablesKeyword.switchtochildwindow();
	}
	
	@When("^I navigate back to my mailbox$")
	public void i_navigate_back_to_my_mailbox() throws Throwable, UnhandledAlertException {
		ReUsablesKeyword.switchtoparentwindow();
	}
	
	@Then("^Ill see the \'Hello,This message is to confirm that you changed your password.\' Message")
	public void ill_see_the_confirm_password_change_message() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, ConfirmPasswordIsChange_Text.isDisplayed());
	}
	
	
	@Then("^I click the  Email Trigger of ([^\"]*)$")
	public void i_click_the_email_trigger_of_value(String emailTrigger) throws Throwable, UnhandledAlertException {
		if(emailTrigger.equals("Web Audit")){
			WebAuditPaperPlane_button.click();
		}else if(emailTrigger.equals("Proposal")){
			ProposalPaperPlane_button.click();
		}else if(emailTrigger.equals("Lead Gen")){
			ViewLeads_button.click();
			LeadGenEmail_button.click();
		}else if(emailTrigger.equals("Lead Gen Sequence")){
			ViewLeads_button.click();
			LeadGenRunAutomation_button.click();
		}else if(emailTrigger.equals("CRM")){
			WD.until(ExpectedConditions.elementToBeClickable(CRMPaperPlane_button));
			CRMPaperPlane_button.click();
		}else if(emailTrigger.equals("CRM Sequence")){
			WD.until(ExpectedConditions.elementToBeClickable(CRMPaperPlane_button));
			CRMContact_button.click();
			ReUsablesKeyword.switchToLatestTab();
			WD.until(ExpectedConditions.elementToBeClickable(CRMActivateEmailSequence_button));
			CRMActivateEmailSequence_button.click();
		}
	}
	
	@When("^I open a next Window tab$")
	public void i_open_a_next_window_tab() throws Throwable, UnhandledAlertException {
		ReUsablesKeyword.switchtoparentwindow();
	}
	
	@When("^I redirect to SEO1_([^\"]*)$")
	public void i_redirect_to_value_page(String page) throws Throwable, UnhandledAlertException {
		ReUsablesKeyword.elementMouseHover(AgencyTools_link);
		if(page.equals("Web Audit Page")){
			WebAudit_link.click();
			Thread.sleep(3000);
		}else if(page.equals("Proposal Page")){
			ProposalBuilder_link.click();
			Thread.sleep(3000);
		}else if(page.equals("Lead Generator Page")){
			LeadGenerator_link.click();
			Thread.sleep(3000);
		}else if(page.equals("CRM Page")){
			CRM_link.click();
			Thread.sleep(3000);
		}
	}
	
	
	@Then("^Ill not see the SEO00_ByMayFifteen text")
	public void ill_not_see_SEO00_ByMayFifteen(){
			Assert.assertEquals(true, ByMayFifteen_text.isEmpty());
	}
	
	@Then("^Ill see the SEO00_DoItLater button")
	public void ill_see_SEO00_DoItLater_button(){
			Assert.assertEquals(true, DoItLater_button.isDisplayed());
	}
	
	@When("^I click the SEO00_DoItLater button")
	public void i_click_SEO00_DoItLater_button(){
		DoItLater_button.click();
	}
	
    @Then("^Ill see that an SEO00_Email Modal will be displayed")
	public void ill_see_SEO00_Email_modal() throws Throwable, UnhandledAlertException {
			Thread.sleep(3000);
			Assert.assertEquals(true, SendEmailModal_header.isDisplayed());
	}
    
	@When("^I populate the SEO00_To textfield with ([^\"]*)$")
	public void i_populate_SEO00_To_textfield(String email){
		SendEmailTo_textfield.clear();
		SendEmailTo_textfield.sendKeys(email);
	}
	
	@When("^I populate the SEO00_Subject textfield with ([^\"]*)$")
	public void i_populate_SEO00_Subject_textfield(String subject){
		SendEmailSubject_textfield.clear();
		SendEmailSubject_textfield.sendKeys(subject);
	}
	
	@When("^I click SEO00_Send button$")
	public void i_populate_SEO00_Send_button(){
		SendEmailSend_button.click();
	}
	
	@Then("^Ill see the SEO00_MessageSentNotification")
	public void ill_see_the_SEO00_MessageSentNotification(){
			Assert.assertEquals(true, MessageSentNotif_text.isDisplayed());
	}
	
}
