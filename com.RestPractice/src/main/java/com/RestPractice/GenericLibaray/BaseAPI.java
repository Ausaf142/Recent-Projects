package com.RestPractice.GenericLibaray;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseAPI {
	public JavaLibrary jlib=new JavaLibrary();
	public RestAssured rlib=new RestAssured();
	 public DataBaseConnection dlib=new DataBaseConnection();
	
	
@BeforeSuite
public void BS() throws SQLException {
	System.out.println("===connected to database=====");
	dlib.connectDatabase();
	baseURI=IConstant.appURL;
	port=IConstant.appPort;
	
	
}
	@AfterSuite
	public void AS() throws SQLException {
		dlib.DatabaseDisconnect();
		Reporter.log("===disconnect to database===",true);
	}
	
}

