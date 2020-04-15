package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithImage {
    @FindBy(".//img[contains(@src, '{{ value }}')]")
    AtlasWebElement image(@Param("value") String value);
}
