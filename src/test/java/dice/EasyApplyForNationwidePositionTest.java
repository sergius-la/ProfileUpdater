package dice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseScenario;
import utility.DataClass;

public class EasyApplyForNationwidePositionTest extends BaseScenario {


	@Test(dataProvider = "Dice Credentials", dataProviderClass = DataClass.class)
	public static void EasyApplyForNationwidePosition(String email, String pass) throws InterruptedException {

		List<WebElement> easyApplyLikns;

		homepage.navigateToHomepage();
		homepage.logIn(email, pass);
		profilePage.clickOnOpeningsNationwide();

		//Navigate to a new window (driver)
		profilePage.switchToNewTab();

		//Get list of links (driver)
		easyApplyLikns = searchPage.getEasyApplyLinksList();

		//Open Job Description Page
		easyApplyLikns.get(0).click();
		//Navigate to a new window (driver)
		searchPage.switchToNewTab();

		//Click on the Apply Button
		jobDescriptionPage.clickOnApplyButton();


		easyApplyPage.resumeSelect();
		easyApplyPage.clickOnApplyButton();

		//TODO: Close the Success page
	}
}
