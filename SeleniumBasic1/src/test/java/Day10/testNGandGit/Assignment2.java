package Day10.testNGandGit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin",
				Keys.chord(Keys.CONTROL,"a"),
				Keys.chord(Keys.CONTROL,"c"));
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(Keys.CONTROL,"v");
		driver.findElement(By.className("buttonBlue")).click();
		
		//
		driver.findElement(By.className("app-navigator")).click();
		Actions action=new Actions(driver);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='app-menu']/div/div[2]/div"));
		action.moveToElement(list.get(1)).perform();
		
		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.xpath("//div[@class='app-menu']/div/div[2]/div[2]/ul/div/div/li[2]")).click();
		
		driver.findElement(By.cssSelector(".col-sm-11>div>div:nth-of-type(2)>div>nav>div>div:nth-of-type(2)>ul>li>button")).click();
		
		//create leads
		driver.findElement(By.name("firstname")).sendKeys("Happy");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		driver.findElement(By.name("mobile")).sendKeys("8975789601");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//again clickon leads
		driver.findElement(By.className("app-navigator")).click();
		WebElement list1=driver.findElement(By.xpath("//div[@class='app-menu']/div/div[2]/div[2]"));
		list1.click();
		driver.findElement(By.linkText("Leads")).click();
		//
		driver.findElement(By.name("firstname")).sendKeys("Happy",Keys.ENTER);
		
		//checkbox
		WebElement checkbox=driver.findElement(By.xpath("//td[@class='listViewRecordActions']/div/span/input"));
		checkbox.click();
		System.out.println("is check box is clickable "+checkbox.isEnabled());
//		driver.findElement(By.cssSelector(".listViewRecordActions>div>span>input")).click();
		//edit button
		driver.findElement(By.cssSelector(".listview-actions-container>div>div>div>button:nth-of-type(1)")).click();
		
		
		
		
		
		
	}

}
