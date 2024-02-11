package GenericLibraries;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * this class contain generic library for database
 * @author AUSAF AHMED
 *
 */
public class DatabaseLibrary {
	public Driver driverRef;
	Connection con;
	/**
	 * this method will make connection to database
	 * @throws SQLException
	 */
	public void connectDatabase() throws SQLException {
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		 con = DriverManager.getConnection(IconstantLibrary.dbURL, IconstantLibrary.dbUN, IconstantLibrary.dbpwd);
	
	}
	/**
	 * this will close connection to database
	 * @throws SQLException 
	 */
 public void disconnectDB() throws SQLException {
   con.close();
}
 /**
  * This mtd will execute the query,fetch the data and validate also
 * @throws SQLException 
  */
 public String executeQueryandReturnData(String query, int columnIndex, String expData) throws SQLException
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		while(result.next())
		{
			String actData = result.getString(columnIndex);
			if(expData.equalsIgnoreCase(actData))
			{
				flag = true;
				break;
			}

		}

		if(flag)
		{
			System.out.println("the data is verified");
			return expData;
		}
		else
		{
			System.out.println("the data is not verified");
			return " ";
		}
	 
	 
 }
 
 
 
}
