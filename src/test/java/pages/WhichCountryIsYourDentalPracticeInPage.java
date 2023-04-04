package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhichCountryIsYourDentalPracticeInPage {

    WebDriver driver;

    By ENGLAND = By.id("radio-england");
    By SCOTLAND = By.id("radio-scotland");
    By WALES = By.id("radio-wales");
    By NORTHERN_IRELAND = By.id("radio-nire");
    By I_AM_NOT_Registered_With_A_Dental_Practice = By.id("radio-not-registered");
    By NEXT_BUTTON = By.id("next-button");

    public WhichCountryIsYourDentalPracticeInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dentalPracticeCountry(String dp_country) {

        if (dp_country.equalsIgnoreCase("ENGLAND") || dp_country.equalsIgnoreCase("england")) {
            driver.findElement(ENGLAND).click();
        }
        else if (dp_country.equalsIgnoreCase("SCOTLAND")|| dp_country.equalsIgnoreCase("scotland")) {
            driver.findElement(SCOTLAND).click();
        }
        else if (dp_country.equalsIgnoreCase("WALES")|| dp_country.equalsIgnoreCase("wales")) {
            driver.findElement(WALES).click();
        }
        else if (dp_country.equalsIgnoreCase("NORTHERN_IRELAND")|| dp_country.equalsIgnoreCase("northern_ireland")) {
            driver.findElement(NORTHERN_IRELAND).click();
        }
        else if (dp_country.equalsIgnoreCase("I_AM_NOT_Registered_With_A_Dental_Practice")|| dp_country.equalsIgnoreCase("I am not registered with a dental practice")) {
            driver.findElement(I_AM_NOT_Registered_With_A_Dental_Practice).click();
        }
        driver.findElement(NEXT_BUTTON).click();
    }
}
