package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {
  @Test
  public void firstTestNgFile() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\Documents\\Manita\\driver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  String expectedTitle="Google";
	  String actualTitle=driver.getTitle();
//webElement element=driver.findElement(By.name(name)))
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.close();
	  }
}
