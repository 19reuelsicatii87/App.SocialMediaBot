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

public class Email extends Helper{
	@FindBy(xpath="//input[@type='email']")
	WebElement GoogleEmail_TextField;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement GooglePassword_TextField;
	
	@FindBy(xpath="//content/span[text()='Next']")
	WebElement GoogleNext_Button;
	
	@FindBy(xpath="//a[@data-g-label='Sign in']")
	WebElement GoogleHomeSignIn_Link;
	
	@FindBy(xpath="//img[@alt='Print all']")
	WebElement GooglePrintAll_Img;
	
	@FindBy(xpath="//a[@title='Gmail']")
	WebElement Google_Hyperlink;
	
	@FindBy(xpath="//div[@class='J-J5-Ji J-JN-M-I-Jm']/span")
	WebElement Google_AllCheckbox;
	
	@FindBy(xpath="//div[@class='ar9 T-I-J3 J-J5-Ji']")
	WebElement Google_Delete;	
	
	public static final WebElement SearchEmail(String keyword){
		WebElement EmailSubject = driver.findElement(By.xpath("//span[contains(.,'"+keyword+"')]"));
		return EmailSubject;
	}
	
	public Email() {
		PageFactory.initElements(driver, this);
		
	}
	
	@Then("^Ill see the Google Pop up")
	public void ill_see_the_google_signin_page() throws Throwable, UnhandledAlertException {
		ReUsablesKeyword.switchtochildwindow();	
		WD.until(ExpectedConditions.elementToBeClickable(GoogleNext_Button));
		Assert.assertEquals(true, GoogleNext_Button.isDisplayed());
	}
	
	@When("^I populate google email field with ([^\"]*)$")
	public void i_enter_email__value_in_google_emailaddress_field(String arg1) throws Throwable, UnhandledAlertException {
		GoogleEmail_TextField.sendKeys(arg1);
	}
	
	@When("^I populate google password field with ([^\"]*)$")
	public void i_enter_password_value_in_google_password_field(String arg1) throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(GooglePassword_TextField));
		GooglePassword_TextField.sendKeys(arg1);
	}
	
	@When("^I click google next button$")
	public void i_click_google_next_button() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(GoogleNext_Button));
		GoogleNext_Button.click();
	}
	
	@Then("^Google sign in window will close$")
	public void google_signin_window_will_close() throws Throwable, UnhandledAlertException {
		Thread.sleep(10000);
		ReUsablesKeyword.switchtoparentwindow();
	}
	
	@When("^I open my ([^\"]*) mailbox using my ([^\"]*) and ([^\"]*)$")
	public void i_open_my_value_mailbox(String domain, String email, String password) throws Throwable, UnhandledAlertException {
			if(domain.equals("google")){
				driver.get("https://mail.google.com");
				Thread.sleep(3000);
				GoogleHomeSignIn_Link.click();
				WD.until(ExpectedConditions.elementToBeClickable(GoogleEmail_TextField));
				GoogleEmail_TextField.sendKeys(email);
				GoogleNext_Button.click();
				WD.until(ExpectedConditions.elementToBeClickable(GooglePassword_TextField));
				GooglePassword_TextField.sendKeys(password);
				GoogleNext_Button.click();
			}
	}
	
	@When("^I click the email with Subject ([^\"]*)$")
	public void i_click_the_email_in_gmail(String subject) throws Throwable, UnhandledAlertException {
		loop:
		for(int i=0;i<3; i++){
			Google_Hyperlink.click();
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
	
	@When("^Ill delete all the email in ([^\"]*) for post condition")
	public void i_delete_email(String domain) throws Throwable, UnhandledAlertException {
			if(domain.equals("google")){
				Google_Hyperlink.click();
				Google_AllCheckbox.click();
				Thread.sleep(3000);
				Google_Delete.click();
				Thread.sleep(5000);

			}
	}
}
