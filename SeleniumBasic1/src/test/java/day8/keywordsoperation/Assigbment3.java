package day8.keywordsoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigbment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		
		driver.findElement(By.id("number1Field")).sendKeys("10",
								 Keys.chord(Keys.CONTROL,"a"),
								 Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.id("number2Field")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		driver.findElement(By.id("selectOperationDropdown")).click();
		
		driver.findElement(By.id("calculateButton")).click();
		
		WebElement answer=driver.findElement(By.id("numberAnswerField"));
		String ans =answer.getText();
		int integer=Integer.valueOf(ans);
		System.out.println(integer);
		
		
		
	}

}
