package ui.pageHelpers;

public class MainPageHelper extends BaseHelper {

    public MainPageHelper scrollToButton(){
        openStartUrl();
        scrollToElementWithJSExec(pageManager.onMainPage().container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12").input("lc"));
        return this;
    }

    public MainPageHelper inputPersonalNumberForCheckBalance(){
        pageManager.onMainPage().container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12").input("lc").sendKeys("19767");
        return this;
    }

    public MainPageHelper changeCityForCheckBalance(){
        pageManager.onMainPage().container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12");
        return  this;
    }







}
