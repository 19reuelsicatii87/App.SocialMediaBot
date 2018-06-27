package webApp.Seoreseller;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.Helper;
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
	
	public static final WebElement CompleteProfileSelectCountry(String keyword){
		WebElement SelectedtCountry = driver.findElement(By.xpath("//span[@class='country-name'][text()='"+keyword+"']"));
		return SelectedtCountry;
	}
	
	@FindBy(xpath="//div[@id='s2id_autogen49']//span[@class='select2-arrow']")
	WebElement CompanySetupCompanyProfile_Selector;	
	
	
	public static final WebElement CompleteProfileCompanyProfileByKeyword(String keyword){
		WebElement SelectedCompanyProfile = driver.findElement(By.xpath("//ul[@class='select2-results']/li/div[contains(.,'"+keyword+"')]"));
		return SelectedCompanyProfile;
	}
	
	public static final WebElement CompleteProfileCompanyProfileByIndex(int index){
		WebElement SelectedCompanyProfile = driver.findElement(By.xpath("//ul[@class='select2-results']/li["+index+"]"));
		return SelectedCompanyProfile;
	}	
	
	@FindBy(xpath="//div[@id='s2id_autogen51']//span[@class='select2-arrow']")
	WebElement CompanySetupExistingClient_Selector;	
	
	public static final WebElement CompleteProfileExistingClientByKeyword(String keyword){
		WebElement SelectedExistingClient = driver.findElement(By.xpath("//ul[@class='select2-results']/li/div[contains(.,'"+keyword+"')]"));
		return SelectedExistingClient;
	}
	
	public static final WebElement CompleteProfileExistingClientByIndex(int index){
		WebElement SelectedExistingClient = driver.findElement(By.xpath("//ul[@class='select2-results']/li["+index+"]"));
		return SelectedExistingClient;
	}	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-website']")
	WebElement CompanySetupCompanyWebsite_Textfield;	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-phone']")
	WebElement CompanySetupBusinessPhone_Textfield;	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-address']")
	WebElement CompanySetupAddress_Textfield;	
	
	@FindBy(xpath="//input[@id='profile-setup-box-input-company-city']")
	WebElement CompanySetupCity_Textfield;	
	
	@FindBy(xpath="//div[@id='s2id_profile-setup-box-input-company-state']//span[@class='select2-arrow']")
	WebElement CompanySetupState_Selector;		
	
	@FindBy(xpath="//input[@class='select2-input select2-active']")
	WebElement CompanySetupState_Input;		

	@FindBy(xpath="//div[@id='s2id_profile-setup-box-input-company-country']//span[@class='select2-arrow']")
	WebElement CompanySetupCountry_Selector;
	
	@FindBy(xpath="(//div[@class='select2-search']//input[@class='select2-input'])[6]")
	WebElement CompanySetupCountry_Input;	
	
	@FindBy(xpath="//div//a[text()='BACK']")
	WebElement CompanySetupBack_Input;
	
	@FindBy(xpath="//button[@data-step-action='finish']")
	WebElement CompanySetupUFinishSetup_Button;
	
	public SEO01_Home() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@When("^I click SEO01_AddCampaign button$")
	public void i_click_SEO01_AddCampaign_button() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(AddCampaign_button));
		AddCampaign_button.click();
	}
	
	
	@When("^I populate the SEO01_DomainUrl textfield with \"([^\"]*)\"$")
	public void i_populate_the_SEO__DomainUrl_textfield_with(String arg1) throws Throwable {
		DomainUrl_textfield.sendKeys(arg1);
	}

	@When("^I click the User Avatar")
	public void i_click_user_avatar() throws Throwable, UnhandledAlertException {
		UserAvatar_image.click();
	}
	
	@When("^I click the Logout")
	public void i_click_the_logout() throws Throwable, UnhandledAlertException {
		Logout.click();
	}



}
