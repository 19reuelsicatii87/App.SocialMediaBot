package webApp.Compass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;

public class COM26_TaskProjectViewTabroadmap extends WEBHelper{

		@FindBy(xpath="//a[@class='cke_button cke_button__save_article  cke_button_off']")
	WebElement SaveArticle_button;
	


	public COM26_TaskProjectViewTabroadmap() {
		PageFactory.initElements(driver, this);
		
	}
	
}
