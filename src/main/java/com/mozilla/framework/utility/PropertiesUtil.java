package com.mozilla.framework.utility;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static final String PROPERTY_FILE = "application.properties";
    private static java.util.Properties properties;

    private PropertiesUtil() {}

    private static Properties getInstance() {
        if(properties == null) {
            properties = new Properties();
            loadProperties();
        }
        return properties;
    }

    private static void loadProperties() {
        try {
            properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(PROPERTY_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String name) {
        return getInstance().getProperty(name);
    }

    public static void setProperty(String key, String value) {
        getInstance().setProperty(key, value);
    }
}
