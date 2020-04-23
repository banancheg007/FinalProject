package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import ui.elements.*;
import ui.enums.Button;
import ui.enums.Input;
import ui.enums.ContainerEnum;

public interface MainPage extends BasePage, WithNavigationBar, WithHeader, WithInput, WithContainer, WithFooter {


    default AtlasWebElement getSendButton(){
        return container(ContainerEnum.CHECK_BALANCE.getLocatorString()).button(Button.SEND.getLocatorString());
    }

    default Dropdown getCityDropdownFromHeader(String header){
        return header().dropdown(header);
    }

    default Dropdown getCityDropdownForCheckBalance(String header){
        return container(ContainerEnum.CHECK_BALANCE.getLocatorString()).dropdown(header);
    }

    default  Dropdown getDropdownFromNavigationBar(String header){
        return navigationBar().dropdown(header);
    }

    default AtlasWebElement getPersonalNumberInput(){
        return container(ContainerEnum.CHECK_BALANCE.getLocatorString()).input(Input.PERSONAL_NUMBER.getLocatorString());
    }
    default Dropdown getDropDownFromNavigationBar(String header){
        return navigationBar().dropdown(header);
    }

    default void setInputPersonalNumber(String number){
        getPersonalNumberInput().sendKeys(number);
    }




    default void changeCityInHeader(String header, String city){
        getCityDropdownFromHeader(header).click();
        getCityDropdownFromHeader(header).dropdownItem(city).click();
    }

    default void changeCityForCheckBalance(String header,String city){
        getCityDropdownForCheckBalance(header).click();
        getCityDropdownForCheckBalance(header).dropdownItem(city).click();
    }

    default  void changeDropdownItemInNavigationBar(String header,String menuItem){
        getDropdownFromNavigationBar(header).click();
        getDropdownFromNavigationBar(header).dropdownItem(menuItem).click();

    }










}
