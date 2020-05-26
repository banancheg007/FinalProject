package ui;

import core.initialDriver.InitialDriver;
import org.openqa.selenium.WebDriver;
import ui.pageHelpers.*;

public class AppManager {

    private  WebDriver driver = InitialDriver.getInstance().getDriver();

    private PageManager pageManager = new PageManager(this);

    private MainPageHelper mainPageHelper = new MainPageHelper(this,pageManager);
    private ConnectPageHelper connectPageHelper = new ConnectPageHelper(this, pageManager);
    private LoginPageHelper loginPageHelper = new LoginPageHelper(this,pageManager);
    private PersonalPageHelper personalPageHelper = new PersonalPageHelper(this,pageManager);
    private BalancePageHelper balancePageHelper = new BalancePageHelper(this,pageManager);
    private InternetPageHelper internetPageHelper = new InternetPageHelper(this,pageManager);
    private ServicesPageHelper servicesPageHelper = new ServicesPageHelper(this,pageManager);
    private PaymentsHistoryPageHelper paymentsHistoryPageHelper = new PaymentsHistoryPageHelper(this,pageManager);
    private AbonentPageHelper abonentPageHelper = new AbonentPageHelper(this,pageManager);
    private ActionsPageHelper actionsPageHelper = new ActionsPageHelper(this,pageManager);
    private NewsPageHelper newsPageHelper = new NewsPageHelper(this,pageManager);
    private PaymentsPageHelper paymentsPageHelper = new PaymentsPageHelper(this,pageManager);
    private RequestsPageHelper requestsPageHelper = new RequestsPageHelper(this,pageManager);


    public AppManager(){
    }

    public void setBrowser(String browser){
        InitialDriver.getInstance().setBrowser(browser);
    }

    public WebDriver getDriver(){
        return  driver;
    }

    public MainPageHelper getMainPageHelper(){
        return mainPageHelper;
    }

    public ConnectPageHelper getConnectPageHelper(){
        return connectPageHelper;
    }

    public LoginPageHelper getLoginPageHelper(){ return loginPageHelper; }

    public PersonalPageHelper getPersonalPageHelper(){ return personalPageHelper; }

    public InternetPageHelper getInternetPageHelper(){ return internetPageHelper; }

    public BalancePageHelper getBalancePageHelper(){ return balancePageHelper; }

    public ServicesPageHelper getServicesPageHelper(){ return servicesPageHelper; }

    public AbonentPageHelper getAbonentPageHelper(){ return abonentPageHelper; }

    public ActionsPageHelper getActionsPageHelper(){ return actionsPageHelper; }

    public NewsPageHelper getNewsPageHelper(){ return newsPageHelper; }

    public PaymentsPageHelper getPaymentsPageHelper(){ return paymentsPageHelper; }

    public RequestsPageHelper getRequestsPageHelper(){ return requestsPageHelper; }


    public PaymentsHistoryPageHelper getPaymentsHistoryPageHelper(){ return paymentsHistoryPageHelper; }


}
