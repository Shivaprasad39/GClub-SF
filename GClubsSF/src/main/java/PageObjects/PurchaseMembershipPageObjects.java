package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseMembershipPageObjects {
 
	@FindBy(xpath = "//span[.=\"PURCHASE MEMBERSHIP\"]")
	public static WebElement purchaseMembershipbtn;
	
	@FindBy(xpath = "//span[. = \"Add more cards\"]")
	public static WebElement addMoreCardsbtn;
	
	@FindBy(xpath = "//input[@class = \"MuiSelect-nativeInput\"]/..")
	public static WebElement clickTier;
	
	@FindBy(xpath = "//li[@data-value= \"1\"]")
	public static WebElement selectTier;
	
	@FindBy(xpath = "//input[@type = \"text\"]")
	public static WebElement enterNumberOfTiers;
	
	@FindBy(xpath = "//input[@name = \"agreement\"]")
	public static WebElement agreementCheckBox;
	
	@FindBy(xpath = "//button[@type = \"submit\"]")
	public static WebElement nextbtn;
	
	
	
}
