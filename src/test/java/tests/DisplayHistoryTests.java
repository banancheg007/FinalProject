package tests;

import org.testng.annotations.Test;
import utils.Constants;
import utils.enums.Button;
import utils.enums.ContainerEnum;
import utils.enums.DropDownHistoryItems;

public class DisplayHistoryTests extends BaseTest{

    @Test(description = "Відображення історії за період")
    public void HistoryForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2019,DropDownHistoryItems.DECEMBER, DropDownHistoryItems.ALL_TYPES).waitForLoadData().compareMonthAndYearResults(DropDownHistoryItems.DECEMBER.getNumericalEquivalent(),Integer.parseInt(DropDownHistoryItems.YEAR_2019.getItemText()));
    }

    /*@Test(description = "Відображення списання за період")
    public void WriteOffsForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2018,DropDownHistoryItems.SEPTEMBER, DropDownHistoryItems.WRITE_OFFS).waitForLoadData().compareWriteOffsReason();
    }


    @Test(description = "Відображення поповнень за період")
    public void IncomeForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2020,DropDownHistoryItems.JANUARY, DropDownHistoryItems.INCOME).waitForLoadData().compareIncomeReason();
    }*/
}
