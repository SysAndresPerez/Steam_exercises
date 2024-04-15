package pages;

import elements.Label;
import waits.Waits;

public abstract class BaseForm {

    private final Label uniqueElement;

    public BaseForm(Label uniqueElement){
        this.uniqueElement = uniqueElement;
    }

    public boolean isPageDisplay(){
        return Waits.waitForElementToBeDisplayed(uniqueElement);
    }
}