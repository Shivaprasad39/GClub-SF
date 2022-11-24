package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPageObjects {
	
	@FindBy(id = "email")
	public static WebElement email;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(xpath = "//span[.=\"SIGN IN\"]")
	public static WebElement signInlink;
	
	@FindBy(xpath = "//span[.=\"Sign in\"]")
	public static WebElement signInbtn;
	
	
	
	
	
	
	
	
	
	

}
