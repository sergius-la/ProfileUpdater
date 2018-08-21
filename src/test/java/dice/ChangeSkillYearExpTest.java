package dice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseScenario;
import utility.DataClass;

public class ChangeSkillYearExpTest extends BaseScenario {
	
	
	@Test(dataProvider = "Dice Credentials", dataProviderClass = DataClass.class)
	public static void changeSkillYearExp(String email, String pass) throws InterruptedException {
		
		homepage.navigateToHomepage();
		homepage.logIn(email, pass);
		profilePage.clickOnEditButton();
		profilePage.changeYearExpSkill("Cucumber", "5");
		profilePage.clickOnDoneButton();
		profilePage.scrollPageUP();
		homepage.logOut();
		driver.close();
	}
	
	
	
	
}
