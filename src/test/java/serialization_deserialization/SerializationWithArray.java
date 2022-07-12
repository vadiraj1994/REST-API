package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projectSerializeDeserialize.EmployeeeDetailsWithArray;



public class SerializationWithArray {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		int[] phno= {12345,34567};
		//Step 1: Create Object of Pojo class and initialise
    EmployeeeDetailsWithArray empArr=new  EmployeeeDetailsWithArray("vadiraj","TYSS123", "vadi123@ty.com", phno);
     //Step 2:Create object of Object Mapper class
		ObjectMapper obj =new ObjectMapper();
		
		//Step 3:From Object Mapper call the method writeValue() [for serialization]
		obj.writeValue(new File("EmployeeDetailsWithArray.json"), empArr);
		
	
		
		
		
	}
}
