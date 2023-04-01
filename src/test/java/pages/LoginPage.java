package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

    WebDriver driver;

    By START_NOW_BUTTON = By.id("next-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void startNow() {

        driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();

        driver.findElement(START_NOW_BUTTON).click();
    }
}
