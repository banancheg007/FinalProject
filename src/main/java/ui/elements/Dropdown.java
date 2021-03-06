package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface Dropdown extends AtlasWebElement {

    @FindBy(".//following-sibling::*/*[contains(., '{{ value }}')]")
    AtlasWebElement dropdownItem(@Param("value") String value);
}
