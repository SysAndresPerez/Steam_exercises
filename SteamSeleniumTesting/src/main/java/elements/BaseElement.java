package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import waits.Waits;

public abstract class BaseElement{

    private final By locator;

    public BaseElement(By locator){
        this.locator = locator;
    }

    public WebElement getElement(){
        return Waits.waitForElementToBePresent(locator);
    }

    public Boolean isDisplayed(){
        try {
            return getElement().isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void click(){
        getElement().click();
    }

    public String getText(){
        return getElement().getText();
    }
}