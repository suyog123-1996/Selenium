package day1.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver cdriver=new ChromeDriver();
		
		cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//this method is not working so need to store in webelement
		//cdriver.findElement(By.id("username")).clear().sendKeys();
		//store in web element
		String currentUrl=cdriver.getCurrentUrl();
		System.out.println("Curent url is "+currentUrl);
		String currentTitle=cdriver.getTitle();
		System.out.println("Current title is .+currentTitle");
		WebElement username=cdriver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password=cdriver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("admin");
		
		cdriver.findElement(By.tagName("button")).click();
		String expectedUrl="vtigercrm";
		System.out.println("is login page open?"+currentUrl.contains(expectedUrl));
		String expectedTitle="vtiger";
		System.out.println("is title matched "+currentTitle.contains(expectedTitle));
		
		
		
	}

}
