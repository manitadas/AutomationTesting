package filehandlingExample;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellsheetDataWriting  {
	public static void main(String[]args) throws IOException{
FileOutputStream fos=new FileOutputStream("C:\\Users\\mmpan\\Documents\\TestData.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet sheet=workbook.createSheet("credentials");
excellsheetReadingData ex=new excellsheetReadingData();
String[][] abc=ex.testReader();
for(int j=0;j<abc.length;j++) {
	XSSFRow row=sheet.createRow(j);
	for(int k=0;k<abc[j].length;k++) {
		XSSFCell cell= row.createCell(k);
		cell.setCellValue(abc[j][k]);
		System.out.println(abc[j][k]+"\t");
	}
	System.out.println();
}
workbook.write(fos);
fos.close();
workbook.close();
}
}
