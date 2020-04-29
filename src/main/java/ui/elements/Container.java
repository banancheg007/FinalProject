package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface Container extends AtlasWebElement,WithInput, WithButton, WithDropdown, WithParagraph {

    @FindBy(".//div[@class='{{ value }}']")
    Container innerContainer(@Param("value") String value);
}
