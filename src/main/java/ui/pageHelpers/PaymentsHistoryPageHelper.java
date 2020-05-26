package ui.pageHelpers;

import io.qameta.allure.Step;
import utils.enums.DropDownHistoryItems;
import ui.AppManager;
import ui.PageManager;

import java.text.ParseException;

public class PaymentsHistoryPageHelper extends BaseHelper{

    public PaymentsHistoryPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Show history for period and type")
    public PaymentsHistoryPageHelper showHistoryForPeriodAndType(DropDownHistoryItems year, DropDownHistoryItems month, DropDownHistoryItems type){
        pageManager.onPaymentsHistoryPage().showHistoryForPeriodAndType(year, month, type);
        return this;
    }


    @Step("Wait for load data results")
    public PaymentsHistoryPageHelper waitForLoadData(){
        pageManager.onPaymentsHistoryPage().waitForLoadData();
        return this;
    }

    @Step("Compare month and year from results")
    public PaymentsHistoryPageHelper compareMonthAndYearResults(int expectedMonth, int expectedYear){
        pageManager.onPaymentsHistoryPage().compareMonthAndYearResults(expectedMonth,expectedYear);
        return this;
    }

    @Step("Compare reason for write offs")
    public PaymentsHistoryPageHelper compareWriteOffsReason(){
        pageManager.onPaymentsHistoryPage().compareWriteOffsReason();
        return this;
    }

    @Step("Compare reason for income")
    public PaymentsHistoryPageHelper compareIncomeReason(){
        pageManager.onPaymentsHistoryPage().compareIncomeReason();
        return this;
    }




}
