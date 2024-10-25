package Day5.cssSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Books")).click();
		
//		List<WebElement> bookLink=driver.findElements(By.cssSelector("html>body>div:nth-of-type(4)>*:first-child>div:nth-of-type(4)>*:nth-child(2)>*:nth-child(2)>*:nth-child(2)>*:nth-child(3)>*:first-child>*:first-child>div:nth-of-type(2)>h2>a"));
		
		List<WebElement> bookLink=driver.findElements(By.cssSelector(".item-box>.product-item>div:nth-of-type(2)>h2>a"));
		List<WebElement> bookPrice=driver.findElements(By.cssSelector(".item-box>.product-item>div:nth-of-type(2)>div:nth-of-type(3)>*:first-child"));
		System.out.println("Total number of books are "+bookLink.size());
		
		for(int i=0;i<bookLink.size();i++) {
			WebElement book=bookLink.get(i);
			String bookName=book.getText();
			System.out.println(bookName);
				//for price
			WebElement price=bookPrice.get(i);
			String bookprice=price.getText();
			System.out.println(bookprice);
//			System.out.println(bookLink.get(i).getText()+"  & price is "+bookPrice.get(i).getText());
		}
		
		
	}

}
