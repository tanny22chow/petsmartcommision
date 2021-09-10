package petsmartcommision.PageObjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LandingComponent {

    @Autowired
    public BaseComponent baseComponent;

    public void openUrl(){
        baseComponent.driver.get("https://www.browserstack.com/");
    }
    public void openUrl2(){
        baseComponent.driver.get("https://www.google.com/");
    }
}
