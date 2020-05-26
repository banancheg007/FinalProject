package uiTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ui.enums.Button;
import ui.enums.ContainerEnum;
import ui.enums.DropDownHistoryItems;
import ui.initialDriver.AppManager;
import ui.initialDriver.InitialDriver;
import ui.utils.Utils;

import java.text.ParseException;

public class CrossBrowserTests extends BaseTest{

    protected AppManager appManager;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        InitialDriver.getInstance().setBrowser(browser);
        appManager = new AppManager();

        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }

    @Test(description = "Check sending connect request with wrong telephone")
    public void CheckSendingConnectRequestWithWrongTelephone(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.CONNECT.getText());
        appManager.getConnectPageHelper().fillConnectFormAndSendRequest(Utils.SURNAME,Utils.NAME,Utils.WRONG_TELEPHONE,Utils.ADDRESS,Utils.MESSAGE).compareTextAfterSendRequestForConnectWithWrongData(Utils.TYPE_CORRECT_PHONE);
    }

    @Test(description = "Check sending connect request with correct telephone")
    public void CheckSendingConnectRequestWithCorrectTelephone(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.CONNECT.getText());
        appManager.getConnectPageHelper().fillConnectFormAndSendRequest(Utils.SURNAME,Utils.NAME,Utils.CORRECT_TELEPHONE,Utils.ADDRESS,Utils.MESSAGE).compareTextAfterSendRequestForConnectWithWrongData(Utils.CHOOSE_CITY);
    }

    @Test(description = "Empty login and password sign in")
    public void signInEmptyData(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.EMPTY_LOGIN, Utils.EMPTY_PASSWORD).compareTextAfterLoginWithWrongData(Utils.WRONG_DATA);
    }

    @Test(description = "Sign in with correct data")
    public void signIn(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().compareExpectedNameWithAuthorizedUser(Utils.FULL_NAME_ACTIVE_ABONENT);
    }

    @Test(description = "Logout test")
    public void Logout(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().logout().checkEqualsUrlWithCurrent(Button.EXIT.getUrl());
    }

    @Test(description = "Displaying user information test")
    public void InternetPage(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_INTERNET.getContainerClass());
        appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Utils.LOGIN).compareExpectedStatusWithAuthorizedUser(Utils.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Utils.ORDER_DATE);
    }

    @Test(description = "Displaying history for period")
    public void HistoryForPeriod() throws ParseException {
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2019,DropDownHistoryItems.DECEMBER, DropDownHistoryItems.ALL_TYPES).waitForLoadData().compareMonthAndYearResults(DropDownHistoryItems.DECEMBER.getNumericalEquivalent(),Integer.parseInt(DropDownHistoryItems.YEAR_2019.getItemText()));
    }

    @Test(description = "Displaying write offs for period")
    public void WriteOffsForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2018,DropDownHistoryItems.SEPTEMBER, DropDownHistoryItems.WRITE_OFFS).waitForLoadData().compareWriteOffsReason();
    }


    @Test(description = "Displaying income for period")
    public void IncomeForPeriod(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_BALANCE.getContainerClass());
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2020,DropDownHistoryItems.JANUARY, DropDownHistoryItems.INCOME).waitForLoadData().compareIncomeReason();
    }
}
