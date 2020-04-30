package ui.pages;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.WebDriver;
import ui.initialDriver.AppManager;

public class PageManager {

    AppManager appManager;

    public PageManager(AppManager appManager){
        this.appManager = appManager;
        System.out.println("PageManager create");
    }

    protected <T extends WebPage> T onPage(Class<T> page) {
        return new Atlas(new WebDriverConfiguration(getDriver())).create(getDriver(), page);
    }

    public WebDriver getDriver() {
        return appManager.getDriver();
    }

    public MainPage onMainPage() {
        return onPage(MainPage.class);
    }

    public ConnectPage onConnectPage(){ return  onPage(ConnectPage.class);}

    public LoginPage onLoginPage(){ return  onPage(LoginPage.class);}

    public PersonalPage onPersonalPage(){ return  onPage(PersonalPage.class);}

    public BalancePage onBalancePage(){ return  onPage(BalancePage.class);}

    public InternetPage onInternetPage(){ return  onPage(InternetPage.class);}

    public ServicesPage onServicesPage(){ return  onPage(ServicesPage.class);}

    public PaymentsHistoryPage onPaymentsHistoryPage(){ return  onPage(PaymentsHistoryPage.class);}


}