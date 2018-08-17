package test.Runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.jetty.html.Break;

import cucumber.Framework.WEBHelper;
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
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/CompassReport.html","rerun:target/rerun.txt"},
        tags = {"@COMSMOKETEST_TS01, @COMSMOKETEST_TS04"}
   

)


public class R1_CompassSmokeTest extends WEBHelper{
	
	@BeforeClass
	public static void BeforeClass() throws Exception
	{

		log.info("Execution is started from First Runner Test - BeforeClass Annotation");
		

	}	
		
 	
	@AfterClass
	public static void AfterClass() throws IOException, Throwable
	{	
	
		Mail.SendReport("CompassReport.html", "CompassDEVURL", "[SMOKE TEST]: COMPASS - ");
		log.info("Execution is ended from Second Runner - Test AfterClass Annotation");
		
	}
	
}


