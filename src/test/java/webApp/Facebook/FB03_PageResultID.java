package webApp.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class FB03_PageResultID extends WEBHelper {

	@FindBy(xpath = ".//form[@action='/search/top/']//input[@type='text']")
	WebElement Search_txtfield;

	@FindBy(xpath = ".//form[@action='/search/top/']/button")
	WebElement Search_button;

	public static final WebElement SharePost_button(String position) {
		WebElement SharePost_button = driver
				.findElement(By.xpath("//div[@data-insertion-position='"+position+"']//a[text()='Share']"));
		return SharePost_button;
	}
	
	public static final WebElement SharePost_dropdown(String Sharetext) {
		WebElement SharePost_dropdown = driver
				.findElement(By.xpath("//div[@class='uiContextualLayerPositioner uiLayer']//span[text()='"+Sharetext+"']"));
		return SharePost_dropdown;
	}



	public FB03_PageResultID() {
		PageFactory.initElements(driver, this);
	}

	@When("^I click FB03_SharePost button whose position is ([^\"]*)$")
	public void i_click_FB03_SharePost_button_whose_position_is_variable(String position) throws Throwable,UnhandledAlertException	{
		log.info("I click FB03_SharePost button whose position is "+ position);
				SharePost_button(position).click();
	}
	
	@When("^I click FB03_SharePost button whose position is \"([^\"]*)\"$")
	public void i_click_FB03_SharePost_button_whose_position_is_value(String position) throws Throwable,UnhandledAlertException	{
		log.info("I click FB03_SharePost button whose position is "+ position);
				SharePost_button(position).click();
	}

	@When("^I click FB03_SharePost dropdown whose text is ([^\"]*)$")
	public void i_click_FB03_SharePost_dropdown_whose_text_is_varriable(String Sharetext) throws Throwable, UnhandledAlertException {
		log.info("I click FB03_SharePost dropdown whose text is" + Sharetext);
		SharePost_dropdown(Sharetext).click();
	}

}
