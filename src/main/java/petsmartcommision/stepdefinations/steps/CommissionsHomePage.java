package petsmartcommision.stepdefinations.steps;

import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import petsmartcommision.PageObjects.CommissionHomeComponent;

public class CommissionsHomePage {

    @Autowired
    private CommissionHomeComponent commissionHomeComponent;

    @Then("^navigate to transaction page$")
    public void navigateToCalculations(){
        commissionHomeComponent.navigateToCalculations();
        commissionHomeComponent.navigateToTransactions();
        System.out.println("i am on calculations page");

    }
    @Then("^navigate to Titles page$")
    public void navigateToTitles(){
        commissionHomeComponent.navigateToTitles();
        System.out.println("i am on Titles page");

    }
}
