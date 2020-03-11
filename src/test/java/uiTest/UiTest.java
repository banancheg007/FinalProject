package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;
import ui.pages.MainPage;


@Epic("Main page")
@Feature("Authorization")
@Listeners({Listener.class})
public class UiTest {

    private AppManager appManager;


    @BeforeMethod
    public void setUp() {
        appManager = new AppManager();
    }

    @Test(description = "Open main page")
    public void OpenMainPage() {
        appManager.getMainPageHelper().openStartUrl();
        appManager.onPage(MainPage.class).navigationBar().dropdown("Для Дому").click();//dropdownItem("Телебачення").click();
        appManager.onPage(MainPage.class).navigationBar().dropdown("Для Дому").dropdownItem("Телебачення").click();

        appManager.onPage(MainPage.class).navigationBar().dropdown("Продукція").click();//dropdownItem("Телебачення").click();
        appManager.onPage(MainPage.class).navigationBar().dropdown("Продукція").dropdownItem("Домофони").click();
       //Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(), "www.gfgfdg");

    }


}
