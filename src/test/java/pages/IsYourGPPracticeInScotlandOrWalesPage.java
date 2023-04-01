package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class IsYourGPPracticeInScotlandOrWalesPage {
    private WebDriver driver;
    public IsYourGPPracticeInScotlandOrWalesPage(WebDriver driver){
        this.driver = driver;
    }
    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");
}
