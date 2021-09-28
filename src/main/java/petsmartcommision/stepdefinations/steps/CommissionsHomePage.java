package petsmartcommision.stepdefinations.steps;

import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import petsmartcommision.PageObjects.CommissionHomeComponent;
import petsmartcommision.PageObjects.commonappComponent.CommonSearchBar;

public class CommissionsHomePage {

    @Autowired
    private CommissionHomeComponent commissionHomeComponent;

    @Autowired
    private CommonSearchBar commonSearchBar;

    @Then("^navigate to transaction page$")
    public void navigateToCalculations(){
        commissionHomeComponent.navigateToCalculations();
        commissionHomeComponent.navigateToTransactions();
        System.out.println("i am on transaction page");

    }
    @Then("^navigate to Titles page$")
    public void navigateToTitles(){
        commissionHomeComponent.navigateToTitles();
        System.out.println("i am on Titles page");
    }
    @Then("^click on filter icon$")
    public void clcikFilterIcon(){
        commonSearchBar.clickFilterIcon();
    }

}
