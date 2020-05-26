package ui.pages;

import ui.elements.*;

public interface MainPage extends BasePage, WithNavigationBar, WithHeader, WithInput, WithContainer, WithFooter {


    default Dropdown getCityDropdownFromHeader(String header){
        return header().dropdown(header);
    }


    default  Dropdown getDropdownFromNavigationBar(String header){
        return navigationBar().dropdown(header);
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


    default  void changeDropdownItemInNavigationBar(String header,String menuItem){
        getDropdownFromNavigationBar(header).click();
        getDropdownFromNavigationBar(header).dropdownItem(menuItem).click();

    }












}
