package pages;

import actions.ActionsUtil;
import driver.Driver;
import elements.Label;
import elements.TheUniqueElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.JsUtil;

import java.util.List;

public class PrivacyPage extends BaseForm {
    //The Unique Element or a Reference
    public PrivacyPage(){
        super(new TheUniqueElement(By.id("pageTitle")));
    }

    //Locators
    private final List<WebElement> allLanguages = Driver.getDriver().findElements(By.id("languages"));
    private final Label signature202X = new Label(By.xpath("//*[@id=\"newsColumn\"]/i[3]"));

    //Methods
    public void changeThePrivacyPolicyLanguage(){
        for(WebElement language : allLanguages){
            //String href = language.getAttribute("href");
            allLanguages.getFirst().click();
            allLanguages.get(1).click();
            allLanguages.get(2).click();
            allLanguages.get(3).click();
            allLanguages.get(4).click();
            allLanguages.get(5).click();
            allLanguages.get(6).click();
        }
    }

    public void scrollToFindSignature202X(){
        ActionsUtil.scrollToElement(signature202X); //With Selenium Action
        //JsUtil.scrollToFindElement(signature202X); //With Javascript
    }

    public boolean isSignature202XDisplayed(){
        return signature202X.isDisplayed();
    }
}
