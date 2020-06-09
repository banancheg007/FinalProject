package ui.pageHelpers;

import io.qameta.allure.Step;
import utils.enums.Button;
import utils.enums.ContainerEnum;
import utils.enums.Input;
import ui.managers.AppManager;
import ui.managers.PageManager;

import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class ConnectPagePageHelper extends BasePageHelper {

    public ConnectPagePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Заповнити заявку на підключення (без міста)")
    public ConnectPagePageHelper fillConnectFormAndSendRequest(String surname, String name, String phone, String address, String message){
        pageManager.onConnectPage().input(Input.SURNAME.getId()).sendKeys(surname);
        pageManager.onConnectPage().input(Input.NAME.getId()).sendKeys(name);
        pageManager.onConnectPage().input(Input.TELEPHONE.getId()).sendKeys(phone);
        pageManager.onConnectPage().input(Input.ADDRESS.getId()).sendKeys(address);
        pageManager.onConnectPage().messageTextArea().sendKeys(message);
        pageManager.onConnectPage().button(Button.SEND.getText()).click();
        return this;
    }

    @Step("Порівняти очікуваний і поточний текст помилки після відправки заяви на підключення")
    public ConnectPagePageHelper compareTextAfterSendRequestForConnectWithWrongData(String expectedString){
        pageManager.onConnectPage().container(ContainerEnum.CONNECT_REQUEST.getContainerClass()).paragraph().should(isDisplayed());
        compareString(expectedString,pageManager.onConnectPage().container(ContainerEnum.CONNECT_REQUEST.getContainerClass()).paragraph().getText());
        return this;
    }

}
