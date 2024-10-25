package Day6.dropdownHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class stdDropdown {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
	
		//Step1-Identify Required Dropdown
		WebElement dropdown=driver.findElement(By.id("Skills"));
		//step2-create instance of select class and pass above dropdown in its constructor
		Select select=new Select(dropdown);
		//now you can perforn anyn required operations
		System.out.println("Is dropdown allow to select a multiple option "+select.isMultiple());
		
		System.out.println("Default value is displayed in dropdown "+select.getFirstSelectedOption().getText());
		
		List<WebElement> dropdownList=select.getOptions();
		System.out.println("List count is "+dropdownList.size());
		
		for(WebElement a:dropdownList) {
			System.out.println(a.getText());
		}
		//select options
		//BY Index
		select.selectByIndex(0);
		
		
		System.out.println("Option is selected from index1 "+select.getFirstSelectedOption().getText());
		//By value
		Thread.sleep(1000);
		select.selectByValue("Client Support");
		System.out.println("Option is selected by value "+select.getFirstSelectedOption().getText());
//		By visible text
		Thread.sleep(1000);
		select.selectByVisibleText("Corel Draw");
		System.out.println("Option selected using visible text "+select.getFirstSelectedOption().getText());
	}

}
