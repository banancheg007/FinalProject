package ui.pages.personalCabinetPages;

import ui.elements.WithButton;
import ui.elements.WithContainer;
import ui.elements.WithLabel;
import ui.elements.WithPersonalCabinetMenu;
import ui.pages.BasePage;

public interface PersonalCabinetPage extends BasePage, WithPersonalCabinetMenu, WithButton, WithContainer, WithLabel {

    default void goToPage(String personalCabinetMenuButton){
        personalCabinetMenu().button(personalCabinetMenuButton).click();
    }
}
