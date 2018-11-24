package alerttest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserwindowPopUp {
//Alert pop up-alert api(accept.dismiss)
	//upload file pop up(type=file,sendkeys)
	//browser window popup(wnindowHandle Api-getwindowhandles
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html/");
		driver.findElement(By.xpath("//a[@class='black']")).click();
		Thread.sleep(2000);
		Set<String>handle=driver.getWindowHandles();
		Iterator<String> itr=handle.iterator();
		String parentWindowId=itr.next();
		System.out.println("ParentWindowid is"+parentWindowId);
		String childWindowId=itr.next();
		System.out.println("Child window is "+childWindowId);
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window popup"+ driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window popup"+driver.getTitle());
		driver.close();
		
	}

}
