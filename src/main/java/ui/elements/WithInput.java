package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithInput{
    @FindBy(".//input[contains(@title,'{{ value }}')]")
    AtlasWebElement input(@Param("value") String value);


}
