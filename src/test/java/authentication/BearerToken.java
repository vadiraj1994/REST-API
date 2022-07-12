package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	public void bearerTokenTest()
	{
		baseURI="https://api.github.com";
		
		JSONObject jObj=new JSONObject();
		jObj.put("name", "SDET35-RESTAssured");
		jObj.put("description", "RestFulWeb services FW tested");
		
		given()
		.auth()
		.oauth2("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")
		.body(jObj)
		.contentType(ContentType.JSON)
		.when()
		.post("/user/repos")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
