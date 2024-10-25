package Day7.XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/samsung-mobile-store?");
		
		WebElement price=driver.findElement(By.xpath("//div[text()='₹6,499']"));
		
		String Samsung=price.getText();
		System.out.println(Samsung);
		
		
		
		
		
	}

}
