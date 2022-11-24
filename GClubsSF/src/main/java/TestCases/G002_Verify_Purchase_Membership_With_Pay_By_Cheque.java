package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasicFunctions.BasicMethods;
import BasicFunctions.CommonFunctions;
import PageObjects.ERPLoginPageObjects;
import PageObjects.PaymentPageObjects;
import PageObjects.PurchaseMembershipPageObjects;

public class G002_Verify_Purchase_Membership_With_Pay_By_Cheque extends CommonFunctions {	


	/*public void login() {
		G001_Verify_SignIn_Functionality.login();
	}*/


	public static void PurchaseMembership() {
		PageFactory.initElements(driver, PageObjects.PurchaseMembershipPageObjects.class);
		PurchaseMembershipPageObjects.purchaseMembershipbtn.click();
		PurchaseMembershipPageObjects.addMoreCardsbtn.click();
		PurchaseMembershipPageObjects.clickTier.click();
		PurchaseMembershipPageObjects.selectTier.click();
		PurchaseMembershipPageObjects.enterNumberOfTiers.sendKeys("4");			
		PurchaseMembershipPageObjects.agreementCheckBox.click();
		PurchaseMembershipPageObjects.nextbtn.click();

	}
	public static void PayByCheque() {
		PageFactory.initElements(driver, PageObjects.PaymentPageObjects.class);
		PageObjects.PaymentPageObjects.agreeDisclaimerbtn.click();
		PageObjects.PaymentPageObjects.payByChequebtn.click();
		PageObjects.PaymentPageObjects.payByChequePlaceOrderbtn.click();
		
	}
	public static void LoginERP(String username,String password) {
		ERPLoginPageObjects.username.sendKeys(username);
		ERPLoginPageObjects.password.sendKeys(password);
		ERPLoginPageObjects.loginbtn.click();
	}

	public static void DualConfirmPayment() {
		for(int i=1;i<=2;i++) {
			if(i==1) {
				LoginERP("admin","admin123");
			}else
			{
				LoginERP("ShivaFinanceQ2","Shiva@123");
			}
			ConfirmPayment();
		}
	}
	public static void ConfirmPayment() {
		PageObjects.TransactionsPageObjects.transactionsIcon.click();
		PageObjects.TransactionsPageObjects.orderId.sendKeys("GC2009120122231");
		PageObjects.TransactionsPageObjects.searchbtn.click();
		PageObjects.TransactionsPageObjects.viewbtn.click();
		PageObjects.TransactionsPageObjects.confirmPaymentbtn.click();
		PageObjects.TransactionsPageObjects.exitbtn.click();	
	}
	public static void ERPDualApproval() throws IOException {
		PageFactory.initElements(driver, PageObjects.ERPLoginPageObjects.class);
		PageFactory.initElements(driver, PageObjects.TransactionsPageObjects.class);
		String ERPurl = CommonFunctions.ERPUrl();
		driver.get(ERPurl);
		DualConfirmPayment();
					
	}
	@Test
	public void MTOrderUsingCheque() throws IOException {	
		PageFactory.initElements(driver, PageObjects.SignInPageObjects.class);
		G001_Verify_SignIn_Functionality.login();
		PurchaseMembership();
		PayByCheque();
		ERPDualApproval();
	}


}
