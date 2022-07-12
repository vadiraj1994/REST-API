package crudOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {

	@Test
	public void CreateProject()
	{
		//Step 1: Create required data
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "Vadiraj");
		jObj.put("projectName", "Sony");
		jObj.put("status", "Created");
		jObj.put("teamSize", "15");
		//Step 2: Send the request
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		Response response = req.post("http://localhost:8084/addProject");

		System.out.println(response.prettyPeek());
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getSessionId());
		System.out.println(response.contentType());

		ValidatableResponse valid = response.then();

		valid.log().all();

	}
}
