package framework.utility;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Logger;

public class Driver {

    private IOSDriver driver;
    final String APP_URL = "D:\\ProjectToTestTwo\\ApiDemos.apk";
    final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    final int TIME_OUT = 15;

    private Driver() { }

    private static Driver instance = new Driver();

    public static Driver getInstance() {
        return instance;
    }

    private ThreadLocal<IOSDriver> threadLocal = new ThreadLocal<IOSDriver>() {
        @Override
        protected IOSDriver initialValue() {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (driver == null) {
                capabilities.setCapability("app", "/Users/khrystyna/Library/Developer/Xcode/DerivedData/Client-brfxltyitivdwtbpzpvcqlitwmyw/Build/Products/Fennec-iphonesimulator/Client.app");
                capabilities.setCapability("platformName", "IOS");
                capabilities.setCapability("platformVersion", "11.4");
                capabilities.setCapability("deviceName", "iPhone X");
                capabilities.setCapability("noReset", true);
            }
            return driver;
        }
    };

    public IOSDriver getDriver() {return threadLocal.get(); }

    public void removeDriver(){
        driver = threadLocal.get();
        try{
            driver.manage().deleteAllCookies();
            driver.quit();
        }
        finally {
            threadLocal.remove();
        }
    }
}
