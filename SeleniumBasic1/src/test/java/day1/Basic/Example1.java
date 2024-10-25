package day1.Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Example1 {
	static public void main(String[]arr) {
		
		//Create an instance for required browser class and upcast it to webdriver interface
		WebDriver driver = new ChromeDriver();
		//enter applovation  url
		//driver.get("www.google.com");
		
		driver.get("https://www.google.com");
		//Get application title
		String actualAppTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("App Title is "+actualAppTitle );
		System.out.println("number of character in title "+actualAppTitle.length());
		
		System.out.println("Is google searched opened? "+actualAppTitle.equals(expectedTitle));
		//get url
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="www.google.com";
		System.out.println("Current Url "+actualUrl);
		System.out.println("Is Current URL is matched with Expected?"+actualUrl.contains(expectedUrl));
		
		//to get current page source
		String pageSource=driver.getPageSource();
		System.out.println("page source length "+pageSource.length());
		
		
		driver.close();
		
		
		
		
	}
}
