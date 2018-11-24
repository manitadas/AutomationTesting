package alerttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://username:password@mail.rediff.com/cgi-bin/login.cgi/basic_auth");
		//String playMessage=driver.findElement(By.cssSelector("p)).getText();
		//System.out.println(playMessage);
	}

}
