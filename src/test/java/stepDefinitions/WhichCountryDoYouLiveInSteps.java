package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.WhichCountryDoYouLiveInPage;

public class WhichCountryDoYouLiveInSteps {
    WebDriver driver;
    WhichCountryDoYouLiveInPage whichCountryDoYouLivePages = new WhichCountryDoYouLiveInPage(driver);

    @Given("I will see {string} page")
    public void i_will_see_page(String expectedTitle) {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = whichCountryDoYouLivePages.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("I choose an option live in country as {string}")
    public void i_choose_an_option_live_in_country_as(String countryName) {
        // Write code here that turns the phrase above into concrete actions
        whichCountryDoYouLivePages.selectCountry(countryName);
    }

    @Then("I will see {string} screen")
    public void i_will_see_screen(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("I choose {string} to live in the Highlands and Islands")
    public void iChooseToLiveInTheHighlandsAndIslands(String arg0) {
    }


}

