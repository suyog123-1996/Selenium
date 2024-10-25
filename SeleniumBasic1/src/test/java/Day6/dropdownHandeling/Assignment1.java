package Day6.dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/customer/orders");
		//for Email
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		//For PAssword
		driver.findElement(By.id("Password")).sendKeys("Abc@12345");
		//for login
		driver.findElement(By.className("login-button")).click();
		//click on book field
		driver.findElement(By.linkText("BOOKS")).click();
		//add to cart a product
		driver.findElement(By.className("product-box-add-to-cart-button")).click();
		//click on shopping cart
		driver.findElement(By.linkText("Shopping cart")).click();
		//Country ID
		WebElement element=driver.findElement(By.id("CountryId"));
		
		Select select=new Select(element);
	
		//for Country
		select.selectByVisibleText("Australia");
		//for Postal ZIP Code
		WebElement postalCode=driver.findElement(By.id("ZipPostalCode"));
		postalCode.clear();
		postalCode.sendKeys("442401");
		//For CheckBox
		driver.findElement(By.name("termsofservice")).click();
		//CheckOut button
		driver.findElement(By.id("checkout")).click();
		//billing adress Continue Button
		driver.findElement(By.className("new-address-next-step-button")).click();
		//Shipping adress Continue Button
		driver.findElement(By.cssSelector("input[onclick='Shipping.save()']")).click();
		//Shipping Method Continue Button
		driver.findElement(By.className("shipping-method-next-step-button")).click();
		//Payment Method Continue Button
		driver.findElement(By.className("payment-method-next-step-button")).click();
		//Payment Information
		driver.findElement(By.className("payment-info-next-step-button")).click();
		//Confirm Order
		driver.findElement(By.className("confirm-order-next-step-button")).click();
		//Continue Buttom
		driver.findElement(By.className("order-completed-continue-button")).click();
		//profile button
		driver.findElement(By.className("account")).click();
		//for order button
		driver.findElement(By.linkText("Orders")).click();
		
		
		
		
		
	}

}
/*
 * https://demowebshop.tricentis.com/customer/orders place order and validate
 * from order page
 */
