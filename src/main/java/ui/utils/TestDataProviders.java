package ui.utils;

import org.testng.annotations.DataProvider;
import ui.enums.*;

public class TestDataProviders {

    @DataProvider(name = "getCitiesFromHeader",parallel = false)
    public static Object[][] getCitiesFromHeader() {
        return new Object[][]{
                {DropdownCityItem.BILOZIRYA.getHeader(),DropdownCityItem.BILOZIRYA.getText(),DropdownCityItem.BILOZIRYA.getUrl()},
                {DropdownCityItem.VATUTINE.getHeader(),DropdownCityItem.VATUTINE.getText(),DropdownCityItem.VATUTINE.getUrl()},
                {DropdownCityItem.VOZNESENSKE.getHeader(),DropdownCityItem.VOZNESENSKE.getText(),DropdownCityItem.VOZNESENSKE.getUrl()},
                {DropdownCityItem.GERONIMOVKA.getHeader(),DropdownCityItem.GERONIMOVKA.getText(),DropdownCityItem.GERONIMOVKA.getUrl()},
                {DropdownCityItem.DUBIYIVKA.getHeader(),DropdownCityItem.DUBIYIVKA.getText(),DropdownCityItem.DUBIYIVKA.getUrl()},
                {DropdownCityItem.ZVENIGORODKA.getHeader(),DropdownCityItem.ZVENIGORODKA.getText(),DropdownCityItem.ZVENIGORODKA.getUrl()},
                {DropdownCityItem.ZGAR.getHeader(),DropdownCityItem.ZGAR.getText(),DropdownCityItem.ZGAR.getUrl()},
                {DropdownCityItem.ZOLOTONOSHA.getHeader(),DropdownCityItem.ZOLOTONOSHA.getText(),DropdownCityItem.ZOLOTONOSHA.getUrl()},
                {DropdownCityItem.KANIV.getHeader(),DropdownCityItem.KANIV.getText(),DropdownCityItem.KANIV.getUrl()},
                {DropdownCityItem.LESKI.getHeader(),DropdownCityItem.LESKI.getText(),DropdownCityItem.LESKI.getUrl()},
                {DropdownCityItem.MOSHNI.getHeader(),DropdownCityItem.MOSHNI.getText(),DropdownCityItem.MOSHNI.getUrl()},
                {DropdownCityItem.NOVA_DMITRIVKA.getHeader(),DropdownCityItem.NOVA_DMITRIVKA.getText(),DropdownCityItem.NOVA_DMITRIVKA.getUrl()},
                {DropdownCityItem.PEREIASLAV.getHeader(),DropdownCityItem.PEREIASLAV.getText(),DropdownCityItem.PEREIASLAV.getUrl()},
                {DropdownCityItem.RUSKA_POLYANA.getHeader(),DropdownCityItem.RUSKA_POLYANA.getText(),DropdownCityItem.RUSKA_POLYANA.getUrl()},
                {DropdownCityItem.SAGUNIVKA.getHeader(),DropdownCityItem.SAGUNIVKA.getText(),DropdownCityItem.SAGUNIVKA.getUrl()},
                {DropdownCityItem.SVIDIVOK.getHeader(),DropdownCityItem.SVIDIVOK.getText(),DropdownCityItem.SVIDIVOK.getUrl()},
                {DropdownCityItem.SMILA.getHeader(),DropdownCityItem.SMILA.getText(),DropdownCityItem.SMILA.getUrl()},
                {DropdownCityItem.STEBNE.getHeader(),DropdownCityItem.STEBNE.getText(),DropdownCityItem.STEBNE.getUrl()},
                {DropdownCityItem.STETSIVKA.getHeader(),DropdownCityItem.STETSIVKA.getText(),DropdownCityItem.STETSIVKA.getUrl()},
                {DropdownCityItem.HUDYAKI.getHeader(),DropdownCityItem.HUDYAKI.getText(),DropdownCityItem.HUDYAKI.getUrl()},
                {DropdownCityItem.HUTORY.getHeader(),DropdownCityItem.HUTORY.getText(),DropdownCityItem.HUTORY.getUrl()},
                {DropdownCityItem.CHERVONA_SLOBODA.getHeader(),DropdownCityItem.CHERVONA_SLOBODA.getText(),DropdownCityItem.CHERVONA_SLOBODA.getUrl()},
                {DropdownCityItem.CHORNOBAY.getHeader(),DropdownCityItem.CHORNOBAY.getText(),DropdownCityItem.CHORNOBAY.getUrl()},
                {DropdownCityItem.SHPOLA.getHeader(),DropdownCityItem.SHPOLA.getText(),DropdownCityItem.SHPOLA.getUrl()},
                {DropdownCityItem.YURKIVKA.getHeader(),DropdownCityItem.YURKIVKA.getText(),DropdownCityItem.YURKIVKA.getUrl()}
        };

    }

