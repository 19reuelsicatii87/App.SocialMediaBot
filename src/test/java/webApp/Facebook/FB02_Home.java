package webApp.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class FB02_Home extends WEBHelper {

	@FindBy(xpath = ".//form[@action='/search/top/']//input[@type='text']")
	WebElement Search_txtfield;

	@FindBy(xpath = ".//form[@action='/search/top/']/button")
	WebElement Search_button;

	public static final WebElement SecondaryHeader_link(String secHeader) {
		WebElement SecondaryHeader_link = driver
				.findElement(By.xpath("//div[@id='u_fetchstream_3_0']//div[contains(text(),'" + secHeader + "')][1]"));
		return SecondaryHeader_link;
	}

	public static final WebElement PageResult_link(String page) {
		WebElement PageResult_link = driver.findElement(By.xpath("//span[contains(text(),'" + page + "')]"));
		return PageResult_link;
	}

	public FB02_Home() {
		PageFactory.initElements(driver, this);
	}

	@When("^I populate FB02_Search textfield with ([^\"]*)$")
	public void i_populate_Username_with_value(String keyword) throws Throwable, UnhandledAlertException {
		log.info("I populate FB02_Search textfield with " + keyword);
		Search_txtfield.sendKeys(keyword);
	}

	@When("^I populate FB02_Username textfield with \"([^\"]*)\"$")
	public void i_populate_Username_with_variable(String keyword) throws Throwable, UnhandledAlertException {
		log.info("I populate FB02_Search textfield with " + keyword);
		Search_txtfield.sendKeys(keyword);
	}

	@When("^I click FB02_Secondary header whose text is ([^\"]*)$")
	public void I_click_FB02_Secondary_header_whose_text_is_variable(String secHeader)
			throws Throwable, UnhandledAlertException {
		log.info("I click FB02_Secondary header whose text is " + secHeader);
		SecondaryHeader_link(secHeader).click();
	}

	@When("^I click FB02_Page Result whose text is ([^\"]*)$")
	public void I_click_FB02_Page_Result_whose_text_is_variable(String page) throws Throwable, UnhandledAlertException {
		log.info("I click FB02_Page Result whose text is " + page);
		PageResult_link(page).click();
	}

	@When("^I click FB02_Search button$")
	public void i_click_Search_button() throws Throwable, UnhandledAlertException {
		log.info("I click FB02_Search button");
		Search_button.click();
	}

}
