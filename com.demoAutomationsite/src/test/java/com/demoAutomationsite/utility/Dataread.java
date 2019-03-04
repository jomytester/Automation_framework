package com.demoAutomationsite.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataread {

	XSSFWorkbook wb;
	
	
	public Dataread() throws Exception {
		
		File source = new File("./TestData/Demosite.xlsx");
		FileInputStream fis = new FileInputStream(source);
		
		wb= new XSSFWorkbook(fis);
		
		
	}
	
	
	
	
	public String ReadDat(int row_val , int col_val) {
		
		XSSFSheet sheet= wb.getSheetAt(0);
		
		return sheet.getRow(row_val).getCell(col_val).getStringCellValue();
		
		
		
		
	}
}
