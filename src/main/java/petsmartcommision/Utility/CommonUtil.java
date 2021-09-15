package petsmartcommision.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonUtil {

    public static void positionalClick(WebElement ele, WebDriver d){
        Actions act=new Actions(d);
        act.moveToElement(ele).click().perform();

    }
}
