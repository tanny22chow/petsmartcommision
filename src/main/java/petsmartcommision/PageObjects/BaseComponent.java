package petsmartcommision.PageObjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import petsmartcommision.drivers.DriverProvider;

import javax.annotation.PostConstruct;


@Component
public class BaseComponent  {

    public WebDriver driver;

    @PostConstruct
    public void init(){
        if(driver==null){
           driver= DriverProvider.getDriverinsTance("local");
        }
    }


}
