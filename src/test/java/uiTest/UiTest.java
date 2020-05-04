package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.enums.Button;
import ui.enums.DropDownHistoryItems;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;
import ui.utils.TestDataProviders;
import ui.utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


@Epic("Main page")
@Feature("Smoke tests")
@Listeners({Listener.class})
public class UiTest {

    //protected static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    private AppManager appManager;


    @BeforeMethod
    public void setUp() {
       // System.setProperty("console.encoding","utf-8");
        appManager = new AppManager();

        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }

    @Test(description = "Check references after change cities in header", dataProvider = "getCities", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterChangeCitiesInHeader(String header,String city, String url){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().changeCityInHeader(header,city).checkEqualsUrlWithCurrent(url);
        //Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(),url);

    }
    @Test(description = "Change cities in check balance tab", dataProvider = "getCities", dataProviderClass = TestDataProviders.class)
    public void ChangeCitiesInCheckBalanceTab(String header,String city, String url){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().changeCityForCheckBalance(header,city);
    }
    @Test(description = "Check references after select dropdown menu items", dataProvider = "getMenuItems", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterSelectDropdownMenuItems(String header,String menuItem, String url){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().selectDropdownItem(header, menuItem).checkEqualsUrlWithCurrent(url);
       // Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(),url);
    }

    @Test(description = "Check references after click on fab", dataProvider = "getFabs", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnFab(String fab, String url) throws InterruptedException {
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().clickOnFab(fab).checkEqualsUrlWithCurrent(url);
       // System.out.println("before assert id= "+Thread.currentThread().getId()+" current url= "+appManager.getDriver().getCurrentUrl());
        //Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(),url);
    }

    @Test(description = "Check sending connect request with wrong telephone")
    public void CheckSendingConnectRequestWithWrongTelephone(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.CONNECT.getLocatorString());
        appManager.getConnectPageHelper().fillConnectFormAndSendRequest(Utils.SURNAME,Utils.NAME,Utils.WRONG_TELEPHONE,Utils.ADDRESS,Utils.MESSAGE).compareTextAfterSendRequestForConnectWithWrongData(Utils.TYPE_CORRECT_PHONE);
    }

    @Test(description = "Check sending connect request with correct telephone")
    public void CheckSendingConnectRequestWithCorrectTelephone(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.CONNECT.getLocatorString());
        appManager.getConnectPageHelper().fillConnectFormAndSendRequest(Utils.SURNAME,Utils.NAME,Utils.CORRECT_TELEPHONE,Utils.ADDRESS,Utils.MESSAGE).compareTextAfterSendRequestForConnectWithWrongData(Utils.CHOOSE_CITY);
    }

    @Test(description = "Empty login and password sign in")
    public void signInEmptyData() throws InterruptedException {
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getLocatorString());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.EMPTY_LOGIN, Utils.EMPTY_PASSWORD).compareTextAfterLoginWithWrongData(Utils.WRONG_DATA);
    }

    @Test(description = "Sign in with correct data")
    public void signIn() throws InterruptedException {
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getLocatorString());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().compareExpectedNameWithAuthorizedUser(Utils.FULL_NAME_ACTIVE_ABONENT);
    }

    @Test(description = "Logout test")
    public void Logout(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getLocatorString());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().logout().checkEqualsUrlWithCurrent(Button.EXIT.getUrl());
        //Thread.sleep(5000);
    }

    @Test(description = "Displaying user information test")
    public void InternetPage(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getLocatorString());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToInternetPage();
        appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Utils.LOGIN).compareExpectedStatusWithAuthorizedUser(Utils.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Utils.ORDER_DATE);
        //Thread.sleep(5000);
    }

    @Test(description = "Displaying history for period")
    public void HistoryForPeriod() throws InterruptedException, ParseException {
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getLocatorString());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToBalancePage();
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        //appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Utils.LOGIN).compareExpectedStatusWithAuthorizedUser(Utils.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Utils.ORDER_DATE);
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2019,DropDownHistoryItems.DECEMBER, DropDownHistoryItems.ALL_TYPES).waitForLoadData().compareMonthAndYearResults(DropDownHistoryItems.DECEMBER.getNumericalEquivalent(),Integer.parseInt(DropDownHistoryItems.YEAR_2019.getLocatorString()));
        //Thread.sleep(5000);
    }

    @Test(description = "Displaying write offs for period")
    public void WriteOffsForPeriod() throws InterruptedException, ParseException {
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getLocatorString());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToBalancePage();
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        //appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Utils.LOGIN).compareExpectedStatusWithAuthorizedUser(Utils.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Utils.ORDER_DATE);
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2018,DropDownHistoryItems.SEPTEMBER, DropDownHistoryItems.WRITE_OFFS).waitForLoadData().compareWriteOffsReason();
        //Thread.sleep(5000);
    }

    @Test(description = "Displaying income for period")
    public void IncomeForPeriod() throws InterruptedException, ParseException {
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getLocatorString());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToBalancePage();
        appManager.getBalancePageHelper().goToPaymentsHistoryPage();
        //appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Utils.LOGIN).compareExpectedStatusWithAuthorizedUser(Utils.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Utils.ORDER_DATE);
        appManager.getPaymentsHistoryPageHelper().showHistoryForPeriodAndType(DropDownHistoryItems.YEAR_2020,DropDownHistoryItems.JANUARY, DropDownHistoryItems.INCOME).waitForLoadData().compareIncomeReason();
        //Thread.sleep(5000);
    }


    @Test
    public void Test() throws ParseException {
        String currentDate ="28.09.2019";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new SimpleDateFormat("dd.MM.yy").parse(currentDate));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
    }





  /*  @Test(description = "Check references after click on button in header", dataProvider = "getHeaderButtons", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnButtonInHeader(String button, String url) throws InterruptedException {
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(button).checkEqualsUrlWithCurrent(url);
        // System.out.println("before assert id= "+Thread.currentThread().getId()+" current url= "+appManager.getDriver().getCurrentUrl());
        //Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(),url);
    }*/



//    @Test(description = "Check references after click on fab", dataProvider = "getFabs", dataProviderClass = TestDataProviders.class)
//    public void abc(String fab, String url) throws InterruptedException {
//        //appManager = new AppManager();
//        WebDriverManager.chromedriver().setup();
//        webDriver.set(new ChromeDriver());
//        webDriver.get().get(url);
//        Assert.assertEquals(webDriver.get().getCurrentUrl(),url);
//        //appManager.getMainPageHelper().openMainPage().clickOnFab(fab);
//        //Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(),url);
//    }


}
