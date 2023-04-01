package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class DoYouLiveWithPartnerPage {
     WebDriver driver;

    public DoYouLiveWithPartnerPage(WebDriver driver){
        this.driver = driver;
    }
    By YES_RADIO_BUTTON = By.id("radio-yes");
    By NO_RADIO_BUTTON = By.id("radio-no");
    By NEXT_BUTTON = By.id("next-button");

    public void liveWithPartner(String partner_option) {

        if (partner_option.equalsIgnoreCase("Yes")) {
            driver.findElement(YES_RADIO_BUTTON).click();

        }
        else if (partner_option.equalsIgnoreCase("No")) {
            driver.findElement(NO_RADIO_BUTTON).click();
        }
        driver.findElement(NEXT_BUTTON).click();
    }
}
