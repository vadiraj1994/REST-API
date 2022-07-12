package pojo_Serialization_Deserialization;

/**
 * This is a pojo class to store employee details
 * @author Vadiraj
 *
 */

public class EmployeeDetailsWithObject	//Declare Global Variable
{

	String name;
	String empId;
	String designation;
	int[] phno;
	Object Spouse;

	//create an Empty constructor for Deserialization
	public EmployeeDetailsWithObject() 
	{
		
	}

	

	//Step 2:Create construtor to initialise these variable

	public EmployeeDetailsWithObject(String name, String empId, int[] phno, String designation, Object spouse) {
		
		this.name = name;
		this.empId = empId;
		this.designation = designation;
		this.phno = phno;
		this.Spouse = spouse;
	}






	public String getName() {
		return name;
	}





	public String getEmpId() {
		return empId;
	}



	public String getDesignation() {
		return designation;
	}



	public int[] getPhno() {
		return phno;
	}



	public Object getSpouse() {
		return Spouse;
	}

}


