package RequestChaining;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import projectLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class CreateProjectAndDelete {

	@Test
	public void createProjectAndDelete()
	{
		
		baseURI="http://localhost";
		port=8084;

		ProjectLibrary pro=new ProjectLibrary("vadiraj", "TY_PROJ_04", "created", 10);

		Response resp = given()
				.body(pro)
				.contentType(ContentType.JSON)
				.when().post("/addProject");
		String pid = resp.jsonPath().get("/projectId");
		System.out.println(pid);

		given()
		.pathParam("key", pid)
		.when().get("./project/{key}")
		.then().assertThat().statusCode(200).log().all();

		given()
		.pathParam("key", pid)
		.when().delete("./projects/{key}")
		.then().assertThat().statusCode(204).log().all();
	}
}
