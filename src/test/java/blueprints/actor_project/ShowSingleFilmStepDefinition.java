package blueprints.actor_project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.ResourceAccessException;

@ScenarioScope
public class ShowSingleFilmStepDefinition {
    @Autowired
    FilmRepository fr;

    int filmid;
    Film chosenFilm;

    @Given("film exists with id {int}")
    public void film_exists_with_id(int id){
        filmid = id;
        fr.findById(id)
                .orElseThrow(() -> new ResourceAccessException("Resource films/" + id + "could not be found"));
    }

    @When("i request film details")

    public void i_request_an_actors_details(){
        chosenFilm = fr.findById(filmid)
                .orElseThrow(() -> new ResourceAccessException("Resource films/" + filmid + "could not be found"));
        Assertions.assertNotEquals(null,chosenFilm,"Film not retrieved");
    }
    @Then("webpage should show the film {string}")
    public void webpage_should_show_the_film(String title){
        String correctDetails = title;
        String testDetails = chosenFilm.getTitle();
        Assertions.assertEquals(correctDetails,testDetails,"Film details do not match");
    }
}
