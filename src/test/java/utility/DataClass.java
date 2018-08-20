package utility;

import org.testng.annotations.DataProvider;

public class DataClass {

	@DataProvider(name = "Dice Credentials")
	public static Object[][] diceCredintials() {
		
		return new Object[][] {
			{"log", "pass"},
		};
	}
}
