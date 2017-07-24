package cucumber.Runner;





import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.Framework.Helper;
import cucumber.Framework.SetUp;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.Utilities.*;

@RunWith(Cucumber.class)

@CucumberOptions(
		format = { "pretty", "html:target/cucumber","json:target/JSON/OutputRerun.json" },
        features = {"@target/rerun.txt"},
        glue = {"cucumber.Framework","webApp.Compass", "webApp.Seoreseller", "webApp.PayPerContent"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/CucumberReport_ReRun.html","rerun:target/rerun1.txt"}
   

)


public class CompassSmokeSecondTest extends Helper{
	
	@BeforeClass
	public static void SecondBeforeClass() throws Exception 
	{
	
		if(GetPropertValue("Data/TestProperties.xml","BrowserType").equalsIgnoreCase("MOBIWEB"))
		{
			ReUsablesKeyword.Prerequisite_Mobile();
			
		}
		
		
		File file = new File("target/rerun.txt");
		while (!file.exists()) 
		{
			Thread.sleep(1000);
		}
		
		while(!file .canWrite())
		{
			Thread.sleep(1000);
		}
		
		  Thread.sleep(10000); 
		  log.info("Execution is started from Second Runner Test - BeforeClass Annotation");
		  
	}
	
	
	
 	
	@AfterClass
	public static void SecondAfterClass() throws Exception
	{
		
		/*if(SetUp.getScenarioName().substring(0, 12).contentEquals("COMSMOKETEST"))
		{
			
		Mail.SendMultipleReports("CompassDEVURL", "[SMOKE TEST]: COMPASS - ");
		}*/
		
		Mail.SendMultipleReports("CompassDEVURL", "[SMOKE TEST]: COMPASS - ");
		
		Helper.log.info("Execution is ended from Second Runner - Test AfterClass Annotation");
		
	}
	
}


