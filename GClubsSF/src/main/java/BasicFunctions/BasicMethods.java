package BasicFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasicMethods {
	static WebDriver driver;

	public static void mouseHover(WebElement webelement) {
		Actions actions = new Actions(driver);
		actions.moveToElement(webelement);
	}

	public static void SelectDropDown(WebElement webelement) {
		Select SelectDropDown = new Select(webelement);
	}
	
	public static void SelectDropDown(WebElement webelement) {
		Select SelectDropDown = new Select(webelement);
	}
    


}
