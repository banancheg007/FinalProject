package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.enums.Button;
import ui.enums.ContainerEnum;
import ui.enums.Input;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;

public class ConnectPageHelper extends BaseHelper {

    public ConnectPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Fill connect request form without city and send connect request")
    public ConnectPageHelper fillConnectFormAndSendRequest(String surname, String name, String phone, String address, String message){
        pageManager.onConnectPage().input(Input.SURNAME.getLocatorString()).sendKeys(surname);
        pageManager.onConnectPage().input(Input.NAME.getLocatorString()).sendKeys(name);
        pageManager.onConnectPage().input(Input.TELEPHONE.getLocatorString()).sendKeys(phone);
        pageManager.onConnectPage().input(Input.ADDRESS.getLocatorString()).sendKeys(address);
        pageManager.onConnectPage().messageTextArea().sendKeys(message);
        pageManager.onConnectPage().button(Button.SEND.getLocatorString()).click();
        return this;
    }

    @Step("Compare expected string with text after send request for connecting")
    public ConnectPageHelper compareTextAfterSendRequestForConnectWithWrongData(String expectedString){
        compareStringWithTextFromElement(expectedString,pageManager.onConnectPage().container(ContainerEnum.CONNECT_REQUEST.getLocatorString()).paragraph());
        return this;
    }

}
