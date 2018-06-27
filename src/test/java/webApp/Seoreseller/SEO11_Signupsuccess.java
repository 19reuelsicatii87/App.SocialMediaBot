package webApp.Seoreseller;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO11_Signupsuccess extends Helper{
	
	//@FindBy(xpath="//div[@id='signup-box-title-container']/h3/strong[text()='Create Your Account']")
	//WebElement CreateYourAccount_Text;

	
	
	
	public SEO11_Signupsuccess() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@Then("^I be redirected to Welcome page$")
	public void i_be_redirected_to_Welcome_page() throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	@Then("^I see the message \"([^\"]*)\"$")
	public void i_see_the_message_value(String arg1) throws Throwable, UnhandledAlertException {
	    //CodeHere
	}
	
	
}
