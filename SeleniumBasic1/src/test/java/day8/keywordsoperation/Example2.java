package day8.keywordsoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/ibm/login.do");
		//perform operation with the help of keyboard operation
		//type username as "admin01" and copied it 
		driver.findElement(By.id("username")).sendKeys("admin01",
													  Keys.chord(Keys.CONTROL,"a"),
													  Keys.chord(Keys.CONTROL,"c"));
		//paste the copied value and enter the button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),
													Keys.ENTER);
	}

}
