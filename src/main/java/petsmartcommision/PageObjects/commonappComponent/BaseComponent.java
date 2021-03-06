package petsmartcommision.PageObjects.commonappComponent;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.stereotype.Component;
import petsmartcommision.drivers.DriverProvider;

import javax.annotation.PostConstruct;

@Component
public class BaseComponent  {

    public RemoteWebDriver driver;

    @PostConstruct
    public void init(){
        if(driver==null){
           driver= DriverProvider.getDriverinsTance("local");
        }
    }


}
