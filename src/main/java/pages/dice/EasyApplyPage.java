package pages.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePageClass;

public class EasyApplyPage extends BasePageClass {

	public EasyApplyPage(WebDriver driver) {
		super(driver);
	}
	
	//Drop-down
	private By resumeSelectDropDown = By.xpath("//div[@id='resume-select']");
	private By resumeSelectOption = By.xpath("//ul[@id='resume-select-options']");
	
	
	
	//Action
	public void resumeSelect() {
		actions.click(driver.findElement(resumeSelectDropDown));
		actions.moveToElement(driver.findElement(resumeSelectOption));
		actions.click(driver.findElement(resumeSelectOption));
		actions.perform();
	}
	
	
}
