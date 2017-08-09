package webApi.Lumen;


import cucumber.api.java.en.Then;
import static org.junit.Assert.assertEquals;








public class LoginAuthenticate extends APIHelper{
	
	
	@Then("^I receive a response with StatusCode ([^\"]*) over LoginAuthenticate$")
	public void I_receive_a_response_with_StatusCode_STATUSCODE_over_LoginAuthenticate(String arg0) {
		assertEquals(arg0, Resp.getStatusCode());		
		
	}
	
	

	
	
	
	
	
	
	
	
	

}
