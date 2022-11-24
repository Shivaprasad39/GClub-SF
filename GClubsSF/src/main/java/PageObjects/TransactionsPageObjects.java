package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransactionsPageObjects {
	
	@FindBy(xpath = "(//a[@href=\"/en/transactions\"])[2]")
	public static WebElement transactionsIcon;
	
	@FindBy(id = "orderId")
	public static WebElement orderId;
	
	@FindBy(xpath = "//span[.=\"search\"]")
	public static WebElement searchbtn;
	
	@FindBy(xpath = "//span[.=\"VIEW\"]")
	public static WebElement viewbtn;
	
	@FindBy(xpath = "//span[.=\"Confirm payment\"]")
	public static WebElement confirmPaymentbtn;
	
	@FindBy(xpath = "//div[.=\"EXIT\"]")
	public static WebElement exitbtn;
	
	
	
	

}
