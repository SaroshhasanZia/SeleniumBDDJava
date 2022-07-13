package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static general.commonFunctions.scrollToBottom;
import static objects.OurExpertise.*;
import static objects.homePage.homePage;
import static objects.homePage.scrollToForm;

public class OurExpertis {
    
    


    @Given("^User clicks on dropdown$")
    public void userClicksOnDropdown()  {
        navigateToExpertiseDropdown();

    }

    @And("User selects Big Data And BI")
    public void userSelectsBigDataAndBI() throws InterruptedException {
        selectBigData();
    }


    @Then("User lands on Big Data And BI")
    public void userLandsOnBigDataAndBI() {
        userLandsOnBigDataPage();
    }

    @Then("User navigate to the form")
    public void userNavigateToTheForm() {
        scrollToBottom();
        scrollToForm();
    }

    @And("User selects AI and Machine Learning")
    public void userSelectsAIAndMachineLearning() throws InterruptedException {
        selecMachineLearning();
    }

    @Then("User lands on AI and Machine Learning")
    public void userLandsOnAIAndMachineLearning() {
        userLandsOnMachineLearningPage();
    }

    @And("User selects Web And Mobile Application")
    public void userSelectsWebAndMobileApplication() throws InterruptedException {
        selectWebAndMobileApp();
    }

    @Then("User lands on Web And Mobile Application page")
    public void userLandsOnWebAndMobileApplicationPage() {
        userLandsOnWebAndMobileAppPage();
    }

    @And("User selects Enterprise Applications")
    public void userSelectsEnterpriseApplications() throws InterruptedException {
        selectEnterpriseApp();
    }

    @Then("User lands on Enterprise Applications page")
    public void userLandsOnEnterpriseApplicationsPage() {
        userLandsOnEnterpriseAppPage();
    }

    @And("User selects Salesforce")
    public void userSelectsSalesforce() throws InterruptedException {
        selectSalesforce();
    }

    @Then("User lands on Salesforce page")
    public void userLandsOnSalesforcePage() {
        userLandsOnSalesforcePage();
    }

    @And("User selects Cloud Services")
    public void userSelectsCloudServices() throws InterruptedException {
        selectCloudServices();
    }

    @Then("User lands on Cloud Services")
    public void userLandsOnCloudServices() {
        userLandsOnCloudServicesPage();
    }
}

