package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class NHSCostLoginSteps {
	
	WebDriver driver =null;
	LoginPage login;
	WhichCountryDoYouLiveInPage lic;
	IsYourGPPracticeInScotlandOrWalesPage gpPractice;
	WhichCountryIsYourDentalPracticeInPage dpCountry;
	WhatIsYourDateOfBirthPage dob;
	DoYouLiveWithPartnerPage lwp;
	DoYouClaimAnyBenefisTaxCreditsPage claims;
	UniversalCredit uc;
	JointUniversalCredit juc;
	CombinedTakeHomePay cthp;
	NHSCostHelpOutput output;
	
	@Given("I access NHS cost online service")
	public void i_access_nhs_cost_online_service() {
		
		String driverPath = System.getProperty("user.dir");
		System.out.println("Project driver path is"+ driverPath);
				
		System.setProperty("webdriver.chrome.driver",driverPath +"/src/test/resources/drivers/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@When("I start my application")
	public void i_start_my_application() {
				
		driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		login = new LoginPage(driver);
		login.startNow();		
	}

	@Then("^I choose (.*) as a live in country$") 
	public void i_choose_england_as_a_live_in_country(String country) {
		
		lic = new WhichCountryDoYouLiveInPage(driver);
		lic.liveInCountry(country);	   
	}
	
	@When("^I choose (.*) to GP practice in Scotland or Wales$")
	public void i_choose_no_to_gp_practice_in_scotland_or_wales(String option) {
		
	    gpPractice = new IsYourGPPracticeInScotlandOrWalesPage(driver);
	    gpPractice.gPpracticeInScotlandOrWales(option);
	}

	@When("^My dental practice is in (.*)$")
	public void my_dental_practice_is_in_england(String dp_country) {
		dpCountry = new WhichCountryIsYourDentalPracticeInPage(driver);
		dpCountry.dentalPracticeCountry(dp_country);
	}

	@When("^My date of birth is (.*), (.*), (.*)$")
	public void my_date_of_birth_is(Integer day, Integer month, Integer year) {
		dob = new WhatIsYourDateOfBirthPage(driver);
		dob.dateOfBirth(day, month, year);
	}

	@When("^I choose (.*) to live with partner$")
	public void i_choose_to_live_with_partner(String partner_option) {
		lwp = new DoYouLiveWithPartnerPage(driver);
		lwp.liveWithPartner(partner_option);		
	}

	@When("^I choose (.*) for claim any benefits or tax credits$")
	public void i_choose_for_claim_any_benefits_or_tax_credits(String claim_option) {
		claims = new DoYouClaimAnyBenefisTaxCreditsPage(driver);
		claims.claimBenefits(claim_option);
	}
	
	@When("^My partner (.*) get universal credit payments$")
	public void my_partner_does_getuniversal_credit_payments(String uc_option) {
	    uc = new UniversalCredit(driver);
	    uc.universalCredit(uc_option);
	}

	@When("^As part of joint universal credit (.*) responsibilities$")
	public void as_part_of_joint_universal_credit_do_not_have_responsibilities(String credit_option) {
		juc = new JointUniversalCredit(driver);
		juc.jointUniversalCredit(credit_option);
	}

	@When("^I choose (.*) to have a combined take-home pay$")
	public void i_choose_to_have_a_combined_take_home_pay(String pay_option) {
		cthp = new CombinedTakeHomePay(driver);
		cthp.combinedTakeHomePay(pay_option);
	}

	@Then("^I will see (.*) screen$")
	public void i_will_see_get_help_with_nhs_costs_screen(String message) {
	   output = new NHSCostHelpOutput(driver);
	   output.getOutputScreen(message);

	   driver.quit();
	}

	@And("I choose {string} to live in the Highlands and Islands")
	public void iChooseToLiveInTheHighlandsAndIslands(String arg0) {
	}
}
