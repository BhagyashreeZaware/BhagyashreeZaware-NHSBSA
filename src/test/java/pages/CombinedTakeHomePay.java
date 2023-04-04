package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CombinedTakeHomePay {
	WebDriver driver;

	By YES_RADIO_BUTTON = By.id("radio-yes");
	By NO_RADIO_BUTTON = By.id("radio-no");
	By NEXT_BUTTON = By.id("next-button");

	public CombinedTakeHomePay(WebDriver driver) {
		this.driver = driver;
	}
	
	public void combinedTakeHomePay(String pay_option) {
		
		if (pay_option.equalsIgnoreCase("Yes")) {
				driver.findElement(YES_RADIO_BUTTON).click();
		}
		else if (pay_option.equalsIgnoreCase("No")) {
			driver.findElement(NO_RADIO_BUTTON).click();
		}
		driver.findElement(NEXT_BUTTON).click();
	}

}
