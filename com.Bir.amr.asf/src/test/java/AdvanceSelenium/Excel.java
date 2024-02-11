package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	
		public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			FileInputStream fis=new FileInputStream("./excelvtiger.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row rw = sheet.getRow(0);
			Cell c = rw.getCell(1);
			String value = c.getStringCellValue();
			System.out.println(value);
			
			Row rw1 = sheet.getRow(1);
			Cell c1 = rw1.getCell(1);
			String username = c1.getStringCellValue();
			System.out.println(username);
			
			
			Row rw2 = sheet.getRow(2);
			Cell c2 = rw2.getCell(1);
			String password = c2.getStringCellValue();
			System.out.println(password);
		
	}

}
