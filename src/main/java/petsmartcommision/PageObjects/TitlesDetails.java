package petsmartcommision.PageObjects;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import petsmartcommision.PageObjects.commonappComponent.BaseComponent;

@Component
public class TitlesDetails {

    @Autowired
    private BaseComponent baseComponent;

    private By groomPayrateval=By.xpath("//legend[text()='Custom Fields']/following-sibling::table//td[2]//div[2]/div[1]");

    public String getGroomPayVal(){
        return baseComponent.driver.findElement(groomPayrateval).getText();
    }
}
