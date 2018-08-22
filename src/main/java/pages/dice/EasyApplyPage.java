package pages.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.BasePageClass;

public class EasyApplyPage extends BasePageClass {

	public EasyApplyPage(WebDriver driver) {
		super(driver);
	}
	
	/*
		Locators
	*/
	
	//Button
	private By applyButton = By.xpath("//button[@id='submit-job-btn']");
	private By closeButton = By.xpath("//div[@class='row']//button[@class='close' and contains(text(), '×')]");
	
	
//	TODO: Create a new page
	//Easy Apply Success
	private By closeSuccesButton = By.xpath("//button[@id='successUpperCloseBtn']");
	
	public void clickOnSuccessButton() {
		super.clickOn(closeSuccesButton);
	}
	
	
	//Drop-down
	private By resumeSelectDropDown = By.xpath("//div[@id='resume-select']");
	private By resumeSelectOption = By.xpath("//ul[@id='resume-select-options']");
	
	//Input
	private By nameInput = By.xpath("//input[@id='fn-input']");
	
	
	//Action
	public void resumeSelect() throws InterruptedException {
		//TODO: Make Method clear
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(resumeSelectDropDown));
		wait.until(ExpectedConditions.presenceOfElementLocated(resumeSelectDropDown));
		
		actions.click(driver.findElement(resumeSelectDropDown));
		actions.moveToElement(driver.findElement(resumeSelectOption));
		actions.click(driver.findElement(resumeSelectOption));
		actions.perform();
	}
	
	
	/*
		Methods
	*/
	
	public void clearNameInput() throws InterruptedException {
		super.clear(nameInput);
	}
	
	public void clickOnApplyButton() {
		super.clickOn(applyButton);
	}
	
	public void clickOnCloseButton() {
		super.clickOn(closeButton);
	}
	
}
