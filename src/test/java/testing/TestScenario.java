package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

		
	}
}
