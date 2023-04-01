package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;
public class WhatIsYourDateOfBirthPage {

    private WebDriver driver;
    By DAY = By.id("dob-day");
    By MONTH = By.id("dob-month");
    By YEAR = By.id("dob-year");
    By NEXT_BUTTON = By.id("next-button");
    // Constructor of the page class:
    public WhatIsYourDateOfBirthPage(WebDriver driver) {
        this.driver = driver;
    }
}
