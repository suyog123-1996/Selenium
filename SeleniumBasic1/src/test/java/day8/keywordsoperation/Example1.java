package day8.keywordsoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/ibm/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
													  
		Thread.sleep(1000);
		//to refresh the page use F5
		driver.findElement(By.name("pwd")).sendKeys(Keys.F5);
	}

}
