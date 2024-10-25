package Day10.testNGandGit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		driver.findElement(By.cssSelector(".oxd-sidepanel-body>ul>li:nth-of-type(2)")).click();
		//create Employeee
		driver.findElement(By.cssSelector(".orangehrm-paper-container>div>button")).click();
		//firstname
		driver.findElement(By.name("firstName")).sendKeys("Munna");
		driver.findElement(By.name("lastName")).sendKeys("Tripathi");
		WebElement id=driver.findElement(By.cssSelector(".oxd-form-row>div:nth-of-type(2)>div>div>div:nth-of-type(2)>input"));
		id.clear();
		Thread.sleep(2000);
		id.sendKeys("007");
		driver.findElement(By.className("oxd-button--secondary")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		//update pim
		driver.findElement(By.cssSelector(".oxd-form-row>div>*:first-child>div>div:nth-of-type(2)>div>div>input")).sendKeys("Munna");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.findElement(By.cssSelector(".oxd-table-cell-actions>button>i")).click();
		
		driver.findElement(By.className("orangehrm-middlename")).sendKeys("Akhandanand");
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
