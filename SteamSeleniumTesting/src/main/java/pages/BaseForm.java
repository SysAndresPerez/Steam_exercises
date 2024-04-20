package pages;

import elements.TheUniqueElement;
import waits.Waits;

public abstract class BaseForm {

    private final TheUniqueElement uniqueElement;

    public BaseForm(TheUniqueElement uniqueElement){
        this.uniqueElement = uniqueElement;
    }

    public boolean isItDisplay(){
        return Waits.waitForElementToBeDisplayed(uniqueElement);
    }
}