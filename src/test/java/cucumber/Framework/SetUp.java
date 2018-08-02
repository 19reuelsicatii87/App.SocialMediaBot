package cucumber.Framework;

import java.io.IOException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class SetUp extends Helper {
	
	static String ScenarioName;
	static String ScenarioID;


	
	@Before
	public void setup(Scenario scenario) throws IOException, InterruptedException
	{		
		ScenarioName = scenario.getName();
		ScenarioID = scenario.getId();	
		
		switch (scenario.getName())
		{		
			case "COMSMOKETEST_TS01": 
				CallAPI("http://dev.app.compass/tests/delete_test_automation_data");		 
	        break;
			
			case "COMSMOKETEST_TS02":  
				CallAPI("http://dev.app.compass/tests/delete_test_automation_data");
			break;
			
			case "COMSMOKETEST_TS03": 
				CallAPI("http://dev.app.compass/tests/delete_test_automation_data");
	        break;
			
			case "COMSMOKETEST_TS04": 
				CallAPI("http://dev.app.compass/tests/delete_tasks");
				CallAPI("http://dev.app.compass/tests/insert_tasks");
	        break;       

		
		}
		
		log.info("Execution started"
				+ "\n Scenario Name: " + scenario.getName()
				+ "\n Scenario ID: " + scenario.getId()		
				);	
		
		log.info("Execution is started from First Runner Test - Before Annotation");
		GetDriverObject();

		
	}
	
	
	@Before
	static public String getScenarioName() throws IOException, InterruptedException
	{
		return ScenarioName;
	}
	
	@Before
	static public String getScenarioID() throws IOException, InterruptedException
	{
		return ScenarioID;
	}
	
	
	
	
}
