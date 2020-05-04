package ui.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import org.testng.Assert;
import ui.elements.WithButton;
import ui.elements.WithPersonalCabinetMenu;
import ui.enums.Button;
import ui.enums.DropDownHistoryItems;
import ui.utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.collection.IsEmptyCollection.empty;

public interface PaymentsHistoryPage extends BasePage, WithPersonalCabinetMenu, WithButton {

    @FindBy("//*[contains(@id,'{{ value }}')]")
    AtlasWebElement dropdown(@Param("value") String value);

    @FindBy(".//*[@data-head='Дата']")
    ElementsCollection<AtlasWebElement> dateColumns();

    @FindBy(".//*[@data-head='Причина']")
    ElementsCollection<AtlasWebElement> reasonColumns();

    default void waitForLoadData(){
        dateColumns().waitUntil(not(empty()));
        for (AtlasWebElement a:dateColumns()){
            System.out.println(a.getText());
        }
    }


    default void showHistoryForPeriodAndType(DropDownHistoryItems year, DropDownHistoryItems month, DropDownHistoryItems type){
        dropdown(year.getHeaderId()).click();
        button(year.getLocatorString()).click();
        dropdown(month.getHeaderId()).click();
        button(month.getLocatorString()).click();
        dropdown(type.getHeaderId()).click();
        button(type.getLocatorString()).click();
        button(Button.SHOW.getLocatorString()).click();
    }

    default void compareMonthAndYearResults(int expectedMonth, int expectedYear) throws ParseException {
        for (AtlasWebElement element:dateColumns()){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new SimpleDateFormat("dd.MM.yy").parse(element.getText()));
            Assert.assertEquals(expectedMonth,calendar.get(Calendar.MONTH));
            Assert.assertEquals(expectedYear,calendar.get(Calendar.YEAR));
        }
    }

    default void compareWriteOffsReason(){
        for (AtlasWebElement element:reasonColumns()){
            Assert.assertTrue(element.getText().contains(Utils.INTERNET) || element.getText().contains(Utils.IPTV));
        }
    }

    default void compareIncomeReason(){
        for (AtlasWebElement element:reasonColumns()){
            Assert.assertTrue(element.getText().contains(Utils.PAYMENT) || element.getText().contains(Utils.ADDITION));
        }
    }


}
