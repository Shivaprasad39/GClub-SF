package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPageObject {
	@FindBy(xpath = "//span[.=\"SIGN IN\"]")
	public static WebElement signinbtn;
	
	@FindBy(xpath = "//span[.=\"REGISTER\"]")
	public static WebElement registerbtn;	
	
	@FindBy(id = "firstname")
	public static WebElement firstname;
	
	@FindBy(id = "lastname")
	public static WebElement lastname;
	
	@FindBy(id = "email")
	public static WebElement email;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(id = "cpassword")
	public static WebElement cpassword;
	
	@FindBy(xpath = "//a[.='Acknowledge to G|CLUBS DISCLAIMER']/../../..//preceding-sibling::input")
	public static WebElement AckCheckbox;
	
	@FindBy(xpath = "//a[.='privacy policy']/../../..//preceding-sibling::input")
	public static WebElement TCCheckbox;
	
	@FindBy(xpath = "//span[.=\"Next\"]")
	public static WebElement nextbtn;
	
	
	
	
}
