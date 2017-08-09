package webApi.Lumen;

import io.restassured.response.Response;
import java.util.UUID;
import io.restassured.builder.RequestSpecBuilder;
import com.google.gson.JsonParser;


public class APIHelper{
	
	
	public static Response Resp;
	public static RequestSpecBuilder reqB = new RequestSpecBuilder();
	public static JsonParser parser = new JsonParser();

	
	
    public static String randomgenerator() {
    	return UUID.randomUUID().toString().replace("-", "");

    }
	
	
	
	

}
