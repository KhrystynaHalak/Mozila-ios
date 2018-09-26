package framework.utility;

import io.appium.java_client.ios.IOSDriver;
//import org.apache.log4j.helpers.ThreadLocalMap;

import mozilla.pages.SyncPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static framework.utility.Properties.*;

public class Driver {

    private static Logger logger = LogManager.getLogger(Driver.class);

    private IOSDriver driver;

    private static final String APPIUM_URL = getProperty("appium.url");
    private static final int TIME_OUT = Integer.valueOf(getProperty("timeout"));
    private static final String APP_ADDRESS = getProperty("app.address").replace("{user.dir}", System.getProperty("user.dir"));
    private static final String PLATFORM_NAME = getProperty("platform.name");
    private static final String PLATFORM_VERSION = getProperty("platform.version");
    private static final String DEVICE_NAME = getProperty("device.name");
    private static final boolean NO_RESET = Boolean.valueOf(getProperty("noreset"));
    private static final String AUTOMATION_NAME = getProperty("automation.name");


    private Driver() {
    }

    private static Driver instance = new Driver();

    public static Driver getInstance() {
        return instance;
    }

    private ThreadLocal<IOSDriver> threadLocal = new ThreadLocal<IOSDriver>() {
        @Override
        protected IOSDriver initialValue() {
            logger.info("Initializing ios driver ...");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (driver == null) {
                capabilities.setCapability("app", APP_ADDRESS);
                logger.debug("App adress: " + APP_ADDRESS);
                capabilities.setCapability("platformName", PLATFORM_NAME);
                logger.debug("Platform name: " + PLATFORM_NAME);
                capabilities.setCapability("platformVersion", PLATFORM_VERSION);
                logger.debug("Platform version: " + PLATFORM_VERSION);
                capabilities.setCapability("deviceName", DEVICE_NAME);
                logger.debug("Device name: " + DEVICE_NAME);
                capabilities.setCapability("noReset", true);
                logger.debug("No reset: " + NO_RESET);
                capabilities.setCapability("automationName", AUTOMATION_NAME);
                logger.debug("Automation name: " + AUTOMATION_NAME);
                //capabilities.setCapability("fullReset", true);

                try {
                    driver = new IOSDriver(new URL(APPIUM_URL), capabilities);
                    driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
                } catch (MalformedURLException e) {
                    logger.error("Dreiver initialization failure: "+e.getMessage());
                    e.printStackTrace();
                }
                logger.info("Driver successfully initialized!");
            }
            return driver;
        }
    };

    public IOSDriver getDriver() {
        return threadLocal.get();
    }

    public void removeDriver() {
        logger.info("Removing driver ...");
        driver = threadLocal.get();
        try {
            driver.quit();
        } finally {
            threadLocal.remove();
        }
    }
}