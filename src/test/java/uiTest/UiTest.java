package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;
import ui.utils.TestDataProviders;


@Epic("Main page")
@Feature("Authorization")
@Listeners({Listener.class})
public class UiTest {


    private AppManager appManager;


    @BeforeMethod
    public void setUp() {
       // System.setProperty("console.encoding","utf-8");
        appManager = new AppManager();

        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }

    @Test(description = "Open main page", dataProvider = "getCities", dataProviderClass = TestDataProviders.class)
    public void OpenMainPage(String header,String city, String url){
        appManager.getMainPageHelper().openMainPage().changeCityInHeader(header,city);
        Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(),url);

    }
    @Test(description = "Open main page2", dataProvider = "getCities", dataProviderClass = TestDataProviders.class)
    public void OpenMainPage2(String header,String city, String url){
        appManager.getMainPageHelper().openMainPage().changeCityForCheckBalance(header,city);
    }
    @Test(description = "Open main page3", dataProvider = "getMenuItems", dataProviderClass = TestDataProviders.class)
    public void OpenMainPage3(String header,String menuItem, String url) throws InterruptedException {
        appManager.getMainPageHelper().openMainPage().selectDropdownItem(header, menuItem);
        Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(),url);
        Thread.sleep(5000);
    }




}
