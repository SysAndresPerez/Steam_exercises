package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jsonReader.JsonReaderUtil;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    //WebDriver using Singleton

    protected static WebDriver driver;

    public synchronized static WebDriver getDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            //If is necessary use the headless mode put "options" between the parenthesis.
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void goToURL() {
        try {
            getDriver().navigate().to(JsonReaderUtil.getValue("configData", "URL"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void refreshPage(){
        Driver.getDriver().navigate().refresh();
    }

    public static void configuration(){
        //getDriver().manage().window().maximize();
        getDriver().manage().window().setSize(new Dimension(1024, 768));
        getDriver().manage().window().setPosition(new Point(100, 100));
    }

    public static void closeWindow() {
        if (driver != null) {
            driver.close();
        }
    }

    public static void quit(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}