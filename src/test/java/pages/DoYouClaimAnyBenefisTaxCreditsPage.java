package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DoYouClaimAnyBenefisTaxCreditsPage {

    WebDriver driver;

    By YES_RADIO_BUTTON = By.name("benefitsOrTaxCredits");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");

    public DoYouClaimAnyBenefisTaxCreditsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void claimBenefits(String claim_option) {

        if (claim_option.equalsIgnoreCase("yes")) {
            if(driver.findElement(YES_RADIO_BUTTON).isDisplayed()||driver.findElement(YES_RADIO_BUTTON).isEnabled()) {
                driver.findElement(YES_RADIO_BUTTON).click();
            }
            else {
                Assert.fail("Web element is not present");
            }
        }
        else if (claim_option.equalsIgnoreCase("No")) {
            driver.findElement(NO_RADIO_BUTTON).click();
        }
        driver.findElement(NEXT_BUTTON).click();
    }
}