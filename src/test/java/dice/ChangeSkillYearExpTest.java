package dice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseScenario;

public class ChangeSkillYearExpTest extends BaseScenario {
	
	
	@Test
	public static void changeSkillYearExp() throws InterruptedException {
		
		
		homepage.navigateTo(baseURL);
		homepage.logIn(email, password);
		profilePage.clickOnEditButton();
		profilePage.changeYearExpSkill("Cucumber", "5");
		profilePage.clickOnDoneButton();
		profilePage.scrollPageUP();
		homepage.singOut();
		driver.close();
	}
	
	
	
	
}
