package dataDrivenTesting;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import projectLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class DataProviderForDifferentTestData {

	@Test(dataProvider = "getData")
	public void createProjectWithDifferentData(String createdBy,String projectName,String status,String teamSize){
		
		Random ran=new Random();
		int random = ran.nextInt(200);
		
		baseURI="http://localhost";
		port=8084;
		
		ProjectLibrary pObj=new ProjectLibrary(createdBy, projectName, status, random);
		
		given()
		.body(pObj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().log().all();
	}
	
	
	
	
	@DataProvider
	
	public Object[][] getData()
	{

		Random ran=new Random();
		int random = ran.nextInt(200);
		Object[][] obj=new Object[5][4];
		obj[0][0]="vadi";
		obj[0][1]="Hdfc"+random;
		obj[0][2]="On going";
		obj[0][3]="5";

		obj[1][0]="Raja";
		obj[1][1]="idfc"+random;
		obj[1][2]="Completed";
		obj[1][3]="6";
		
		obj[2][0]="Agastya";
		obj[2][1]="Union"+random;
		obj[2][2]="created";
		obj[2][3]="7";
		
		obj[3][0]="Bhairava";
		obj[3][1]="BOB"+random;
		obj[3][2]="On-going";
		obj[3][3]="8";
		
		return obj;
		
	}
}
