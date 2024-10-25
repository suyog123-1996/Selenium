package cssValidationAndMultipleelements;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssValidationAndPosition {

	public static void main(String[] args) {
		//generic statement
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//To avoid NoSuchElementException Due to sync Use ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get the url
		driver.get("https://online.actitime.com/qk/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), "Username or Password is invalid. Please try again."));
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		//get css properties
		System.out.println("Error Message Colour is- "+errorMsg.getCssValue("color"));
		System.out.println("Errror Message Font size is- "+errorMsg.getCssValue("font-size"));
		System.out.println("Error Message Font Family Is- "+errorMsg.getCssValue("font-family"));
		
		//get coordinates of error msg
		Point errorPoint=errorMsg.getLocation();
		int error_X=errorPoint.getX();
		int error_Y=errorPoint.getY();
		System.out.println("Error msg X "+error_X);
		System.out.println("Error msg Y "+error_Y);
		
		//get coordinates for username field
		WebElement usernameInputField=driver.findElement(By.id("username"));
		Point usernamePoint=usernameInputField.getLocation();
		int username_X=usernamePoint.getX();
		int username_Y=usernamePoint.getY();
		System.out.println("Username X "+username_X);
		System.out.println("Username Y "+username_Y);
		
		System.out.println("is error msg field is displayed above username field "+(error_Y<username_Y));
		
		
	}

}
