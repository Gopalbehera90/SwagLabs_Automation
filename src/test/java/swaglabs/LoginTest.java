package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test(enabled=false)
	public void LoginFailiureTest() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com","Anc@1234");
		
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		System.out.println("The error message is " + errorMessage.getText());
		
	}
	
	@Test
	public void LoginSuccessTest() {
	
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce");	
		
		// Add to cart
		
		WebElement addtocart = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/following::button[1]"));
		addtocart.click();
		
		// Verify the item in the cart
		
		WebElement cartlink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartlink.click();
		
		WebElement yourcart = driver.findElement(By.xpath("//div[@class='cart_item_label']"));
		System.out.println("It contains " + yourcart.getText());
		
		
		
		
		
	}
	
	
	

		
	
	
	
	
	

}
