package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import org.openqa.selenium.WebDriver;
import ui.elements.*;
import ui.enums.Container;
import ui.enums.*;

public interface MainPage extends BasePage, WithNavigationBar, WithHeader, WithInput, WithContainer, WithFooter {

    @FindBy("//div[contains(@class,'{{ value }}')]")
    AtlasWebElement captchaCheckbox(@Param("value") String value);

    @FindBy("//iframe[@height]")
    AtlasWebElement frame();





    default AtlasWebElement getSendButton(){
        return container(Container.CHECK_BALANCE.getContainerClass()).button(Button.SEND.getText());
    }

    default void setInputPersonalNumber(String number){
        container(Container.CHECK_BALANCE.getContainerClass()).input(Input.PERSONAL_NUMBER.getInputClass()).sendKeys(number);
    }

    default void clickSendButton(){
        getSendButton().click();
    }

    default void selectCaptcha(){
        captchaCheckbox(Checkbox.CAPTCHA.getCheckboxClass()).click();
    }

    default void changeCity(String city){
       header().dropdown(DropDownHeader.CITY.getText()).click();
       header().dropdown(DropDownHeader.CITY.getText()).dropdownItem(city).click();
       // header().click();
    }

    default void changeCityForCheckBalance(String city, WebDriver webDriver){
        container(Container.CHECK_BALANCE.getContainerClass()).dropdown(DropDownHeader.CITY.getText()).click();
        container(Container.CHECK_BALANCE.getContainerClass()).dropdown(DropDownHeader.CITY.getText()).dropdownItem(city).click(); //.click();
    }










}
