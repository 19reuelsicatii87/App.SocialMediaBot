package webApp.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class FB04_GroupsIDMembers extends WEBHelper {

	@FindBy(xpath = "//div[@id='profileEscapeHatchContentID']//button[contains(@class,'FriendRequestAdd')]")
	WebElement AddFriendRequest_button;

	public static final WebElement ProfileImage(int profileNumber) {
		WebElement ProfileImage = driver.findElement(
				By.xpath("(//div[@class='fbProfileBrowserResult hideSummary']//a)[" + profileNumber + "]"));
		return ProfileImage;
	}

	public static final WebElement PageResult_link(String page) {
		WebElement PageResult_link = driver.findElement(By.xpath("//span[contains(text(),'" + page + "')]"));
		return PageResult_link;
	}

	public FB04_GroupsIDMembers() {
		PageFactory.initElements(driver, this);
	}

	@When("^I add the first \"(\\d+)\" profiles$")
	public void i_add_the_first_value_profile(int ProfileNumber) throws Throwable, UnhandledAlertException {
		log.info("I add the first " + ProfileNumber + " profiles");

		int x = 0;
		for (int i = 1; i < ProfileNumber + 1; i++) {
			x = x + 300;

			// Click to ProfileImage
			// =========================================
			try {
				ProfileImage(i * 2).click();
				Thread.sleep(2000);

			} catch (NoSuchElementException e) {
				log.error("Unable to locate ProfileImage_button");
				JS.executeScript("window.scrollTo(0, " + x + ");");
				Thread.sleep(3000);
				ProfileImage(i * 2).click();
				Thread.sleep(2000);
			}

			// Click AddFriendRequest_button
			// =========================================
			try {
				AddFriendRequest_button.click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
			} catch (NoSuchElementException e) {
				log.error("Unable to locate AddFriendRequest_button");
				driver.navigate().back();
				Thread.sleep(2000);
			}
		}
	}

}
