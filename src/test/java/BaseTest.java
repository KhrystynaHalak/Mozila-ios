/*import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import mozilla.pages.AllOtherPages;
import mozilla.pages.BookmarksPage;
import mozilla.pages.HomePage;
import mozilla.pages.TabToolbarMenuPage;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected Logger log = Logger.getLogger("WD: ");
    protected final int implicitTimeOut = 50;

    //@BeforeClass
    public void beforeClass() {

        IOSDriver driver = Driver.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(implicitTimeOut, TimeUnit.SECONDS);

    }

    @AfterClass
    public void afterClass() {
        Driver.getInstance().removeDriver();
    }
}
*/