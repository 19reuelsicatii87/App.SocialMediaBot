package webApp.Seoreseller;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class SEO16_OnboardingStart extends WEBHelper{
	@FindBy(xpath="//button[contains(.,'get started')]")
	WebElement LetsGetStarted_button;
	
	
	public SEO16_OnboardingStart() {
		PageFactory.initElements(driver, this);
	}
	

	@When("^I click the SEO16_LetsGetStarted button")
	public void i_click_lets_get_started_button() throws Throwable, UnhandledAlertException {
		Thread.sleep(5000);
		LetsGetStarted_button.click();
	}
	
}
