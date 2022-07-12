package pojo_Serialization_Deserialization;
/**
 * This is a pojo class to store employee details
 * @author Vadiraj
 *
 */



public class EmployeeDetails 
{
 
//Step 1:Declare all the necessary variables as global
	String empName;
	String empId;
	String email;
	int phoneNo;
	String designation;

	//create an Empty constructor for Deserialization
    public EmployeeDetails() 
    {
    	
    }
	
	
	//Step 2:Create construtor to initialise these variable
	
	

	public EmployeeDetails(String empName, String empId, String email, int phoneNo, String designation) {
		
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
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
