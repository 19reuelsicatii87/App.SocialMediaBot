package webApp.Seoreseller;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO01_Home extends Helper{
	
	@FindBy(xpath=".//a[@href='/new-campaign/wizard']")
	WebElement AddCampaign_button;
	
	@FindBy(xpath=".//input[@id='business_url']")
	WebElement DomainUrl_textfield;
	
	@FindBy(xpath=".//button[@id='new-business-create-btn']")
	WebElement CheckDomain_button;
	
	@FindBy(xpath=".//button[@id='new-business-save-btn']")
	WebElement CreateCampaign_button;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement ClickToGetStarted_button;
	
	@FindBy(xpath="//div[@id='user-account-container']/button/img")
	WebElement UserAvatar_image;
	
	@FindBy(xpath="//div[@id='user-account-container']//li/a[@href='/logout']")
	WebElement Logout;
		
	@FindBy(xpath="//div[@id='profile-setup-box-image-action-holder']")
	WebElement CompanySetupUploadPhoto_Button;
	
	@FindBy(xpath="//div/input[@id='profile-setup-box-input-firstname']")
	WebElement CompanySetupFirstName_Textfield;
	
	@FindBy(xpath="//div/input[@id='profile-setup-box-input-lastname']")
	WebElement CompanySetupLastName_Textfield;
	
	@FindBy(xpath="//div/input[@id='profile-setup-box-input-role']")
	WebElement CompanySetupRole_Textfield;
	
	@FindBy(xpath="//div/input[@id='profile-setup-box-input-phone']")
	WebElement CompanySetupPhone_Textfield;
	
	@FindBy(xpath="//div[@class='custom-stepper-actions text-right']/button")
	WebElement CompanySetupCompleteProfile_Button;
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-name']")
	WebElement CompanySetupCompanyName_Textfield;	

	@FindBy(xpath="//input[@id='profile-setup-box-input-company-name']")
	WebElement CompanySetupCompanyProfile_Textfield;	
	
	@FindBy(xpath="//div[@class='selected-flag']")
	WebElement CompanySetupFlagIcon_Button;	
	
	public static final WebElement CompanySetupSelectCountry(String keyword){
		WebElement SelectedtCountry = driver.findElement(By.xpath("//span[@class='country-name'][text()='"+keyword+"']"));
		return SelectedtCountry;
	}
	
	@FindBy(xpath="//div[@id='s2id_autogen49']//span[@class='select2-arrow']")
	WebElement CompanySetupCompanyProfile_Selector;	
	
	
	public static final WebElement CompanySetupCompanyProfileByKeyword(String keyword){
		WebElement SelectedCompanyProfile = driver.findElement(By.xpath("//ul[@class='select2-results']/li/div[contains(.,'"+keyword+"')]"));
		return SelectedCompanyProfile;
	}
	
	public static final WebElement CompanySetupCompanyProfileByIndex(int index){
		WebElement SelectedCompanyProfile = driver.findElement(By.xpath("//ul[@class='select2-results']/li["+index+"]"));
		return SelectedCompanyProfile;
	}	
	
	@FindBy(xpath="//div[@id='s2id_autogen51']//span[@class='select2-arrow']")
	WebElement CompanySetupExistingClient_Selector;	
	
	public static final WebElement CompanySetupExistingClientByKeyword(String keyword){
		WebElement SelectedExistingClient = driver.findElement(By.xpath("//ul[@class='select2-results']/li/div[contains(.,'"+keyword+"')]"));
		return SelectedExistingClient;
	}
	
	public static final WebElement CompanySetupExistingClientByIndex(int index){
		WebElement SelectedExistingClient = driver.findElement(By.xpath("//ul[@class='select2-results']/li["+index+"]"));
		return SelectedExistingClient;
	}	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-website']")
	WebElement CompanySetupCompanyWebsite_Textfield;	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-phone']")
	WebElement CompanySetupBusinessPhone_Textfield;	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-address']")
	WebElement CompanySetupAddress_Textfield;	
	
	@FindBy(xpath="(//span[@class='pac-matched'])[1]")
	WebElement CompanySetupAddressFirstAutofill_span;	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-city']")
	WebElement CompanySetupCity_Textfield;	
	
	@FindBy(xpath="//div[@id='s2id_profile-setup-box-input-company-state']//span[@class='select2-arrow']")
	WebElement CompanySetupState_Selector;		
	
	@FindBy(xpath="//div[@id='s2id_profile-setup-box-input-company-state']//span[@class='select2-chosen']")
	WebElement CompanySetupState_span;		

	@FindBy(xpath="//div[@id='s2id_profile-setup-box-input-company-country']//span[@class='select2-arrow']")
	WebElement CompanySetupCountry_Selector;
	
	@FindBy(xpath="//div[@id='s2id_profile-setup-box-input-company-country']//span[@class='select2-chosen']")
	WebElement CompanySetupCountry_span;	
	
	@FindBy(xpath="//div//a[text()='BACK']")
	WebElement CompanySetupBack_Input;
	
	@FindBy(xpath="//button[@data-step-action='finish']")
	WebElement CompanySetupFinishSetup_button;
	
	@FindBy(xpath="//p[text()='Congratulations! You have successfully verified your email address.']")
	WebElement SuccessAccountVerifyMessage_text;
	
	@FindBy(xpath="(//div[@class='custom-input-group-addon']/i)[6]")
	WebElement CompanySetupCompanyWebsite_icon;
	
	@FindBy(xpath="//div[@class='selected-flag']")
	WebElement CompanySetupSelectedFlag_icon;
	
	@FindBy(xpath="//h3/p")
	WebElement CompanySetupVerbiage_text;	
	
	@FindBy(xpath="//a[text()='Email Settings']")
	WebElement EmailSettings_link;
	
	@FindBy(xpath="//span[@class='menu-icon partner-crm-icon']")
	WebElement CRMIcon_link;
	
	@FindBy(xpath="//span[@class='menu-icon website-audit-icon']")
	WebElement WebAuditIcon_link;
	
	@FindBy(xpath="//span[@class='menu-icon proposal-icon']")
	WebElement ProposalIcon_link;

	@FindBy(xpath="//span[@class='menu-icon mockup-creator-icon")
	WebElement MockUpCreatorIcon_link;
	
	@FindBy(xpath="//span[@class='menu-icon affiliates-icon")
	WebElement LeadGeneratorIcon_link;
	
	public SEO01_Home() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@When("^I click SEO01_AddCampaign button$")
	public void i_click_SEO01_AddCampaign_button() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(AddCampaign_button));
		AddCampaign_button.click();
	}
	
	
	@When("^I populate the SEO01_DomainUrl textfield with \"([^\"]*)\"$")
	public void i_populate_the_SEO01_DomainUrl_textfield_with(String arg1) throws Throwable {
		DomainUrl_textfield.sendKeys(arg1);
	}

	@When("^I click the User Avatar$")
	public void i_click_user_avatar() throws Throwable, UnhandledAlertException {
		UserAvatar_image.click();
	}
	
	@When("^I click the Logout$")
	public void i_click_the_logout() throws Throwable, UnhandledAlertException {
		Logout.click();
	}
	
	
	@Then("^I see the SEO01_SeoReseller banner$")
	public void i_see_the_SEO01_SeoReseller_banner() throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@Then("^Ill see the SEO01_SuccessAccountVerifyMessage message$")
	public void i_see_the_SSEO01_SuccessAccountVerifyMessage_message() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, SuccessAccountVerifyMessage_text.isDisplayed());
	}
	
	@Then("^Ill see the SEO01_CompanySetup popup$")
	public void i_see_the_SEO01_CompanySetup_popup() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(CompanySetupCompleteProfile_Button));
	}
	
	@Then("^Ill see SEO01_CompanyProfile verbiage$")
	public void i_see_the_SEO01_CompanyProfile_verbiage() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, CompanySetupVerbiage_text.isDisplayed());
	}
	
	@Then("^Ill see that the SEO01_UploadLogo button is removed$")
	public void ill_not_see_the_SEO01_UploadLogo_button() throws Throwable, UnhandledAlertException {
		Boolean isPresent = driver.findElements(By.xpath("//button[contains(.,'UPLOAD LOGO')]")).size() < 1;
		if(isPresent==true){
			Assert.assertEquals(true, isPresent);
		}else{
			fail("Upload Logo was displayed");
		}
	}
	
	@Then("^Ill see the SEO01_CompanyWebsite globe$")
	public void ill_see_the_SEO01_CompanyWebsite_globe() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, CompanySetupCompanyWebsite_icon.isDisplayed());
	}
	
	@Then("^Ill see that the SEO01_PhoneCountry icon is based on ([^\"]*)$")
	public void ill_see_the_SEO01_PhoneCountry_icon(String country) throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, CompanySetupSelectedFlag_icon.getAttribute("title").contains(country));
	}
	
	@When("^I click SEO01_CompleteProfile button$")
	public void i_click_SEO01_CompleteProfile_button() throws Throwable, UnhandledAlertException {
	    CompanySetupCompleteProfile_Button.click();
	}
	
	@Then("^I populate SEO01_CompanyName textfield with ([^\"]*)$")
	public void i_populate_SEO01_CompanyName_value(String companyName) throws Throwable, UnhandledAlertException {
		CompanySetupCompanyName_Textfield.sendKeys(companyName);
		Thread.sleep(2000);
	}
	
	@Then("^I select ([^\"]*) in SEO01_CompanyProfile dropdown$")
	public void i_select_SEO01_CompleteProfile_dropdown(String companyProfile) throws Throwable, UnhandledAlertException {
		CompanySetupCompanyProfile_Selector.click();
		CompanySetupCompanyProfileByKeyword(companyProfile).click();
	}
	
	@Then("^I select ([^\"]*) in SEO01_ExistingClient dropdown$")
	public void i_select_SEO01_ExistingClient_dropdown(String existingClient) throws Throwable, UnhandledAlertException {
		CompanySetupExistingClient_Selector.click();
		CompanySetupExistingClientByKeyword(existingClient).click();
	}
	 
	@Then("^I populate SEO01_CompanyWebsite textfield with ([^\"]*)$")
	public void i_populate_SEO01_CompanyWebsite_textfield(String companyWebsite) throws Throwable, UnhandledAlertException {
		CompanySetupCompanyWebsite_Textfield.sendKeys(companyWebsite);

	}	
	
	@Then("^I populate SEO01_BusinessPhone textfield with ([^\"]*)$")
	public void i_populate_SEO01_BusinessPhone_textfield(String businessPhone) throws Throwable, UnhandledAlertException {
		CompanySetupBusinessPhone_Textfield.sendKeys(businessPhone);
	}		

	@Then("^I populate SEO01_Address textfield with ([^\"]*) returned by Google$")
	public void i_populate_SEO01_Address_textfield(String address) throws Throwable, UnhandledAlertException {
		CompanySetupAddress_Textfield.sendKeys(address);
		CompanySetupAddressFirstAutofill_span.click();
		Thread.sleep(2000);
	}
	
	@Then("^Ill see that SEO01_State and SEO01_Country fields are auto-populated$")
	public void ill_see_the_autopopulate_fields_in_companysetup() throws Throwable, UnhandledAlertException {
	     Assert.assertEquals(false, CompanySetupState_span.getText().isEmpty());
	     Assert.assertEquals(false, CompanySetupCountry_span.getText().isEmpty());
	}
	
	@Then("^I click SEO01_FinishSetup Button$")
	public void i_click_finish_setup_button() throws Throwable, UnhandledAlertException {
		CompanySetupFinishSetup_button.click();
	}
	
	@Then("^Ill not see the SEO01_CompanySetup popup$")
	public void Ill_not_see_SEO01_CompanySetup_popup() throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		Assert.assertEquals(true, UserAvatar_image.isDisplayed());
	}

	@Then("^Ill see that Im redirected to SEO06_DashboardHome Page$")
	public void ill_see_the_dashboard_home_page() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, UserAvatar_image.isDisplayed());
	}
	
	@Then("^I click the SEO01_EmailSettings$")
	public void i_click_the_SEO01_EmailSettings_link() throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		EmailSettings_link.click();
	}
	
	@When("^I redirect to SEO1_([^\"]*)$")
	public void i_redirect_to_value_page(String page) throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(WebAuditIcon_link));
		if(page.equals("Web Audit Page")){
			WebAuditIcon_link.click();
			Thread.sleep(3000);
		}else if(page.equals("Proposal Page")){
			ProposalIcon_link.click();
			Thread.sleep(3000);
		}else if(page.equals("Lead Generator Page")){
			LeadGeneratorIcon_link.click();
			Thread.sleep(3000);
		}else if(page.equals("CRM Page")){
			CRMIcon_link.click();
			Thread.sleep(3000);
		}
	}
}
