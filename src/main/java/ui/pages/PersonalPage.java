package ui.pages;

import ui.elements.WithButton;
import ui.elements.WithContainer;
import ui.enums.ContainerEnum;

public interface PersonalPage extends BasePage, WithButton, WithContainer {

    default String getFullNameOfAuthorizedUser(){
        return container(ContainerEnum.PERSONAL_PAGE_ABONENT.getLocatorString()).innerContainer(ContainerEnum.PERSONAL_PAGE_INNER_DATA.getLocatorString()).getText();
    }
}
