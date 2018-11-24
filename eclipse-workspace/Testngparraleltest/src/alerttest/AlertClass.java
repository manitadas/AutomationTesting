package alerttest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//Handle javascript alert and popup.
public class AlertClass {
	public static void main(String[]args) throws InterruptedException {
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.name("proceed")).click();
Thread.sleep(2000);
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
String text=alert.getText();
if(text.equals("Please enter a valid user name")){
	System.out.println("correct alert message");
}
else
{
	System.out.println("incorrect alert message");
}
alert.accept();
//alert.dismiss();
	}


}
