package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class WhichCountryIsYourDentalPracticeInPage {

    By ENGLAND = By.id("radio-england");
    By SCOTLAND = By.id("radio-scotland");
    By WALES = By.id("radio-wales");
    By NORTHERN_IRELAND = By.id("radio-nire");
    By I_AM_NOT_Registered_With_A_Dental_Practice = By.id("radio-not-registered");
    By NEXT_BUTTON = By.id("next-button");
    private WebDriver driver;

    // Constructor of the page class:
    public WhichCountryIsYourDentalPracticeInPage(WebDriver driver) {
        this.driver = driver;
    }
}
