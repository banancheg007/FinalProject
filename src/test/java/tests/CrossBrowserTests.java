package tests;

import org.testng.annotations.Test;
import utils.Constants;
import utils.enums.Button;
import utils.enums.ContainerEnum;
import utils.enums.DropDownHistoryItems;

public class CrossBrowserTests extends BaseTest{


    @Test(description = "Check sending connect request with wrong telephone")
    public void CheckSendingConnectRequestWithWrongTelephone(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.CONNECT.getText());
        appManager.getConnectPageHelper().fillConnectFormAndSendRequest(Constants.SURNAME,Constants.NAME,Constants.WRONG_TELEPHONE,Constants.ADDRESS,Constants.MESSAGE).compareTextAfterSendRequestForConnectWithWrongData(Constants.TYPE_CORRECT_PHONE);
    }

    @Test(description = "Check sending connect request with correct telephone")
    public void CheckSendingConnectRequestWithCorrectTelephone(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.CONNECT.getText());
        appManager.getConnectPageHelper().fillConnectFormAndSendRequest(Constants.SURNAME,Constants.NAME,Constants.CORRECT_TELEPHONE,Constants.ADDRESS,Constants.MESSAGE).compareTextAfterSendRequestForConnectWithWrongData(Constants.CHOOSE_CITY);
    }

    @Test(description = "Empty login and password sign in")
    public void signInEmptyData(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.EMPTY_LOGIN, Constants.EMPTY_PASSWORD).compareTextAfterLoginWithWrongData(Constants.WRONG_DATA);
    }

    @Test(description = "Sign in with correct data")
    public void signIn(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().compareExpectedNameWithAuthorizedUser(Constants.FULL_NAME_ACTIVE_ABONENT);
    }

    @Test(description = "Logout test")
    public void Logout(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().logout().checkEqualsUrlWithCurrent(Button.EXIT.getUrl());
    }

    @Test(description = "Displaying user information test")
    public void InternetPage(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_INTERNET.getContainerClass());
        appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Constants.LOGIN).compareExpectedStatusWithAuthorizedUser(Constants.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Constants.ORDER_DATE);
    }

    @Test(description = "Displaying history for period")
    public void HistoryForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2019,DropDownHistoryItems.DECEMBER, DropDownHistoryItems.ALL_TYPES).waitForLoadData().compareMonthAndYearResults(DropDownHistoryItems.DECEMBER.getNumericalEquivalent(),Integer.parseInt(DropDownHistoryItems.YEAR_2019.getItemText()));
    }

    @Test(description = "Displaying write offs for period")
    public void WriteOffsForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2018,DropDownHistoryItems.SEPTEMBER, DropDownHistoryItems.WRITE_OFFS).waitForLoadData().compareWriteOffsReason();
    }


    @Test(description = "Displaying income for period")
    public void IncomeForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2020,DropDownHistoryItems.JANUARY, DropDownHistoryItems.INCOME).waitForLoadData().compareIncomeReason();
    }
}
