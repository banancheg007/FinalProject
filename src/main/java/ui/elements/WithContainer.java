package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import io.qameta.atlas.webdriver.extension.Selector;

public interface WithContainer{
    @FindBy("//div[@class='{{ value }}'] ")
    Container container(@Param("value") String value);
}
