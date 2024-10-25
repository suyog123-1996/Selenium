package Day5.cssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com");
		//for username
//		WebElement username=driver.findElement(By.cssSelector(".orangehrm-login-slot>div:nth-of-type(2)>*:first-child>*:first-child>p"));
		
		WebElement username=driver.findElement(By.cssSelector(".orangehrm-login-slot>div:nth-of-type(2)>div:nth-of-type(1)>*:first-child>*:first-child"));
		String user=username.getText();
		System.out.println(user);
		
		String[] strUser=user.split(" ", 3);
		for (int i=0;i<strUser.length;i++) {
			
			if (i==2) {
				System.out.println(strUser[i]);
				driver.findElement(By.name("username")).sendKeys(strUser[i]);
			}
		}
		//for password
		WebElement password=driver.findElement(By.cssSelector(".orangehrm-login-slot>div:nth-of-type(2)>*:first-child>*:first-child>*:last-child"));
		String pass=password.getText();
		System.out.println(pass);
	
		String[] strPass=pass.split(" ",3);
		for (int i=0;i<strPass.length;i++) {
			
			if(i==2) {
				System.out.println(strPass[i]);
				driver.findElement(By.name("password")).sendKeys(strPass[i]);
			}
			
		}
		//for login
		driver.findElement(By.className("orangehrm-login-button")).click();
	
	
	
	
	
	}

}
