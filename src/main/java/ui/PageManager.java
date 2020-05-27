package ui;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.WebDriver;
import ui.pages.*;
import ui.pages.personalCabinetPages.*;

public class PageManager {

    AppManager appManager;

    public PageManager(AppManager appManager){
        this.appManager = appManager;
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

    public AbonentPage onAbonentPage(){ return  onPage(AbonentPage.class);}

    public PaymentPage onPaymentPage(){ return  onPage(PaymentPage.class);}

    public NewsPage onNewsPage(){ return  onPage(NewsPage.class);}

    public RequestsPage onRequestsPage(){ return  onPage(RequestsPage.class);}

    public ActionsPage onActionsPage(){ return  onPage(ActionsPage.class);}

    public PaymentsHistoryPage onPaymentsHistoryPage(){ return  onPage(PaymentsHistoryPage.class);}

    public PersonalCabinetPage onPersonalCabinetPage(){ return  onPage(PersonalCabinetPage.class);}


}