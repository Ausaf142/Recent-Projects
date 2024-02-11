package Practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;





public class JDBC {
	public static void main(String[] args) throws SQLException {
		//create ur query
		
		//first create obj driver
		//put jar file in pom mysql.connecter
		//import cj.jdbc.driver
	Driver driver=new Driver();
	//call class DriverManager
	DriverManager.registerDriver(driver);
	//get connection to database
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	//create sql satatmnt
	Statement stat = conn.createStatement();
//	stat.executeUpdate("insert into tea value('amar',5,5)");
	ResultSet res = stat.executeQuery("select* from Persons");
//	while(res.next()) {
//		System.out.println(res.getString(1)+" "+res.getInt(2)+" "+res.getInt(3));
//	}
	conn.close();
	


}
}