package ui.utils;

import org.testng.annotations.DataProvider;
import ui.enums.DropdownCityItem;

public class TestDataProviders {

    @DataProvider(name = "getCity")
    public static Object[][] getCity() {
        return new Object[][]{
                {DropdownCityItem.YURKIVKA.getText()},
                {DropdownCityItem.DUBIYIVKA.getText()}
        };
    }


}
