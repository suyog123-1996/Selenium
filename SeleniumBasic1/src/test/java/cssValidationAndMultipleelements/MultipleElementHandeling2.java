package cssValidationAndMultipleelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//i think experiment has been failed
public class MultipleElementHandeling2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		
		//get all links from page
		List<WebElement> linklist=driver.findElements(By.tagName("div"));
		System.out.println("total links are "+linklist.size());
		for(int i=0;i<linklist.size();i++) {
			WebElement element=linklist.get(i);
			String attribute=element.getAttribute("class");
			System.out.println(attribute);
		}
		
		
		
	}

}
