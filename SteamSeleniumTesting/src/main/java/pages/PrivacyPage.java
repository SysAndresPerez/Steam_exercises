package pages;

import actions.ActionsUtil;
import elements.Button;
import elements.TheUniqueElement;
import org.openqa.selenium.By;
import waits.Waits;

public class PrivacyPage extends BaseForm {
    //The Unique Element or a Reference
    public PrivacyPage(){
        super(new TheUniqueElement(By.id("store_nav_area")));
    }

    //Locators
    private final Button secondTabBar = new Button(By.xpath("noteworthy_tab"));
    private final Button mostPlayedBtn = new Button(By.xpath("//*[contains(@id, 'noteworthy_flyout')]/div/a[2]")); // --> You can use this path only change the Spanish to English //a[normalize-space()='Los más jugados']
    private final Button newsTabBar = new Button(By.xpath(("//*[@id='store_nav_area']/div[2]/div/a[2]/span")));

    //Methods
    public void mouseHoverSecondTab(){
        ActionsUtil.hoverMouse(secondTabBar);
    }

    public void clickMostPlayed(){
        Waits.waitToBeClickable(mostPlayedBtn).click();
    }

    public void clickNewsTabBar(){
        Waits.waitToBeClickable(newsTabBar).click();
    }
}
