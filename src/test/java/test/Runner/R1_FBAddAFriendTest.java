package test.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.Framework.WEBHelper;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import test.Utilities.Mail;

@RunWith(Cucumber.class)
@CucumberOptions(

		format = { "pretty", "html:target/cucumber", "json:target/JSON/R1_SharePostTestReport.json" }, features = {
				"." }, glue = { "cucumber.Framework", "webApp.Facebook" }, plugin = {
						"com.cucumber.listener.ExtentCucumberFormatter:target/R1_SharePostTestReport.html",
						"rerun:target/rerun.txt" }, tags = { "@AddAFriend"}

)

public class R1_FBAddAFriendTest extends WEBHelper {

	@BeforeClass
	public static void BeforeClass() throws Exception {
		log.info("Execution is started from First Runner Test - BeforeClass Annotation");
	}

	@AfterClass
	public static void AfterClass() throws IOException, Throwable {
		Mail.SendReport("R1_SharePostTestReport.html", GetApplication() + GetTestEnv(),
				"[SMOKE TEST]: " + GetApplication() + GetTestEnv() + " - ");
		log.info("Execution is ended from Second Runner - Test AfterClass Annotation");
	}
}
