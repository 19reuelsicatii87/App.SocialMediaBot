package webApp.Compass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;

public class COM21_ClientsBucketSiteidUseridProjectKeywords extends WEBHelper{
	
	@FindBy(xpath="//input[@id='keyword_search']")
	WebElement Search_textfield;
	
	@FindBy(xpath="//span[text()='Search']")
	WebElement Search_button;
	
	@FindBy(xpath="//button[text()='Add']")
	WebElement Add_button;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement Remove_button;
	
	@FindBy(xpath="//textarea[@id='keywords']")
	WebElement Keywords_textarea;
	
	@FindBy(xpath="//select[@name='search_engine_id[]']")
	WebElement SearchEngines_selection;
	
	@FindBy(xpath="//select[@id='cmbKeywordDefaultTagging']")
	WebElement DefaultTagging_dropdown;
	
	@FindBy(xpath="//select[@id='cmbKeywordDefaultTagging']")
	WebElement GeoTarget_dropdown;
	
	@FindBy(xpath="//form[@id='form-add-keywords']//button[@type='submit']")
	WebElement AddKeywordsSave_button;
	
	@FindBy(xpath="//form[@id='form-add-keywords']//button[text()='Cancel']")
	WebElement AddKeywordsCancel_button;
	
	@FindBy(xpath="//div[@class='text-center']/i")
	WebElement Bookmark_icon;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement ModalOK_button;
	
	@FindBy(xpath="//p[text()='Keywords were added to the campaign.']")
	WebElement ModalMessage_text;
	
	public COM21_ClientsBucketSiteidUseridProjectKeywords() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}