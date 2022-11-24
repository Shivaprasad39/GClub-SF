package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPageObject {

	@FindBy(xpath = "//input[@type=\"email\"]")
	public static WebElement email;
	
	@FindBy(xpath = "//span[.=\"Next\"]")
	public static WebElement nextbtn;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	public static WebElement password;
	
	@FindBy(xpath = "//div[.=\"Use another account\"]")
	public static WebElement useAnotherAcc;
	
	@FindBy(xpath = "//input[@aria-label=\"Search Google Account\"]")
	public static WebElement search;
	
	
	
	
	
}
