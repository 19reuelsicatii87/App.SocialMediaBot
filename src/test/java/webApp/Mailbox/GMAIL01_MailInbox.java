package webApp.Mailbox;

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

public class GMAIL01_MailInbox extends Helper{
	@FindBy(xpath="//input[@type='email']")
	WebElement GoogleEmail_textField;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement GooglePassword_textField;
	
	@FindBy(xpath="//content/span[text()='Next']")
	WebElement GoogleNext_button;
	
	@FindBy(xpath="//a[@data-g-label='Sign in']")
	WebElement GoogleHomeSignIn_link;
	
	@FindBy(xpath="//img[@alt='Print all']")
	WebElement GooglePrintAll_img;
	
	@FindBy(xpath="//a[@title='Gmail']")
	WebElement Google_hyperlink;
	
	@FindBy(xpath="//div[@class='J-J5-Ji J-JN-M-I-Jm']/span")
	WebElement Google_AllCheckbox;
	
	@FindBy(xpath="//div[@class='ar9 T-I-J3 J-J5-Ji']")
	WebElement Google_Delete;	
	
	@FindBy(xpath="//div[contains(.,'Link will only be valid for 24 hours')]")
	WebElement LinkValidFor2Hrs_text;
	
	@FindBy(xpath="//div//a[text()='Reset your Password']")
	WebElement ResetYourPassword_button;
	
	@FindBy(xpath="//div[@class='ii gt']//div/a[contains(text(),'account')]")
	WebElement ResetYourPassword_link;
	
	public static final WebElement SearchEmail(String keyword){
		WebElement EmailSubject = driver.findElement(By.xpath("//span[contains(.,'"+keyword+"')]"));
		return EmailSubject;
	}
	
	public static final WebElement SearchEmailAge(String keyword){
		WebElement SearchEmailAge = driver.findElement(By.xpath("//span[contains(.,'"+keyword+"')]"));
		return SearchEmailAge;
	}
	
	public GMAIL01_MailInbox() {
		PageFactory.initElements(driver, this);
		
	}
	
	@When("^I navigate to GMAIL$")
	public void i_navigate_to_GMAIL() throws Throwable, UnhandledAlertException {
		driver.get("https://mail.google.com");
	}

	@When("^I click the GMAIL01_GoogleHomeSignIn link$")
	public void i_click_the_GMAIL__GoogleHomeSignIn_link(int arg1) throws Throwable, UnhandledAlertException {
		GoogleHomeSignIn_link.click();
	}

	@When("^I populate the GMAIL01_GoogleEmail textField with ([^\"]*)$")
	public void i_populate_the_GMAIL__GoogleEmail_textField_with_Email(String Email) throws Throwable, UnhandledAlertException {
		GoogleEmail_textField.sendKeys(Email);
	}

	@When("^I click the GMAIL01_GoogleNext button$")
	public void i_click_the_GMAIL__GoogleNext_button(int arg1) throws Throwable, UnhandledAlertException {
		GoogleNext_button.click();
	}

	@When("^I populate the GMAIL01_GooglePassword textField with ([^\"]*)$")
	public void i_populate_the_GMAIL__GooglePassword_textField_with_Password(String Password) throws Throwable, UnhandledAlertException {
		GoogleEmail_textField.sendKeys(Password);
	}

	@When("^I click the GMAIL01_EmailSubject with ([^\"]*)$")
	public void i_click_the_GMAIL__EmailSubject_with_Subject(String subject) throws Throwable, UnhandledAlertException {
		loop:
		for(int i=0;i<3; i++){
			Google_hyperlink.click();
			Thread.sleep(10000);
			if(SearchEmail(subject).isDisplayed()){
				SearchEmail(subject).click();
				break loop;
			}else{
				if(i==2){
					fail("Expected to receive the email with subject: "+subject );
				}
			}
		}
	}

	@Then("^Ill see the GMAIL01_Message div with \"(Hi Partner, To reset your password please click on the button below. Link will only be valid for 24 hours:)\"$")
	public void ill_see_the_GMAIL__Message_div_with_Hi_Partner_To_reset_your_password_please_click_on_the_button_below_Link_will_only_be_valid_for_hours(String Message) throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, LinkValidFor2Hrs_text.isDisplayed());
		Assert.assertEquals(LinkValidFor2Hrs_text.getText(), Message);
				
	}

	@Then("^Ill see the GMAIL01_ResetYourPassword ([^\"]*)$")
	public void ill_see_the_GMAIL__ResetYourPassword_button(String ElementName) throws Throwable, UnhandledAlertException {
	
		switch(ElementName) {
		    case "button":
		    	Assert.assertEquals(true, ResetYourPassword_button.isDisplayed());
		        break;
		    case "link":
		    	Assert.assertEquals(true, ResetYourPassword_link.isDisplayed());
		        break;
			}
	}

	@When("^I click the GMAIL01_ResetYourPassword ([^\"]*)$")
	public void i_click_the_GMAIL__ResetYourPassword_ElementName(String ElementName) throws Throwable, UnhandledAlertException {

		switch(ElementName) {
	    case "button":
	    	ResetYourPassword_button.click();
	        break;
	    case "link":
	    	ResetYourPassword_link.click();
	        break;
		}
		
	}
	
	
	
	
}
