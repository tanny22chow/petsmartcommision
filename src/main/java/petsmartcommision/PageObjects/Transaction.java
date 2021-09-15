package petsmartcommision.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import petsmartcommision.PageObjects.commonappComponent.BaseComponent;

@Component
public class Transaction {

    @Autowired
    private BaseComponent baseComponent;

    private By avgHourlyRateVal=By.xpath("//legend[text()='Custom Fields']/following-sibling::table//tr[2]/td[1]/div[2]");

    public void selectRowBasedOnOrderId(String orderId){
        baseComponent.driver.findElements(By.xpath(String.format("//td[@title='%s']/preceding-sibling::td/input",orderId))).get(0).click();
    }

    public String getavgHourlyRateVal(){
        WebElement element= baseComponent.driver.findElement(avgHourlyRateVal);
        JavascriptExecutor js=((JavascriptExecutor)baseComponent.driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        return element.getText();
    }
}
