package day4.browseropt;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		//generic statement
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//to open briwserr on full screen
		driver.manage().window().maximize();
		//to set browser window based on need
		driver.manage().window().setSize(new Dimension(600,700));
		//to minimize browser
		driver.manage().window().minimize();
		//to open briwserr on full screen
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).click();
		//to go back to previous page
		driver.navigate().back();
		//to goto next page
		driver.navigate().forward();
		//to move to the different url
		driver.navigate().to("https://www.google.com");
		//to refersh current page
		driver.navigate().refresh();
		
		
		
		
		
		
	}

}
