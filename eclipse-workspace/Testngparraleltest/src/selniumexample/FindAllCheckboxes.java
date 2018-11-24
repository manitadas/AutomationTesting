package selniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllCheckboxes {
//Find total number of Checkboxes on a Webpage :


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		List<WebElement> checkboxes=driver.findElements(By.id("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		/*for(int i=1;i<=checkboxes.size();i++) {
			System.out.println();*/
		//}
//Find total number of Menus on a Webpage :
		//list <WebElement> dropdown = driver.findElements(By.tagName("select")); 
		//System.out.println(dropdown.size());
		
		//Find total number of TextBoxes on a Webpage :

//List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
		//System.out.println(textboxes.size());

	}

}
