package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to avoid no NoSuchElementException which is coming due to sync we will use Implicit wait
		//best practise says to write a implicit wait before starting the program
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/qk/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
	
		driver.findElement(By.id("loginButton")).click();//user log into the page
		String ExpectedTitle="actiTIME - Enter Time-Track";
		//implement conditional wait to wait till required page title is not getting displayed with in given timeout
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		Wait.until(ExpectedConditions.titleIs(ExpectedTitle));
		String CurrentTitle=driver.getTitle();
		System.out.println("After Login Current Title  is "+CurrentTitle);
		Wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		driver.findElement(By.id("logoutLink")).click();
		
		System.out.println("Is login Successfull?"+CurrentTitle.contains(ExpectedTitle));
		driver.close();

	
	}

}
