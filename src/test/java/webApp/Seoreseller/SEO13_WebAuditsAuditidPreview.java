package webApp.Seoreseller;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Then;

public class SEO13_WebAuditsAuditidPreview extends Helper{
	
	@FindBy(xpath="//h2[text()='Technical Audit']")
	WebElement TechnicalAudit_header;
	
	public static final WebElement CompetitorBar_text(String url){
		WebElement competitorBar_text = driver.findElement(By.xpath("//div[@id='executive-summary-page']//div[@class='competitors-body']//div[text()='"+url+"']"));
		return competitorBar_text;
	}

	public SEO13_WebAuditsAuditidPreview() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^Ill see the SEO13_Audit report$")
	public void ill_see_audit_report(){
			Assert.assertEquals(true, TechnicalAudit_header.isDisplayed());
	}
	
	@Then("^Ill see Competitor ([^\"]*)$")
	public void ill_see_audit_report(String url){
			if(url.equals("blank")){
				
			}else{
				Assert.assertEquals(true, CompetitorBar_text(url).isDisplayed());
			}
	}
}
