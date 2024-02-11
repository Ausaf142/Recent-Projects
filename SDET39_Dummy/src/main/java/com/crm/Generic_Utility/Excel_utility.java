package com.crm.Generic_Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
	public String getValueFromExcel(String sheetname,int RowNum,int CellNo) throws Throwable {
		FileInputStream fis = new FileInputStream("./Data/Book4.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(RowNum);
		Cell cell = row.getCell(CellNo);
		String data = cell.getStringCellValue();
		
		
		return data;
}
}