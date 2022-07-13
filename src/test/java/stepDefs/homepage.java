package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static general.commonAssertions.textAssertion;
import static general.commonFunctions.*;
import static objects.homePage.assertHomepage;
import static objects.homePage.*;

public class homepage {


    @Given("User browse the URL")
    public void userBrowseTheURL() throws InterruptedException {
        browse();

    }


    @Then("User is navigated to homepage")
    public void userIsNavigatedToHomepage() {
        assertHomepage();

    }

    @Given("User is at the homepage")
    public void userIsAtTheHomepage() throws InterruptedException {
        homePage();

    }

    @When("User clicks on the Contact Us button")
    public void userClicksOnTheContactUsButton() throws InterruptedException {

        clickOnContactUs();
    }

    @Then("User is navigated to the form")
    public void userIsNavigatedToTheForm() {
        scrollToForm();
    }

    @And("User fills the form")
    public void userFillsTheForm() throws InterruptedException {
        Thread.sleep(3000);
        formFill();
    }

    @And("User clicks on the submit button")
    public void userClicksOnTheSubmitButton() throws InterruptedException {
        clickButton();
    }

    @Then("User gets success message")
    public void userGetsSuccessMessage() {
        formSubmitted();

    }

    @When("User clicks on the Schedule a consultation button")
    public void userClicksOnTheScheduleAConsultationButton() {
        clickOnScheduleConsultation();
    }

    @When("User clicks on More About Us button")
    public void userClicksOnMoreAboutUsButton() {
        clickMoreAboutUs();
    }

    @Then("User is navigated to the About Us page")
    public void userIsNavigatedToTheAboutUsPage() {
        getPage("ABOUT US");
        scrollToBottom();

    }

    @And("User navigates to the form")
    public void userNavigatesToTheForm() {
    }

    @When("User clicks on Case Study button")
    public void userClicksOnCaseStudyButton() {
        clickCaseStudy();
    }

    @Then("User is navigated to the Case Study page")
    public void userIsNavigatedToTheCaseStudyPage() {
        assertCaseStudyPage();
    }

    @When("User clicks on the Language dropdown")
    public void userClicksOnTheLanguageDropdown() {
        clickOnLangBtn();
    }

    @And("User select Dutch language")
    public void userSelectDutchLanguage() throws InterruptedException {
        changeLanguage();
    }

    @Then("User gets the content in Dutch Language")
    public void userGetsTheContentInDutchLanguage() {
        langChangeAssertion();
    }

    @When("User Navigates to the bottom of the page")
    public void userNavigatesToTheBottomOfThePage() {
        navigatesToBottom();
    }

    @And("User click on Privacy Policy")
    public void userClickOnPrivacyPolicy() {
        clickOnPrivacyPolicy();
    }

    @Then("User Navigates to Privay policy page")
    public void userNavigatesToPrivayPolicyPage() {
        privacyAssertion();
    }
}
