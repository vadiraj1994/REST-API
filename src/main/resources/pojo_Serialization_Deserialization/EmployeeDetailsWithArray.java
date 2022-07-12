package pojo_Serialization_Deserialization;

/**
* This is a pojo class to store employee details
* @author Vadiraj
*
*/
public class EmployeeDetailsWithArray
{
	//Step 1:Declare all the necessary variables as global
	String empName;
	String empId;
	String[] email;
	int[] phoneNo;
	String designation;
	

	//create an Empty constructor for Deserialization
    public EmployeeDetailsWithArray() 
    {
    	
    }
	
	
	//Step 2:Create construtor to initialise these variable
	public EmployeeDetailsWithArray(String empName, String empId, String[] email, int[] phoneNo, String designation) {
		this.empName = empName;
		this.empId = empId;
		this.email = email;
		this.phoneNo = phoneNo;
		this.designation = designation;
	}
	//Step 3: Provide getters and setters to access these variables

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public String[] getEmail() {
		return email;
	}

	public int[] getPhoneNo() {
		return phoneNo;
	}

	public String getDesignation() {
		return designation;
	}

	
}
