package testing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseScenario;
import pages.dice.JobDescriptionPage;
import utility.DataClass;

public class TestScenario extends BaseScenario {

	@Test(dataProvider = "Dice Credentials", dataProviderClass = DataClass.class)
	public static void testing(String email, String pass) throws Exception {

//		String link = "https://www.dice.com/jobs/detail/QA-Engineer%26%2345need-Microsoft-CUIT-exp-Resource-Informatics-Group-Inc-Spring-TX-77373/10493233/5b7ada97dced6406643b9107?icid=sr4-1p&q=&l==";
		
		
//		homepage.navigateToHomepage();
////		homepage.logIn(email, pass);
////		profilePage.clickOnOpeningsNationwide();
//		
//		homepage.openLinkNewTab(contactSales);
//		homepage.switchToNewTab();
//		Thread.sleep(5000);
//		homepage.closeNewTab();
//		homepage.scrollPageDown();
		
//		homepage.navigateTo(link);
//		jobDescriptionPage.clickOnApplyButton();
		
	}
}
