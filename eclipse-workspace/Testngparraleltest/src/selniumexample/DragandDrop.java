package selniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

	@Test
	public void dragAndDrop() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		//element need to drag
	WebElement element=	driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	//elements need to drop
	WebElement element1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	//Action classes for this action
	Actions action=new Actions(driver);
	//Dragged and dropped
	action.dragAndDrop(element, element1);
	driver.quit();
		

	}

}
