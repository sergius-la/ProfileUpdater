package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.dice.DiceHomepage;
import pages.dice.ProfilePage;

public class BaseScenario {
	
	protected static WebDriver driver = new ChromeDriver();
    
	protected static String baseURL = "https://www.dice.com";
	protected static String email = ""; //Add login
	protected static String password = ""; //Add password
	
	protected static DiceHomepage homepage = new DiceHomepage(driver);;
	protected static ProfilePage profilePage = new ProfilePage(driver);;
}
