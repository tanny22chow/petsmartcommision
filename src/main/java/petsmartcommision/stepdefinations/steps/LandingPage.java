package petsmartcommision.stepdefinations.steps;

import io.cucumber.java.en.Given;

import org.springframework.beans.factory.annotation.Autowired;
import petsmartcommision.PageObjects.LandingComponent;

public class LandingPage{


    @Autowired
    private LandingComponent landingComponent;

    @Given("^I am on the landing page$")
    public void openLandingpage(){
        System.out.println("i am on Landing page");
        landingComponent.openUrl();


    }
    @Given("^I am on the landing page2$")
    public void openLandingpage2(){
        System.out.println("i am on Landing page");
        landingComponent.openUrl2();


    }
}
