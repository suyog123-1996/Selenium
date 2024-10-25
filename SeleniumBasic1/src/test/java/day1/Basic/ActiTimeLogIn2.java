package day1.Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ActiTimeLogIn2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/qk/login.do");
		
		//If you need a element once then no need to store in WebElement
		//first find the element and perform the operation username as admin01
		driver.findElement(By.id("username")).sendKeys("admin01");
	
		
		//first identify the password and perform required operation like password as admin01 
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		
		driver.findElement(By.id("loginButton")).click();
		
		
		
		driver.close();
	
	
	
	}

}
