package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import ui.elements.WithContainer;
import ui.elements.WithHeader;
import ui.elements.WithInput;
import ui.elements.WithNavigationBar;

public interface MainPage extends BasePage, WithNavigationBar, WithHeader, WithInput, WithContainer {

    @FindBy("//div[contains(@class,'{{ value }}')]")
    AtlasWebElement captchaCheckbox(@Param("value") String value);

    @FindBy("//iframe[@height]")
    AtlasWebElement frame();



}
