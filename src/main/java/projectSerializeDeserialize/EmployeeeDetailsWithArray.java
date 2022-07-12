package projectSerializeDeserialize;

public class EmployeeeDetailsWithArray 
{
	String empName;
	String empId;
	String email;
	int[] empPhno;
	
	public EmployeeeDetailsWithArray(String empName, String empId, String email, int[] empPhno) {
		
		this.empName = empName;
		this.empId = empId;
		this.email = email;
		this.empPhno = empPhno;
	}
    public EmployeeeDetailsWithArray()
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
	public int[] getEmpPhno() {
		return empPhno;
	}
	
	
	
	
	
	
	
	
}
