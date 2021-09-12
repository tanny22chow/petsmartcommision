package petsmartcommision.PageObjects;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommissionHomeComponent {

    @Autowired
    private BaseComponent basecomponent;

    private By titles= By.xpath("//span[text()='Titles']");
    private By calculations= By.xpath("//span[text()='Calculations']");
    private By tx= By.linkText("Transactions");

    public void navigateToTitles(){
        basecomponent.driver.findElement(titles).click();
    }
    public void navigateToCalculations(){
        basecomponent.driver.findElement(calculations).click();
    }
    public void navigateToTransactions(){
        basecomponent.driver.findElement(tx).click();
    }
}
