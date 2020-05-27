package ui.pageHelpers;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.enums.ContainerEnum;
import utils.enums.Input;
import ui.AppManager;
import ui.PageManager;


public class LoginPageHelper extends BaseHelper{

    public LoginPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }


    @Step("Авторизуватись")
    public LoginPageHelper signIn(String city, String login, String password){
        pageManager.onLoginPage().container(ContainerEnum.AUTH_CITY_DROPDOWN.getContainerClass()).click();
        pageManager.onLoginPage().cityDropdownItem(city).click();
        pageManager.onLoginPage().input(Input.BTN_CITY_SELECT.getId()).click();
        pageManager.onLoginPage().input(Input.LOGIN.getId()).sendKeys(login);
        pageManager.onLoginPage().input(Input.PASSWORD.getId()).sendKeys(password);
        pageManager.onLoginPage().input(Input.BTN_LOGIN.getId()).click();
        return this;
    }



    @Step("Порівняти поточний тексту помилки з очікуваним повідомленням")
    public LoginPageHelper compareTextAfterLoginWithWrongData(String expectedString){
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(),3);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(pageManager.onLoginPage().container(ContainerEnum.AUTH.getContainerClass()),expectedString));
        compareString(expectedString,pageManager.onLoginPage().container(ContainerEnum.AUTH.getContainerClass()).getText());
        return this;
    }
}
