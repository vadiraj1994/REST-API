package projectSerializeDeserialize;

public class EmployeeDetails {

	String empName;
	String empId;
	String email;
	String designation;
	public EmployeeDetails(String empName, String empId, String email, String designation) {

		this.empName = empName;
		this.empId = empId;
		this.email = email;
		this.designation = designation;
	}
	public EmployeeDetails()
	{

	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmpno() {
		return email;
	}

	public String getDesignation() {
		return designation;
	}

}
