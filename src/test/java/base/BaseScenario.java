package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import pages.dice.DiceHomepage;
import pages.dice.EasyApplyPage;
import pages.dice.JobDescriptionPage;
import pages.dice.ProfilePage;

public class BaseScenario {
	
	protected static WebDriver driver = new ChromeDriver();
	
	protected static DiceHomepage homepage = new DiceHomepage(driver);
	protected static ProfilePage profilePage = new ProfilePage(driver);
	protected static JobDescriptionPage jobDescriptionPage = new JobDescriptionPage(driver);
	protected static EasyApplyPage  easyApplyPage = new EasyApplyPage(driver);
	
	@AfterTest
	public void endOfTest() {
		
	}
}
