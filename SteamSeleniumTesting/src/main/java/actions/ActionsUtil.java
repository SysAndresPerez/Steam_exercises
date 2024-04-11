package actions;

import driver.Driver;
import elements.BaseElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {

    private static Actions actions;

    public static  Actions getActions(){
        if(actions == null){
            actions = new Actions(Driver.getDriver());
        }
        return actions;
    }
    public static void hoverMouse(BaseElement element){
        getActions().moveToElement(element.getElement()).perform();
    }

    public static void dragAndDrop(BaseElement sourceElement, BaseElement destinyElement){
        getActions()
                .clickAndHold(sourceElement.getElement())
                .moveToElement(destinyElement.getElement())
                .release()
                .perform();
    }
}
