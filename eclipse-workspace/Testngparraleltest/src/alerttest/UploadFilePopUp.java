package alerttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilePopUp {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\mmpan\\Documents\\Manita\\sampletesting.htm");
	}

}
