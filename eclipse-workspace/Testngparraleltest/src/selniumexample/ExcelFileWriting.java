package selniumexample;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriting {
public static void main(String[]args) throws IOException{

	//create an object of Workbook and pass the FileInputStream object into it 
	//to create a pipeline between the sheet and eclipse.
	File file=new File("C:\\Users\\mmpan\\Documents\\Testeclipsedata.xlsx");
	FileOutputStream fos=new FileOutputStream(file);
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("TestDataSet");
}
}
