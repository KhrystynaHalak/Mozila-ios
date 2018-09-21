package framework.utility;
import io.appium.java_client.ios.IOSDriver;
import mozilla.pages.BookmarksPage;
import mozilla.pages.HomePage;
import mozilla.pages.TabToolbarMenuPage;
//import org.apache.log4j.helpers.ThreadLocalMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private IOSDriver driver;

    final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    final String appAdress = "/Users/khrystyna/Library/Developer/Xcode/DerivedData/Client-brfxltyitivdwtbpzpvcqlitwmyw/Build/Products/Fennec-iphonesimulator/Client.app";
    final int TIME_OUT = 15;

    protected HomePage homePage;
    protected TabToolbarMenuPage tabToolbarMenuPage;
    protected BookmarksPage bookmarksPage;


    private Driver() { }

    private static Driver instance = new Driver();

    public static Driver getInstance() {
        return instance;
    }


    private ThreadLocal<IOSDriver> threadLocal = new ThreadLocal<IOSDriver>() {
        @Override
        protected IOSDriver initialValue(){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (driver == null) {

                capabilities.setCapability("app", appAdress);
                capabilities.setCapability("platformName", "IOS");
                capabilities.setCapability("platformVersion", "11.4");
                capabilities.setCapability("deviceName", "iPhone SE");
                capabilities.setCapability("noReset", true);
                try {
                    driver = new IOSDriver(new URL(APPIUM_URL), capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
            return driver;
        }

    };

    public IOSDriver getDriver() {return threadLocal.get(); }

    public void removeDriver(){
        driver = threadLocal.get();
        try{
            driver.quit();
        }
        finally {
            threadLocal.remove();
        }
    }

}