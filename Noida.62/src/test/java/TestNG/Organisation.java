package TestNG;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import GenericUtility.JavaUtility;
import POM.HOME_PAGE;

	public class Organisation extends BaseClass {
	public void organisationTest() {
	
		JavaUtility jlib=new JavaUtility();
		int number = jlib.Randomnum();

		HOME_PAGE hp =new HOME_PAGE(driver);
		hp.Org();
		
//		System.out.println("org");
//			driver.findElement(By.linkText("Organizations")).click();
			driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			driver.findElement(By.name("accountname")).sendKeys("amar"+number+"");
			driver.findElement(By.name("button")).click();
    			
		}

	}

