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

	public void clickOnEditButton() {
		driver.findElement(editButton).click();
	}
	
	public void clickOnDoneButton() {
		driver.findElement(doneButton).click();
	}

	private List<WebElement> getListSkills() {
		List<WebElement> elements = driver.findElements(skillInputFileds);
		//		for (WebElement element : elements) {
		//			System.out.println(element.getAttribute("value"));
		//		}
		return elements;
	}

	private List<WebElement> getListYearsExp() {
		List<WebElement> elements = driver.findElements(yearsExpInputFileds);
		//		for (WebElement element : elements) {
		//			System.out.println(element.getAttribute("value"));
		//		}
		return elements;
	}

	
	public boolean changeSkill(String oldSkill, String newSkill) {
		List<WebElement> elementsSkills = getListSkills();
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
		List<WebElement> elementsSkills = getListSkills();
		List<WebElement> elementsYearsExp = getListYearsExp();
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
