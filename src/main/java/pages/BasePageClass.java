package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class BasePageClass {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Actions actions;
	protected JavascriptExecutor js;
	
	public BasePageClass(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 45);
		actions = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}
	
	public void scrollPageUP() {
		js.executeScript("window.scrollBy(0,-1000)");
	}

}
