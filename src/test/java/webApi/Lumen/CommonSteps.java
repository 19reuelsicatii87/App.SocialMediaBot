package webApi.Lumen;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;










public class CommonSteps extends APIHelper{
	
	

	@Given("^Im an Account Manager$")
	public void im_an_Account_Manager() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	
	@When("^I set baseURI$")
	public void I_set_baseURI() throws Throwable{	
		
		reqB.setBaseUri(GetPropertValue("Data/TestProperties.xml","LumenDEVURL"));		
		
	}
	
	@When("^I set basePath to ([^\"]*)$")
	public void I_set_basePath_to_VARIABLE(String arg0) {		

		reqB.setBasePath(arg0);				
		
	}
	
	@When("^I set basePath to \"([^\"]*)\"$")
	public void I_set_basePath_to_VALUE(String arg0) {		

		reqB.setBasePath(arg0);				
		
	}
	
	@When("^I add parameter Key as \"([^\"]*)\" and Value as ([^\"]*)$")
	public void i_add_parameter_Key_as_VALUE_and_Value_as_VARIABLE(String arg0, String arg1) throws Throwable {	

		reqB.addParam(arg0, arg1);
		
	}
	
	@When("^I add parameter Key as \"([^\"]*)\" and Value as \"([^\"]*)\"$")
	public void i_add_parameter_Key_as_VALUE_and_Value_as_VALUE(String arg0, String arg1) throws Throwable {	

		reqB.addParam(arg0, arg1);
		
	}
	
	
	
	@When("^I build RequestSpecification$")
	public void i_build_RequestSpecification() throws Throwable {		

		requestSpecification = reqB.build();				
		
	}
	
	@When("^I attached response to JsonPath$")
	public void I_attached_response_to_JsonPath() {
		
		jp = new JsonPath(Resp.asString());
		//System.out.println(Resp.asString());

	}
	
	@When("^I retrieve token$")
	public void I_retrieve_token() {
		
		Token = jp.getString("response.data.token");
		//System.out.println("TOKEN: " + Token);
	}
	
	
	@When("^I execute a GET method$")
	public void I_execute_a_GET_method() {
		
		Resp = get();

	}
	
	
	@When("^I execute a POST method$")
	public void i_execute_a_POST_method() throws Throwable {
		
		Resp = post();

	}
	
	
	
	
	
	
	
	
	

}
