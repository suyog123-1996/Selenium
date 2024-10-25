package Day7.XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		
		WebElement price=driver.findElement(By.xpath("//h5[text()='$320']"));
		
		String price1=price.getText();
		System.out.println(price1);
		
	}

}
