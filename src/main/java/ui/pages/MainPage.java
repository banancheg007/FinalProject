package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Page;
import io.qameta.atlas.webdriver.extension.Param;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import ui.elements.*;

public interface MainPage extends BasePage, WithNavigationBar, WithHeader, WithInput, WithContainer, WithFooter {

    @FindBy("//div[contains(@class,'{{ value }}')]")
    AtlasWebElement captchaCheckbox(@Param("value") String value);

    @FindBy("//iframe[@height]")
    AtlasWebElement frame();

}
