package pages;

import actions.ActionsUtil;
import elements.*;
import org.openqa.selenium.By;
import utils.JsUtil;

public class MainPage extends BaseForm {

    //The Unique Element or a Reference
    public MainPage(){
        super(new TheUniqueElement(By.id("home_maincap_v7")));
    }

    //Locators
    private final Button loginBtn = new Button(By.xpath("//a[@class='global_action_link']"));
    private final Button privacyBtn = new Button(By.xpath(""));

    //Methods
    public void clickLoginBtn(){
        loginBtn.click();
    }

    public void scrollUntilFindPrivacyBtn(){
        ActionsUtil.scrollToElement(privacyBtn); //With Selenium Action
        //JsUtil.scrollToFindElement(privacyBtn); //With Javascript
    }

    public void clickPrivacyBtn(){
        privacyBtn.click();
    }
}
