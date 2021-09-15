package petsmartcommision.stepdefinations.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import petsmartcommision.PageObjects.Transaction;

public class TransactionPage {

    @Autowired
    private Transaction transaction;


    @Then("^select row with$")
    public void selectRowWithParam(DataTable data) throws InterruptedException {
        transaction.selectRowBasedOnOrderId(data.asList().get(0));
        Thread.sleep(10000);
    }

    @Then("^verify hourly avg value$")
    public void verifyValue(){
        System.out.println(transaction.getavgHourlyRateVal());
        assertThat(transaction.getavgHourlyRateVal()).isNotEqualTo(null).as("No avg value available");
    }
}
