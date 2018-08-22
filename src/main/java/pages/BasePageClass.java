package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;



public class BasePageClass {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Actions actions;
	protected JavascriptExecutor js;
	protected ArrayList<String> tabs;

	public BasePageClass(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 45);
		this.actions = new Actions(driver);
		this.js = (JavascriptExecutor) driver;
		this.tabs = new ArrayList<String>();
	}
	
	//Navigation
	public void openLinkNewTab(By by) {
		driver.findElement(by).sendKeys(Keys.COMMAND, "t", Keys.RETURN);
	}

	public void navigateTo(String link) {
		driver.get(link);
	}

	public void switchToNewTab() {
		tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}
	
	public void closeNewTab() {
	    driver.close();
	    driver.switchTo().window(tabs.get(0)); 
	}
	
	public void scrollPageUP() {
		js.executeScript("window.scrollBy(0,-1000)");
	}
	
	public void scrollPageDown() {
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	//Actions
	public void clickOn(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		driver.findElement(by).click();
	}

	public void sendKeyTo(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}
	
	public void clear(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).clear();
	}

	public List<WebElement> getListOfWebElements(By by) {
//		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		List<WebElement> elements = driver.findElements(by);
		//		for (WebElement element : elements) {
		//			System.out.println(element.getAttribute("value"));
		//		}
		return elements;
	}
	
	//Text
	public String getTextFrom(By by) {
		return driver.findElement(by).getText();
	}
	
}
