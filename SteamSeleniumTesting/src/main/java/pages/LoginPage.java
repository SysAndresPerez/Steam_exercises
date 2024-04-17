package pages;

import elements.*;
import org.openqa.selenium.By;
import waits.Waits;

public class LoginPage extends BaseForm {

    //The Unique Element or a Reference
    public LoginPage(){
        super(new TheUniqueElement(By.xpath("//div[@class='_39uMKt8ePvr2Tw7x1YxJh3']")));
    }

    //Locators - In this case, I changed the old locators because now steam only uses magic numbers. In the future, maybe I will change the locators.
    private final TextBox userTxtBox = new TextBox(By.xpath("(//input[@type='text'])[1]"));
    private final TextBox passTxtBox = new TextBox(By.xpath("//input[@type='password']"));
    private final Button signBtn = new Button(By.xpath("//button[@type='submit']"));
    private final Label errorMsg = new Label(By.xpath("//div[@class='_1Mcy9wnDnt1Q72FijsNtHC']"));
    private final TextBox codeTxtBox = new TextBox(By.xpath("//div[@class='responsive_page_frame with_header']//input[1]")); //Works differently ... I guess.

    //Methods
    public void typeUser(String user){
        userTxtBox.sendKeys(user);
    }

    public void typePass(String pass){
        passTxtBox.sendKeys(pass);
    }

    public void clickSubmitBtn(){
        signBtn.click();
    }

    public boolean isErrorMsgDisplayed(){
        return Waits.waitForElementToBeDisplayed(errorMsg);
    }

    public boolean isCheckerDisplay(){
        return Waits.waitForElementToBeDisplayed(codeTxtBox);
    }
}
