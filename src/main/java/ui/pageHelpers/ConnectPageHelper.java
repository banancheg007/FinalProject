package ui.pageHelpers;

import io.qameta.allure.Step;
import utils.enums.Button;
import utils.enums.ContainerEnum;
import utils.enums.Input;
import ui.AppManager;
import ui.PageManager;

public class ConnectPageHelper extends BaseHelper {

    public ConnectPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Заповнити заявку на підключення (без міста)")
    public ConnectPageHelper fillConnectFormAndSendRequest(String surname, String name, String phone, String address, String message){
        pageManager.onConnectPage().input(Input.SURNAME.getId()).sendKeys(surname);
        pageManager.onConnectPage().input(Input.NAME.getId()).sendKeys(name);
        pageManager.onConnectPage().input(Input.TELEPHONE.getId()).sendKeys(phone);
        pageManager.onConnectPage().input(Input.ADDRESS.getId()).sendKeys(address);
        pageManager.onConnectPage().messageTextArea().sendKeys(message);
        pageManager.onConnectPage().button(Button.SEND.getText()).click();
        return this;
    }

    @Step("Порівняти очікуваний і поточний текст помилки після відправки заяви на підключення")
    public ConnectPageHelper compareTextAfterSendRequestForConnectWithWrongData(String expectedString){
        compareString(expectedString,pageManager.onConnectPage().container(ContainerEnum.CONNECT_REQUEST.getContainerClass()).paragraph().getText());
        return this;
    }

}
