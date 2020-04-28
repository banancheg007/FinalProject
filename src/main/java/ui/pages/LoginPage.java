package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import ui.elements.WithContainer;
import ui.elements.WithDropdown;
import ui.elements.WithInput;

public interface LoginPage extends BasePage, WithDropdown, WithContainer, WithInput {

    @FindBy(".//option[contains(text(),'{{ value }}')]")
    AtlasWebElement cityDropdownItem(@Param("value") String value);
}
