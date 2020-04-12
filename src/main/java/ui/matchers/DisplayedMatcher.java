package ui.matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.TypeSafeMatcher;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class DisplayedMatcher extends TypeSafeMatcher<WebElement> {
    public DisplayedMatcher() {
    }

    protected boolean matchesSafely(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (WebDriverException var3) {
            return false;
        }
    }

    public void describeTo(Description description) {
        description.appendText("element is displayed on page");
    }

    public void describeMismatchSafely(WebElement element, Description mismatchDescription) {
        mismatchDescription.appendValue(element).appendText(" is not displayed on page");
    }

    @Factory
    public static DisplayedMatcher displayed() {
        return new DisplayedMatcher();
    }
}
