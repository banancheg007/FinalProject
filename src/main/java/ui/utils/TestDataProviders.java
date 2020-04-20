package ui.utils;

import org.testng.annotations.DataProvider;
import ui.enums.DropdownCityItem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestDataProviders {

    @DataProvider(name = "getCities")

    public static Object[][] getCities() {
            return getDataFromEnums(DropdownCityItem.class);

    }


    public static <T extends Enum<T>> Object[][] getDataFromEnums(Class<T> aEnum) {
        System.out.println(Arrays.asList(aEnum.getEnumConstants()));
        Object[] array = aEnum.getEnumConstants();
        Object[][]array2 = new Object[aEnum.getEnumConstants().length][1];
        Method method = null;
        try {
            method = aEnum.getDeclaredMethod("getLocatorString");
        } catch (NoSuchMethodException exception) {
            exception.printStackTrace();
        }
        int i = 0;
        for (Object o:array) {
            try {
                array2[i][0]= method.invoke(o, null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            System.out.println(array2[i][0] );
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
