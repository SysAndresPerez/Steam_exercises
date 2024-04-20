package pages;

import driver.Driver;
import elements.Button;
import elements.CheckBox;
import elements.Label;
import elements.TheUniqueElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsPage extends BaseForm {

    //The Unique Element or a Reference
    public NewsPage(){
        super(new TheUniqueElement(By.id("eventcalendar_CalendarRow_uRe48")));
    }

    //Locators
    private final Button optionsAndFiltersBtn = new Button(By.className("eventcalendar_FilterSettingsCtn_1C7Qd"));

    private final CheckBox eventsBox = new CheckBox(By.xpath("(//div[contains(@class,'DialogToggle_Label')])[1]"));
    private final CheckBox liveStreamBox = new CheckBox(By.xpath("(//div[contains(@class,'DialogToggle_Label')])[2]"));
    private final CheckBox contentUpdatesBox = new CheckBox(By.xpath("(//div[contains(@class,'DialogToggle_Label')])[3]"));
    private final CheckBox releasesBox = new CheckBox(By.xpath("(//div[contains(@class,'DialogToggle_Label')])[4]"));
    private final CheckBox salesBox = new CheckBox(By.xpath("(//div[contains(@class,'DialogToggle_Label')])[5]"));
    private final CheckBox newsBox = new CheckBox(By.xpath("(//div[contains(@class,'DialogToggle_Label')])[6]"));

    private final Label noPostsFoundMessage = new Label(By.xpath("//div[contains(@class,'eventcalendar_EndOfRows_fIf4x')]/div[1]"));

    //Methods - Atomic and All in one, You can choose
    public void clickOptionsAndFiltersBtn(){
        optionsAndFiltersBtn.click();
    }

    public void clickEventBox(){
        eventsBox.click();
    }

    public void clickLiveStreamBox(){
        liveStreamBox.click();
    }

    public void clickContentUpdatesBox(){
        contentUpdatesBox.click();
    }

    public void clickReleasesBox(){
        releasesBox.click();
    }

    public void clickSalesBox(){
        salesBox.click();
    }

    public void clickNewsBox(){
        newsBox.click();
    }

    public void clickAllOptions(){
        eventsBox.click();
        liveStreamBox.click();
        contentUpdatesBox.click();
        releasesBox.click();
        salesBox.click();
        newsBox.click();
    }

    public void clickAllOptionsWithList(){
        List<WebElement> optionList = Driver.getDriver().findElements(By.className("Focusable"));
        optionList.get(0).click();
        optionList.get(2).click();
        optionList.get(4).click();
        optionList.get(6).click();
        optionList.get(8).click();
        optionList.get(10).click();
    }

    public boolean isNoPostFoundMsgIsDisplayed(){
        return noPostsFoundMessage.isDisplayed();
    }
}