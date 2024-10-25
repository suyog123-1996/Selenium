package Day5.cssSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplteElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com");
		
		//get all links from page
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4"));
		System.out.println("total devices in the page "+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
//			
//			System.out.println(deviceList.get(i).getText());
			WebElement list=deviceList.get(i);
			String name=list.getText();
//			System.out.println(name);
		}
	
	
	}

}
