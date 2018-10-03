package webApp.Compass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;

public class COM25_TaskProjectViewTabarticle extends WEBHelper{

	@FindBy(xpath="//input[@placeholder='Title...']")
	WebElement Title_textfield;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	WebElement Body_textarea;
	
	@FindBy(xpath="//a[@class='cke_button cke_button__save_article  cke_button_off']")
	WebElement SaveArticle_button;
	
	@FindBy(xpath="//input[@name='meta[title]']")
	WebElement SEOtitle_textfield;
	
	@FindBy(xpath="//textarea[@name='meta[description]']")
	WebElement MetaDescription_textarea;
	
	@FindBy(xpath="//input[@name='article[tags]']")
	WebElement Tags_textfield;

	public COM25_TaskProjectViewTabarticle() {
		PageFactory.initElements(driver, this);
		
	}
	
}
