package petsmartcommision.PageObjects.commonappComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import petsmartcommision.Utility.CommonUtil;

import java.util.stream.Collectors;

@Component
public class CommonFilterView {

    private WebElement ele;

    @Autowired
    private BaseComponent baseComponent;

    private String processingunit="SALON";

    private By fieldName=By.xpath("//table[@id='search_conditions']//tbody/tr[1]/td[1]//select");
    private By comparision=By.xpath("//table[@id='search_conditions']//tbody/tr[1]/td[2]//select");
    private By value=By.xpath("//table[@id='search_conditions']//tbody/tr[1]/td[3]//input");
    private By valueDynamic=By.xpath("//li[text()='Please enter 1 or more character']/parent::ul/preceding-sibling::div//input");
    private By applyBtn=By.id("apply");
    private By processingUnitfield=By.xpath("//input[@placeholder='Filter by Processing Units']/preceding-sibling::div//input");



    public void selectFieldName(String option){
        ele=baseComponent.driver.findElement(fieldName);
        ele.click();
        selectFromList(option,ele);
    }
    public void selectComparision(String option){
        ele=baseComponent.driver.findElement(comparision);
        ele.click();
        selectFromList(option,ele);
    }
    public void setValue(String str){
        CommonUtil.positionalClick(baseComponent.driver.findElement(value),baseComponent.driver);
        try{
            if(baseComponent.driver.findElement(valueDynamic).isDisplayed()){
                baseComponent.driver.findElement(valueDynamic).click();
                baseComponent.driver.findElement(valueDynamic).sendKeys(str,Keys.ENTER);
                baseComponent.driver.findElement(By.xpath(String.format("//span[text()='%s']",str))).click();
                baseComponent.driver.findElement(processingUnitfield).click();
                baseComponent.driver.findElement(By.xpath(String.format("//div[@role='option'][text()='%s']",processingunit))).click();
                return;
            }
        }catch (Exception e){};

        ele=baseComponent.driver.findElement(value);
        ele.click();
        ele.sendKeys(str);

    }

    public void selectFromList(String option, WebElement ele){
        new Select(ele).getOptions().stream().filter(e->{
            return e.getText().equalsIgnoreCase(option);
        }).collect(Collectors.toList()).get(0).click();
    }
    public void clickapplyBtn(){
        baseComponent.driver.findElement(applyBtn).click();
    }

    public void filter(String str1,String str2,String str3){
        selectFieldName(str1);
        selectComparision(str2);
        setValue(str3);
        clickapplyBtn();
    }
}
