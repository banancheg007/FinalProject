package tests;

import core.initialDriver.InitialDriver;
import core.listeners.TestListener;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import ui.managers.AppManager;

@Listeners({TestListener.class,core.listeners.RetryListener.class})
public class BaseTest {
    protected AppManager appManager;

    @Parameters("browser")
    @BeforeMethod
    @Step("Запуск браузеру")
    public void setUp(String browser) {
        InitialDriver.getInstance().setBrowser(browser);
        appManager = new AppManager();
    }
}
