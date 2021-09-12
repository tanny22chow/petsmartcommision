package petsmartcommision.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class DriverProvider {

    private static RemoteWebDriver driver;

    private DriverProvider(){};

    public static RemoteWebDriver getDriverinsTance(String driverType){
        try{
                if(driverType=="local"){
                    ChromeOptions opt=new ChromeOptions();
                    opt.addArguments("--incognito");
                    driver=new ChromeDriver(opt);
                }
                else if(driverType=="bschrome"){
                    driver=driverProviderWithCapibility();
                }
        }catch (Exception e){

        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        return driver;
    }

    private static RemoteWebDriver driverProviderWithCapibility() throws MalformedURLException {
        String AUTOMATE_USERNAME = "harishsathisan2";
        String AUTOMATE_ACCESS_KEY = "98zSWchNpyytRL98ZSNs";
        String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Catalina");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "90.0");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("build", "Commission_Debug");
        caps.setCapability("browserstack.selenium_version", "3.14.0");
        return new RemoteWebDriver(new URL(URL),caps);

    }



}
