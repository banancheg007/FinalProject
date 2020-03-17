package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithHeader {

    @FindBy("//div[contains(@class, 'navbar') and @style]")
    Header header();
}
