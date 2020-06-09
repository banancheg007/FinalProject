package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.managers.AppManager;
import ui.managers.PageManager;
import utils.enums.DropDownHistoryItems;

public class PaymentsHistoryPagePageHelper extends BasePageHelper {

    public PaymentsHistoryPagePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Показати історію за період по типу")
    public PaymentsHistoryPagePageHelper showHistoryForPeriodAndType(DropDownHistoryItems year, DropDownHistoryItems month, DropDownHistoryItems type){
        pageManager.onPaymentsHistoryPage().showHistoryForPeriodAndType(year, month, type);
        return this;
    }


    @Step("Почекати загрузки результатів")
    public PaymentsHistoryPagePageHelper waitForLoadData(){
        pageManager.onPaymentsHistoryPage().waitForLoadData();
        return this;
    }

    @Step("Порівняти місяць і рік з отриманими результатами")
    public PaymentsHistoryPagePageHelper compareMonthAndYearResults(int expectedMonth, int expectedYear){
        pageManager.onPaymentsHistoryPage().compareMonthAndYearResults(expectedMonth,expectedYear);
        return this;
    }

    @Step("Перевірка списання")
    public PaymentsHistoryPagePageHelper compareWriteOffsReason(){
        pageManager.onPaymentsHistoryPage().compareWriteOffsReason();
        return this;
    }

    @Step("Перевірка поповнення")
    public PaymentsHistoryPagePageHelper compareIncomeReason(){
        pageManager.onPaymentsHistoryPage().compareIncomeReason();
        return this;
    }



}
