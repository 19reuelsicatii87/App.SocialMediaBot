package webApp.Seoreseller;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.Framework.WEBHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.Utilities.JsonDataGettersSetters;
import test.Utilities.JsonUtil;

public class SEO15_Leadgenerator extends WEBHelper{
	
	@FindBy(xpath="//input[@id='location']")
	WebElement Location_textfield;
	
	@FindBy(xpath="//input[@id='keyword']")
	WebElement Keyword_textfield;
	
	@FindBy(xpath="//button[@id='generate-lead']")
	WebElement GenerateLeads_button;
	
	@FindBy(xpath="//button[text()=' Processing...']")
	WebElement Processing_button;
	
	@FindBy(xpath="//span[@id='totalLeads']")
	WebElement TotalLeads_text;
	
	@FindBy(xpath="//h6[text()='Leads table is currently busy.']")
	WebElement LeadsTableCurrentlyBusy_text;
	
	@FindBy(xpath="//select[@name='lead-generator-table_length']")
	WebElement LeadGenRecordsPerPage_dropdown;
	
	@FindBy(xpath="//table[@id='lead-generator-table']//tbody//tr")
	WebElement LeadGenResult_table;
	
	@FindBy(xpath="//div[@data-id='leadGenGenerated'][contains(.,'We have finished the lead generation. Click ')]")
	WebElement SuccessfulLeadGen_text;
	
	public static final WebElement SpecificViewLeads_button(String keyword){
		WebElement specificViewLeads_button = driver.findElement(By.xpath("(//h5[contains(.,'"+keyword+"')]/ancestor::tr//button[@data-content='View Leads'])[1]"));
		return specificViewLeads_button;
	}
	
	public static final WebElement CompanyByIndex_text(int index){
		WebElement companyByIndex_text = driver.findElement(By.xpath("(//div[@class='company'])["+index+"]"));
		return companyByIndex_text;
	}
	
	public static final WebElement KeywordAutoComplete_text(String keyword){
		WebElement keywordAutoComplete_text = driver.findElement(By.xpath("//div[@data-keyword='"+keyword+"']"));
		return keywordAutoComplete_text;
	}
	
	@FindBy(xpath="//div[@id='lead-generator-table_processing']")
	WebElement LeadGenLoader_icon;
	
	public SEO15_Leadgenerator() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@When("I populate SEO15_Location textfield with US location coming from the test data file$")
   	public void i_populate_SEO15_Location_data_from_json() throws Throwable, UnhandledAlertException {
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		 Date currentDate = new Date();
		 SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
	     String currentDay = simpleDateformat.format(currentDate);
	     Calendar cal = Calendar.getInstance();
	     String pmOrAm;
	     cal.setTime(currentDate);
	     if (cal.get(Calendar.AM_PM) == 1) {
	    	 pmOrAm = "PM";
	     }else{
	    	 pmOrAm = "AM";
	     }
	     
	     
	 	String jsonFilePath = System.getProperty("user.dir") + "\\Data\\LeadGeneratorData.json";
		String jsonContent = "";
		jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
		JsonDataGettersSetters jsonFile = JsonUtil.fromJson(jsonContent, JsonDataGettersSetters.class);
		String location = "";
		
		if(currentDay.equals("Monday")){
			location = jsonFile.getMonday().get(pmOrAm);
			
		}else if(currentDay.equals("Tuesday")){
			location =jsonFile.getTuesday().get(pmOrAm);
			
		}else if(currentDay.equals("Wednesday")){
			location =jsonFile.getWednesday().get(pmOrAm);
			
		}else if(currentDay.equals("Thursday")){
			location =jsonFile.getThursday().get(pmOrAm);
			
		}else if(currentDay.equals("Friday")){
			location =jsonFile.getFriday().get(pmOrAm);
			
		}else if(currentDay.equals("Saturday")){
			location =jsonFile.getSaturday().get(pmOrAm);
			
		}else if(currentDay.equals("Sunday")){
			location =jsonFile.getSunday().get(pmOrAm);
			
		}
		
		Thread.sleep(3000);
		Location_textfield.sendKeys(location);
   	}
	
	@When("^I populate SEO15_Keyword textfield with ([^\"]*)$")
	public void i_populate_SEO15_Keyword_textfield(String keyword) throws Throwable, UnhandledAlertException {
		Keyword_textfield.click();
		Thread.sleep(3000);
		Keyword_textfield.sendKeys(keyword);
		Thread.sleep(5000);
		KeywordAutoComplete_text(keyword).click();
		Thread.sleep(3000);
	}
	
	
	@When("^I click the the SEO15_GenerateLeads button$")
	public void i_click_SEO15_GenerateLeads_button() throws Throwable, UnhandledAlertException {
		GenerateLeads_button.click();
	}
	
	@Then("^Ill see the SE014_Processing button$")
	public void ill_see_SE014_Processing_button() throws Throwable, UnhandledAlertException {
		Assert.assertEquals(true, Processing_button.isDisplayed());
		Thread.sleep(3000);
	}
	
	@When("^I click the SE014_ViewLeads button of ([^\"]*) in location from the test data file$")
	public void i_click_SE014_ViewLeads_button(String keyword) throws Throwable, UnhandledAlertException {
		for (int i = 0 ; i <10 ; i++){
			if(SuccessfulLeadGen_text.isDisplayed()){
				System.out.println("Generation of Lead Gen is Completed");
				Thread.sleep(5000);
				String output = keyword.substring(0, 1).toUpperCase() + keyword.substring(1);
				SpecificViewLeads_button(output).click();
				break;
				
			}else{
				System.out.println("Lead Gen is In Progress");
				Thread.sleep(3000);
			}
		}
	}
	
	@Then("^Ill see the SE014_LeadGen table$")
	public void ill_see_SE014_LeadGen_table() throws Throwable, UnhandledAlertException {
		 for (int i = 0 ; i <10 ; i++){
				if(LeadGenLoader_icon.getAttribute("style").contains("visibility: hidden;")){
					System.out.println("Lead Gen Loader is Completed");
					Assert.assertEquals(true, LeadGenResult_table.isDisplayed());
					break;
				}else{
					System.out.println("Lead Gen Loader is Ongoing");
					Thread.sleep(10000);
				}
			}
	}
	
	@Then("^Ill see that SEO15_TotalLeadsFound is equal to the row count returned$")
	public void ill_see_SEO15_TotalLeadsFound_is_correct() throws Throwable, UnhandledAlertException {
		Select s = new Select(LeadGenRecordsPerPage_dropdown);
		s.selectByVisibleText("100");
		Thread.sleep(5000);
		int tableTotalCount = driver.findElements(By.xpath("//table[@id='lead-generator-table']//tbody//tr")).size();
		String tableTotalCountString = String.valueOf(tableTotalCount);
	    Assert.assertEquals(tableTotalCountString, TotalLeads_text.getText());
	}
	
	
	@Then("^Ill see that the Company Name is available per row$")
	public void ill_see_CompanyName_value_per_row() throws Throwable, UnhandledAlertException {
		int tableTotalCount = driver.findElements(By.xpath("//table[@id='lead-generator-table']//tbody//tr")).size();
		
		for (int i =1; i<= tableTotalCount; i++){
			System.out.println("Companny Name[" +i+ "]" + CompanyByIndex_text(i).getAttribute("title"));
		    Assert.assertEquals(false, CompanyByIndex_text(i).getText().isEmpty());
			
		}
	}
}
