package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithImage {
    @FindBy(".//img[contains(@src, '{{ value }}')]")
    Dropdown dropdown(@Param("value") String value);
}
