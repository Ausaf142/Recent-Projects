package GenericLibraries;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseAPIclass {
	public JavaLibrary jlib=new JavaLibrary();
	public DatabaseLibrary dlib=new DatabaseLibrary();
	 public RestAssuredLibrary rlib=new RestAssuredLibrary();

	@BeforeSuite
	public void bsConfig() throws SQLException {
		dlib.connectDatabase();
		Reporter.log("====connected to DataBase======",true);
		
		baseURI=IconstantLibrary.appURL;
		port=IconstantLibrary.appPort;
	}
		
		@AfterSuite
		public void asConfig() throws SQLException {
			
		
		dlib.disconnectDB();
		Reporter.log("========Database Close=========",true);
	
		
	}
}
