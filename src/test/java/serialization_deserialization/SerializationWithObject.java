package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import projectSerializeDeserialize.EmployeeDetailsWithObject;
import projectSerializeDeserialize.Spouse;


public class SerializationWithObject {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int[] phno= {12345,34567};
		Spouse sp=new Spouse("abc", 1234, "Infosys");
		//Step 1: Create Object of Pojo class and initialise
 EmployeeDetailsWithObject empObj=new EmployeeDetailsWithObject("Raja", "TYSS12", "vadi12@ty.com", "Sr te", phno);
		//Step 2:Create object of Object Mapper class
		ObjectMapper obj =new ObjectMapper();
		
		//Step 3:From Object Mapper call the method writeValue() [for serialization]
		obj.writeValue(new File("./EmployeeDetailsWithObject.json"), empObj);
		
	}
	}

