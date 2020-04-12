package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;


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
        appManager.getMainPageHelper().openStartUrl();
        //appManager.onPage(MainPage.class).navigationBar().dropdown("Для Дому").click();//dropdownItem("Телебачення").click();
       // appManager.onPage(MainPage.class).navigationBar().dropdown("Для Дому").dropdownItem("Телебачення").click();
       // appManager.getMainPageHelper().scrollToElementWithJSExec(appManager.onPage(MainPage.class).container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12").input("Заповніть це поле"));
       // appManager.getMainPageHelper().scrollToButton("").wa;
        //Thread.sleep(5000);
        //appManager.getMainPageHelper().SwitchToFrame(appManager.onPage(MainPage.class).frame());
        //appManager.getMainPageHelper().onMainPage().captchaCheckbox("").should();

        appManager.getMainPageHelper().scrollToButton().inputPersonalNumberForCheckBalance();
        Thread.sleep(5000);
    }



}
