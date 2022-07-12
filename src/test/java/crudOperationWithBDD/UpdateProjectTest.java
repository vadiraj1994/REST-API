package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProjectTest {

	@Test
	public void updtaeProject()
	{
	
	baseURI="http://localhost";
	port=8084;
	//Step 1: Create required data
	JSONObject jObj=new JSONObject();
	jObj.put("createdBy", "Vadiraj");
	jObj.put("projectName", "Sony");
	jObj.put("status", "OnGoing");
	jObj.put("teamSize", 15);
	//Step 2: Send the request
	
	given().body(jObj).contentType(ContentType.JSON)
	.when().put("/projects/TY_PROJ_404")
	.then().assertThat().statusCode(201)
	.log().all();
	
}
}
