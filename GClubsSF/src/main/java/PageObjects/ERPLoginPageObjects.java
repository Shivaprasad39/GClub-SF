package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ERPLoginPageObjects {
	@FindBy(id = "account")
	public static WebElement username;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(xpath = "//span[.=\"LOGIN\"]")
	public static WebElement loginbtn;
}
