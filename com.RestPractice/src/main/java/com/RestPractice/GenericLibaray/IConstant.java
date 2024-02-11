package com.RestPractice.GenericLibaray;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
public interface IConstant {
	String dbURL="jdbc:mysql://localhost:3306/projects";
	String dbUN="root";
	String dbpwd="root";
	
	String apiUsername="rmgyantra";
	String apipwd="rmgy@9999";
	
	String appURL = "http://localhost";
	int appPort = 8084;
			

}