    @DataProvider(name = "getCitiesWithoutUrls",parallel = false)
    public static Object[][] getCitiesWithoutUrls() {
        return new Object[][]{
                {DropdownCityItem.BILOZIRYA.getHeader(),DropdownCityItem.BILOZIRYA.getText()},
                {DropdownCityItem.VATUTINE.getHeader(),DropdownCityItem.VATUTINE.getText()},
                {DropdownCityItem.VOZNESENSKE.getHeader(),DropdownCityItem.VOZNESENSKE.getText()},
                {DropdownCityItem.GERONIMOVKA.getHeader(),DropdownCityItem.GERONIMOVKA.getText()},
                {DropdownCityItem.DUBIYIVKA.getHeader(),DropdownCityItem.DUBIYIVKA.getText()},
                {DropdownCityItem.ZVENIGORODKA.getHeader(),DropdownCityItem.ZVENIGORODKA.getText()},
                {DropdownCityItem.ZGAR.getHeader(),DropdownCityItem.ZGAR.getText()},
                {DropdownCityItem.ZOLOTONOSHA.getHeader(),DropdownCityItem.ZOLOTONOSHA.getText()},
                {DropdownCityItem.KANIV.getHeader(),DropdownCityItem.KANIV.getText()},
                {DropdownCityItem.LESKI.getHeader(),DropdownCityItem.LESKI.getText()},
                {DropdownCityItem.MOSHNI.getHeader(),DropdownCityItem.MOSHNI.getText()},
                {DropdownCityItem.NOVA_DMITRIVKA.getHeader(),DropdownCityItem.NOVA_DMITRIVKA.getText()},
                {DropdownCityItem.PEREIASLAV.getHeader(),DropdownCityItem.PEREIASLAV.getText()},
                {DropdownCityItem.RUSKA_POLYANA.getHeader(),DropdownCityItem.RUSKA_POLYANA.getText()},
                {DropdownCityItem.SAGUNIVKA.getHeader(),DropdownCityItem.SAGUNIVKA.getText()},
                {DropdownCityItem.SVIDIVOK.getHeader(),DropdownCityItem.SVIDIVOK.getText()},
                {DropdownCityItem.SMILA.getHeader(),DropdownCityItem.SMILA.getText()},
                {DropdownCityItem.STEBNE.getHeader(),DropdownCityItem.STEBNE.getText()},
                {DropdownCityItem.STETSIVKA.getHeader(),DropdownCityItem.STETSIVKA.getText()},
                {DropdownCityItem.HUDYAKI.getHeader(),DropdownCityItem.HUDYAKI.getText()},
                {DropdownCityItem.HUTORY.getHeader(),DropdownCityItem.HUTORY.getText()},
                {DropdownCityItem.CHERVONA_SLOBODA.getHeader(),DropdownCityItem.CHERVONA_SLOBODA.getText()},
                {DropdownCityItem.CHORNOBAY.getHeader(),DropdownCityItem.CHORNOBAY.getText()},
                {DropdownCityItem.SHPOLA.getHeader(),DropdownCityItem.SHPOLA.getText()},
                {DropdownCityItem.YURKIVKA.getHeader(),DropdownCityItem.YURKIVKA.getText()}
        };

    }


