package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class DoYouLivePermanentlyInCareHomePage {

    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");

    private WebDriver driver;

    // Constructor of the page class:
    public DoYouLivePermanentlyInCareHomePage(WebDriver driver) {
        this.driver = driver;
    }
}
