package selniumexample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotExample {
@Test
public void takeScreenShot() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//we can call screenShot method multiple times(ScreenShotExample.takescreenShot(driver);
	driver.get("http://www.google.com");
	// Take screenshot and store as a file format
	 TakesScreenshot scrshot=(TakesScreenshot)driver;
	 File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
	 try {
		 FileUtils.copyFile(srcfile, new File("C:/Siva/2018/screenshot.jpg"));
		// FileUtils.copyFile(srcfile, new File("C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\screenshot\\error.jpg"));
		 //FileUtils.copyFile(srcfile, new File("C:/Siva/2018/"+System.currentTimeMillis()+".jpg"));                              } catch (IOException e)
		 
	 }catch (IOException e)
	 {
		  System.out.println(e.getMessage());
		 
		 }
	 //driver.close();
}
}
