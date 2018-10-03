package webApp.Compass;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.Helper;
import cucumber.api.java.en.When;

public class COM14_CommonSteps extends Helper{
	
	@FindBy(xpath="//a[@class='dropdown-toggle'][text()='Tasks ']")
	WebElement TasksMenu_link;
		
	@FindBy(xpath="//a[text()='Monitoring']")
	WebElement Monitoring_link;
	
	@FindBy(xpath="//a[text()='User Monitoring']")
	WebElement UserMonitoring_link;
	
	@FindBy(xpath="//input[@id='global_search']")
	WebElement GlobalSearch_textfield;
	
	public static final WebElement ReturnClientSelect_link(String keyword){
		WebElement returnClientSelect_link = driver.findElement(By.xpath("//div[@class='clients-results-wrapper']/a[contains(.,'"+keyword+"')]"));
		return returnClientSelect_link;
	}
	
	public static final WebElement ReturnProjectSelect_link(String keyword){
		WebElement returnClientSelect_link = driver.findElement(By.xpath("//div[@class='clients-results-wrapper']//a[contains(.,'"+keyword+"')]"));
		return returnClientSelect_link;
	}
	
	@FindBy(xpath="//a[text()='Overview']")
	WebElement OverviewTab_button;
	
	@FindBy(xpath="//a[text()='Project Management ']")
	WebElement ProjManagementTab_link;
	
	@FindBy(xpath="//a[@id='subprojects_button']")
	WebElement Projects_link;
	
	@FindBy(xpath="//ul[@class='dropdown-menu']//a[text()='Deploy']")
	WebElement DeployMenu_link;
	
	@FindBy(xpath="//a[@class='dropdown-toggle'][text()='Tools ']")
	WebElement ToolsMenu_link;
	
	@FindBy(xpath="//a[text()='Store Management']")
	WebElement StoreManagement_link;
	
	@FindBy(xpath="//a[text()='Templates']")
	WebElement Templates_link;
	
	@FindBy(xpath="//a[text()='Task Templates']")
	WebElement TaskTemplates_link;
	
	@FindBy(xpath="//a[text()='Product Templates']")
	WebElement ProductTemplates_link;
	
	public COM14_CommonSteps() {
		PageFactory.initElements(driver, this);
		
	}
	
	@When("^I search ([^\"]*) in the COM14_GlobalSearch textfield$")
	public void i_search_value_in_globalsearch(String keyword) throws Throwable, UnhandledAlertException {
		GlobalSearch_textfield.sendKeys(keyword);
	}
	
	@When("^I select ([^\"]*) in the Clients section$")
	public void i_select_value_in_client_section(String keyword) throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		ReturnClientSelect_link(keyword).click();
	}

	@When("^I click COM14_OverviewTab$")
	public void i_click_overview_tab() throws Throwable, UnhandledAlertException {
		OverviewTab_button.click();
		Thread.sleep(5000);
	}
	
	@When("^I hover to COM14_ProjectManagement link$")
	public void i_hover_to_proj_management_tab() throws Throwable, UnhandledAlertException {
		MouseHover(ProjManagementTab_link);
		Thread.sleep(5000);
	}
	
	@When("^I click COM14_Projects link$")
	public void i_click_projects_link() throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		Projects_link.click();
	}
	
	
	@When("^I hover to COM14_TasksMenu link$")
	public void i_hover_to_tasks_menu_link() throws Throwable, UnhandledAlertException {
		MouseHover(TasksMenu_link);
		Thread.sleep(5000);
	}
	
	@When("^I click COM14_DeployMenu link$")
	public void i_click_deploy_menu_link() throws Throwable, UnhandledAlertException {
		DeployMenu_link.click();
	}
	
	@When("^I hover to COM14_Tools link$")
	public void i_hover_to_tools_tab() throws Throwable, UnhandledAlertException {
		MouseHover(ToolsMenu_link);
		Thread.sleep(5000);
	}
	
	@When("^I click COM14_StoreManagement link$")
	public void i_click_storemanagement_link() throws Throwable, UnhandledAlertException {
		Thread.sleep(3000);
		StoreManagement_link.click();
	}
	
	
	@When("^I hover to COM14_Templates link$")
	public void i_hover_to_templates_link_tab() throws Throwable, UnhandledAlertException {
		MouseHover(Templates_link);
		Thread.sleep(5000);
	}
	
	
	@When("^I select COM14_TaskTemplates link$")
	public void i_click_task_templates_link_tab() throws Throwable, UnhandledAlertException {
		TaskTemplates_link.click();
	}
	
	
	@When("^I select COM14_ProductTemplates link$")
	public void i_click_product_templates_link_tab() throws Throwable, UnhandledAlertException {
		ProductTemplates_link.click();
	}
}
