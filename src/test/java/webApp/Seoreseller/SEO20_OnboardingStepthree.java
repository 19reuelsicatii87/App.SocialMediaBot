package webApp.Seoreseller;

import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Then;

public class SEO20_OnboardingStepthree extends WEBHelper{
	@FindBy(xpath="//h2[text()='Let’s schedule your onboarding call']")
	WebElement LetsScheduleCall_header;
	
	@FindBy(xpath="//p[contains(.,'We’ll discuss our future partnership, how we will be working together')]")
	WebElement DiscussFuturePartnership_text;
	
	@FindBy(xpath="//iframe[@class='calendly']")
	WebElement Calendly_iframe;
	
	@FindBy(xpath="//button[text()='Done with Booking my Call']")
	WebElement DoneWithMyBooking_button;
	
	@FindBy(xpath="//span[text()='Nah, I’ll do it later']")
	WebElement IllDotItLater_link;
	
	public SEO20_OnboardingStepthree() {
		PageFactory.initElements(driver, this);
	}
	
	
	@Then("^Ill see the SEO20_LetsScheduleYourcall header with \"(Let's schedule your onboarding call)\"$")
	public void i_see_the_message_lets_schedule_call(String message) throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(DoneWithMyBooking_button));
		Assert.assertEquals(true, LetsScheduleCall_header.isDisplayed());
		Assert.assertEquals(message, LetsScheduleCall_header.getText().replace("’", "'"));
	}
	
	
	@Then("^Ill see the SEO20_DiscussOurFuturePartnership text with \"(We'll discuss our future partnership, how we will be working together)\"$")
	public void i_see_the_message_discuss_future_partnership(String message) throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, DiscussFuturePartnership_text.isDisplayed());
		Assert.assertEquals(true, DiscussFuturePartnership_text.getText().replace("’", "'").contains(message));
	}
	
	
	@Then("^Ill see the SEO20_Calendly iframe$")
	public void i_see_calendly_iframe() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Calendly_iframe.isDisplayed());
	}
	    
    @Then("^Ill see the SEO20_DoneWithBookingMyCall button$")
	public void i_see_done_with_booking_call_button() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, DoneWithMyBooking_button.isDisplayed());
	}	 

    @Then("^Ill see the SEO20_NahIllDoIt link$")
	public void i_see_ill_do_it_later_link() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, IllDotItLater_link.isDisplayed());
	}
 
	
}
