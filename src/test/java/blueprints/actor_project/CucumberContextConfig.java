package blueprints.actor_project;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = ActorApplication.class)
public class CucumberContextConfig {
}
