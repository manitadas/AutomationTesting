package selniumexample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownBox {
@Test
public static void dropdownExample(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.geodatasource.com/");
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[3]/a")).click();
	WebElement countryCode=driver.findElement(By.xpath("//*[@id=\"countryCode\"]"));
	Select selectCountry=new Select(countryCode);
	selectCountry.selectByVisibleText("Angola");
	
}
}
