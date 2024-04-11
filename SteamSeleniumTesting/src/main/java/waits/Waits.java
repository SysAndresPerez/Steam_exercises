package waits;

import driver.Driver;
import elements.BaseElement;
import elements.Button;
import jsonReader.JsonReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    protected static WebDriverWait expWait;

    public static WebDriverWait getWait(){
        if(expWait == null){
            int timeToWait = Integer.parseInt(JsonReaderUtil.getValue("configData", "Time"));
            expWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWait));
        }
        return expWait;
    }

    public static boolean waitForElementToBeDisplayed(BaseElement element){
        return getWait().until(driver -> element.isDisplayed());
    }

    public static WebElement waitForElementToBePresent(By locator){
        return getWait().until(driver -> driver.findElement(locator));
    }

    public static WebElement waitToBeClickable(Button locator){
        return getWait().until(ExpectedConditions.elementToBeClickable(locator.getElement()));
    }
}
