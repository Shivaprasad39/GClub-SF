package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasicFunctions.CommonFunctions;
import PageObjects.SignInPageObjects;

public class G001_Verify_SignIn_Functionality extends CommonFunctions {
	public static String username = "shiva4.test+023_@gmail.com";
	public static String password = "Shiva@1212";
	
	public static void login() {
		SignInPageObjects.signInlink.click();
		SignInPageObjects.email.sendKeys(username);
		SignInPageObjects.password.sendKeys(password);
		SignInPageObjects.signInbtn.click();
	}
	@Test
	public static void SignIn() throws IOException {
		PageFactory.initElements(driver, PageObjects.SignInPageObjects.class);
		login();		
	}
	

}
//String ERPurl = CommonFunctions.ERPUrl();
		//driver.get(ERPurl);