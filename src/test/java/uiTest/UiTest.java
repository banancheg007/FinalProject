package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;
import ui.utils.TestDataProviders;


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
