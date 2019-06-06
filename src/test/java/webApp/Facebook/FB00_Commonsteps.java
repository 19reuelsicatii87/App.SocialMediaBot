package webApp.Facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Given;

public class FB00_Commonsteps extends WEBHelper {

	@FindBy(xpath = ".//my-libs-login-form/form/div[1]/input")
	WebElement Username;

	@FindBy(xpath = ".//my-libs-login-form/form/div[2]/input")
	WebElement Password;

	public FB00_Commonsteps() {
		PageFactory.initElements(driver, this);
	}

	@Given("^Im an Facebook User$")
	public void im_an_Account_Manager() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(3000);
	}

}
