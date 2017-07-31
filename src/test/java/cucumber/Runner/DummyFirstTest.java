package cucumber.Runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.jetty.html.Break;

import cucumber.Framework.Helper;
import cucumber.Framework.SetUp;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.Utilities.Mail;
import com.cucumber.listener.*;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		format = { "pretty", "html:target/cucumber","json:target/JSON/Output.json" },
		features = {"."},
		glue = {"cucumber.Framework","webApp.Compass", "webApp.Seoreseller", "webApp.PayPerContent"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/CucumberReport.html","rerun:target/rerun.txt"},
        tags = {"@COMSMOKETEST_TS02"}
   

)


public class DummyTest extends Helper{
	
	@BeforeClass
	public static void BeforeClass() throws Exception
	{

		log.info("Execution is started from First Runner Test - BeforeClass Annotation");

	}	
		
 	
	@AfterClass
	public static void AfterClass() throws IOException, Throwable
	{	
		/*File file = new File(System.getProperty("user.dir") + "\\target\\rerun.txt");
		if(SetUp.getScenarioName().substring(0, 12).contentEquals("COMSMOKETEST") && file.length() == 0){
			
			Mail.SendMultipleReports("CompassDEVURL", "[SMOKE TEST]: COMPASS - ");
		
		}*/
		
		Helper.log.info("Execution is Ended from First Runner Test");
		
	}
	
}


