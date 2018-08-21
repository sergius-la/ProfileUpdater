package pages.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePageClass;

public class JobDescriptionPage extends BasePageClass {
	
	public JobDescriptionPage(WebDriver driver) {
		super(driver);
	}
	
	//Buttons
	

	//Text
	private By locationText = By.xpath("//li[@class='location']/*[1]");

}
