package tests;

import jsonReader.JsonReaderUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utils.RandomStringGenerator;

public class SteamCases extends BaseTest {

    @Test (priority=1)

    public void invalidLogin(){

        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isPageDisplay(), "The Main Page is NOT displayed");

        mainPage.clickLoginBtn();

        LoginPage loginPage = new LoginPage();

        Assert.assertTrue(loginPage.isPageDisplay(),"The Login Page is NOT displayed");

        //Normal Flow
        loginPage.typeUser(RandomStringGenerator.randomString());
        loginPage.typePass(RandomStringGenerator.randomString());
        loginPage.clickSubmitBtn();

        Assert.assertTrue(loginPage.isErrorMsgDisplayed(),"The Access was NOT denied, The error message is NOT displayed");

        //Alternative Flow
        /*
        loginPage.typePass(JsonReaderUtil.getValue("testData", "User"));
        loginPage.typePass(JsonReaderUtil.getValue("testData", "Pass"));
        loginPage.clickSubmitBtn();

        Assert.assertTrue(loginPage.isCheckerDisplay(), "The Checker is NOT displayed");
         */
    }
}