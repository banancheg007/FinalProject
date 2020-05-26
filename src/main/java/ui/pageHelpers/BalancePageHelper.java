package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.AppManager;
import ui.PageManager;

public class BalancePageHelper extends BaseHelper{

    public BalancePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Go to balance page helper")
    public BalancePageHelper goToPaymentsHistoryPage(){
        pageManager.onBalancePage().goToPaymentsHistoryPage();
        return this;
    }
}
