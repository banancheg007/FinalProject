package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import ui.elements.*;
import ui.enums.Button;
import ui.enums.Container;
import ui.enums.DropDownHeader;
import ui.enums.Input;

public interface MainPage extends BasePage, WithNavigationBar, WithHeader, WithInput, WithContainer, WithFooter {


    default AtlasWebElement getSendButton(){
        return container(Container.CHECK_BALANCE.getContainerClass()).button(Button.SEND.getText());
    }

    default Dropdown getCityDropdownFromHeader(){
        return header().dropdown(DropDownHeader.CITY.getText());
    }

    default Dropdown getCityDropdownForCheckBalance(){
        return container(Container.CHECK_BALANCE.getContainerClass()).dropdown(DropDownHeader.CITY.getText());
    }

    default AtlasWebElement getPersonalNumberInput(){
        return container(Container.CHECK_BALANCE.getContainerClass()).input(Input.PERSONAL_NUMBER.getInputClass());
    }

    default void setInputPersonalNumber(String number){
        getPersonalNumberInput().sendKeys(number);
    }




    default void changeCity(String city){
        getCityDropdownFromHeader().click();
        getCityDropdownFromHeader().dropdownItem(city).click();
    }

    default void changeCityForCheckBalance(String city){
        getCityDropdownForCheckBalance().click();
        getCityDropdownForCheckBalance().dropdownItem(city).click();
    }










}
