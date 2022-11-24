package BasicFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static Properties properties = null;
	public static WebDriver driver = null;

	
	static public Properties loadPropertiesFile() throws IOException {
		FileInputStream FileInput = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(FileInput);
		return properties;
	}
    
	@BeforeSuite
	public static void launchBrowser() throws IOException {
		loadPropertiesFile();
		String url = properties.getProperty("url");
		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("driverLocation");
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();				
		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();			
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	}
	/*@AfterSuite
	public void tearDown() {
		driver.quit();
	}*/
	public static String ERPUrl() throws IOException {
		loadPropertiesFile();
		String url = properties.getProperty("ERPUrl");
		return url;
		
	}
	
}
