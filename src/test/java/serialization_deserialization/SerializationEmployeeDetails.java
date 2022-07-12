package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projectSerializeDeserialize.EmployeeDetails;

public class SerializationEmployeeDetails {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
	
	//Step 1: Create Object of Pojo class and initialise
	EmployeeDetails emp= new EmployeeDetails("Vadiraj","ty123","vadi123@ty.com","SeniorQA");
	
	//Step 2:Create object of Object Mapper class
	ObjectMapper obj =new ObjectMapper();
	
	//Step 3:From Object Mapper call the method writeValue() [for serialization]
	obj.writeValue(new File("./EmployeeDetails.json"), emp);
	
}
}