package utils;

import driver.Driver;
import elements.BaseElement;
import org.openqa.selenium.JavascriptExecutor;

public class JsUtil {

    private final static JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    public static void scrollToFindElement(BaseElement element){
        js.executeScript("arguments[0].scrollIntoView();", element.getElement());
    }
}