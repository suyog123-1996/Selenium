package cssValidationAndMultipleelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		//genric statement
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("register-button")).click();
		
		WebElement firstNameError=driver.findElement(By.className("field-validation-error"));
		//get css value
		System.out.println("Colour of error msg is "+firstNameError.getCssValue("color"));
		System.out.println("Font size of error msg is "+firstNameError.getCssValue("font-size"));
		System.out.println("Font family of error msg is "+firstNameError.getCssValue("font-family"));
		//to get co-ordinates of error msg
		Point errorMsgPoint=firstNameError.getLocation();
		int errorMsg_x=errorMsgPoint.getX();
		int errorMsg_y=errorMsgPoint.getY();
		System.out.println("x co-ordinate of error msg "+errorMsg_x);
		System.out.println("y co-ordinate of error msg "+errorMsg_y);
		
		//First name
		WebElement firstName=driver.findElement(By.id("FirstName"));
		
		Point firstNamePoint=firstName.getLocation();
		int FirstName_x=firstNamePoint.getX();
		int FirstName_y=firstNamePoint.getY();
		System.out.println("x co-ordinate of FirstName "+FirstName_x);
		System.out.println("y co-ordinate of FirstName "+FirstName_y);
		//compare both x cordinate for result
		System.out.println("Is error msg is on right side of the first name field? "+(FirstName_x<errorMsg_x));
		
		//Last Name Field
		WebElement lastName=driver.findElement(By.id("LastName"));
		
		Point lastNamePoint=lastName.getLocation();
		int lastname_x=lastNamePoint.getX();
		int lastname_y=lastNamePoint.getY();
		System.out.println("x co-ordinate of Last Name "+lastname_x);
		System.out.println("y co-ordinate of Last Name "+lastname_y);
		
		System.out.println("Is first name field is above of last name? "+(FirstName_y<lastname_y));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
