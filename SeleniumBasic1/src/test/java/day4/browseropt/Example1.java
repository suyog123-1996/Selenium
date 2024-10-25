package day4.browseropt;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com");
	//to maximize the browser
	driver.manage().window().maximize();
	//click on registration
	driver.findElement(By.className("ico-register")).click();
	//come back to home page and get the title
	driver.navigate().back();
	System.out.println("Current Title "+driver.getTitle());
	//goto registration page again
	driver.findElement(By.className("ico-register")).click();
	// enter firstname 
	driver.findElement(By.id("FirstName")).sendKeys("Suyog");
	//reload the page
	driver.navigate().refresh();
	//navigate to login page
	driver.navigate().to("https://demowebshop.tricentis.com/login");
	
	
		
	}

}
/*
 * open https://demowebshop.tricentis.com/
 * maximize browser window
 * click on registration
 * come back to home page and get the title
 * goto registration page again
 * enter firstname 
 * reload the page
 * navigate to login page
 */
