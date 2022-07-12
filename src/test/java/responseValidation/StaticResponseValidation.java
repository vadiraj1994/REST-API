package responseValidation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticResponseValidation {

	@Test
	public void staicResponse()
	{

		 baseURI="http://localhost";
		 port=8084;
		 
		 String expData="TY_PROJ_804";
		 Response resp=when()
				       .get("/projects");
		 
		 String actData=resp.jsonPath().get("[0].projectId");
		 Assert.assertEquals(expData, actData);
		 resp.then().log().all();
	}
}
