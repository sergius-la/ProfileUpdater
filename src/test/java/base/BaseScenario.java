package base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.dice.DiceHomepage;
import pages.dice.EasyApplyPage;
import pages.dice.JobDescriptionPage;
import pages.dice.ProfilePage;
import pages.dice.SearchPage;

public class BaseScenario {
	
	protected static WebDriver driver = new ChromeDriver();
	
	protected static DiceHomepage homepage = new DiceHomepage(driver);
	protected static ProfilePage profilePage = new ProfilePage(driver);
	protected static JobDescriptionPage jobDescriptionPage = new JobDescriptionPage(driver);
	protected static EasyApplyPage  easyApplyPage = new EasyApplyPage(driver);
	protected static SearchPage searchPage = new SearchPage(driver);
	
	@AfterTest
	public void endOfTest() {
		driver.close();
		driver.quit(); 
	}
	
	@BeforeTest
	public void startOfTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
