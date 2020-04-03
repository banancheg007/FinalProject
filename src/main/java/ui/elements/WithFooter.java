package ui.elements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithFooter {
    @FindBy("//footer")
    Footer footer();
}
