package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemberListPageObjects {
	
	@FindBy(id = "email")
	public static WebElement email;	

	@FindBy(xpath = "//span[.=\"search\"]")
	public static WebElement searchbtn;
	
	@FindBy(xpath = "//span[.=\"VIEW\"]")
	public static WebElement viewbtn;
	
	@FindBy(xpath = "//span[.=\"Orders\"]")
	public static WebElement ordersTab;
	
	
	


}
