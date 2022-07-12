package crudOperationWithoutBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {


	@Test
	public void deleteProject()
	{
	
	Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_402");
	
	System.out.println(response.statusCode());
	ValidatableResponse valid = response.then();
	valid.log().all();
	valid.assertThat().statusCode(204);
	
	
	
	}
	
	
	
	
	
	
}
