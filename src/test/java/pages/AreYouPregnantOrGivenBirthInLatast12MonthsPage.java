package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class AreYouPregnantOrGivenBirthInLatast12MonthsPage {
    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");

    private WebDriver driver;
    DriverFactory driverFactory = new DriverFactory();

    // Constructor of the page class:
    public AreYouPregnantOrGivenBirthInLatast12MonthsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNextButton(){
        driver.findElement(NEXT_BUTTON).click();
    }
}
