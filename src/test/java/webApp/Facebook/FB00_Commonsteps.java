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

	@Given("^Im a Facebook User$")
	public void im_a_Facebook_User() throws Throwable {
		log.info("Im a Facebook User");
		Thread.sleep(3000);
		
		

	}

}
