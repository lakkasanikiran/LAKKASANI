package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;


public class ExcelReader {
	
	public static String TESTDATA_SHEET_PATH="src/test/resources/guru99.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	static Cell cell;
	
	
	
	
	public static Object[][] getTestData(String sheetName){
		FileInputStream file=null;
		
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);
		}catch(FileNotFoundException e){
			e.printStackTrace();
				
			}try {
				book=WorkbookFactory.create(file);
		}
			catch(InvalidFormatException e)
			{
				e.printStackTrace();
			}
			
			catch (IOException e){
			e.printStackTrace();
			
		}
			sheet = book.getSheet(sheetName);
			Object[][] Data=new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			System.out.println(sheet.getLastRowNum());
			System.out.println(sheet.getRow(0).getLastCellNum());
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
					cell=  sheet.getRow(i+1).getCell(k);
					Data[i][k]= null;
					switch(cell.getCellType())
					{
					case STRING:
						Data [i][k]=cell.getStringCellValue();
						break;
					case NUMERIC:
						if(DateUtil.isCellDateFormatted(cell)) {
							
						Data[i][k]=String.valueOf(cell.getDateCellValue());
						}else {
							Data[i][k]=String.valueOf((long)cell.getNumericCellValue());
					}
						break;
					case BOOLEAN:
						Data[i][k]=Boolean.toString(cell.getBooleanCellValue());
						break;
					case BLANK:
						Data[i][k]="";
						break;
					}
					
				}
			}
			return Data;
	}
}
