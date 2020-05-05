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
public class DataProviderTests extends BaseTest{

    protected AppManager appManager;

    @BeforeMethod
    public void setUp() {
        appManager = new AppManager();
        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }


    @Test(description = "Check references after change cities in header", dataProvider = "getCities", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterChangeCitiesInHeader(String header,String city, String url){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().changeCityInHeader(header,city).checkEqualsUrlWithCurrent(url);
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
    }

    @Test(description = "Check references after click on fab", dataProvider = "getFabs", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnFab(String fab, String url) throws InterruptedException {
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().clickOnFab(fab).checkEqualsUrlWithCurrent(url);
    }


}
