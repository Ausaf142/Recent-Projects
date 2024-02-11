package TestNG;



import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


import GenericUtility.BaseClass;
import GenericUtility.JavaUtility;
import POM.HOME_PAGE;

public class Lead extends BaseClass {
	@Test  
	public void Leads() throws InterruptedException {
		JavaUtility jlib=new JavaUtility();
		int number = jlib.Randomnum();
		
		/*OPTIMISED IN BASE CLASS*/
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.get("http://localhost:8888/");
//		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("root");
//		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
		
		
		
		Reporter.log("ye maderchod hai fasja rha apne bhosre me dalo",true);
		Thread.sleep(2000);
		HOME_PAGE hp =new HOME_PAGE(driver);
		hp.Lead();
//		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Lead...\"]")).click();
		driver.findElement(By.name("lastname")).sendKeys("amar"+number+"");
		driver.findElement(By.name("company")).sendKeys("fleekIT");
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		System.out.println("lead reg");
		System.out.println("sad");
		
	}

	
	
}
