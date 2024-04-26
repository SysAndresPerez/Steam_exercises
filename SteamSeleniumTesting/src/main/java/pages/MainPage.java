package pages;

import elements.*;
import org.openqa.selenium.By;

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

    public void clickPrivacyBtn(){
        privacyBtn.click();
    }
}
