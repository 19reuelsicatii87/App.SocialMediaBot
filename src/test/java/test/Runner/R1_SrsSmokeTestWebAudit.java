package test.Runner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.Framework.WEBHelper;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import test.Utilities.Mail;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		format = { "pretty", "html:target/cucumber","json:target/JSON/WebAuditOutput.json" },
		features = {"."},
		glue = {"cucumber.Framework","webApp.Compass", "webApp.Seoreseller", "webApp.PayPerContent", "webApp.Mailbox"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/SRSDashboardWebAuditReport.html","rerun:target/SrsWebAuditRerun.txt"},
        tags = {"@WebAudit"}
   
)


public class R1_SrsSmokeTestWebAudit extends WEBHelper{
	
	
	@BeforeClass
	public static void BeforeClass() throws Exception
	{
		log.info("Execution is started from First Runner Test - BeforeClass Annotation");
	}	
 	
	@AfterClass
	public static void AfterClass() throws IOException, Throwable
	{	
		
		String htmlFilePath = System.getProperty("user.dir") + "\\target\\SRSDashboardWebAuditReport.html";
		String htmlFileContent = new String(Files.readAllBytes(Paths.get(htmlFilePath)));
		String testStatus;
		if(htmlFileContent.contains("'status fail'")){
			testStatus = "FAILED";
		}else{
			testStatus = "PASSED";
		}
	
		Mail.SendReport("SRSDashboardWebAuditReport.html", GetApplication() + GetTestEnv(), "[SMOKE TEST]: " + GetApplication() + GetTestEnv() + " (WebAuditv3:"+testStatus+") - ");
		log.info("Execution is ended from Second Runner - Test AfterClass Annotation");
	}
}


