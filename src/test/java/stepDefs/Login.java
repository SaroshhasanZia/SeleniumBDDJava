package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static general.commonFunctions.browseUrl;
import static general.commonFunctions.maximizeBrowser;


public class Login {



    @Given("User is on the login screen")
    public void user_is_on_the_login_screen() {
        // Write code here that turns the phrase above into concrete actions
//        browseUrl("https://www.google.com/");
//        maximizeBrowser();
        System.out.println("User is on the login screen haha");}

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters password and username");

    }



    @And("Clicks on the login button")
    public void clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicks on the login button");


    }
    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is navigated to homepage");


    }



}
