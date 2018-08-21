package pages.dice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePageClass;

public class ProfilePage extends BasePageClass {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	//Buttons
	private By editButton = By.xpath("//button[@id='editProfile']/..");
	private By doneButton = By.xpath("//button[@class='btn btn-default btn-lg pull-right hidden-xs hidden-sm ng-scope']");

	//Input Field
	private By skillInputFileds = By.xpath("//input[@class='form-control ng-scope ng-pristine ng-valid ng-valid-required']");
	private By yearsExpInputFileds = By.xpath("//input[@class='form-control ng-scope ng-pristine ng-valid ng-valid-required']//following::input[@type='text' and @placeholder='Yrs Exp']");

	//Text
	private By lastEditedDateText = By.xpath("//h3[@class='ng-scope ng-binding']");
	
	//Link
	private By openingsNationwide = By.xpath("//a[text() = 'openings nationwide']");

	public void clickOnEditButton() {
		super.clickOn(editButton);
	}
	
	public void clickOnDoneButton() {
		super.clickOn(doneButton);
	}
	
	public void clickOnOpeningsNationwide() {
		super.clickOn(openingsNationwide);
	}

	
	public boolean changeSkill(String oldSkill, String newSkill) {
		List<WebElement> elementsSkills = super.getListOfWebElements(skillInputFileds);
		boolean result = false; 

		for (WebElement element : elementsSkills) {
			
			if (element.getAttribute("value").equals(oldSkill)) {
				element.clear();
				element.sendKeys(newSkill);
				result = true;
				break;
			} 
		}
		return result;
	}


	public boolean changeYearExpSkill(String skill, String newYearsExp) {
		List<WebElement> elementsSkills = super.getListOfWebElements(skillInputFileds);
		List<WebElement> elementsYearsExp = super.getListOfWebElements(yearsExpInputFileds);
		boolean result = false;
		
		for (int i = 0; i < elementsSkills.size(); i++) {
			if (elementsSkills.get(i).getAttribute("value").equals(skill)) {
				elementsYearsExp.get(i).clear();
				elementsYearsExp.get(i).sendKeys(newYearsExp);
				result = true;
				break;
			}
		}
		return result;
	}


}
