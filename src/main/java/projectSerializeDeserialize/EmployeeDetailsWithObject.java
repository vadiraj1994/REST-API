package projectSerializeDeserialize;

public class EmployeeDetailsWithObject {


	String empName;
	String empId;
	String email;
	String designation;
	int[] phNo;
	public EmployeeDetailsWithObject(String empName, String empId, String email, String designation, int[] phNo) {
		
		this.empName = empName;
		this.empId = empId;
		this.email = email;
		this.designation = designation;
		this.phNo = phNo;
	}
	public EmployeeDetailsWithObject()
	{
		
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmail() {
		return email;
	}
	public String getDesignation() {
		return designation;
	}
	public int[] getPhNo() {
		return phNo;
	}
	
}
