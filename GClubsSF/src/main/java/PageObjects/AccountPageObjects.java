package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPageObjects {
     
	@FindBy(xpath = "//span[.=\"APPLICATION FORM\"]")
	public static WebElement applicationformbtn;
	
	@FindBy(xpath = "//span[.=\"MEMBERSHIP\"]")
	public static WebElement membershipbtn;
	
	@FindBy(xpath = "//span[.=\"UPDATE MY INFO\"]")
	public static WebElement updateMyInfobtn;
	
	@FindBy(xpath = "//span[.=\"PAYMENT HISTORY\"]")
	public static WebElement paymentHistorybtn;
	
	@FindBy(xpath = "//span[.=\"DOCUMENTS\"]")
	public static WebElement documentsbtn;
	
	@FindBy(xpath = "//span[.=\"MEMBERSHIP CREDIT\"]")
	public static WebElement membershipCreditbtn;
	
	@FindBy(xpath = "//span[.=\"UPGRADE\"]")
	public static WebElement upgradebtn;
	
	@FindBy(xpath = "//span[.=\"PURCHASE MEMBERSHIP\"]")
	public static WebElement purchaseMembershipbtn;
	
	@FindBy(xpath = "//span[.=\"PAY ANNUAL FEE\"]")
	public static WebElement payAnnualFeebtn;
	
	@FindBy(xpath = "//span[.=\"MEMBERSHIPS\"]")
	public static WebElement membershipslink;	
	
	@FindBy(xpath = "//span[.=\"GMUSIC\"]")
	public static WebElement gMusiclink;
	
	@FindBy(xpath = "//span[.=\"ACCOUNT\"]")
	public static WebElement accountlink;
	
	@FindBy(xpath = "Sweepstakes")
	public static WebElement sweepstakeslink;
	
	@FindBy(xpath = "//span[.=\"SIGN OUT\"]")
	public static WebElement signOutlink;
	
	@FindBy(xpath = "//span[.=\"HELP\"]")
	public static WebElement helplink;
	
	@FindBy(xpath = "//span[.=\"BROCHURE\"]")
	public static WebElement brochurelink;
	
	@FindBy(xpath = "//span[.=\"中文简体\"]")
	public static WebElement chineselanguage;
	
}
