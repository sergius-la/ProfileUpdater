package pages.dice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePageClass;

public class SearchPage extends BasePageClass {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	//Links
	private By easyApplyLinks = By.xpath("//a[@class='dice-btn-link  easy-apply']");
	private By easyApplyAltLinks = By.xpath("a[@class='dice-btn-link job-visited easy-apply']");
	
	public List<WebElement> getEasyApplyLinksList() throws InterruptedException {
		Thread.sleep(3000);
		
		List<WebElement> links = new ArrayList<>();
		
		try {
			links = super.getListOfWebElements(easyApplyLinks);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			
			links = super.getListOfWebElements(easyApplyAltLinks);
		}
		
//		for (WebElement element : links) {
//			System.out.println(element.getText());
//		}
		return  links;
	}
	
	//TODO: Logic on Opening a new page and removing it from a list 
}
