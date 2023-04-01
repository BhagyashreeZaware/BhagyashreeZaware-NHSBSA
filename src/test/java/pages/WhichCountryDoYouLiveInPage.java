package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhichCountryDoYouLiveInPage {

    private WebDriver driver;

    //Class constructor
    public WhichCountryDoYouLiveInPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    By ENGLAND = By.id("radio-england");
    By SCOTLAND = By.id("radio-scotland");
    By WALES = By.id("radio-wales");
    By NORTHERN_IRELAND = By.id("radio-nire");
    By NEXT_BUTTON = By.id("next-button");
    By HEADING = By.id("question-heading");

    public void selectCountry(String countryName) {
        if (countryName.equalsIgnoreCase("england") || countryName.equalsIgnoreCase("ENGLAND")) {
            driver.findElement(ENGLAND).click();
        } else if (countryName.equalsIgnoreCase("scotland") || countryName.equalsIgnoreCase("OPTION_SCOTLAND")) {
            driver.findElement(SCOTLAND).click();
        } else if (countryName.equalsIgnoreCase("wales") || countryName.equalsIgnoreCase("WALES")) {
            driver.findElement(WALES).click();
        } else if (countryName.equalsIgnoreCase("nire") || countryName.equalsIgnoreCase("NORTHERN_IRELAND")) {
            driver.findElement(NORTHERN_IRELAND).click();
        }
    }
    public String getTitle() {
        String actualTitle = driver.findElement(HEADING).getText();
        return actualTitle;
    }
}
