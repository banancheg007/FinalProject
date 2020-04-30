package ui.pages;

import ui.elements.WithContainer;
import ui.elements.WithLabel;
import ui.elements.WithPersonalCabinetMenu;
import ui.enums.Button;
import ui.enums.ContainerEnum;

public interface BalancePage extends WithPersonalCabinetMenu, BasePage, WithLabel, WithContainer {

    default void goToPaymentsHistoryPage(){
        container(ContainerEnum.PAYMENTS_HISTORY.getLocatorString()).button(Button.VIEW_PAYMENT_HISTORY.getLocatorString()).click();
    }
}
