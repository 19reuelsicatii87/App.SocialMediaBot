package webApp.Compass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.WEBHelper;

public class COM24_TaskProjectView extends WEBHelper{

	@FindBy(xpath="//button[text()='Click to Start']")
	WebElement ClickToStart_button;

	@FindBy(xpath="//button[@id='ab-onhold']")
	WebElement PutOnHold_button;
	
	@FindBy(xpath="//button[text()='Click to Resume']")
	WebElement ClickToResume_button;
	
	@FindBy(xpath="//button[text()='Click to Complete']")
	WebElement ClickToComplete_button;
	
	public static final WebElement TaskTab_link(String taskTab){
		WebElement taskTab_link = driver.findElement(By.xpath("//div[@id='tasktabs']//a[text()='"+taskTab+"']"));
		return taskTab_link;
	}
	
	@FindBy(xpath="//span[contains(@class,'legend-status')]")
	WebElement TaskStatus_text;
	
	public COM24_TaskProjectView() {
		PageFactory.initElements(driver, this);
		
	}
	
}
