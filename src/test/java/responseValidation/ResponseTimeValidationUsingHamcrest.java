package responseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidationUsingHamcrest 
{	
	@Test	
	public void responseTimeValidation()
	{
		baseURI="http://localhost";
		port=8084;
		
		Response resp=when().get("/projects");
		resp.then().assertThat().time(Matchers.lessThan(400L), TimeUnit.MILLISECONDS);
		
		//Hamcrest Matchers-Tool which helps us to validate Response Time
		//Hamcrest Matchers has a class called Matchers and Matcher Interface which has methods like
		//lessThan(), greaterThan(), lessThanOrEqualTo()
	}
}
