package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageObjects {

	@FindBy(xpath = "//span[. = \"Agree Disclaimer\"]")
	public static WebElement agreeDisclaimerbtn;
	
	@FindBy(xpath = "//div[. = \"Pay by cheque\"]")
	public static WebElement payByChequebtn;
	
	@FindBy(xpath = "(//span[. = \"Place order\"])[1]")
	public static WebElement payByChequePlaceOrderbtn;
	
	@FindBy(xpath = "//div[. = \"PAY WITH H DOLLAR\"]")
	public static WebElement payByHDollarbtn;
	
	@FindBy(id = "firstName")
	public static WebElement firstName;
  
	@FindBy(id = "lastName")
	public static WebElement lastName;

	@FindBy(id = "helogin")
	public static WebElement himalayaExchangeLoginEmail;

	@FindBy(xpath = "(//input[@type = \"checkbox\"]")
	public static WebElement payByHDollarCheckBox;

	@FindBy(xpath = "(//span[. = \"Place order\"])[2]")
	public static WebElement payByHDollarPlaceOrderbtn;

}
