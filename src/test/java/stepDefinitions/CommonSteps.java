package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CommonPages;

public class CommonSteps {

    WebDriver driver;
    CommonPages commonPages = new CommonPages(driver);

    @Before
    public void setUp(){
        commonPages.initializeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
    @Given("I launch the cost online service application.")
    public void iLaunchTheCostOnlineServiceApplication() {
        commonPages.launchApplication();
        commonPages.acceptCookies();
    }
    @Given("I start my NHS cost online service application")
    public void i_start_my_nhs_cost_online_service_application() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        commonPages.clickOnStartNowButton();
    }

    @Given("I am on the page {string}")
    public void i_am_on_the_page(String expectedTitle) {
        // Write code here that turns the phrase above into concrete actions
            String actualtitle = commonPages.getTitle();
            Assert.assertEquals(actualtitle,expectedTitle);
    }

}
