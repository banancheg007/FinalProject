package ui.pages.personalCabinetPages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import org.testng.Assert;
import ui.elements.WithButton;
import ui.elements.WithPersonalCabinetMenu;
import utils.enums.Button;
import utils.enums.DropDownHistoryItems;
import ui.pages.BasePage;
import utils.Constants;

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
        button(year.getItemText()).click();
        dropdown(month.getHeaderId()).click();
        button(month.getItemText()).click();
        dropdown(type.getHeaderId()).click();
        button(type.getItemText()).click();
        button(Button.SHOW.getText()).click();
    }

    default void compareMonthAndYearResults(int expectedMonth, int expectedYear){
        for (AtlasWebElement element:dateColumns()){
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(new SimpleDateFormat("dd.MM.yy").parse(element.getText()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Assert.assertEquals(expectedMonth,calendar.get(Calendar.MONTH));
            Assert.assertEquals(expectedYear,calendar.get(Calendar.YEAR));
        }
    }

    default void compareWriteOffsReason(){
        for (AtlasWebElement element:reasonColumns()){
            Assert.assertTrue(element.getText().contains(Constants.INTERNET) || element.getText().contains(Constants.IPTV));
        }
    }

    default void compareIncomeReason(){
        for (AtlasWebElement element:reasonColumns()){
            Assert.assertTrue(element.getText().contains(Constants.PAYMENT) || element.getText().contains(Constants.ADDITION));
        }
    }


}
