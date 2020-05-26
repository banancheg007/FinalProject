package ui.pages;

import ui.elements.WithButton;
import ui.elements.WithContainer;
import utils.enums.Button;
import utils.enums.ContainerEnum;

public interface PersonalPage extends BasePage, WithButton, WithContainer {

    default String getFullNameOfAuthorizedUser(){
        return container(ContainerEnum.TO_PAGE_ABONENT.getContainerClass()).innerContainer(ContainerEnum.PERSONAL_PAGE_INNER_DATA.getContainerClass()).getText();
    }


    default void logout(){
        button(Button.EXIT.getText()).click();
    }

    default void goToPage(String nextPageNavigateContainerClass){
        container(nextPageNavigateContainerClass).click();
    }

}
