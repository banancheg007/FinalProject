package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithFloatingActionButton {
    @FindBy("//i[contains(@class, 'fab + {{ value }}')]")
    AtlasWebElement floatingActionButton(@Param("value") String value);
}
