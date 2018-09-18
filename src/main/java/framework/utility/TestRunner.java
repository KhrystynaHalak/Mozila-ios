package framework.utility;

import org.junit.After;
import org.junit.Before;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.ios.IOSDriver;
import mozilla.pages.AllOtherPages;
import mozilla.pages.BookmarksPage;
import mozilla.pages.HomePage;
import mozilla.pages.TabToolbarMenuPage;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestRunner {

    final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    protected HomePage homePage;
    protected TabToolbarMenuPage tabToolbarMenuPage;
    protected BookmarksPage bookmarksPage;
    protected AllOtherPages allOtherPages;



    DesiredCapabilities caps = new DesiredCapabilities();

    public IOSDriver driver;


    @Before
    public void setCaps() {
        //this.caps = caps;

        caps.setCapability("app", "/Users/andrew/Library/Developer/Xcode/DerivedData/Client-dgszbkjkkopxrcclmheybhbwfngb/Build/Products/Fennec-iphonesimulator/Client.app");
        caps.setCapability("platformName", "IOS");
        caps.setCapability("platformVersion", "11.4");
        caps.setCapability("deviceName", "iPhone SE");
        caps.setCapability("noReset", true);
        {
            try {
                driver = new IOSDriver(new URL(APPIUM_URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        homePage = new HomePage(driver);
        tabToolbarMenuPage = new TabToolbarMenuPage(driver);
        bookmarksPage = new BookmarksPage(driver);
        allOtherPages = new AllOtherPages(driver);
    }


    @After
    public void Teardown() {
        driver.quit();
        System.out.println("I'm doing something to tidy up after the test");
    }
}

