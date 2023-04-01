package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonPages {

    static WebDriver driver;

    // Constructor of the page class:
    public CommonPages(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By START_NOW_BUTTON = By.id("next-button");
    By ACCEPT_COOKIES = By.id("nhsuk-cookie-banner__link_accept_analytics");

    By HEADING = By.className("heading-xlarge");

    public void initializeDriver(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
    }
    public void launchApplication() {
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        driver.manage().window().maximize();
    }

    public void clickOnStartNowButton() {
        driver.findElement(START_NOW_BUTTON).isDisplayed();
        driver.findElement(START_NOW_BUTTON).click();
    }

    public void acceptCookies() {
        driver.findElement(ACCEPT_COOKIES).click();
    }

    public String getTitle() {
        String actualTitle = driver.findElement(HEADING).getText();
        return actualTitle;
    }
    public void tearDown(){
        driver.quit();
    }
}
