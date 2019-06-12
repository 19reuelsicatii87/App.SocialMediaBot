package webApp.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class FB05_FriendsRequest extends WEBHelper {

	public static final WebElement AddFriendRequest_button(int profileNumber) {
		WebElement AddFriendRequest_button = driver.findElement(
				By.xpath("(//li[@class='friendBrowserListUnit'])["+profileNumber+"]//button[contains(@class,'FriendRequestAdd ')]"));
		return AddFriendRequest_button;
	}

	public FB05_FriendsRequest() {
		PageFactory.initElements(driver, this);
	}

	@When("^I add the first \"(\\d+)\" profiles from Friends$")
	public void i_add_the_first_value_profile_from_Friends(int ProfileNumber) throws Throwable, UnhandledAlertException {
		log.info("I add the first " + ProfileNumber + " profiles");

		int x = 0;
		for (int i = 1; i < ProfileNumber + 1; i++) {
			x = x + 300;

			// Click to ProfileImage
			// =========================================
			try {
				AddFriendRequest_button(i).click();
				Thread.sleep(2000);

			} catch (NoSuchElementException e) {
				log.error("Unable to locate ProfileImage_button");
				JS.executeScript("window.scrollTo(0, " + x + ");");
				Thread.sleep(2000);
				AddFriendRequest_button(i).click();
				Thread.sleep(2000);
			}			
		}
	}

}
