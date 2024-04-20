package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.RandomStringGenerator;

public class SteamCases extends BaseTest {

    @Test (priority = 1)
    public void invalidLogin(){

        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isItDisplay(), "The Main Page is NOT displayed");

        mainPage.clickLoginBtn();

        LoginPage loginPage = new LoginPage();

        Assert.assertTrue(loginPage.isItDisplay(),"The Login Page is NOT displayed");

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

    @Test (priority = 2)
    public void mostPlayedGames(){

        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isItDisplay(), "The Main Page is NOT displayed");

        NavBar navBar = new NavBar();

        Assert.assertTrue(navBar.isItDisplay(), "The NavBar is NOT displayed");

        navBar.mouseHoverSecondTab();
        navBar.clickMostPlayed();

        MostPlayedPage mostPlayedPage = new MostPlayedPage();

        Assert.assertTrue(mostPlayedPage.isItDisplay(), "The Most Played Page is NOT Displayed");

        Assert.assertTrue(mostPlayedPage.getPlayersFirstGame() > mostPlayedPage.getPlayersSecondGame(), "The 2nd Game has more players");

        Assert.assertTrue(mostPlayedPage.getPlayersSecondGame() > mostPlayedPage.getPlayersThirdGame(), "The 3rd Game has more players");
    }

    @Test (priority = 3)
    public void changeLanguages(){

        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isItDisplay(), "The Main Page is NOT displayed");


    }

    @Test (priority = 4)
    public void newsFilters(){

        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isItDisplay(), "The Main Page is NOT displayed");

        NavBar navBar = new NavBar();

        Assert.assertTrue(navBar.isItDisplay(), "The NavBar is NOT Displayed");

        navBar.clickNewsTabBar();

        NewsPage newsPage = new NewsPage();

        Assert.assertTrue(newsPage.isItDisplay(), "The News Page is NOT displayed");

        newsPage.clickOptionsAndFiltersBtn();
        newsPage.clickAllOptions();

        Assert.assertTrue(newsPage.isNoPostFoundMsgIsDisplayed(), "The Message is NOT displayed");
    }
}