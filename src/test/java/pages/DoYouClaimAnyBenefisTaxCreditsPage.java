package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class DoYouClaimAnyBenefisTaxCreditsPage {

    WebDriver driver;

    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");

    public DoYouClaimAnyBenefisTaxCreditsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void claimBenefits(String claim_option) {

        if (claim_option.equalsIgnoreCase("Yes")) {
            driver.findElement(YES_RADIO_BUTTON).click();

        }
        else if (claim_option.equalsIgnoreCase("No")) {
            driver.findElement(NO_RADIO_BUTTON).click();
        }
        driver.findElement(NEXT_BUTTON).click();
    }
}