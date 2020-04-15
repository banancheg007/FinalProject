package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithDropdown {
    @FindBy(".//*[contains(text(), '{{ value }}') and contains(@class, 'dropdown')]")
    Dropdown dropdown(@Param("value") String value);
}
