package pages;

import elements.Button;
import elements.Label;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {

    public MainPage(){
        super(new Label(By.id("home_maincap_v7")));
    }

    //Locators
    private final Button loginBtn = new Button(By.className("global_action_link"));

    //Methods
    public void clickLoginBtn(){
        loginBtn.click();
    }
}
