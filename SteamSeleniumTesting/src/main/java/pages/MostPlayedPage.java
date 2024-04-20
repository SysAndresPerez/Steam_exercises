package pages;

import elements.Button;
import elements.Label;
import elements.TheUniqueElement;
import org.openqa.selenium.By;

public class MostPlayedPage extends BaseForm {

    //The Unique Element or a Reference
    public MostPlayedPage(){
        super(new TheUniqueElement(By.xpath("//table[@class='_3arZn0BMPzyhcYNADe193m']")));
    }

    //Locators - In this case, I used magic numbers but can be changed in the future.
    private final Label firstGame = new Label(By.xpath("//div[contains(@id, 'page_root')]//table//tr[1]/td[5]"));
    private final Label secondGame = new Label(By.xpath("//div[contains(@id, 'page_root')]//table//tr[2]/td[5]"));
    private final Label thirdGame = new Label(By.xpath("//div[contains(@id, 'page_root')]//table//tr[3]/td[5]"));

    //Methods
    public Integer getPlayersFirstGame(){
        String fistTextValue = firstGame.getText().replace(",", "");
        return Integer.parseInt(fistTextValue);
    }

    public Integer getPlayersSecondGame(){
        String secondTextValue = secondGame.getText().replace(",", "");
        return Integer.parseInt(secondTextValue);
    }

    public Integer getPlayersThirdGame(){
        String thirdTextValue = thirdGame.getText().replace(",", "");
        return Integer.parseInt(thirdTextValue);
    }
}