package webApp.Compass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;

public class COM22_ClientsBucketSiteidUseridProjectKeUrlmap extends WEBHelper{
	
	@FindBy(xpath="//button[@id='save-target-keywords-btn']")
	WebElement SaveTargetKeywowords_button;
	
	@FindBy(xpath="//div[@id='target_keywords_wrap']//div[@class='content ui-droppable']")
	WebElement TargetKeywordsDroppable_div;
	
	@FindBy(xpath="//div[@id='available_keywords_wrap']//div[@class='content ui-droppable']")
	WebElement AvailableKeywordsDroppable_div;
	
	public static final WebElement AvailableKeywordsItem_text(String keyword){
		WebElement availableKeywordsItem_text = driver.findElement(By.xpath("//div[@id='available_keywords_wrap']//div[@data-keyword-text='"+keyword+"']"));
		return availableKeywordsItem_text;
	}
	
	public COM22_ClientsBucketSiteidUseridProjectKeUrlmap() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}