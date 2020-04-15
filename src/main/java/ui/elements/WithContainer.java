package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface WithContainer{
    @FindBy("//div[@class='{{ value }}']")
    Container container(@Param("value") String value);
}
