package selniumexample;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	
		// TODO Auto-generated method stub
public static List<WebElement> findAllLinks(WebDriver driver) {
	List<WebElement> elementList=new ArrayList<>();
	elementList = driver.findElements(By.tagName("a"));
	elementList.addAll(driver.findElements(By.tagName("img")));
	List<WebElement> finalList = new ArrayList<>();
	for (WebElement element : elementList) {
		if(element.getAttribute("href") != null) {
			finalList.add(element);
		}
			 
	}return finalList;
	
 
}
public static String isLinkBroken(URL url) throws Exception{
	String response = "";
	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	try {
		connection.connect();
		response = connection.getResponseMessage();
		connection.disconnect();
		return response;
	}catch(Exception e) {
		return e.getMessage();
	}
}
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmpan\\eclipse-workspace\\Testngparraleltest\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	List<WebElement> allImages = findAllLinks(driver);
	System.out.println("Total number of elements found " + allImages.size());
	 for( WebElement element : allImages){
		 try {
			 System.out.println("URL: " + element.getAttribute("href")+ " returned "
		 + isLinkBroken(new URL(element.getAttribute("href"))));

		 }catch(Exception e) {
			 System.out.println("At " + element.getAttribute("innerHTML") 
			 + " Exception occured -&gt; " + e.getMessage());	    		
		 }
	 }

}
}
