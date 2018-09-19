import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import mozilla.pages.HistoryPage;
import mozilla.pages.HomePage;
//import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    //protected Logger log = Logger.getLogger("WD: ");
    protected final int implicitTimeOut = 50;

    protected HomePage homePage;
    protected HistoryPage historyPage;

    @BeforeClass
    public void beforeClass() {

        IOSDriver driver = Driver.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(implicitTimeOut, TimeUnit.SECONDS);

        homePage = new HomePage();
        historyPage = new HistoryPage();
    }

    @AfterClass
    public void afterClass() throws IOException{
        Driver.getInstance().removeDriver();
    }
}
