package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import io.qameta.atlas.webdriver.extension.Page;
import org.testng.Assert;
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
        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }

    @Test(description = "Open main page")
    public void OpenMainPage() throws InterruptedException {
       // appManager.getMainPageHelper().openStartUrl();
        //appManager.onPage(MainPage.class).navigationBar().dropdown("Для Дому").click();//dropdownItem("Телебачення").click();
       // appManager.onPage(MainPage.class).navigationBar().dropdown("Для Дому").dropdownItem("Телебачення").click();
       // appManager.getMainPageHelper().scrollToElementWithJSExec(appManager.onPage(MainPage.class).container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12").input("Заповніть це поле"));
        appManager.getMainPageHelper().scrollToButton();
        //Thread.sleep(5000);
        //appManager.getMainPageHelper().SwitchToFrame(appManager.onPage(MainPage.class).frame());
        //appManager.onPage(MainPage.class).captchaCheckbox("recaptcha-checkbox-").click();

        //appManager.onPage(MainPage.class).onHomePage().container("div").click();
        Thread.sleep(5000);
       //Assert.assertEquals(appManager.getMainPageHelper().getCurrentUrl(), "www.gfgfdg");

    }



}
