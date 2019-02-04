package webApp.Seoreseller;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEO22_SettingsUsers extends WEBHelper{
	@FindBy(xpath="//h3[text()='Manage Users']")
	WebElement ManageUsers_header;
	
	@FindBy(xpath="//button[text()='Add New User']")
	WebElement AddNewUser_button;
	
	@FindBy(xpath="//h4[text()='Add New User']")
	WebElement AddNewUserModal_header;
	
	@FindBy(xpath="//input[@id='user_email']")
	WebElement Email_textfield;
	
	@FindBy(xpath="//input[@id='user_username']")
	WebElement Username_textfield;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password_textfield;
	
	@FindBy(xpath="//select[@id='user_role']")
	WebElement Role_dropdown;
	
	@FindBy(xpath="//input[@id='password']/preceding-sibling::i")
	WebElement PasswordToggle_icon;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement Save_button;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement Close_button;
	
	@FindBy(xpath="//div[@class='modal-header']/button")
	WebElement AddNewUserModalX_button;
	
	public SEO22_SettingsUsers() {
		PageFactory.initElements(driver, this);
	}
	
	
	@Then("^Ill be able to see the SEO22_ManageUsers Page")
	public void ill_see_manage_users_page() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(AddNewUser_button));
 		Assert.assertEquals(true, ManageUsers_header.isDisplayed());
	}
	
	
	@When("^I click the SEO22_AddNewUser button")
	public void i_click_add_new_user_button() throws Throwable, UnhandledAlertException {
		AddNewUser_button.click();
	}
	
	@Then("^Ill see the SEO22_AddNewUser Modal")
	public void i_see_add_new_user_modal() throws Throwable, UnhandledAlertException {
		WD.until(ExpectedConditions.elementToBeClickable(Save_button));
		Assert.assertEquals(true, AddNewUserModal_header.isDisplayed());

	}
	
	@Then("^Ill see the SEO22_EmailAddress textfield")
	public void i_see_email_address_textfield() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Email_textfield.isDisplayed());
		
	}
	
	@Then("^Ill see the SEO22_Username textfield")
	public void i_see_username_textfield() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Username_textfield.isDisplayed());
	}
	
	
	@Then("^Ill see the SEO22_Role dropdown")
	public void i_see_role_dropdown() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Role_dropdown.isDisplayed());
		
	}
	
	@Then("^Ill see the SEO22_Password textfield")
	public void i_see_password_textfield() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Password_textfield.isDisplayed());

	}
	
	@Then("^Ill see that the Password textfield contains a SEO22_Toggle icon")
	public void ill_see_password_textfield_with_toggle_icon() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, PasswordToggle_icon.isDisplayed());
	}
	
	@Then("^Ill see the SEO22_Save button")
	public void ill_see_save_button() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Save_button.isDisplayed());

	}
	
	@Then("^Ill see the SEO22_Close button")
	public void ill_see_close_button() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Close_button.isDisplayed());

	}
	
	@Then("^Ill see the SEO22_Xclose button of Add New User Modal")
	public void ill_see_x_button_of_add_new_user_modal() throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		if(driver.findElements(By.xpath("//div[@class='modal-header']/button")).size()!= 0){
			Assert.assertTrue(true);
		}else{
			Assert.fail();
		}

	}
	
	@When("^I populate SEO22_EmailAddress textfield with ([^\"]*)")
	public void i_populate_email_address_textfield_with_value(String email) throws Throwable, UnhandledAlertException {
		String[] emailParts = email.split("@");
		String finalString = emailParts[0]+"+"+dateNoMin+"@"+emailParts[1];
		Email_textfield.sendKeys(finalString);	
	}
	
	@When("^I populate SEO22_Username textfield with ([^\"]*)")
	public void i_populate_username_textfield_with_value(String username) throws Throwable, UnhandledAlertException {
		Username_textfield.sendKeys(username+dateNoSpace);
		
	}
	
	@When("^I select ([^\"]*) in SEO22_Role dropdown")
	public void i_select_role_value_under_role_dropwdown(String role) throws Throwable, UnhandledAlertException {
		SelectByVisibleText(Role_dropdown, role);
		
	}
	
	@When("^I populate SEO22_Password textfield with ([^\"]*)")
	public void i_populate_password_textfield_with_value(String password) throws Throwable, UnhandledAlertException {
		Password_textfield.sendKeys(password);
		
	}
	
	@When("^I click the SEO22_Save button")
	public void i_click_save_button() throws Throwable, UnhandledAlertException {
		Save_button.click();
		
	}

}
