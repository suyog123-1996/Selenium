package Day7.XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");

		//register
		driver.findElement(By.xpath("//html/body/div[4]/div/div/div/div/ul/li/a")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Suyog");
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Chiwande");
		
		
		
	}

}
