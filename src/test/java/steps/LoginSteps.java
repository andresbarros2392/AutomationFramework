package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {

    @Given("^I login into the app with \"([^\"]*)\" username and \"([^\"]*)\" password$")
    public void iLoginIntoTheAppWithUsernameAndPassword(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @Given("I navigate to sign up page")
    public void iNavigateToSignUpPage() {
    }

    @When("^I navigate to homepage$")
    public void navigateToHomepage(){
        System.out.println("I'm navigating here");
    }

    @Then("^I should be able to see all my accounts$")
    public void validateAccountsVisibility(){
        System.out.println("I'm validating here");
    }


    @When("User sign up with the right info")
    public void userSignUpWithTheRightInfo(DataTable data) {
        List<List<String>> obj = data.asLists();

    }
}
