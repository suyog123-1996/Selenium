package day4.browseropt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//to avoid NoSuchElelmentException due to sync we use implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/login");
		
		//validate Email
		WebElement email=driver.findElement(By.id("Email"));
		System.out.println("Email is displayed "+email.isDisplayed());
		//is email editable
		System.out.println("Email is Editable "+email.isEnabled());
		
		//validate password
		WebElement password=driver.findElement(By.id("Password"));
		System.out.println("password is displayed "+password.isDisplayed());
		//is email editable
		System.out.println("Password is editable "+password.isEnabled());
		
		//Remember me check box
		WebElement rememberMe=driver.findElement(By.id("RememberMe"));
		//validate Remember me check box
		System.out.println("Remember me check box is Display "+rememberMe.isDisplayed());
		
		//Remember me check box is Clickable
		System.out.println("Remember me check box is selected "+rememberMe.isSelected());
		rememberMe.click();
		System.out.println("Remember me check box is selected after click on it "+rememberMe.isSelected());
		
		//Login button
		WebElement loginButton=driver.findElement(By.className("login-button"));
		//Login button is visible
		System.out.println("LogIn Button is Displayed "+loginButton.isDisplayed());
		//LogIn Button is clickable
		System.out.println("LogIn Button is Clickable "+loginButton.isEnabled());
		//name of login button
		System.out.println("Login Button name is - "+loginButton.getAttribute("value"));
		
		//searchButton
		WebElement searchButton=driver.findElement(By.className("search-box-button"));
		//validate searchButton
		System.out.println("Search button is displayed "+searchButton.isDisplayed());
		//search Button is clickable
		System.out.println("search button is clickable "+searchButton.isEnabled());
		//name of SearchButton
		System.out.println("name of search button is - "+searchButton.getAttribute("value"));
		
		
		
	}

}
/*
 * Basic validation
 * Email
  		-visibility-isDisplay()
  		-editable-IsEnable()
 * password
   		-visibility-isDisplay()
  		-editable-isEnable()
 * Remember me check box
 		-visibility-isDisplay()	
 		-Clickable-isEnable()
 * Login button
 		-visibility-isDisplay()	
 		-Clickable-isEnable()
  		-name-getAttribute()
 * Search button
 * 		-vsisbility-isDisplay()
 * 		-Clickable-isEnable()
 * 		-name-getAttribute()
 */
