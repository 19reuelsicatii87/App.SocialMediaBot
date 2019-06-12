package cucumber.Framework;

import static io.restassured.RestAssured.post;
import static io.restassured.RestAssured.requestSpecification;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

public class CommonSteps extends WEBHelper {

	@When("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to_URL_variable(String Path) throws Throwable {
		log.info("I navigate to "
				+ GetPropertValue("Properties/TestProperties.xml", GetApplication() + GetTestEnv() + "_" + Path));
		Thread.sleep(5000);
		driver.get(GetPropertValue("Properties/TestProperties.xml", GetApplication() + GetTestEnv() + "_" + Path));

	}

	@When("^I navigate back to \"([^\"]*)\"$")
	public void i_navigate_back_to_URL_variable(String Path) throws Throwable {
		log.info("I navigate back to "
				+ GetPropertValue("Properties/TestProperties.xml", GetApplication() + GetTestEnv() + "_" + Path));
		Thread.sleep(5000);
		driver.get(GetPropertValue("Properties/TestProperties.xml", GetApplication() + GetTestEnv() + "_" + Path));

	}

	@When("^I navigate to ParentWindow$")
	public void i_navigate_to_ParentWindow() throws Throwable, UnhandledAlertException {
		log.info("I navigate to ParentWindow");
		ReUsablesKeyword.switchtoparentwindow();
	}

	@When("^I navigate to ChildWindow$")
	public void i_navigate__to_ChildWindow() throws Throwable, UnhandledAlertException {
		log.info("I navigate to ChildWindow");
		ReUsablesKeyword.switchtochildwindow();
	}

	@When("^I wait for (\\d+) millisecond$")
	public void i_wait_for_digit_millisecond(int millisecond) throws Throwable, UnhandledAlertException {
		log.info("I wait for " + millisecond + " millisecond");
		Thread.sleep(millisecond);
	}

	@When("^I wait for page to load$")
	public void i_wait_for_page_to_load() throws Throwable, UnhandledAlertException {
		log.info("I wait for page to load");
		while (!JS.executeScript("return document.readyState").toString().equals("complete")) {
			Thread.sleep(1500);
			System.out.println(
					JS.executeScript("return document.readyState").toString() + "... Waiting for the page to load...");
		}
	}

	@Given("^I navigate to the application exact ([^\"]*)$")
	public void i_navigate_to_the_application_exact_URL(String URL) throws Throwable {
		log.info("I navigate to the application exact " + URL);
		driver.get(URL);
	}

	@Then("^I ensure that ([^\"]*) does not exist$")
	public void i_check_email_value_not_existing(String email) throws Throwable, UnhandledAlertException {
		log.info("I ensure that " + email + " does not exist");
		if (GetTestEnv().contains("PRD")) {
			System.out.println("Do Nothing");
		} else {
			String ToEmail = UUID.randomUUID().toString().replace("-", "");
			RequestSpecBuilder reqB = new RequestSpecBuilder();
			reqB.setBaseUri(GetPropertValue("Properties/TestProperties.xml", "Lumen" + GetTestEnv()));
			reqB.setBasePath("admin/tools/email-updater");
			reqB.addParam("site_id", "1");
			reqB.addParam("from_email", email);
			reqB.addParam("to_email", ToEmail + "@gmail.com");
			reqB.addParam("username", ToEmail + "@gmail.com");
			requestSpecification = reqB.build();
			Response Resp = post();
			if (Resp.getStatusCode() == 200) {
				System.out.println("Successfully updated registered EmailAdress");

			} else {
				System.out.println("Unsuccessfully updated registered EmailAdress");
			}
		}

	}

	@When("^I click the \"([^\"]*)\"$")
	public void i_click_the_Object(String arg1) throws Throwable {
		log.info("I click the " + arg1);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		try {
			ReUsablesKeyword.ClickonObject(ReUsablesKeyword.FindObject(arg1));
		} catch (Exception e) {
			Assert.fail(e.toString());
			log.error("Exception got occured at User click the object ::" + e.toString());
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ReUsablesKeyword.WaitforPageLoad();

	}

	@Then("^I should be navigated to the \"([^\"]*)\" Page$")
	public void i_should_be_navigated_to_the_Page(String arg1) throws Throwable {
		log.info("I should be navigated to the " + arg1 + " Page");
		try {
			WD.until(ExpectedConditions.titleContains(arg1));
		}

		catch (Exception e) {
			System.out.println(driver.getTitle());
			log.error("Page Title Validation got failed for Page Name::" + arg1 + " Actual ::" + driver.getTitle());
			Assert.fail("Page Title Validation got failed for Page Name::" + arg1 + " Actual ::" + driver.getTitle());

		}
	}
	
	@When("^I scroll the page down \"(\\d+)\" times$")
	public void i_scroll_the_page_down_value_times(int position)
			throws Throwable, UnhandledAlertException {
		log.info("I scroll the page down "+position+" times");
		int x=0;
		for (int i = 0; i < position; i++) {
			x=x+300;
			JS.executeScript("window.scrollTo(0, "+ x +");");
			Thread.sleep(1000);	
		}
	}

}
