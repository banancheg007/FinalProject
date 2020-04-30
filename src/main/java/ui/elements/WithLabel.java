package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithLabel {

    @FindBy(".//*[contains(@class,'mini') and contains(., '{{ value }}')]/following-sibling::div")
    AtlasWebElement dataLabel(@Param("value") String value);
}
