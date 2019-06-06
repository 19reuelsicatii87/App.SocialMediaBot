package cucumber.Framework;

import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class SetUp extends WEBHelper {

	static String ScenarioName;
	static String ScenarioID;

	@Before
	public void setup(Scenario scenario) throws IOException, InterruptedException {
		ScenarioName = scenario.getName();
		ScenarioID = scenario.getId();

		log.info("Execution started" + "\n Scenario Name: " + scenario.getName() + "\n Scenario ID: "
				+ scenario.getId());

		log.info("Execution is started from First Runner Test - Before Annotation");
		GetDriverObject();

	}

	@Before
	static public String getScenarioName() throws IOException, InterruptedException {
		return ScenarioName;
	}

	@Before
	static public String getScenarioID() throws IOException, InterruptedException {
		return ScenarioID;
	}

}
