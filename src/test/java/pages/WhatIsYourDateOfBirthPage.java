package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;
public class WhatIsYourDateOfBirthPage {

    WebDriver driver;

    By DAY = By.id("dob-day");
    By MONTH = By.id("dob-month");
    By YEAR = By.id("dob-year");
    By NEXT_BUTTON = By.id("next-button");

    public WhatIsYourDateOfBirthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dateOfBirth(int day, int month, int year) {
        driver.findElement(DAY).click();
        driver.findElement(DAY).sendKeys(String.valueOf(day));

        driver.findElement(MONTH).click();
        driver.findElement(MONTH).sendKeys(String.valueOf(month));

        driver.findElement(YEAR).click();
        driver.findElement(YEAR).sendKeys(String.valueOf(year));

        driver.findElement(NEXT_BUTTON).click();
    }

}
