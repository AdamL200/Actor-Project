package blueprints.actor_project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;

@ScenarioScope
public class ShowSingleActorStepDefinition {
    @Autowired
    ActorRepository ar;

    int actorid;
    Actor chosenActor;

    @Given("actor exists with id {int}")
    public void actor_exists_with_id(int id){
        actorid = id;
        ar.findById(id)
                .orElseThrow(() -> new ActorNotFoundException(id));
    }

    @When("i request an actors details")

    public void i_request_an_actors_details(){
        chosenActor = ar.findById(actorid)
                .orElseThrow(() -> new ActorNotFoundException(actorid));
        Assertions.assertNotEquals(null,chosenActor,"Actor not retrieved");
    }
    @Then("webpage should show the actors {string} and {string}")
    public void webpage_should_show_the_actors_firstname_and_lastname(String firstname, String lastname){
        String correctDetails = firstname + " " + lastname;
        String testDetails = chosenActor.getFirstname() + " " + chosenActor.getLastname();
        Assertions.assertEquals(correctDetails,testDetails,"Actor details do not match");
    }
}
