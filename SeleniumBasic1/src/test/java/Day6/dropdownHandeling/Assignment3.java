package Day6.dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/qk/login.do");
		// current title
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		// expected Title
		String expectedTitle = "actiTIME - Login";
		// Validate login Page
		System.out.println("Is login page name is same "+currentTitle.equals(expectedTitle));
				
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();
		
		//validate home page
		String currentUrl=driver.getCurrentUrl();
		
		String expectedUrl="actitime.com";
		
		System.out.println("Is home page is visisble "+currentUrl.contains(expectedUrl));
		
		
		
		
		//task
		driver.findElement(By.linkText("Tasks")).click();//creating task
		//add new 
		driver.findElement(By.className("addNewButton")).click();
		//for New Task
		driver.findElement(By.cssSelector(".addNewMenu>div:nth-of-type(3)")).click();		//1st dropdown
		driver.findElement(By.cssSelector(".customerOrProjectSelector>div>div>div:nth-of-type(3)")).click();
		
		//select first dropdown as bigbang
		driver.findElement(By.cssSelector(".selectCustomerRow>td>div>div>div:nth-of-type(2)>div>div>div>div:nth-of-type(5)")).click();
		//2nd dropdown
		driver.findElement(By.cssSelector(".selectProjectRow >td>div>div>div>div:nth-of-type(3)")).click();
		//select second dropdown as Spaceship building
		driver.findElement(By.cssSelector(".selectProjectRow>td>div>div>div:nth-of-type(2)>div>div>div>div:nth-of-type(4)")).click();
		//Task1
		WebElement task=driver.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>*:first-child>input[placeholder='Enter task name']"));
		task.sendKeys("Lunar 1");
		//checkbox
		driver.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>td:nth-of-type(6)>label>*:last-child")).click();
		//Create button 
		driver.findElement(By.cssSelector(".basicLightboxFooter>div:nth-of-type(2)>div>div>*:first-child")).click();
		//delete check box
		driver.findElement(By.cssSelector(".createdTasksRowsTable>tbody>tr>td>div>.img")).click();
		//delete button
		driver.findElement(By.cssSelector(".content>div>.content>div>div:nth-of-type(6)")).click();
		//Confirm Delete button
		driver.findElement(By.cssSelector(".content>.operationConfirmDialog>*:first-child>.buttonsContainer>div>.buttonIcon>.submitTitle")).click();
		//search for the deleted task
		driver.findElement(By.className("components-SearchInput-searchInput--dlqxQrkh")).sendKeys("Lunar 1");
		
		driver.findElement(By.id("logoutLink")).click();
		
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