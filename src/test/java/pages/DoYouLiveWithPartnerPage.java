package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class DoYouLiveWithPartnerPage {
    private WebDriver driver;

    public DoYouLiveWithPartnerPage(WebDriver driver){
        this.driver = driver;
    }
    DriverFactory driverFactory = new DriverFactory();
    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");
}
