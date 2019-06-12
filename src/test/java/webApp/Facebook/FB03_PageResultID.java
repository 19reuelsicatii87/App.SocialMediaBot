package webApp.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.When;

public class FB03_PageResultID extends WEBHelper {

	@FindBy(xpath = ".//form[@action='/search/top/']//input[@type='text']")
	WebElement Search_txtfield;

	@FindBy(xpath = ".//form[@action='/search/top/']/button")
	WebElement Search_button;
	
	@FindBy(xpath = "//input[@id='audience_group']")
	WebElement GroupName_txtfield;
	
	@FindBy(xpath = "(//div[@data-testid='react_share_dialog_content']//button[text()='Post'])[1]")
	WebElement GroupPost_button;

	public static final WebElement SharePost_button(String position) {
		WebElement SharePost_button = driver
				.findElement(By.xpath("//div[@data-insertion-position='" + position + "']//a[text()='Share']"));
		return SharePost_button;
	}

	public static final WebElement SharePost_dropdown(String Sharetext) {
		WebElement SharePost_dropdown = driver.findElement(
				By.xpath("//div[@class='uiContextualLayerPositioner uiLayer']//span[text()='" + Sharetext + "']"));
		return SharePost_dropdown;
	}

	public FB03_PageResultID() {
		PageFactory.initElements(driver, this);
	}

	@When("^I click FB03_SharePost button whose position is ([^\"]*)$")
	public void i_click_FB03_SharePost_button_whose_position_is_variable(String position)
			throws Throwable, UnhandledAlertException {
		log.info("I click FB03_SharePost button whose position is " + position);
		int x=0;
		for (int i = 0; i < 20; i++) {
			x=x+400;
			try {
				SharePost_button(position).click();
				break;
			} catch (NoSuchElementException e) {
				System.out.println("X-Value: " + x);
				JS.executeScript("window.scrollTo(0, "+ x +");");
				Thread.sleep(1000);
			}			
		}
	}

	@When("^I click FB03_SharePost button whose position is \"([^\"]*)\"$")
	public void i_click_FB03_SharePost_button_whose_position_is_value(String position)
			throws Throwable, UnhandledAlertException {
		log.info("I click FB03_SharePost button whose position is " + position);
		int x=0;
		for (int i = 0; i < 20; i++) {
			x=x+400;
			try {
				SharePost_button(position).click();
				break;
			} catch (NoSuchElementException e) {
				System.out.println("X-Value: " + x);
				JS.executeScript("window.scrollTo(0, "+ x +");");
				Thread.sleep(1000);
			}			
		}
	}
	
	@When("^I click FB03_SharePost dropdown whose text is ([^\"]*)$")
	public void i_click_FB03_SharePost_dropdown_whose_text_is_varriable(String Sharetext)
			throws Throwable, UnhandledAlertException {
		log.info("I click FB03_SharePost dropdown whose text is " + Sharetext);
		SharePost_dropdown(Sharetext).click();
	}
	
	@When("^I click FB03_SharePost dropdown whose text is \"([^\"]*)\"$")
	public void i_click_FB03_SharePost_dropdown_whose_text_is_value(String Sharetext)
			throws Throwable, UnhandledAlertException {
		log.info("I click FB03_SharePost dropdown whose text is " + Sharetext);
		SharePost_dropdown(Sharetext).click();
	}
	
	@When("^I populate FB03_GroupName textfield with ([^\"]*)$")
	public void i_populate_FB03_GroupName_textfield_with_value(String GroupName)
			throws Throwable, UnhandledAlertException {
		log.info("I populate FB03_GroupName textfield with " + GroupName);
		GroupName_txtfield.sendKeys(GroupName);
		Thread.sleep(1000);
		GroupName_txtfield.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		GroupName_txtfield.sendKeys(Keys.ENTER);
		
	}
	
	@When("^I click FB03_GroupPost button$")
	public void i_click_FB03_GroupPost_button()
			throws Throwable, UnhandledAlertException {
		log.info("I click FB03_GroupPost button");
		GroupPost_button.click();
	}

}
