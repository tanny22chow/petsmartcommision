package petsmartcommision.PageObjects;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import petsmartcommision.PageObjects.commonappComponent.BaseComponent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LandingComponent {

    @Value("${app.username}")
    private String username;

    @Value("${app.password}")
    private String password;

    @Value("${app.url}")
    private String url;

    @Autowired
    public BaseComponent baseComponent;

    private By usernameField=By.id("login_input");
    private By passwordField=By.id("password");
    private By submitBtn=By.xpath("//span[text()='Sign In']");
    private By apps=By.xpath("//span[@title='Apps']");
    private By commission=By.linkText("Commissions");

    public void openUrl(){
        baseComponent.driver.get(url);
    }
    public void login(){
        baseComponent.driver.findElement(usernameField).sendKeys(username);
        baseComponent.driver.findElement(passwordField).sendKeys(password);
        baseComponent.driver.findElement(submitBtn).click();
        baseComponent.driver.findElement(apps).click();
        baseComponent.driver.findElement(commission).click();
    }
    public void navigateToCommisionLandingpage(){
//        openUrl();
//        login();
        logmessege();
    }
    public void logmessege(){
        try{
            FileWriter fw = new FileWriter("demo.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            pw.println(timeStamp);
            pw.flush();
            pw.close();
        }catch(Exception e){

        }
    }
}
