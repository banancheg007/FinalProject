package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.managers.AppManager;
import ui.managers.PageManager;

public class BalancePageHelper extends BasePageHelper {

    public BalancePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Перейти на сторінку історії платежів")
    public BalancePageHelper goToPaymentsHistoryPage(){
        pageManager.onBalancePage().goToPaymentsHistoryPage();
        return this;
    }
}
