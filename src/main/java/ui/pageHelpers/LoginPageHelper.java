package ui.pageHelpers;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.enums.ContainerEnum;
import ui.enums.Input;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;


public class LoginPageHelper extends BaseHelper{

    public LoginPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }


    @Step("Sign in")
    public LoginPageHelper signIn(String city, String login, String password){
        pageManager.onLoginPage().container(ContainerEnum.AUTH_CITY_DROPDOWN.getContainerClass()).click();
        pageManager.onLoginPage().cityDropdownItem(city).click();
        pageManager.onLoginPage().input(Input.BTN_CITY_SELECT.getId()).click();
        pageManager.onLoginPage().input(Input.LOGIN.getId()).sendKeys(login);
        pageManager.onLoginPage().input(Input.PASSWORD.getId()).sendKeys(password);
        pageManager.onLoginPage().input(Input.BTN_LOGIN.getId()).click();
        return this;
    }



    @Step("Compare expected string with text after choose city for login")
    public LoginPageHelper compareTextAfterLoginWithWrongData(String expectedString){
        //pageManager.onLoginPage().container(ContainerEnum.AUTH.getLocatorString()).waitUntil(anyOf(displayed(),text(Utils.NEED_TO_CHOOSE_A_CITY)));
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(),3);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(pageManager.onLoginPage().container(ContainerEnum.AUTH.getContainerClass()),expectedString));
        compareString(expectedString,pageManager.onLoginPage().container(ContainerEnum.AUTH.getContainerClass()).getText());
        return this;
    }
}
