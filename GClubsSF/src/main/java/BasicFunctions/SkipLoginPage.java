package BasicFunctions;

import java.util.concurrent.Future;

import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.api.client.http.HttpResponse;


public class SkipLoginPage {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void skipLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www-qa2.gclubdev.net/en/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = "{\"xDwRuAuvTteAqXdqs0JtBvJf6lol9QeY\":{\"web_sdk_last_host\":\"widget-mediator.zopim.com\",\"timestamp\":1655463352399,\"account_status\":\"online\"}}";
		System.out.println("testing");
		js.executeScript("localStorage.setItem(arguments[0],arguments[1])", "__zlcstore", value);
		System.out.println("G|Clubs application launched");
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
		/*String title = driver.getTitle();
		System.out.println("gettr title: " + title);
		//Assert.assertEquals(title, "Home | GETTR");
		System.out.println("gettr application title verified");
		Thread.sleep(500);
		/*click(obj.btnAcceptCookies);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,"https://stg.gettr.com/");
		System.out.println("Launched url: "+currentUrl);*/
	}
	public static void main(String[] args) throws InterruptedException {
		skipLogin();

	}
	

}
