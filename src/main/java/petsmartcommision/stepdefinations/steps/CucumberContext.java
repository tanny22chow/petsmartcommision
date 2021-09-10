package petsmartcommision.stepdefinations.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;
import petsmartcommision.springcontextmanager.RootContextManager;

@ContextConfiguration(classes = RootContextManager.class)
@CucumberContextConfiguration
public class CucumberContext {
}
