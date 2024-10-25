package Day5.cssSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		WebElement link=driver.findElement(By.linkText("SAMSUNG"));
		link.click();
		//get all link list
		List<WebElement> list=driver.findElements(By.cssSelector(".makers>ul>li>a"));
		
		System.out.println("total devices in this page "+list.size());
		for(int i=0;i<list.size();i++) {
			WebElement linkList=list.get(i);
			String name=linkList.getText();
			System.out.println(name);
			
			
		}
	
	
	
	}

}
