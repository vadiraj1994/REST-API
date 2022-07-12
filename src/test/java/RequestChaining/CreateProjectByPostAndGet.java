package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import projectLibrary.ProjectLibrary;

public class CreateProjectByPostAndGet
{
	@Test
	public void createProjectAndGet()
	{
		baseURI="http://localhost";
		port=8084;
		
		Random ran=new Random();
		int random = ran.nextInt(200);

		//create project[POST]
		ProjectLibrary pro=new ProjectLibrary("vadiraj", "TY_PROJ_"+random, "created", 10);


		Response resp = given()
				.body(pro)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");

		//using json path retrive projectId from response
		String pid = resp.jsonPath().get("projectId");
		Reporter.log(pid);
		
		//use this projectId for Another request for Chaining..
		//2]Request[GET]
		given()
		.pathParam("id",pid )
		.when().get("/projects/{id}")
		.then().log().all();


	}

}
