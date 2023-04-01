package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NHSCostHelpOutput {

	WebDriver driver;

	By GET_HELP_FROM_NHS_COSTS = By.className("heading-large");
	
	public NHSCostHelpOutput(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getOutputScreen(String expectedResult) {
	String actualResult = driver.findElement(GET_HELP_FROM_NHS_COSTS).getText();
	System.out.print(actualResult);
	Assert.assertTrue("Text not found!", actualResult.contains(expectedResult));
   }
}