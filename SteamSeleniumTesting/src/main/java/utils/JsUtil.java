package utils;

import driver.Driver;
import elements.BaseElement;
import org.openqa.selenium.JavascriptExecutor;

public class JsUtil {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    public void scrollToFindElement(BaseElement element){
        js.executeScript("arguments[0].scrollIntoView();", element.getElement());
    }
}