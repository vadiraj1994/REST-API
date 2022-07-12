package responseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class DynamicResponseValidation {


	@Test
	public void dynamicResponse()
	{

		baseURI="http://localhost";
		port=8084;

		String expData="TY_PROJ_804";
		Response resp=when().get("/projects");

		boolean flag = false;
		List<String> list = resp.jsonPath().get("projectId");
		for (String s : list)
		{
			if(s.equalsIgnoreCase(expData))
			{
				flag=true;
				break;
			}

		}
		Assert.assertTrue(flag);
	}
}