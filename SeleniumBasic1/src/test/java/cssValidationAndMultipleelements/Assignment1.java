package cssValidationAndMultipleelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("register-button")).click();
		
		
		//For First Name error
		WebElement firstNameError=driver.findElement(By.className("field-validation-error"));
		//get css value
		System.out.println("First name error msg colour is- "+firstNameError.getCssValue("color"));
		System.out.println("First name error msg font size is- "+firstNameError.getCssValue("font-size"));
		System.out.println("First name error msg font family is- "+firstNameError.getCssValue("font-family"));
		
		//get coordinates of first name error
		Point firstNamePoint=firstNameError.getLocation();
		
		int error_x=firstNamePoint.getX();
		
		System.out.println("x co-ordinates of first name error msg "+error_x);
		
		//cooordinates of first name
		WebElement firstNameField=driver.findElement(By.id("FirstName"));
		Point firstname=firstNameField.getLocation();
		int firstName_x=firstname.getX();
		
		System.out.println("x co-ordinates of first name "+firstName_x);
		
		System.out.println("Is error msg is on right side of the first name field? "+(firstName_x<error_x));
	
		
		
		
		
		//For Last Name Field error
		WebElement lastNameErrorMsg=driver.findElement(By.className("field-validation-error"));
		//get css value
		System.out.println("last name error msg colour is- "+ lastNameErrorMsg.getCssValue("color"));
		System.out.println("last name error msg font size is- "+ lastNameErrorMsg.getCssValue("font-size"));
		System.out.println("last name error msg font family is- "+ lastNameErrorMsg.getCssValue("font-family"));
		
		//get co-ordinates of last name  error
		Point lastNameerrorPoint=lastNameErrorMsg.getLocation();
		int lastNameError_x=lastNameerrorPoint.getX();
		
		System.out.println("x co-ordinates of last name error is "+lastNameError_x);
		
		//get co-ordinates of last name field
		WebElement lastNameField=driver.findElement(By.id("LastName"));
		Point lastNamePoint=lastNameField.getLocation();
		int lastName_x=lastNamePoint.getX();
		
		System.out.println("x co-ordinates of last name field is "+lastName_x);
		
		System.out.println("Is error msg is on right side of the Last name field? "+(lastName_x<lastNameError_x));
		
		//for Email error
		WebElement emailError=driver.findElement(By.className("field-validation-error"));
		//get css value
		System.out.println("Email error msg colour is- "+ emailError.getCssValue("color"));
		System.out.println("Email error msg font size is- "+ emailError.getCssValue("font-size"));
		System.out.println("Email error msg font family is- "+ emailError.getCssValue("font-family"));
		//get email coordinates 
		Point emailErrorPoint=emailError.getLocation();
		int emailError_x=emailErrorPoint.getX();
		
		System.out.println("x co-ordinates of last name field is "+emailError_x);
		
		
		//Email field
		WebElement emailField=driver.findElement(By.id("Email"));
		
		Point emailFieldPoint=emailField.getLocation();
		int emailField_x=emailFieldPoint.getX();
		
		System.out.println("x co-ordinates of last name field is "+emailField_x);

		System.out.println("Is error msg is on right side of the Email field? "+(emailField_x<emailError_x));
		
		//password field error
		WebElement passwordError=driver.findElement(By.className("field-validation-error"));
		//get css value
		System.out.println("Email error msg colour is- "+ passwordError.getCssValue("color"));
		System.out.println("Email error msg font size is- "+ passwordError.getCssValue("font-size"));
		System.out.println("Email error msg font family is- "+ passwordError.getCssValue("font-family"));
		//get password error co-ordinates
		Point passwordErrorPoint=passwordError.getLocation();
		int passwordError_x=passwordErrorPoint.getX();
		
		System.out.println("x co-ordinate of password error "+passwordError_x);
		
		//password field
		WebElement passwordField=driver.findElement(By.id("Password"));
		Point passwordPoint=passwordField.getLocation();
		int password_x=passwordPoint.getX();
		System.out.println("x co-ordinate of password field "+password_x);
		System.out.println("is error msg is on right side of the Email field? "+(password_x<passwordError_x));
		
		//confirm Password Error
		
		WebElement confirmPasswordError=driver.findElement(By.className("field-validation-error"));
		//get css value
		System.out.println("Email error msg colour is- "+ confirmPasswordError.getCssValue("color"));
		System.out.println("Email error msg font size is- "+ confirmPasswordError.getCssValue("font-size"));
		System.out.println("Email error msg font family is- "+ confirmPasswordError.getCssValue("font-family"));
		//get confirm password  co-ordinates
		int confirmpasswordError_x=passwordErrorPoint.getX();
		
		System.out.println("x co-ordinate of password error "+confirmpasswordError_x);

		//get confirm password  co-ordinates
		WebElement confirmPassword=driver.findElement(By.id("ConfirmPassword"));
		Point confirmPasswordPoint=confirmPassword.getLocation();
		int confirmPassword_x=confirmPasswordPoint.getX();
		System.out.println("x co-ordinate of password field "+confirmPassword_x);
		System.out.println("is error msg is on right side of the Email field? "+(confirmPassword_x<confirmpasswordError_x));
		
	}

}
