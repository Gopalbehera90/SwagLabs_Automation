package swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	  //====================== Locators ======================//
	
	 @FindBy(name="user-name")
	 WebElement Username;
	 
	 @FindBy(id="password")
	 WebElement Password;
	 
	 @FindBy(name="login-button")
	 WebElement LoginBtn;
	 
	 
	 //====================== Functions ========================//
	 
	 public LoginPage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		public void LoginFunction(String UserNameVal,String PwdVal) {
			
			// type Username & Password 
			
			Username.sendKeys(UserNameVal);
			Password.sendKeys(PwdVal);
			LoginBtn.click();

	
		
		
		}

	}