    @DataProvider(name = "getMenuItems",parallel = false)
    public static Object[][] getMenuItems() {
       // return getDataFromEnums(DropDownMenuHeaderItem.class);

        return new Object[][]{
                {DropDownMenuHeaderItem.APARTMENT_BUILDINGS.getHeader(),DropDownMenuHeaderItem.APARTMENT_BUILDINGS.getText(),DropDownMenuHeaderItem.APARTMENT_BUILDINGS.getUrl()},
                {DropDownMenuHeaderItem.PRIVATE_HOUSE.getHeader(),DropDownMenuHeaderItem.PRIVATE_HOUSE.getText(),DropDownMenuHeaderItem.PRIVATE_HOUSE.getUrl()},
                {DropDownMenuHeaderItem.TV.getHeader(),DropDownMenuHeaderItem.TV.getText(),DropDownMenuHeaderItem.TV.getUrl()},
                {DropDownMenuHeaderItem.TV_PLUS_INTERNET.getHeader(),DropDownMenuHeaderItem.TV_PLUS_INTERNET.getText(),DropDownMenuHeaderItem.TV_PLUS_INTERNET.getUrl()},
                {DropDownMenuHeaderItem.SERVICES_FOR_HOME.getHeader(),DropDownMenuHeaderItem.SERVICES_FOR_HOME.getText(),DropDownMenuHeaderItem.SERVICES_FOR_HOME.getUrl()},
                {DropDownMenuHeaderItem.INTERNET_FOR_BUSINESS.getHeader(),DropDownMenuHeaderItem.INTERNET_FOR_BUSINESS.getText(),DropDownMenuHeaderItem.INTERNET_FOR_BUSINESS.getUrl()},
                {DropDownMenuHeaderItem.SERVICES_FOR_BUSINESS.getHeader(),DropDownMenuHeaderItem.SERVICES_FOR_BUSINESS.getText(),DropDownMenuHeaderItem.SERVICES_FOR_BUSINESS.getUrl()},
                {DropDownMenuHeaderItem.ADDITIONAL_SERVICES_FOR_BUSINESS.getHeader(),DropDownMenuHeaderItem.ADDITIONAL_SERVICES_FOR_BUSINESS.getText(),DropDownMenuHeaderItem.ADDITIONAL_SERVICES_FOR_BUSINESS.getUrl()},
                {DropDownMenuHeaderItem.HOSTING.getHeader(),DropDownMenuHeaderItem.HOSTING.getText(),DropDownMenuHeaderItem.HOSTING.getUrl()},
                {DropDownMenuHeaderItem.DOMAIN.getHeader(),DropDownMenuHeaderItem.DOMAIN.getText(),DropDownMenuHeaderItem.DOMAIN.getUrl()},
                {DropDownMenuHeaderItem.ADDITIONAL_SERVICES_FOR_OTHER_SERVICES.getHeader(),DropDownMenuHeaderItem.ADDITIONAL_SERVICES_FOR_OTHER_SERVICES.getText(),DropDownMenuHeaderItem.ADDITIONAL_SERVICES_FOR_OTHER_SERVICES.getUrl()},
                {DropDownMenuHeaderItem.ROUTERS.getHeader(),DropDownMenuHeaderItem.ROUTERS.getText(),DropDownMenuHeaderItem.ROUTERS.getUrl()},
                {DropDownMenuHeaderItem.INTERCOMS.getHeader(),DropDownMenuHeaderItem.INTERCOMS.getText(),DropDownMenuHeaderItem.INTERCOMS.getUrl()},
                {DropDownMenuHeaderItem.COMMON_QUESTIONS.getHeader(),DropDownMenuHeaderItem.COMMON_QUESTIONS.getText(),DropDownMenuHeaderItem.COMMON_QUESTIONS.getUrl()},
                {DropDownMenuHeaderItem.FEEDBACK.getHeader(),DropDownMenuHeaderItem.FEEDBACK.getText(),DropDownMenuHeaderItem.FEEDBACK.getUrl()},
                {DropDownMenuHeaderItem.ABOUT_COMPANY.getHeader(),DropDownMenuHeaderItem.ABOUT_COMPANY.getText(),DropDownMenuHeaderItem.ABOUT_COMPANY.getUrl()},
                {DropDownMenuHeaderItem.CONTACTS.getHeader(),DropDownMenuHeaderItem.CONTACTS.getText(),DropDownMenuHeaderItem.CONTACTS.getUrl()},
                {DropDownMenuHeaderItem.CITY_CAMERAS.getHeader(),DropDownMenuHeaderItem.CITY_CAMERAS.getText(),DropDownMenuHeaderItem.CITY_CAMERAS.getUrl()},
                {DropDownMenuHeaderItem.WIFI_HOTSPOT.getHeader(),DropDownMenuHeaderItem.WIFI_HOTSPOT.getText(),DropDownMenuHeaderItem.WIFI_HOTSPOT.getUrl()},
        };
    }

    @DataProvider(name = "getFabs",parallel = false)
    public static Object[][] getFabs(){
        //return getDataFromEnums2(FloatingActionButton.class);
        return new Object[][]{
                {FloatingActionButton.FACEBOOK_FAB.getFabClass(),FloatingActionButton.FACEBOOK_FAB.getUrl()},
                {FloatingActionButton.INSTAGRAM_FAB.getFabClass(),FloatingActionButton.INSTAGRAM_FAB.getUrl()},
                {FloatingActionButton.TELEGRAM_FAB.getFabClass(),FloatingActionButton.TELEGRAM_FAB.getUrl()},
                {FloatingActionButton.GOOGLE_PLAY_FAB.getFabClass(),FloatingActionButton.GOOGLE_PLAY_FAB.getUrl()},
                {FloatingActionButton.APP_STORE_FAB.getFabClass(),FloatingActionButton.APP_STORE_FAB.getUrl()}
        };
    }

    @DataProvider(name = "getHeaderButtons",parallel = false)
    public static Object[][] getHeaderButtons(){
        return new Object[][]{
                {Button.CONNECT.getText(),Button.CONNECT.getUrl()},
                {Button.PAYMENT.getText(),Button.PAYMENT.getUrl()},
                {Button.PERSONAL_CABINET.getText(),Button.PERSONAL_CABINET.getUrl()}
        };
    }


