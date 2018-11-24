package selniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchAlert {
 public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("alert")).click();
		// Switch to JavaScript Alert window
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		driver.close();
	}

}
