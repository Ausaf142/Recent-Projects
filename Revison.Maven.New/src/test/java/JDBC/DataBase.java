package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBase {
	public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","root");
		Statement stat = conn.createStatement();
//for adding in datababses we can use;
//		int res = stat.executeUpdate("insert into students value('adeeb',12,45)");

		
	
		ResultSet result = stat.executeQuery("select * from students");
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getInt(2)+" "+result.getInt(3));
		}
			conn.close();
	
		
		
		
	}

}
