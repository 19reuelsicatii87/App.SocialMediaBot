package webApp.Facebook;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FB01_Login extends WEBHelper {

	@FindBy(xpath = ".//input[@name='email']")
	WebElement Username_txtfield;

	@FindBy(xpath = ".//input[@name='pass']")
	WebElement Password_txtfield;

	@FindBy(xpath = ".//label[@class='uiButton uiButtonConfirm']//input")
	WebElement Login_button;

	public FB01_Login() {		
		PageFactory.initElements(driver, this);		
	}

	@When("^I populate FB01_Username textfield with ([^\"]*)$")
	public void i_populate_Username_with_value(String username) throws Throwable, UnhandledAlertException {
		log.info("I populate FB01_Username with " + username);
		Username_txtfield.sendKeys(username);
	}

	@When("^I populate FB01_Username textfield with \"([^\"]*)\"$")
	public void i_populate_Username_with_variable(String username) throws Throwable, UnhandledAlertException {
		log.info("I populate FB01_Username with " + username);
		Username_txtfield.sendKeys(username);
	}

	@When("^I populate FB01_Password textfield with ([^\"]*)$")
	public void i_populate_Password_with_value(String password) throws Throwable, UnhandledAlertException {
		log.info("I populate FB01_Password with " + password);
		Password_txtfield.sendKeys(password);
	}

	@When("^I populate FB01_Password textfield with \"([^\"]*)\"$")
	public void i_populate_Password_with_variable(String password) throws Throwable, UnhandledAlertException {
		log.info("I populate FB01_Password with " + password);
		Password_txtfield.sendKeys(password);
	}

	@When("^I click FB01_LogIn button$")
	public void i_click_LogIn_button() throws Throwable, UnhandledAlertException {
		log.info("I click FB01_LogIn button");
		Login_button.click();
	}

	@Then("^Ill see that Ive login successfully$")
	public void ill_see_that_Ive_login_successfully() throws Throwable, UnhandledAlertException {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^Ill see that Ive logout successfully$")
	public void ill_see_that_Ive_logout_successfully() throws Throwable, UnhandledAlertException {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

}
