package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * This class contains methods specific to database
 * @author Vadiraj
 *
 */
public class DataBaseLibrary {

	/**
	 * This method used to connect to DB
	 * @throws SQLException
	 */
	Driver driverRef;
	Connection conn;
	public void connectToDb() throws SQLException
	{
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
	}
	/**
	 * This method will close the database connection
	 * @throws SQLException 
	 */
	public void closeBb() throws SQLException
	{
		conn.close();
	}
	public String executeQueryAndReturnData(String query,int columnIndex,String expData) throws SQLException
	{
		boolean flag=false;
		ResultSet result = conn.createStatement().executeQuery(query);

		while(result.next())
		{
			String actData=result.getString(columnIndex);
			if(expData.equalsIgnoreCase(actData))
			{
				flag=true;
				break;
			}
		}
        if(flag)
        {
        	System.out.println("Data verified");
        	return expData;
        }
        else
        {
        	System.out.println("data does not match");
        	return "";
        }
	}
}
