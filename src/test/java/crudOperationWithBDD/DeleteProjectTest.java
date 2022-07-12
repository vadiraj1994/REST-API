package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {


	@Test
	public void deleteProjectTest()
	{
	
	
		baseURI="http://localhost";
		port=8084;
		
		when().delete("/projects/TY_PROJ_404")
		.then().assertThat().statusCode(204)
		.log().all();
	
	
	
	
	
	}
	
	
	
	
	
	
}
