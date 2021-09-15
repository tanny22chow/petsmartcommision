package petsmartcommision.stepdefinations.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import petsmartcommision.PageObjects.commonappComponent.BaseComponent;
import petsmartcommision.drivers.DriverProvider;

import java.io.File;


public class Hooks {

    private ApplicationContext applicationContext;

    @Autowired
    public Hooks(ApplicationContext applicationContext){
        this.applicationContext=applicationContext;
    };

    @Before
    public void startup(){
        RemoteWebDriver rd=applicationContext.getBean(BaseComponent.class).driver;
        if(rd.getSessionId()==null){
            applicationContext.getBean(BaseComponent.class).driver= DriverProvider.getDriverinsTance("bschrome");
        }
    }

    @After
    public void teardown(Scenario sc){
        if(sc.isFailed()){
            try{
                File f= ((TakesScreenshot)applicationContext.getBean(BaseComponent.class).driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/test-output/screenshots/" + sc.getName()+".png");
                FileUtils.copyFile(f,destinationPath);
            }catch (Exception e){

            }
        }
        System.out.println("teardown hooks called");
        destroyDriverInstance();
    }
    public void destroyDriverInstance(){
        applicationContext.getBean(BaseComponent.class).driver.quit();
    }
}
