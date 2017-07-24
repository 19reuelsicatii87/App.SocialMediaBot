package webApp.WilliamHill;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.Framework.Helper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.relevantcodes.extentreports.LogStatus;

public class WL_horseracing extends Helper{
	
	@FindBy(xpath=".//div[@class='TrendingBets_betContainer_6vQ']//button[1]")
	 WebElement HR_Selection;
	@FindBy(xpath=".//div[@class='QuickBet_root_1Zh']")
	WebElement QuickBet_PopUp;	
	@FindBy(xpath=".//input[@class='CurrencyBox_currencyBox_b0O CurrencyBox_withoutSymbol_87M QuickBetOptions_textInput_3JR']")
	WebElement Stake_txtfield;
	@FindBy(xpath=".//span[@class='QuickBetOptions_payoutNumber_2Xz']")
	WebElement PossiblePayout_Label;
	

	
	
	public WL_horseracing() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@When("^User add selection from Trending Multi Builder$")
	public void user_add_selection_from_Trending_Multi_Builder() throws Throwable {
		HR_Selection.click();
		
		logger.log(LogStatus.PASS, "Test Step(before IF) - User add selection from Trending Multi Builder");
		
		
		if (logger.getRunStatus() == LogStatus.PASS)
		{
			logger.log(LogStatus.PASS, "Test Step - User add selection from Trending Multi Builder");
		}
		
		
	

	}

	@Then("^User sees QuickBet pop-window$")
	public void user_sees_QuickBet_pop_window() throws Throwable {
	    Assert.assertEquals(true, QuickBet_PopUp.isDisplayed());

	}

	@When("^User populate stake ([^\"]*)$")
	public void user_populate_stake(String Amount) throws Throwable {
		Stake_txtfield.sendKeys(Amount);

	}

	@Then("^User sees possible payout change to non-zero$")
	public void user_sees_possible_payout_change_to_non_zero() throws Throwable {
		Assert.assertFalse("Possible Payout is change to non-zero", (PossiblePayout_Label.getText().contains("0.00")));
			

	}
	
	


}
