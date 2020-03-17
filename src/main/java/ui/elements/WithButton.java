package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithButton {
    @FindBy(".//*[contains(text(), '{{ value }}')]")
    AtlasWebElement button(@Param("value") String value);
}
