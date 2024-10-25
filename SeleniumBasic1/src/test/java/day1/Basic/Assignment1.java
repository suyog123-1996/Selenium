package day1.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) {
		//launch firefox browser
		WebDriver fdriver= new FirefoxDriver();
		//get the url
		fdriver.get("https://demowebshop.tricentis.com/login");
		//get the title with the getTitle() and storee it in string
		String titleName=fdriver.getTitle();
		System.out.println("Title name "+titleName +" |Title Length " +titleName.length());
		//get actual url and store it in a ref
		String actualUrl=fdriver.getCurrentUrl();
		//Print ActualUrl
		System.out.println("Actual URL "+actualUrl);
		//Write a expected url
		
		String expextedUrl="demowebshop.tricentis.com/login";
		//compare both actual and expected url with the help of contains method
		System.out.println("Is actual url and expected url is same? "+actualUrl.contains(expextedUrl));
		//find element/Email with help of locator and write in it with the help of sendKeys method
		fdriver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		//find element/Password with help of locator and write in it with the help of sendKeys method
		fdriver.findElement(By.id("Password")).sendKeys("Abc@12345");
		
		//find the login button and click on it
		fdriver.findElement(By.className("login-button")).click();
		
		fdriver.findElement(By.className("ico-logout")).click();
		
		fdriver.close();
		
		
		
		
	}

}
