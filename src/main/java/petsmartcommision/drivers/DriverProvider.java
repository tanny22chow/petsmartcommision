package petsmartcommision.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverProvider {

    private static WebDriver driver;

    private DriverProvider(){};

    public static WebDriver getDriverinsTance(String driverType){
        try{
                if(driverType=="local"){
                    driver=new ChromeDriver();
                    return driver;
                }
                else if(driverType=="bschrome"){
                    driver=driverProviderWithCapibility();
                    return driver;
                }
        }catch (Exception e){

        }
        return null;
    }

    private static WebDriver driverProviderWithCapibility() throws MalformedURLException {
        String AUTOMATE_USERNAME = "harishsathisan2";
        String AUTOMATE_ACCESS_KEY = "98zSWchNpyytRL98ZSNs";
        String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Catalina");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "90.0");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browserstack.selenium_version", "3.14.0");
        return new RemoteWebDriver(new URL(URL),caps);

    }



}
