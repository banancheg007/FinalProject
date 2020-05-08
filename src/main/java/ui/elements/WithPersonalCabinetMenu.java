package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithPersonalCabinetMenu extends WithContainer {



    @FindBy("//div[contains(@id,'menu')]")
    Container personalCabinetMenu();
}
