package selniumexample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		// Store and Print the name of the First window on the console
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		// Click on the Button "New Message Window"
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
		// Store and Print the name of all the windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		// Pass a window handle to the other window
		if(handles.size()>1) {
		for (String handle1 : handles) {
			if(!handle.equals(handle1)) {
				//switch to child window.
			driver.switchTo().window(handle1);
			System.out.println(handle1);
			
			// closing  child window
			driver.close();
			// closing original window 
			//driver.quit();
			}
		}
		}

	}

}
