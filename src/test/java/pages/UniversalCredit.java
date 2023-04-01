package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UniversalCredit {
	
	WebDriver driver;

	By YES_RADIO_BUTTON = By.id("yes-universal");
	By NOT_APPLIED_RADIO_BUTTON = By.id("not-yet");
	By NO_RADIO_BUTTON = By.id("different-benefit");
	By NEXT_BUTTON = By.id("next-button");

	public UniversalCredit(WebDriver driver) {
		this.driver = driver;
	}
	
	public void universalCredit(String uc_option) {
		
		if (uc_option.equalsIgnoreCase("does")) {
			driver.findElement(YES_RADIO_BUTTON).click();
		}
		else if (uc_option.equalsIgnoreCase("Not_yet")) {
			driver.findElement(NOT_APPLIED_RADIO_BUTTON).click();
		}
		else if (uc_option.equalsIgnoreCase("does not")) {
			driver.findElement(NO_RADIO_BUTTON).click();
		}
		driver.findElement(NEXT_BUTTON).click();
	}
}
