package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseScenario;
import pages.dice.JobDescriptionPage;
import pages.dice.SearchPage;
import utility.DataClass;

public class TestScenario extends BaseScenario {

	@Test(dataProvider = "Dice Credentials", dataProviderClass = DataClass.class)
	public static void testing(String email, String pass) throws Exception {

		List<WebElement> easyApplyLikns;
		
		By locator = By.xpath("//div[@class='row']//button[@class='close' and contains(text(), '×')]");
		
//		String link = "https://www.dice.com/jobs/detail/QA-Engineer%26%2345need-Microsoft-CUIT-exp-Resource-Informatics-Group-Inc-Spring-TX-77373/10493233/5b7ada97dced6406643b9107?icid=sr4-1p&q=&l==";
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;

		homepage.navigateToHomepage();
		homepage.logIn(email, pass);
		profilePage.clickOnOpeningsNationwide();
		//TODO: Navigate to a new window
		profilePage.switchToNewTab();
		
		//Get list of links;
		easyApplyLikns = searchPage.getEasyApplyLinksList();
//		System.out.println(easyApplyLikns.size());
		
		//Open Job Description Page
		easyApplyLikns.get(0).click();
		//TODO: Navigate to a new window
		searchPage.switchToNewTab();
		
		//TODO: Click on the Apply Button
		jobDescriptionPage.clickOnApplyButton();
		
		

        Set handles = driver.getWindowHandles();

        System.out.println(handles);

        // Pass a window handle to the other window

//        for (String handle1 : driver.getWindowHandles()) {
//
//        	System.out.println(handle1);
//
//        	driver.switchTo().window(handle1);
//
//        	}
      
		
		
		
		
		
		
		
//		driver.findElement(locator).click();
		
//		//Driver Switch to Frame
//		driver.switchTo().frame("cover-resume-modal");
//		driver.switchTo().activeElement();
		
		
//		easyApplyPage.resumeSelect();
		
		
		
		
		
		//New Window
		//TODO: Apply for position
		
		//TODO: Close the window
		//TODO: Navigate back
		
		//TODO: After Apply 
		
		
//		homepage.openLinkNewTab(contactSales);
//		homepage.switchToNewTab();
//		Thread.sleep(5000);
//		homepage.closeNewTab();
//		homepage.scrollPageDown();
		
//		homepage.navigateTo(link);
//		jobDescriptionPage.clickOnApplyButton();
		
//		driver.close();
//		driver.quit();
	}
}
