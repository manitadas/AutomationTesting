package edu.wbl.testngpriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngPriority {
WebDriver driver;
//Method 1: Open Browser say Firefox.
@Test(priority=1)
public void openBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmpan\\Documents\\Manita\\driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	
}
//Method 2: Launch Google.com
@Test(priority=2)
public void launchGoogle() {
	driver.get("https://www.google.com/");
}
//Method 3: Perform a search using "Facebook"
@Test(priority=3)
public void performSearchAndClick1stLink() {
	driver.findElement(By.xpath(" //input[@id='lst-ib']")).sendKeys("facebook");
}
//Method 4: Verify Google search page title.	
@Test(priority=4)
public void FaceBookPageTitleVerification() throws Exception{
	driver.findElement(By.xpath("	//input[@value='Google Search']")).click();
	Thread.sleep(2000);
	boolean actual=driver.getTitle().contains("Facebook -Google Search");
	//boolean expected=true;
	Assert.assertEquals(actual,false);
			
}
}
