package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projectSerializeDeserialize.EmployeeeDetailsWithArray;



public class DeserializationUsingArray {

public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
	int[] phNo= {12345,67891};
		//Step 1:Create object of Object Mapper class
		ObjectMapper obj =new ObjectMapper();

		//Step 2:Call the Read Value method and store it in variable
   EmployeeeDetailsWithArray e1=new EmployeeeDetailsWithArray("Bhairava", "TYSS12", "vadi123@ty.com",phNo );
		//Step 3: Using getters and setters 
		System.out.println(e1.getEmail());
		System.out.println(e1.getEmpId());
}
}