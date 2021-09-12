package petsmartcommision.stepdefinations.steps;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import petsmartcommision.PageObjects.LandingComponent;

public class LandingPage{


    @Autowired
    private LandingComponent landingComponent;

    @Given("^I am on commision landing page$")
    public void openLandingpage(){
        System.out.println("i am on Landing page");
        landingComponent.navigateToCommisionLandingpage();
    }

}
