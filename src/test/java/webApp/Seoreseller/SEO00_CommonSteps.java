package webApp.Seoreseller;

import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Utilities.QueryDatabase;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO00_CommonSteps extends Helper{
	@FindBy(xpath="//nav[@id='main-menu']//li/a[text()='Home']")
	WebElement SrsHome_Link;
	
	@FindBy(xpath="//div//img")
	WebElement SrsBanner_Image;
	
	@FindBy(xpath="//button[@class='login_button btn btn-primary text-uppercase']")
	WebElement LoginToYourDashBoard_Button;
	
	@FindBy(xpath="//span[text()='Ignore, I trust this message']")
	WebElement GoogleIgnoreMessage_Alert;
	
	@FindBy(xpath="//div[text()='This message is to confirm that you changed your password. Please see details:']")
	WebElement ConfirmPasswordIsChange_Text;
	
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
		Assert.assertEquals(true, SrsHome_Link.isDisplayed());
	}
	
	@When("^Ill not see the SEO00_Dashboard page")
	public void ill_not_be_redirected_to_dashboard() throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		Assert.assertEquals(true, SrsBanner_Image.isDisplayed());
		Assert.assertEquals(false, SrsHome_Link.isDisplayed());
	}
	
	@Then("^Ill see the SEO00_LogIn page")
	public void ill_see_the_login_page() throws Throwable, UnhandledAlertException {
        Thread.sleep(3000);
		Assert.assertEquals(true, LoginToYourDashBoard_Button.isDisplayed());
	}	


	
	@Then("^Ill see the \'Hello,This message is to confirm that you changed your password.\' Message")
	public void ill_see_the_confirm_password_change_message() throws Throwable, UnhandledAlertException {
			Assert.assertEquals(true, ConfirmPasswordIsChange_Text.isDisplayed());
	}
	
	@Then("^I check if ([^\"]*) should not exist as pre condition$")
	public void ii_check_email_value_not_existing(String email) throws Throwable, UnhandledAlertException {
		String idNumber = QueryDatabase.ReturnSpecificData("SELECT * FROM tbl_user WHERE email='"+email+"'", "id");
		try{
			if(idNumber.equals(null)){
				
			}else{
				QueryDatabase.DeleteSpecificData("DELETE FROM tbl_user WHERE id="+idNumber+" AND site_id=1");
				QueryDatabase.DeleteSpecificData("DELETE FROM tbl_userinfo WHERE use_id="+idNumber+"");
				System.out.println("DATABASE : "+email +" with ID " + idNumber +" is now removed");
			}
			
		}catch(Exception e){
			System.out.println("DATABASE : Email is available and not yet registered");
		}			
	}
	
	
	@When("^I redirect to ([^\"]*)$")
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
	
	@Then("^I click the  Email Trigger of ([^\"]*)$")
	public void i_click_the_email_trigger_of_value(String emailTrigger) throws Throwable, UnhandledAlertException {
		ReUsablesKeyword.elementMouseHover(AgencyTools_link);
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
}
