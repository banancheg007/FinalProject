package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithDropdown {
    @FindBy(".//a[contains(text(), '{{ value }}')]")
    Dropdown dropdown(@Param("value") String value);



}
