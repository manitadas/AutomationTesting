package alerttest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php/");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Thread.sleep(2000);
		String mainWindow=driver.getWindowHandle();;
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> itr=handler.iterator();
		while(itr.hasNext()) {
			String ChildWindow=itr.next();
			//mainWindow=itr.next();
			if(!mainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			//String msg=	driver.findElement(By.xpath("//td[@colspan='2']//h2")).getText();
				//System.out.println(msg);
				driver.findElement(By.name("emailid"))
                .sendKeys("mmpanigrahi@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
				
			}
			
		}
		
		driver.switchTo().window(mainWindow);
		driver.close();
	}

}
