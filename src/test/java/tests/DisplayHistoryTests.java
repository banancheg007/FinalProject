package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.Constants;
import utils.enums.Button;
import utils.enums.ContainerEnum;
import utils.enums.DropDownHistoryItems;

public class DisplayHistoryTests extends BaseTest{

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("History")
    @Test(description = "Відображення історії за період")
    public void HistoryForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2019,DropDownHistoryItems.DECEMBER, DropDownHistoryItems.ALL_TYPES).waitForLoadData().compareMonthAndYearResults(DropDownHistoryItems.DECEMBER.getNumericalEquivalent(),Integer.parseInt(DropDownHistoryItems.YEAR_2019.getItemText()));
    }

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("History")
    @Test(description = "Відображення списання за період")
    public void WriteOffsForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2018,DropDownHistoryItems.SEPTEMBER, DropDownHistoryItems.WRITE_OFFS).waitForLoadData().compareWriteOffsReason();
    }

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("History")
    @Test(description = "Відображення поповнень за період")
    public void IncomesForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2020,DropDownHistoryItems.JANUARY, DropDownHistoryItems.INCOME).waitForLoadData().compareIncomeReason();
    }
}
