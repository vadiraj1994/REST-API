package differentWaysToPostRequest;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import projectLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingPojoClass {

	@Test
	
	
	public void createProject()
	{
		Random ran=new Random();
		 int random=ran.nextInt();
		 
		
		 baseURI="http://localhost";
		 port=8084;
		 
		 //create data
		 ProjectLibrary pLib=new ProjectLibrary("vadiraj", "TYSS:"+random, "created", 10);
		 
		 //send the request
		 given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/addProject")
		 .then()
		 .assertThat().statusCode(201).log().all();
	}
}
