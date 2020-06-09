package ui.managers;

import core.initialDriver.InitialDriver;
import org.openqa.selenium.WebDriver;
import ui.pageHelpers.*;

public class AppManager {


    private PageManager pageManager = new PageManager(this);

    private MainPagePageHelper mainPageHelper = new MainPagePageHelper(this,pageManager);
    private ConnectPagePageHelper connectPageHelper = new ConnectPagePageHelper(this, pageManager);
    private LoginPagePageHelper loginPageHelper = new LoginPagePageHelper(this,pageManager);
    private PersonalPagePageHelper personalPageHelper = new PersonalPagePageHelper(this,pageManager);
    private BalancePagePageHelper balancePageHelper = new BalancePagePageHelper(this,pageManager);
    private InternetPagePageHelper internetPageHelper = new InternetPagePageHelper(this,pageManager);
    private ServicesPagePageHelper servicesPageHelper = new ServicesPagePageHelper(this,pageManager);
    private PaymentsHistoryPagePageHelper paymentsHistoryPageHelper = new PaymentsHistoryPagePageHelper(this,pageManager);
    private AbonentPagePageHelper abonentPageHelper = new AbonentPagePageHelper(this,pageManager);
    private ActionsPagePageHelper actionsPageHelper = new ActionsPagePageHelper(this,pageManager);
    private NewsPagePageHelper newsPageHelper = new NewsPagePageHelper(this,pageManager);
    private PaymentsPagePageHelper paymentsPageHelper = new PaymentsPagePageHelper(this,pageManager);
    private RequestsPagePageHelper requestsPageHelper = new RequestsPagePageHelper(this,pageManager);


    public AppManager(){
    }

    public void setBrowser(String browser){
        InitialDriver.getInstance().setBrowser(browser);
    }

    public WebDriver getDriver(){
        return  InitialDriver.getInstance().getDriver();
    }

    public MainPagePageHelper getMainPageHelper(){
        return mainPageHelper;
    }

    public ConnectPagePageHelper getConnectPageHelper(){
        return connectPageHelper;
    }

    public LoginPagePageHelper getLoginPageHelper(){ return loginPageHelper; }

    public PersonalPagePageHelper getPersonalPageHelper(){ return personalPageHelper; }

    public InternetPagePageHelper getInternetPageHelper(){ return internetPageHelper; }

    public BalancePagePageHelper getBalancePageHelper(){ return balancePageHelper; }

    public ServicesPagePageHelper getServicesPageHelper(){ return servicesPageHelper; }

    public AbonentPagePageHelper getAbonentPageHelper(){ return abonentPageHelper; }

    public ActionsPagePageHelper getActionsPageHelper(){ return actionsPageHelper; }

    public NewsPagePageHelper getNewsPageHelper(){ return newsPageHelper; }

    public PaymentsPagePageHelper getPaymentsPageHelper(){ return paymentsPageHelper; }

    public RequestsPagePageHelper getRequestsPageHelper(){ return requestsPageHelper; }


    public PaymentsHistoryPagePageHelper getPaymentsHistoryPageHelper(){ return paymentsHistoryPageHelper; }


}
