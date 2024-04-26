package utils;

import driver.Driver;

public class inOtherTab {
    public static void handleTheOtherTab(){
        Driver.getDriver().getWindowHandles().forEach(tab -> Driver.getDriver().switchTo().window(tab));
    }
}