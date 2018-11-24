package filehandlingExample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileEx {
	public static void main(String[]args) throws IOException {
		File file=new File("C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\Resource\\filehandling.properties");
		FileReader reader=new FileReader(file);
		Properties prop= new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("excelpath"));
		
	}
}
