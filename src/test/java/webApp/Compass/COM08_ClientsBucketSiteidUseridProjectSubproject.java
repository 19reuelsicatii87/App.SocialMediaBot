package webApp.Compass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class COM08_ClientsBucketSiteidUseridProjectSubproject extends Helper{
	
	@FindBy(xpath=".//button[@id='subproject-add-button']")
	WebElement AddAProject_Button;
	
	@FindBy(xpath=".//*[@id='subproject_name']")
	WebElement NameTheProject_textfield;
	
	@FindBy(xpath=".//select[@name='product_id']")
	WebElement SelectAProduct_dropdown;
	
	@FindBy(xpath="//button[text()='Save Project']")
	WebElement SaveProject_button;
	
	public static final WebElement Project_link(String keyword){
		WebElement project_link = driver.findElement(By.xpath("//table[@id='subprojects-table']//td[@class=' sorting_1']/a[contains(.,'"+keyword+"')]"));
		return project_link;
	}
	
	@FindBy(xpath="(//span[@class='input-group-addon btn btn-primary'])[2]")
	WebElement StartDateGlyphicon_button;

	@FindBy(xpath="//input[@name='start_date']")
	WebElement StartDate_textfield;
	
	@FindBy(xpath="(//span[@class='input-group-addon btn btn-primary'])[3]")
	WebElement EndDateGlyphicon_button;
	
	@FindBy(xpath="//input[@name='end_date']")
	WebElement EndDate_textfield;
	
	
	@FindBy(xpath="//table[@id='sp-tasks-table']//a[contains(.,'Update Campaign Roadmap')]")
	WebElement TaskName_link;
	
	public COM08_ClientsBucketSiteidUseridProjectSubproject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	


	@When("^I click COM08_AddAProject button$")
	public void i_click_AddAProject_button() throws Throwable {
		AddAProject_Button.click();
	}

	@When("^I populate COM08_NameTheProject textfield with \"([^\"]*)\"$")
	public void i_populate_NameTheProject_textfield_with(String arg1) throws Throwable {
		Thread.sleep(2000);
		NameTheProject_textfield.sendKeys(arg1);
	}
	
	
	@When("^I select ([^\"]*) with ([^\"]*) over COM08_SelectAProduct dropdown$")
	public void i_select_Product_over_COM08_SelectAProduct_dropdown(String category, String product) throws Throwable {
			String dateIdentifier;
			dateIdentifier = readTextfile("TAA248_Date.txt");
			
			Select S=new Select(SelectAProduct_dropdown);
			S.selectByVisibleText(category+"_"+dateIdentifier+" - "+product+"_"+dateIdentifier);
	}
	
	
	@When("^I click COM08_SaveProject button$")
	public void i_click_SaveProject_button() throws Throwable {
		SaveProject_button.click();
		Thread.sleep(5000);		

	}
	
	
	@Then("^I see the product associated with the project$")
	public void i_see_the_product_associated_with_the_project() throws Throwable {
		//Temporary code block until COM-178 & COM-179 is delivered
		Thread.sleep(5000);		
		
	}
	
	@Then("^Ill see the Subprojects Page$")
	public void ill_see_subprojects_page() throws Throwable {
		Thread.sleep(5000);		
		Assert.assertEquals(true, AddAProject_Button.isDisplayed());
	}
	
	@When("^I populate COM08_NameTheProject textfield with value ([^\"]*)$")
	public void i_populate_NameTheProject_textfield_with_value(String projectName) throws Throwable {
		String currentDate = GetCurrentDateWithTime();
		NameTheProject_textfield.sendKeys(projectName+" "+currentDate);
	}
	
	@When("^I select today as Start Date$")
	public void i_select_current_as_start_date() throws Throwable {
		String currentDate = GetCurrentDateWithoutTime();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('start_date')[0].setAttribute('value', '"+currentDate+"')");
	}
	
	
	@When("^I select \"([^\"]*)\" days after today as an Estimated End Date$")
	public void i_select_5_days_after_as_end_date(String number) throws Throwable {
		String targetDate = DateAddition(Integer.parseInt(number));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('end_date')[1].setAttribute('value', '"+targetDate+"')");
		Thread.sleep(10000);		

	}
	
	@Then("^Ill see the COM08_([^\"]*) in the subprojects page$")
	public void ill_see_task_value(String taskName) throws Throwable {
		Thread.sleep(5000);		
		Assert.assertEquals(true, TaskName_link.isDisplayed());
	}
}