    @DataProvider(name = "getButtonsFromPesonalCabinetMenu",parallel = false)
    public static Object[][] getButtonsFromPesonalCabinet(){
        return new Object[][]{
                {Button.TO_ABONENT_PAGE_BUTTON.getText(),Button.TO_ABONENT_PAGE_BUTTON.getUrl()},
                {Button.TO_INTERNET_PAGE_BUTTON_.getText(),Button.TO_INTERNET_PAGE_BUTTON_.getUrl()},
                {Button.TO_BALANCE_PAGE_BUTTON.getText(),Button.TO_BALANCE_PAGE_BUTTON.getUrl()},
                {Button.TO_SERVICES_PAGE_BUTTON.getText(),Button.TO_SERVICES_PAGE_BUTTON.getUrl()},
                {Button.TO_PAYMENT_PAGE_BUTTON.getText(),Button.TO_PAYMENT_PAGE_BUTTON.getUrl()},
                {Button.TO_NEWS_PAGE_BUTTON.getText(),Button.TO_NEWS_PAGE_BUTTON.getUrl()},
                {Button.TO_REQUESTS_PAGE_BUTTON.getText(),Button.TO_REQUESTS_PAGE_BUTTON.getUrl()},
                {Button.TO_ACTION_PAGE_BUTTON.getText(),Button.TO_ACTION_PAGE_BUTTON.getUrl()}
        };
    }


    @DataProvider(name = "getNavigateContainersToPage",parallel = false)
    public static Object[][] getNavigateContainersToPage(){
        return new Object[][]{
                {ContainerEnum.TO_PAGE_ABONENT.getContainerClass(),ContainerEnum.TO_PAGE_ABONENT.getUrl()},
                {ContainerEnum.TO_PAGE_INTERNET.getContainerClass(),ContainerEnum.TO_PAGE_INTERNET.getUrl()},
                {ContainerEnum.TO_PAGE_BALANCE.getContainerClass(),ContainerEnum.TO_PAGE_BALANCE.getUrl()},
                {ContainerEnum.TO_PAGE_SERVICES.getContainerClass(),ContainerEnum.TO_PAGE_SERVICES.getUrl()},
                {ContainerEnum.TO_PAGE_PAY.getContainerClass(),ContainerEnum.TO_PAGE_PAY.getUrl()},
                {ContainerEnum.TO_PAGE_NEWS.getContainerClass(),ContainerEnum.TO_PAGE_NEWS.getUrl()},
                {ContainerEnum.TO_PAGE_REQUESTS.getContainerClass(),ContainerEnum.TO_PAGE_REQUESTS.getUrl()},
                {ContainerEnum.TO_PAGE_ACTION.getContainerClass(),ContainerEnum.TO_PAGE_ACTION.getUrl()}
        };
    }





   /* public static <T extends Enum<T>> Object[][] getDataFromEnums(Class<T> aEnum) {
        //System.out.println(Arrays.asList(aEnum.getEnumConstants()));
        Object[] array = aEnum.getEnumConstants();
        Object[][]array2 = new Object[aEnum.getEnumConstants().length][3];
        Method method1 = null;
        Method method2 = null;
        Method method3 = null;
        try {
            method1 = aEnum.getDeclaredMethod("getHeader");
            method2 = aEnum.getDeclaredMethod("getLocatorString");
            method3 = aEnum.getDeclaredMethod("getUrl");
        } catch (NoSuchMethodException exception) {
            exception.printStackTrace();
        }
        int i = 0;
        for (Object o:array) {
            try {
                array2[i][0]= method1.invoke(o, null);
                array2[i][1] = method2.invoke(o, null);
                array2[i][2] = method3.invoke(o, null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            i++;
        }
        return array2;

    }


    public static <T extends Enum<T>> Object[][] getDataFromEnums2(Class<T> aEnum) {
        //System.out.println(Arrays.asList(aEnum.getEnumConstants()));
        Object[] array = aEnum.getEnumConstants();
        Object[][]array2 = new Object[aEnum.getEnumConstants().length][2];
        Method method2 = null;
        Method method3 = null;
        try {
            method2 = aEnum.getDeclaredMethod("getLocatorString");
            method3 = aEnum.getDeclaredMethod("getUrl");
        } catch (NoSuchMethodException exception) {
            exception.printStackTrace();
        }
        int i = 0;
        for (Object o:array) {
            try {
                array2[i][0] = method2.invoke(o, null);
                array2[i][1] = method3.invoke(o, null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            i++;
        }
        return array2;

    }*/


}
