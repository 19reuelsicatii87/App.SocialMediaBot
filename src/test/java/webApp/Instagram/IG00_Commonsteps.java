package webApp.Instagram;

import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Given;

public class IG00_Commonsteps extends WEBHelper {

	public IG00_Commonsteps() {
		PageFactory.initElements(driver, this);
	}

	@Given("^Im a Instagram User$")
	public void im_a_Instagram_User() throws Throwable {
		log.info("Im a Instagram User");
		Thread.sleep(3000);
	}

}
