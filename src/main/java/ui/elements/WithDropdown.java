package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithDropdown {
    @FindBy(".//*[contains(text(), '{{ value }}') and contains(@class, 'dropdown')]")
    Dropdown dropdown(@Param("value") String value);

    @FindBy(".//*[contains(text(), '') and contains(@class, 'dropdown')]")
    Dropdown cityDropdown();

    default Dropdown selectCityDropdown(){
        Dropdown dropdown = cityDropdown();
        dropdown.click();
        //dropdown.waitUntil(hasSize(4));
        return dropdown;
    }

    default Dropdown selectDropdown(String text){
        Dropdown dropdown = dropdown(text);
        dropdown.click();
        return dropdown;
    }

}
