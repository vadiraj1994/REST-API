package differentWaysToPostRequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class createUsingHashMap {


	@Test
	
	public void createProject()
	{
		 
		 HashMap jObj=new HashMap();
		 jObj.put("createdBy", "Rahul");
		 jObj.put("projectName", "EPS");
		 jObj.put("status", "Created");
		 jObj.put("teamSize", 15);

		 given().body(jObj).contentType(ContentType.JSON)
		 .when().post("/addProject")
		 .then().assertThat().statusCode(201)
		 .log().all();
		 
	}
}
