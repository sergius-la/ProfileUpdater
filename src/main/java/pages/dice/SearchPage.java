package pages.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePageClass;

public class SearchPage extends BasePageClass {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	//Links
	private By easyApplyLink = By.xpath("a[@class='dice-btn-link  easy-apply']");
	
}
