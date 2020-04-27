package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import ui.elements.WithButton;
import ui.elements.WithContainer;
import ui.elements.WithDropdown;
import ui.elements.WithInput;

public interface ConnectPage extends BasePage, WithButton, WithInput, WithContainer, WithDropdown {

    //Message text area
    @FindBy(".//textarea[contains(@id,'description')]")
    AtlasWebElement messageTextArea();

    /*default AtlasWebElement getInput(String id){
        return input(id);
    }*/


}
