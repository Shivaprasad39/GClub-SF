package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.RegisterPageObject;

public class CreateNewAccount {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, RegisterPageObject.class);
		driver.get("https://www-qa2.gclubdev.net/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		RegisterPageObject.signinbtn.click();
		Thread.sleep(3000);
		RegisterPageObject.registerbtn.click();
		Thread.sleep(3000);
		RegisterPageObject.firstname.sendKeys("Shiva");
		Thread.sleep(3000);
		RegisterPageObject.lastname.sendKeys("test+008");
		Thread.sleep(3000);
		RegisterPageObject.email.sendKeys("shiva4.test+029_@gmail.com");
		Thread.sleep(3000);
		RegisterPageObject.password.sendKeys("Shiva@1212");
		Thread.sleep(3000);
		RegisterPageObject.cpassword.sendKeys("Shiva@1212");
		Thread.sleep(3000);
		RegisterPageObject.AckCheckbox.click();
		Thread.sleep(3000);
		RegisterPageObject.TCCheckbox.click();
		Thread.sleep(3000);
		RegisterPageObject.nextbtn.click();
		
		
        
	}

}
