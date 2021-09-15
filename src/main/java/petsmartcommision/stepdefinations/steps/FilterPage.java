package petsmartcommision.stepdefinations.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import petsmartcommision.PageObjects.commonappComponent.CommonFilterView;

import java.util.List;

public class FilterPage {

    @Autowired
    private CommonFilterView commonFilterView;

    @Then("^filter with$")
    public void filterTitle(DataTable table) throws InterruptedException {
        List<String> l=table.asList();
        commonFilterView.filter(l.get(0),l.get(1),l.get(2));
        Thread.sleep(10000);
    }
}
