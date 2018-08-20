package pages.dice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePageClass;

public class DiceHomepage extends BasePageClass {
	
	//Main Menu: Buttons
	private By loginRegisterButton = By.xpath("//a[@id='Login_1']");
	private By loginButton = By.xpath("//button[@id='LoginBtn_1']");
	private By singOutButton = By.xpath("//button[@data-automation-id='logout-button']");
	
	//Main Menu: Input Fields
	private By loginEmailInput = By.xpath("//input[@id='Email_1']");
	private By loginPasswordInput = By.xpath("//input[@id='Password_1']");
	
	//Main Menu: Drop-down
	private By profileDropDown = By.xpath("//span[@id='dice-login-customer-name']");
	
	 
	public DiceHomepage(WebDriver driver) {
		super(driver);
	}

	//TODO: Make Method More Reliable
	public void navigateTo(String link) {
		driver.get(link);
	}
	
	//TODO; Add Wait Until Expected Conditions
	public void singOut() throws InterruptedException {
		
		actions.click(driver.findElement(profileDropDown));
		actions.moveToElement(driver.findElement(singOutButton));
		actions.click(driver.findElement(singOutButton));
		actions.perform();
	}
	
	public void logIn(String username, String password) {
		driver.findElement(loginRegisterButton).click();
		driver.findElement(loginEmailInput).sendKeys(username);
		driver.findElement(loginPasswordInput).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
	public void logOut() {
		driver.findElement(profileDropDown).click();
	}
	
}
