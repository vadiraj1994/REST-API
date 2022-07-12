package authentication;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2Test {

	@Test
	public void oauth2Test()
	{
		//Step 1:create a post request with client id and secret
		Response resp = given()
		.formParam("client_id", "VADI API SDET")
		.formParam("client_secret", "63f31c1ccc25225c4cd7e3d495f0e150")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://vadi.com")
		.formParam("code", "authorization_code")
		
		.when()
		.post("/token");
	
		//Step 2: capture the access token in response
		String token = resp.jsonPath().get("access_token");
		Reporter.log(token, true);
		//Step 3: use that access token to access any of the API's
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID", 3534)
		.when()
		.post("/api/{USER_ID}/barn-unlock")
		.then().log().all();
	}
}
