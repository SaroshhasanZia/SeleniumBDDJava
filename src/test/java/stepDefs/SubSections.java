package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static general.commonFunctions.scrollToBottom;
import static objects.SubSection.*;
import static objects.homePage.clickOnContactUs;
import static objects.homePage.homePage;

public class SubSections {


    @Given("User is at homepage")
    public void userIsAtHomepage() throws InterruptedException {
        homePage();

    }

    @When("^User clicks on StartUp$")
    public void userClicksOnStartUp() {
        clickOnStartUps();

        }

    @Then("User is navigated to StartUp page")
    public void userIsNavigatedToStartUpPage() {
        getSection("STARTUPS");
        scrollToBottom();
    }


    @When("User clicks on Enterprise")
    public void userClicksOnEnterprise() {
        clickOnEnterprise();
    }

    @Then("User is navigated to Enterprise page")
    public void userIsNavigatedToEnterprisePage() {
        getSection("ENTERPRISE");
        scrollToBottom();
    }

    @When("User clicks on VC Firms")
    public void userClicksOnVCFirms() {
        clickOnVCFirms();
    }

    @Then("User is navigated to VC Firm page")
    public void userIsNavigatedToVCFirmPage() {
        getSection("VC FIRMS");
        scrollToBottom();
    }
}

