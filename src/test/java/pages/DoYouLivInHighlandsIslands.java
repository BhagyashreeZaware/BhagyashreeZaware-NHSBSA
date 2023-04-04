package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoYouLivInHighlandsIslands {

    WebDriver driver;
    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");
    public DoYouLivInHighlandsIslands(WebDriver driver){
        this.driver = driver;
    }

    public void liveInTheHighlandsAndIslands(String credit_option) {

        if (credit_option.equalsIgnoreCase("yes")) {
            driver.findElement(YES_RADIO_BUTTON).click();
        }

        else if (credit_option.equalsIgnoreCase("no")) {
            driver.findElement(NO_RADIO_BUTTON).click();
        }
        driver.findElement(NEXT_BUTTON).click();
    }
}
