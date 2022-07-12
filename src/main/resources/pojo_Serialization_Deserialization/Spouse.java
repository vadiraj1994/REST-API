package pojo_Serialization_Deserialization;
/**
 * This is a pojo class to store employee details
 * @author Vadiraj
 *
 */
public class Spouse 
{
	//Declare Global Variable

	String sName;
	int sPhone;
	String sCompany;
	public Spouse(String sName, int sPhone, String sCompany) {
		
		this.sName = sName;
		this.sPhone = sPhone;
		this.sCompany = sCompany;
	}
	public String getsName() {
		return sName;
	}
	public int getsPhone() {
		return sPhone;
	}
	public String getsCompany() {
		return sCompany;
	}
	

}
