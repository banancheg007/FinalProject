package ui.pages.personalCabinetPages;

import ui.enums.Button;
import ui.enums.ContainerEnum;

public interface BalancePage extends PersonalCabinetPage{

    default void goToPaymentsHistoryPage(){
        container(ContainerEnum.PAYMENTS_HISTORY.getContainerClass()).button(Button.VIEW_PAYMENT_HISTORY.getText()).click();
    }

}
