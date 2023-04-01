package com.SeleniumBase.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	
	public String read(String rv,String cv) throws IOException
	{
		File src= new File("D:\\Book.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws =wb.getSheet("Sheet1");
		
		Iterator<Row> iterator = ws.iterator();
		Row nextRow = iterator.next();
		int rowCount = ws.getLastRowNum();
		int columnCount = nextRow.getLastCellNum();

		System.out.println(rowCount);
		System.out.println(columnCount);
		
		String cellvalue="";
		for(int i=0;i<=rowCount;i++)
		{
			String rowvalue=ws.getRow(i).getCell(0).getStringCellValue();
	
			System.out.println("Value  "+ rowvalue);
		
			if(rowvalue.equals(rv) )
			{
		       for (int j=0;j<columnCount;j++)
		       {
		    	   
		    	String Columnvalue=ws.getRow(0).getCell(j).getStringCellValue();
		    	System.out.println("Columnvalue:  "+  Columnvalue);
		    	if(Columnvalue.equals(cv))
				cellvalue=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellvalue);
		       }
			}
		
		}
		return cellvalue;
	}
	

}
