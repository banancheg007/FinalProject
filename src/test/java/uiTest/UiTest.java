package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.enums.Button;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;
import ui.utils.TestDataProviders;
import ui.utils.Utils;


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
        Thread.sleep(5000);
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
