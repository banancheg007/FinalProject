package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.AppManager;
import ui.PageManager;
import utils.enums.DropDownHistoryItems;

public class PaymentsHistoryPageHelper extends BaseHelper{

    public PaymentsHistoryPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Показати історію за період по типу")
    public PaymentsHistoryPageHelper showHistoryForPeriodAndType(DropDownHistoryItems year, DropDownHistoryItems month, DropDownHistoryItems type){
        pageManager.onPaymentsHistoryPage().showHistoryForPeriodAndType(year, month, type);
        return this;
    }


    @Step("Почекати загрузки результатів")
    public PaymentsHistoryPageHelper waitForLoadData(){
        pageManager.onPaymentsHistoryPage().waitForLoadData();
        return this;
    }

    @Step("Порівняти місяць і рік з отриманими результатами")
    public PaymentsHistoryPageHelper compareMonthAndYearResults(int expectedMonth, int expectedYear){
        pageManager.onPaymentsHistoryPage().compareMonthAndYearResults(expectedMonth,expectedYear);
        return this;
    }

    @Step("Перевірка списання")
    public PaymentsHistoryPageHelper compareWriteOffsReason(){
        pageManager.onPaymentsHistoryPage().compareWriteOffsReason();
        return this;
    }

    @Step("Перевірка поповнення")
    public PaymentsHistoryPageHelper compareIncomeReason(){
        pageManager.onPaymentsHistoryPage().compareIncomeReason();
        return this;
    }



}
