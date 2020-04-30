package ui.initialDriver;

import org.openqa.selenium.WebDriver;
import ui.pageHelpers.*;
import ui.pages.PageManager;

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


    public AppManager(){
        System.out.println("AppManager create");
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

    public PaymentsHistoryPageHelper getPaymentsHistoryPageHelper(){ return paymentsHistoryPageHelper; }


}
