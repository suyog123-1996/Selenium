package day1.Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ActiTimeLogIn {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/qk/login.do");
		//first identify the user before you perform the operation on it
		WebElement usernameInputField=driver.findElement(By.id("username"));
		//perform required operation like username as admin01 
		
		usernameInputField.sendKeys("admin01");
		//first identify the password before you perform the operation on it
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		//perform required operation like password as admin01 
		
		passwordInputField.sendKeys("admin01");
		
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		loginButton.click();
		
		driver.close();
	
	
	
	}

}
