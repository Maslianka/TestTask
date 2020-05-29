package utils;

import java.util.Properties;

public class Utils {
    public static String URL = getSystemProperty("URL", "https://www.audi-mediacenter.com/en");
    Properties properties = new Properties();

    public static String getSystemProperty(String property, String defaultValue) {
        String propertyString;
        propertyString = System.getProperty(property, defaultValue);

        return propertyString;
    }
}
