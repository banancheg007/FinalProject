package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import ui.elements.NavigationBar;
import ui.elements.TopMainMenu;
import ui.elements.WithNavigationBar;
import ui.utils.Utils;

public interface MainPage extends BasePage, WithNavigationBar {

    @FindBy("//div[contains(@class, 'recaptcha-checkbox-')]")
    AtlasWebElement captchaCheckbox();

}
