package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithParagraph {
    @FindBy(".//p")
    AtlasWebElement paragraph();
}
