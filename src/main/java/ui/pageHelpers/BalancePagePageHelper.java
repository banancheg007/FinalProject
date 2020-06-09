package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.managers.AppManager;
import ui.managers.PageManager;

public class BalancePagePageHelper extends BasePageHelper {

    public BalancePagePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Перейти на сторінку історії платежів")
    public BalancePagePageHelper goToPaymentsHistoryPage(){
        pageManager.onBalancePage().goToPaymentsHistoryPage();
        return this;
    }
}
