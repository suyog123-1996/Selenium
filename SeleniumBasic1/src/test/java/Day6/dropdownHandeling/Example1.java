package Day6.dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
//		driver.get("https://demowebshop.tricentis.com/customer/orders");
		
		// for Email
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		// For PAssword
		driver.findElement(By.id("Password")).sendKeys("Abc@12345");
		// for login
		driver.findElement(By.className("login-button")).click();
		// click on book field
//		driver.findElement(By.linkText("BOOKS")).click();
		
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.linkText("Computers")).click();
	}

}
