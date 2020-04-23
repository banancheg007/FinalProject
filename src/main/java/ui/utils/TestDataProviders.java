package ui.utils;

import org.testng.annotations.DataProvider;
import ui.enums.DropDownMenuHeaderItem;
import ui.enums.DropdownCityItem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestDataProviders {

    @DataProvider(name = "getCities")
    public static Object[][] getCities() {
            return getDataFromEnums(DropdownCityItem.class);

    }

    @DataProvider(name = "getMenuItems")
    public static Object[][] getMenuItems() {
        return getDataFromEnums(DropDownMenuHeaderItem.class);

    }




    public static <T extends Enum<T>> Object[][] getDataFromEnums(Class<T> aEnum) {
        System.out.println(Arrays.asList(aEnum.getEnumConstants()));
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
        System.out.println("********");
        for (int j = 0;j<aEnum.getEnumConstants().length;j++){
            for (int k =0;k<1;k++) {

                System.out.println((String) array2[j][k]);
            }
        }
        return array2;

    }


}
