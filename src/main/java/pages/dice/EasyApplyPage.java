package pages.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.BasePageClass;

public class EasyApplyPage extends BasePageClass {

	public EasyApplyPage(WebDriver driver) {
		super(driver);
	}
	
	//Drop-down
	private By resumeSelectDropDown = By.xpath("//div[@id='resume-select']");
	private By resumeSelectOption = By.xpath("//ul[@id='resume-select-options']");
	
	//Input
	private By nameInput = By.xpath("//input[@id='fn-input']");
	
	
	//Action
	public void resumeSelect() {
		wait.until(ExpectedConditions.elementToBeClickable(resumeSelectDropDown));
		actions.click(driver.findElement(resumeSelectDropDown));
		actions.moveToElement(driver.findElement(resumeSelectOption));
		actions.click(driver.findElement(resumeSelectOption));
		actions.perform();
	}
	
	public void clearNameInput() throws InterruptedException {
		super.clear(nameInput);
	}
	
	
}
