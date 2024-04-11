package tests;

import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @BeforeMethod
    public void setUp(){
        Driver.configuration();
        Driver.goToURL();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quit();
    }
}
