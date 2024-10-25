package day4.browseropt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		//from afterwards in every program will use this 4 statement
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//to avoid NoSuchElelmentException due to sync we use implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/register");
		
		//thi all method will be give ans in boolean true or false
		WebElement inputFirstName=driver.findElement(By.id("FirstName"));
		//to check visisbility
		System.out.println("First Name field is displayed "+inputFirstName.isDisplayed());
		//to check given field is editable
		System.out.println("First Name field is editable "+inputFirstName.isEnabled());
		
		WebElement maleRadioButton=driver.findElement(By.id("gender-male"));
		
		//to check visisbility
		System.out.println("Male Radio Button is displayed "+maleRadioButton.isDisplayed());
		
		
		//to check given field is editable
		System.out.println("Male Radio Button is displayed "+maleRadioButton.isEnabled());
		//to check given function is selectable
		System.out.println("Male Radio Button is selectable "+maleRadioButton.isSelected());
		maleRadioButton.click();
		System.out.println("Male Radio Button is selectable after click on it  "+maleRadioButton.isSelected());
		
		//Registration button
		
		WebElement registrationButton=driver.findElement(By.id("register-button"));
		//to check visisbility
		System.out.println("Registartion Button is visisbille "+registrationButton.isDisplayed());
		//to check is enabled
		System.out.println("Registartion Button is clickable "+registrationButton.isEnabled());
		//to get name
		System.out.println("Registration Button name "+registrationButton.getAttribute("value"));
		
		//Register link
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		//to check visisbility
		System.out.println("Registration link visisbility "+registerLink.isDisplayed());
		//to check is enabled
		System.out.println("Registration link is clickable "+registerLink.isEnabled());
		//to get name
		System.out.println("Registration link name "+registerLink.getText());
		
		
	}

}
/*
 * FirstName:  
 * 	visibility- isDisplayed() 
 * 	editable - isEnabled()
 * 
 * Male radio button: visibility, clickable, by default seleted or not, after selection
 * 	visibility- isDisplayed() 
 * 	clickable - isEnabled()
 * 	selection - isSelected()
 * 
 * Registration button:
 * 	visibility- isDisplayed() 
 * 	clickable - isEnabled()
 * 	name	  - getAttribute()
 * 
 * Register link: 
 * 	visibility- isDisplayed() 
 * 	clickable - isEnabled()
 * 	name	  - getText();
 * 
 * 
 * 
 */
