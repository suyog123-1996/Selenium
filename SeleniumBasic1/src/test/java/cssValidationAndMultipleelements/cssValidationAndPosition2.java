package cssValidationAndMultipleelements;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssValidationAndPosition2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.className("buttonBlue")).click();
		
		//Errormsg
		WebElement errorMsg=driver.findElement(By.id("validationMessage"));
		//get css value
		System.out.println("Colour of error msg "+errorMsg.getCssValue("color"));
		System.out.println("Font Size of error msg "+errorMsg.getCssValue("font-size"));
		System.out.println("Font Family of error msg "+errorMsg.getCssValue("font-family"));
		//get co-ordinated of error msg
		Point errorMsgPoint=errorMsg.getLocation();
		int errorMsg_x=errorMsgPoint.getX();
		int errorMsg_y=errorMsgPoint.getY();
		System.out.println("x co-ordinates of error msg "+errorMsg_x);
		System.out.println("y co-ordinates of error msg "+errorMsg_y);
		
		//get co-ordinates of username
		WebElement username=driver.findElement(By.id("username"));
		
		Point usernamePoint=username.getLocation();
		int username_x=usernamePoint.getX();
		int username_y=usernamePoint.getY();
		System.out.println("x co-ordinates of username "+username_x);
		System.out.println("y co-ordinates of username "+username_y);
		
		System.out.println("is error msg is abover the username? "+(errorMsg_y<username_y));
		
		
	}

}
