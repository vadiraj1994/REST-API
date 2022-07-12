package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthToken {

	@Test
	public void basicAuthTest()
	{
		baseURI="http://localhost";
		port=8084;

		given()
		.auth()
		.basic("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
	}
	
	@Test
	public void digestiveAuthTest()
	{
		baseURI="http://localhost";
		port=8084;

		given()
		.auth()
		.digest("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
	}
	
	@Test
	public void preemptiveAuthTest()
	{
		baseURI="http://localhost";
		port=8084;

		given()
		.auth()
		.preemptive()
		.basic("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
	}
}
