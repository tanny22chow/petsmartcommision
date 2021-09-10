package petsmartcommision.PageObjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LandingComponent {

    private WebDriver driver;

    @Autowired
    public BaseComponent baseComponent;

    public LandingComponent(BaseComponent baseComponent){
        this.driver=baseComponent.driver;
    }


    public void openUrl(){
        driver.get("https://www.browserstack.com/");
    }
    public void openUrl2(){
        driver.get("https://www.google.com/");
    }
}
