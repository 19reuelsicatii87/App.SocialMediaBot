package test.Runner;


import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Utilities.Mail;

import cucumber.Framework.Helper;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		format = { "pretty", "html:target/cucumber","json:target/JSON/OutputRerun.json" },
        features = {"@target/SrsRerun.txt"},
        glue = {"cucumber.Framework","webApp.Compass", "webApp.Seoreseller", "webApp.PayPerContent", "webApp.Mailbox"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/SRSDashboardReportReRun.html","rerun:target/SrsRerun2.txt"}
   

)


public class R2_SrsSmokeTest extends Helper{
	@BeforeClass
	public static void SecondBeforeClass() throws Exception 
	{
		log.info("Execution is started from First Runner Test - BeforeClass Annotation");
		  
	}
	
	
 	
	@AfterClass
	public static void SecondAfterClass() throws Exception
	{		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("target/rerun.txt"));
		if (br.readLine() == null){
		    System.out.println("File is EMPTY");

		}else{
		    System.out.println("File is not EMPTY");
			Mail.SendReport("SRSDashboardReport.html", "SeoresellerSTGURL_Login", "[SMOKE TEST]: SRS - ");
			log.info("Execution is ended from Second Runner - Test AfterClass Annotation");
		}		
	}
	
}


