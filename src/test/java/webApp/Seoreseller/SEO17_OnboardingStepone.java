package webApp.Seoreseller;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class SEO17_OnboardingStepone extends WEBHelper{
	@FindBy(xpath="//span[text()='SKIP']")
	WebElement Skip_link;
	
	
	public SEO17_OnboardingStepone() {
		PageFactory.initElements(driver, this);
	}
	
	@When("^I click the SEO17_Skip link")
	public void i_click_skip_link() throws Throwable, UnhandledAlertException {
		Thread.sleep(5000);
		Skip_link.click();
	}
	
}
