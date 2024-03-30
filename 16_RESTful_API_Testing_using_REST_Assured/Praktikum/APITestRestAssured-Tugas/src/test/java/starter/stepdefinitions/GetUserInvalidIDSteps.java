package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetUserInvalidIDSteps {

    @Steps(shared = true)
    GetUserInvalidIDSteps getUserInvalidIDSteps;

    @Given("I set API endpoint with an invalid ID")
    public void setApiEndInvalidId(){
        getUserInvalidIDSteps.setApiEndInvalidId();
    }

    @When("I send request using invalid ID")
    public void sendRequestInvalidId(){
        getUserInvalidIDSteps.sendRequestInvalidId();
    }

    @Then("I receive error message and \"404 Not Found\" response")
    public void receive404(){
        getUserInvalidIDSteps.receive404();
    }
}
