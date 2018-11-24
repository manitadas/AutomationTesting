package selniumexample;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelfileReading {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		FileInputStream fis=new FileInputStream("C:\\Users\\mmpan\\Documents\\Testeclipsedata.xlsx");
		XSSFWorkbook  workbook=new XSSFWorkbook (fis);
		XSSFSheet TestDataSet=workbook.getSheetAt(0);
		//Row row=sheet.getRow(0);
		//Cell cell=row.getCell(0);
		int rowcount=TestDataSet.getLastRowNum();
		System.out.println((rowcount)+1);
		for (int i=0;i<rowcount;i++) {
			
				//System.out.println(cell);
		 String data1=TestDataSet.getRow(i).getCell(0).getStringCellValue();
		 System.out.println(data1);
		 }
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		workbook.close();
		
	}

}
