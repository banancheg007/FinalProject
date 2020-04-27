package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import ui.elements.*;
import ui.enums.ContainerEnum;
import ui.enums.Input;

public interface MainPage extends BasePage, WithNavigationBar, WithHeader, WithInput, WithContainer, WithFooter {


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

    default void setInputPersonalNumber(String number){
        getPersonalNumberInput().sendKeys(number);
    }

    default void clickOnFab(String fab){
        footer().floatingActionButton(fab).click();
    }

    default void clickOnButtonInHeader(String button){
        header().button(button).click();
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
