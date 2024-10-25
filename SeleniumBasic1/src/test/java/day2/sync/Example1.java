package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to avoid no NoSuchElementException which is coming due to sync we will use Implicit wait
		//best practise says to write a implicit wait before starting the program
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();//is not login to the page
//		driver.findElement(By.className("oxd-button")).click();//user log into the page
//		driver.findElement(By.className("oxd-button--medium")).click();//user log into the page
//		driver.findElement(By.className("oxd-button--main")).click();//user log into the page
//		driver.findElement(By.className("orangehrm-login-button")).click();//user log into the page
		
		//to validate home page
		String CurrentUrl=driver.getCurrentUrl();
		String ExpextedUrl="index";
		
		System.out.println("Is login Successfull?"+CurrentUrl.contains(ExpextedUrl));

	
	}

}
