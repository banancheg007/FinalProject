package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithFloatingActionButton extends AtlasWebElement{
    @FindBy(".//i[contains(@class,'{{ value }}')]")
    AtlasWebElement floatingActionButton(@Param("value") String value);
}
