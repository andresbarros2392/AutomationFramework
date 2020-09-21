package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSteps {

    @When("I click on any account")
    public void iClickOnAnyAccount() {
        System.out.println("Clicking account");
    }

    @Then("I should be able to see account details")
    public void iShouldBeAbleToSeeAccountDetails() {
        Assert.assertFalse(true);
    }
}
