package crudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectsTest {

	@Test
	public void getAllProjects()
	{
		Response response = RestAssured.get("http://localhost:8084/projects");

		ValidatableResponse valid = response.then();
		valid.log().all();
		valid.assertThat().statusCode(200);
}
}