package petsmartcommision.stepdefinations.steps;

import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import petsmartcommision.PageObjects.TitlesDetails;
import static org.assertj.core.api.Assertions.*;

public class TitlesDetailsPage {

    @Autowired
    private TitlesDetails titlesDetails;

    @Then("^verify groom pay value$")
    public void clcikFilterIcon() throws InterruptedException {
        Thread.sleep(10000);
        assertThat(titlesDetails.getGroomPayVal()).isEqualTo("50%").as("groom pay value mismatched");
    }
}
