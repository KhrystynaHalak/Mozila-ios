package framework.utility;

import java.io.IOException;

public class Properties {
    private static final String PROPERTY_FILE = "application.properties";
    private static java.util.Properties properties;

    private static void loadProperties() {
        properties = new java.util.Properties();
        try {
            properties.load(Properties.class.getClassLoader().getResourceAsStream(PROPERTY_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties() {}

    public static String getProperty(String name) {
        if(properties == null) {
            loadProperties();
        }
        return properties.getProperty(name);
    }

    public static void setProperty(String key, String value) {
        if(properties == null) {
            loadProperties();
        }
        properties.setProperty(key, value);
    }
}
