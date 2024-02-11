	
package dummy;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.ExcelUtility;

public class Zigly {
	public static void main(String[] args) throws Throwable {
		
		 String excelPtah="./Zigly.xlsx";
		 String page ="Sheet1";
		 int cell=0;
		 int cell2=0;
		 int cell3=0;
		 String status ;
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zigly.com/trackingorder");
		Thread.sleep(2000);
		
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
//		rob.keyPress(KeyEvent.VK_TAB);
//		rob.keyRelease(KeyEvent.VK_TAB);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
		
	
		
		
		driver.findElement(By.id("moe-dontallow_button")).click();
		
	for (int row = 1; row < 8; row++) {   //Loop Count -->count of Row -1
	    System.out.println(row);
	     cell = 0;
	    ExcelUtility excel = new ExcelUtility();

	    try {
	        String id = excel.getNumericCellValue(excelPtah, page, row, cell);
	         cell2 = cell + 1;
	        String mob = excel.getNumericCellValue(excelPtah, page, row, cell2);
	        

	        driver.findElement(By.id("orderId")).sendKeys("0000"+id);
	        driver.findElement(By.id("mobileNumber")).sendKeys(mob);

	        Thread.sleep(1000);
	        driver.findElement(By.id("submit")).click();
	        Thread.sleep(4000);

	        cell3 = cell2 + 1;
	         status = driver.findElement(By.xpath("//span[text()='Order Status:']/..")).getText();

	        excel.writeValue(excelPtah, page, row, cell3, status);
//	        String amount = driver.findElement(By.xpath("//span[@class='total-amount']")).getText();
//	        int cell4 = cell2 + 2;
//	        excel.writeValue(excelPtah, page, row, cell2, cell4, amount);

	        System.out.println(status);
	        driver.navigate().back();
	        driver.findElement(By.id("orderId")).clear();
	        driver.findElement(By.id("mobileNumber")).clear();
	    } catch (Exception e) {
	        // Handle the exception gracefully
	        System.err.println("An error occurred in row " + row + ": " + e.getMessage());
	        status="wrong Id";
	        excel.writeValue(excelPtah, page, row, cell3, status);
	     
	        driver.navigate().back();
	        driver.findElement(By.id("orderId")).clear();
	        driver.findElement(By.id("mobileNumber")).clear();
	        continue;
	        // Optionally, you can add further error-handling logic here if needed.
	    }
	}

	System.out.println("EXCEL SHEET AUTO RUN COMPLETED");
	driver.quit();
	}
}
