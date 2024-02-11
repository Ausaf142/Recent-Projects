package com.RestPractice.GenericLibaray;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class DataBaseConnection {
	
	public Driver driverRef;
	  Connection conn;
	
	
	  public void connectDatabase() throws SQLException {
			driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			 conn = DriverManager.getConnection(IConstant.dbURL, IConstant.dbUN, IConstant.dbpwd);
		
		}

	public void DatabaseDisconnect() throws SQLException {
		System.out.println("connection close ");
		conn.close();
	}


	public String executeQueryReturnData(String query,int Columnindex,String expData) throws SQLException  {
		System.out.println("database query run ");
		
	
		 Statement stat = conn.createStatement();
		// System.out.println("hahaaaaa");
		 ResultSet res = stat.executeQuery(query);
		//.out.println("execute result");
		//System.out.println(res);
		boolean flag=false;
		while(res.next()) {
			String actData = res.getString(Columnindex);
			if(expData.equalsIgnoreCase(actData)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("data is verified");
			return expData;
		}
		else {
			System.out.println("not verified");
			return " ";
		}
		
		
	}
}

