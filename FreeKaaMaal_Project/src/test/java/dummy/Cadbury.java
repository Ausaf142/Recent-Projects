package dummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.ExcelUtility;

public class Cadbury {
	public static void main(String[] args) throws Throwable {
		
		 String excelPtah="./Cad.xlsx";
		 String page ="Sheet1";
		 int cell=0;
		 int cell2=0;
		 int cell3=0;
		 int cell4=0;
		 String status ;
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cadburygifting.in/track-my-order/");
		
	for (int row = 0; row < 3; row++) {
	    System.out.println(row);
	     cell = 0;
	    ExcelUtility excel = new ExcelUtility();

	    try {
	        String id = excel.getNumericCellValue(excelPtah, page, row, cell);
	         cell2 = cell + 1;
	        String email = excel.getStringCellValue(excelPtah, page, row, cell2);

	        driver.findElement(By.id("trackOderId")).sendKeys("00" + id);
	        driver.findElement(By.id("email")).sendKeys(email);

	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[text()='Track Order']")).click();
	        Thread.sleep(4000);

	        cell3 = cell2 + 1;
	         status = driver.findElement(By.xpath("(//div[@class='right']/.)[1]")).getText();

	        excel.writeValue(excelPtah, page, row, cell3, status);
	        String amount = driver.findElement(By.xpath("//span[@class='total-amount']")).getText();
	        cell4 = cell2 + 2;
	        excel.writeValue(excelPtah, page, row, cell4, amount);

	        System.out.println(status);
	        driver.navigate().refresh();
	    } catch (Exception e) {
	        // Handle the exception gracefully
//	        System.err.println("An error occurred in row " + row + ": " + e.getMessage());
	        status="Wrong Id";
	        excel.writeValue(excelPtah, page, row, cell3, status);
	     
	        driver.navigate().refresh();
	        continue;
	        // Optionally, you can add further error-handling logic here if needed.
	    }
	}

	System.out.println("EXCEL SHEET AUTO RUN COMPLETED");
	driver.quit();
	}
}
