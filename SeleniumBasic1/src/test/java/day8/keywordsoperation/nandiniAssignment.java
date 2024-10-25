package day8.keywordsoperation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nandiniAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		Actions action=new Actions(driver);
	List<WebElement> menulist=	driver.findElements(By.cssSelector(".emupdz>*>div>div>span>span"));
	System.out.println("count of menulist="+menulist.size());
	action.moveToElement(menulist.get(0)).perform();
	for(int i=0;i<menulist.size();i++) {
		action.moveToElement(menulist.get(i)).perform();
		
		WebElement menu=menulist.get(i);
		String menuNames=menu.getText();
		System.out.println( menuNames);
		}

	}

}
