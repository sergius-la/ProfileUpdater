package pages.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePageClass;

public class JobDescriptionPage extends BasePageClass {
	
	public JobDescriptionPage(WebDriver driver) {
		super(driver);
	}
	
	//Buttons
	private By applyButton = By.xpath("//div[@id='lowerApplyBtn']//button[1]");

	//Text
	private By locationText = By.xpath("//li[@class='location']/*[1]");
	
	//Actions
	public void clickOnApplyButton() {
		super.clickOn(applyButton);
	}
	
	//Retrieve text
	public String getLocationText() {
		return super.getTextFrom(locationText);
	}
	
	
	
}
