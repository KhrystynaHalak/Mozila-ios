package framework.utility;

import io.appium.java_client.ios.IOSDriver;
//import org.apache.log4j.helpers.ThreadLocalMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private IOSDriver driver;

    final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    final int TIME_OUT = 15;

    private Driver() {
    }

    private static Driver instance = new Driver();

    public static Driver getInstance() {
        return instance;
    }

    private ThreadLocal<IOSDriver> threadLocal = new ThreadLocal<IOSDriver>() {
        @Override
        protected IOSDriver initialValue() {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (driver == null) {
                capabilities.setCapability("app", "/Users/ostap/Desktop/Project/Client.app");
                capabilities.setCapability("platformName", "IOS");
                capabilities.setCapability("platformVersion", "11.4");
                capabilities.setCapability("deviceName", "iPhone SE");
                capabilities.setCapability("noReset", true);
                capabilities.setCapability("automationName", "appium");

                try {
                    driver = new IOSDriver(new URL(APPIUM_URL), capabilities);
                    driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            return driver;
        }
    };

    public IOSDriver getDriver() {
        return threadLocal.get();
    }

    public void removeDriver() {
        driver = threadLocal.get();
        try {
            driver.quit();
        } finally {
            threadLocal.remove();
        }
    }
}