package Practice;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
	public static void main(String[] args) throws InterruptedException, AWTException, EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./B.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		Cell cel = row.createCell(4);
		cel.setCellValue("hareem");
		FileOutputStream fos=new FileOutputStream("./B.xlsx");
		wb.write(fos);
		
		String url = cell.getStringCellValue();
		System.out.println(url);
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		String un = cell1.getStringCellValue();
		System.out.println(un);
		Row row2 = sheet.getRow(2);
		Cell cell3 = row2.getCell(1);
		String pw = cell3.getStringCellValue();
		System.out.println(pw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
//		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/input")).sendKeys(un);
//		driver.findElement(By.name("user_password")).sendKeys(pw);
//		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
}
}