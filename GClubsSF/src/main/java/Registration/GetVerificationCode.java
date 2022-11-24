package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.RegisterPageObject;
import PageObjects.*;

public class GetVerificationCode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, EmailPageObject.class);
		driver.get("https://accounts.google.com/");
		//EmailPageObject.useAnotherAcc.click();
		//Thread.sleep(3000);
		EmailPageObject.email.sendKeys("shivaprasadindium3@gmail.com");
		Thread.sleep(3000);
		EmailPageObject.nextbtn.click();
		Thread.sleep(3000);
		EmailPageObject.password.sendKeys("Indium@123");
		Thread.sleep(3000);
		EmailPageObject.nextbtn.click();
		Thread.sleep(3000);
		
		
		
		
		
		
	}
	
	
	

}
