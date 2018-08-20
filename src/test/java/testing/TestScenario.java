package testing;

import base.BaseScenario;

public class TestScenario extends BaseScenario {
	
	public static void main( String[] args ) throws Exception {
		
		
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
