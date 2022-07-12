package parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {


	@Test
	public void queryParameter()
	{
		baseURI="http://reqres.in";
		
		given()//precondition
		.queryParam("page", 2)
		.when()
		.get("/api/users")
		.then().log().all();
		
		
	}
}
