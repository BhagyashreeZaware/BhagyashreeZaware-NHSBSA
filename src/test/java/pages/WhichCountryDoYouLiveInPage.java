package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhichCountryDoYouLiveInPage {

    WebDriver driver;

    By ENGLAND = By.id("radio-england");
    By SCOTLAND = By.id("radio-scotland");
    By WALES = By.id("radio-wales");
    By NORTHERN_IRELAND = By.id("radio-nire");
    By NEXT_BUTTON = By.id("next-button");

    public WhichCountryDoYouLiveInPage(WebDriver driver) {

        this.driver = driver;

    }
    public void liveInCountry(String country) {
        if(country.equalsIgnoreCase("england") || country.equalsIgnoreCase("ENGLAND")) {
            driver.findElement(ENGLAND).click();

        }
        else if(country.equalsIgnoreCase("scotland") || country.equalsIgnoreCase("SCOTLAND") ) {
            driver.findElement(SCOTLAND).click();
        }
        else if(country.equalsIgnoreCase("wales") || country.equalsIgnoreCase("WALES") ) {
            driver.findElement(WALES).click();
        }

        else if (country.equalsIgnoreCase("northern_ireland") || country.equalsIgnoreCase("NORTHERN_IRELAND") )
        {
            driver.findElement(NORTHERN_IRELAND).click();
        }

        driver.findElement(NEXT_BUTTON).click();

    }
    }

