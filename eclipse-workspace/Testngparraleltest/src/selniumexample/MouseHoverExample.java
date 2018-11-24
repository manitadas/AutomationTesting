package selniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverExample {
@Test
public static void mouseHoverAction() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://timeanddate.com");
	System.out.println(driver.getTitle());
	WebElement menu=driver.findElement(By.xpath("//*[@id=\"navMenu\"]/li[4]/a[2]"));
	WebElement subMenu=driver.findElement(By.xpath("//*[@id=\"navMenu\"]/li[4]/ul/li[1]/a"));
	Actions action=new Actions(driver);
	action.moveToElement(menu).build().perform();
	action.moveToElement(subMenu).click().perform();
	driver.close();
	
	
	
}
}
