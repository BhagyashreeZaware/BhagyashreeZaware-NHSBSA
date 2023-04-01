package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class DoYouClaimAnyBenefisTaxCreditsPage {

    private WebDriver driver;
    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");

    // Constructor of the page class:
    public DoYouClaimAnyBenefisTaxCreditsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNextButton(){
        driver.findElement(NEXT_BUTTON).click();
    }
}