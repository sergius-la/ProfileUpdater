package pages.dice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePageClass;

public class DiceHomepage extends BasePageClass {
	
	static String diceUrl = "https://www.dice.com/";
	
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
	
	public void navigateToHomepage() {
		super.navigateToHomepage(diceUrl);
	}
	
	//TODO; Add Wait Until Expected Conditions
	public void logOut() throws InterruptedException {
		
		actions.click(driver.findElement(profileDropDown));
		actions.moveToElement(driver.findElement(singOutButton));
		actions.click(driver.findElement(singOutButton));
		actions.perform();
	}
	
	public void logIn(String username, String password) {
		super.clickOn(loginRegisterButton);
		super.sendKeyTo(loginEmailInput, username);
		super.sendKeyTo(loginPasswordInput, password);
		super.clickOn(loginButton);
	}
	
}
