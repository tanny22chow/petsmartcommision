package petsmartcommision.stepdefinations.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import petsmartcommision.PageObjects.BaseComponent;
import petsmartcommision.drivers.DriverProvider;


public class Hooks {

    private ApplicationContext applicationContext;

    @Autowired
    public Hooks(ApplicationContext applicationContext){
        this.applicationContext=applicationContext;
    };

    @Before
    public void startup(){
        RemoteWebDriver rd=((RemoteWebDriver)applicationContext.getBean(BaseComponent.class).driver);
        if(rd.getSessionId()==null){
            applicationContext.getBean(BaseComponent.class).driver= DriverProvider.getDriverinsTance("local");
        }
    }

    @After
    public void teardown(){
        System.out.println("teardown hooks called");
        destroyDriverInstance();
    }
    public void destroyDriverInstance(){
        applicationContext.getBean(BaseComponent.class).driver.quit();
    }
}
