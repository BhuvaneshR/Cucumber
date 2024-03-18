package com.test.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ExcelReadAndWrite {
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	private static XSSFRow row;
	public static String getDataFromXLSXFile(String sheetName, String Key) throws IOException
	{
		
		FileInputStream fis=new FileInputStream("/Users/rbhuvanesh/IdeaProjects/Cucumber/testdata/TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetName);
		int totalRows=getPhysicalNumberOfRows(sheet);
		String cellValue=null;
		for(int i=0;i<totalRows;i++)
		{
			int columnLength=getPhysicalNumberofcolumn(sheet, i);
			for(int j=0;j<columnLength;j++)
			{
				String checkCellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				if(checkCellValue.equals(Key))
				{
					cellValue=sheet.getRow(i).getCell(j+1).getStringCellValue(); 
					break;
				}
			}
		}
		return cellValue;
		
	}
	public static int getPhysicalNumberOfRows(XSSFSheet sheet)
	{
		int intRow=sheet.getPhysicalNumberOfRows();
		return intRow;
	}
	public static int getPhysicalNumberofcolumn(XSSFSheet sheet,int i)
	{
		int noOfColumns = sheet.getRow(i).getLastCellNum();
		return noOfColumns;
	}
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=new FileInputStream("/Users/rbhuvanesh/IdeaProjects/Cucumber/testdata/TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Google");
		System.out.println(getDataFromXLSXFile("Google","GoogleURL"));
	}

}
