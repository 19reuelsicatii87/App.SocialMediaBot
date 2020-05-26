package webApp.Instagram;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class IG03_ExploreTags extends WEBHelper {

	public static final List<WebElement> getMostRecentPost_LinkList() {
		List<WebElement> MostRecentPost_LinkList = driver
				.findElements(By.xpath("//h2[contains(text(),'Most recent')]/following-sibling::div//a"));
		return MostRecentPost_LinkList;
	}

	@FindBy(xpath = "//h2/div[contains(text(),'Top posts')]/ancestor::div//article//a[1]")
	WebElement TopRecentPost_Button;

	@FindBy(xpath = "//h2[contains(text(),'Most recent')]/following-sibling::div//a[@xpath=\"1\"]")
	WebElement MostRecentPost_Button;

	@FindBy(xpath = "//section[1]//span[1]//button[1]")
	WebElement PostLike_Button;

	@FindBy(xpath = "//a[text()='Next']")
	WebElement PostLikeNext_Button;

	public IG03_ExploreTags() {
		PageFactory.initElements(driver, this);
	}

	@When("^I click IG03_TopRecentPost button$")
	public void i_click_IG03_TopRecentPost_button() throws Throwable, UnhandledAlertException {
		TopRecentPost_Button.click();
	}

	@When("^I click IG03_MostRecentPost button$")
	public void i_click_IG03_MostRecentPost_button() throws Throwable, UnhandledAlertException {
		MostRecentPost_Button.click();
	}

	@When("^I click IG03_LikePost button for (\\d+)$")
	public void i_click_IG03_LikePost_button_for(int NextCounter) throws Throwable, UnhandledAlertException {

		int i = 0;
		while (i < NextCounter) {

			if (driver.findElement(By.xpath("//article[1]//span[1]/button[1]/*[@height=\"24\"]"))
					.getAttribute("aria-label").contains("Unlike")) {

				// Do Nothing
				log.info("Do Nothing -- " + i);

				// Click Next button
				driver.findElement(By.xpath("//a[text()='Next']")).click();
			}

			else {

				// Click Like and Next button
				Thread.sleep(1000);
				driver.findElement(By.xpath("//section[1]//span[1]//button[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[text()='Next']")).click();
				i++;

			}
		}
	}

	@When("^I populate IG03_CommentPost textfield with ([^\"]*) for (\\d+)$")
	public void i_populate_IG03_CommentPost_textfield_with_variable(String Username, int NextCounter)
			throws Throwable, UnhandledAlertException {

		int i = 0;
		while (i < NextCounter) {

			if (driver.findElement(By.xpath("//article[1]//span[1]/button[1]/*[@height=\"24\"]"))
					.getAttribute("aria-label").contains("Unlike")) {

				// Do Nothing
				log.info("Do Nothing -- " + i);

				// Click Next button
				driver.findElement(By.xpath("//a[text()='Next']")).click();
			}

			else {

				// Click and populate Comment, Click Next button
				Thread.sleep(1000);
				driver.findElement(By.xpath("//textarea[@placeholder='Add a comment…']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//textarea[@placeholder='Add a comment…']"))
						.sendKeys("Hey! awesome post. You may also want to view ours. Visit our Profile @" + Username);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Post']")).click();
				Thread.sleep(1000);				
				driver.findElement(By.xpath("//a[text()='Next']")).click();
				i++;

			}
		}
	}

}
