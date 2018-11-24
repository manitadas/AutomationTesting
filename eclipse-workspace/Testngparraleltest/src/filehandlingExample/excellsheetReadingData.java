package filehandlingExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellsheetReadingData {
	XSSFWorkbook workbook;
	public String[][] testReader() throws IOException{
FileInputStream fis=new FileInputStream("C:\\Users\\mmpan\\Documents\\Testeclipsedata.xlsx");
workbook=new XSSFWorkbook(fis);
XSSFSheet TestDataSet=workbook.getSheetAt(0);
int rowcount=TestDataSet.getLastRowNum();
System.out.println("No of rows is:"+((rowcount)+1));
int columncount=TestDataSet.getRow(0).getLastCellNum();
System.out.println("no of columns is: "+columncount);
String[][] value=new String[rowcount-1][columncount];
int k=0;
for(int i=1;i<rowcount;i++) {
	for(int j=0;j<TestDataSet.getRow(i).getLastCellNum();j++) {
		XSSFCell cell=TestDataSet.getRow(i).getCell(j);
		DataFormatter df=new DataFormatter();
		value[k][j]=df.formatCellValue(cell);
	}
	k++;
}
return value;
	}

	public static void main(String[]args) {
		excellsheetReadingData	ex=new excellsheetReadingData();
		try {
			String[][] abc=ex.testReader();
			for(int j=0;j<abc.length;j++) {
				for(int k=0;k<abc[j].length;k++) {
					System.out.println(abc[j][k]+"\t");
				}
				System.out.println();
			
			}
		} catch (Exception e) {
		System.out.println(	e.getMessage());
		}
	
	}
	
}
