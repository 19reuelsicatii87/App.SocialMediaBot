package webApp.zOther;



import cucumber.Framework.Helper;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.google.gson.JsonArray;
import com.jayway.jsonpath.JsonPath;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;;



public class Dummy extends Helper{
	
	public static WebDriver driver=null;
	
	@FindBy(xpath=".//div[@id='tasks-table_length']//select[@class='form-control']")
	WebElement TaskList_DropDown;
	
	@Test
	public void Main() throws FileNotFoundException
	 {
		File file = new File(System.getProperty("user.dir") + "\\target\\rerun.txt");
		Scanner scanner = new Scanner(file);
		if (file.length() == 0) {			
			System.out.println("File contains NOTHING");
		}
		
		else{
		System.out.println("File Contains: ");
		}
		
		scanner.close();
		
	 }
	


		

		
		


	

}
