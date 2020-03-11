package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithNavigationBar {
    @FindBy("//nav[contains(@class,'resp-menu-2')]/div")
    NavigationBar navigationBar();
}
