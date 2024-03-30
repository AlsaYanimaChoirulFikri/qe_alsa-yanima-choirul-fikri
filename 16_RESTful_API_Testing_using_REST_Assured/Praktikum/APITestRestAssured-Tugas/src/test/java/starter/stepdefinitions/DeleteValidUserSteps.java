package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteValidUser;

public class DeleteValidUserSteps {

    @Steps(shared = true)
    DeleteValidUserSteps deleteValidUserSteps;

    @Given("I set API endpoint for delete user with valid id")
    public void setDeleteValidUserSteps(){
        deleteValidUserSteps.setDeleteValidUserSteps();
    }

    @When("I send request to delete user with valid ID")
    public void sendDeleteUserRequest(){
        deleteValidUserSteps.sendDeleteUserRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200(){
        deleteValidUserSteps.receiveStatusCode200();
    }
}
