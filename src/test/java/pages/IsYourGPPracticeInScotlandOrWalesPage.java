package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class IsYourGPPracticeInScotlandOrWalesPage {
    WebDriver driver;

    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");

    public IsYourGPPracticeInScotlandOrWalesPage (WebDriver driver) {
        this.driver = driver;

    }

    public void gPpracticeInScotlandOrWales(String option) {

        if (option.equalsIgnoreCase("Yes")) {
            driver.findElement(YES_RADIO_BUTTON).click();

        }
        else if (option.equalsIgnoreCase("No")) {
            driver.findElement(NO_RADIO_BUTTON).click();
        }
        driver.findElement(NEXT_BUTTON).click();

    }
    ;
}
