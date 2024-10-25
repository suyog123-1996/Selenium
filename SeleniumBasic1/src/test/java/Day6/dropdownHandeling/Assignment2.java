package Day6.dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://online.actitime.com/qk/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();

		// task
		driver.findElement(By.linkText("Tasks")).click();
		// add new
		driver.findElement(By.className("addNewButton")).click();
		// for New Task
		driver.findElement(By.cssSelector(".addNewMenu>div:nth-of-type(3)")).click();
		// 1st dropdown
		driver.findElement(By.cssSelector(".customerOrProjectSelector>div>div>div>div")).click();

		// select first dropdown as bigbang
		
		driver.findElement(By.cssSelector(".selectCustomerRow>td>div>div>div:nth-of-type(2)>div>div>div>div:nth-of-type(3)")).click();
				
		// 2nd dropdown
		driver.findElement(By.cssSelector(".selectProjectRow >td>div>div>div>div:nth-of-type(3)")).click();
		// select second dropdown as Spaceship building
		
		driver.findElement(By.cssSelector(".selectProjectRow>td>div>div>div:nth-of-type(2)>div>div>div>div:nth-of-type(5)")).click();
				
		// Task1
		driver.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>*:first-child>input[placeholder='Enter task name']")).sendKeys("Task1");
		
		
	}

}
/*

Task2:
Open browser
enter actitime url
validate login page
enter username and password
click on login button
validate Home page 
click Task tab
select "New Task " from "Add New"  button
Fill the required details and click create task button
validate new task is created or not
select newly created task
click delete link
Once task is deleted again validate it whether task is deleted or not
logout from the application and close the browser
*/