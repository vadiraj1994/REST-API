package differentWaysToPostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUsingJsonObject {


	@Test
	public void createJsonObject()
	{
		 

	 baseURI="http://localhost";
	 port=8084;
	 
  
		//Step 1: Create required data
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "Vadiraj");
		jObj.put("projectName", "Sony");
		jObj.put("status", "Created");
		jObj.put("teamSize", "15");
		//Step 2: Send the request
	 given().body(jObj).contentType(ContentType.JSON)
	 .when().post("/addProject")
	 .then().log().all();
	 
	 
	}
}
