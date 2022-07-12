package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projectSerializeDeserialize.EmployeeDetailsWithObject;



public class DeserializationWithObject {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		//Step 1:Create object of Object Mapper class
		ObjectMapper obj =new ObjectMapper();

		//Step 2:Call the Read Value method and store it in variable
		EmployeeDetailsWithObject e1 = obj.readValue(new File(".\\EmployeeDetailsWithObject.json"),EmployeeDetailsWithObject.class );

		//Step 3: Using getters and setters 
		System.out.println(e1.getDesignation());
		System.out.println(e1.getEmail());
}
}
