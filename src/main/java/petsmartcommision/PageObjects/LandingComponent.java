package petsmartcommision.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
        openUrl();
        login();

    }
}
