package petsmartcommision.PageObjects.commonappComponent;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonSearchBar {

    @Autowired
    private BaseComponent baseComponent;

    private By filterIcon=By.xpath("//span[@title='Advanced Search']");

    public void clickFilterIcon(){
        baseComponent.driver.findElement(filterIcon).click();
    }


}
