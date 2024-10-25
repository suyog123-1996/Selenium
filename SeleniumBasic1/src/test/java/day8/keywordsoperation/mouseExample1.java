package day8.keywordsoperation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseExample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");

		List<WebElement> mainList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//create an instance of actions class and pass driver instance to its constructor
		Actions action=new Actions(driver);
		
		//hover on main link
		
//		action.moveToElement(mainList.get(0)).perform();
		//when you wont find element by hover use a co-ordinates like we r using 100 as x and 0 as y
//		action.moveToElement(mainList.get(2),200,0).perform();
		
		//when you want to hover on every element
		for(int i=0;i<mainList.size();i++) {
			action.moveToElement(mainList.get(i)).perform();
			Thread.sleep(1000);
		}
		
		
	}

}
/*To perform mouse operation use the Actions Classs
 * action.moveToElement(username).doubleClick().build().perform();
 * 
 * 
 * 
 * 
 */
