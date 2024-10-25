package Day6.dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownHandeling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
//		driver.findElement(By.id("bsd1-button")).click();
		
		driver.findElement(By.cssSelector(".btn-primary")).click();

		//identify suggestion
//		List<WebElement>=driver.fi
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
