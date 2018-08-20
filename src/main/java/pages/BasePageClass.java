package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.By;
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

	public void navigateToHomepage(String link) {
		driver.get(link);
	}

	public void clickOn(By by) {
		driver.findElement(by).click();
	}

	public void sendKeyTo(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}

	public List<WebElement> getListOfWebElements(By by) {
		List<WebElement> elements = driver.findElements(by);
		//		for (WebElement element : elements) {
		//			System.out.println(element.getAttribute("value"));
		//		}
		return elements;
	}

}
