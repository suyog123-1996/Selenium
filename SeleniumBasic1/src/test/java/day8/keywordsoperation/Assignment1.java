package day8.keywordsoperation;

import java.net.MulticastSocket;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		
		List<WebElement> mainList=driver.findElements(By.cssSelector(".emupdz>*>div>div>span>span"));
		Actions action=new Actions(driver);
		
		action.moveToElement(mainList.get(3)).perform();
//		WebElement name=mainList.get(3);
//		String name1=name.getText();
//		System.out.println(name1);
	
		for(int i=0;i<mainList.size();i++) {
			action.moveToElement(mainList.get(i)).perform();
			WebElement names=mainList.get(i);
			String listName=names.getText();
			System.out.println(listName);
		}
	
	}

}
