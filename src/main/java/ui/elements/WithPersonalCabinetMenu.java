package ui.elements;

import ui.enums.ContainerEnum;

public interface WithPersonalCabinetMenu extends WithContainer {

    default Container personalCabinetMenu(){

    return  container(ContainerEnum.PERSONAL_CABINET_MENU.getLocatorString());
    }
}
