import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected Logger log = Logger.getLogger("WD: ");
    protected final int implicitTimeOut = 50;

    @BeforeClass
    public void beforeClass() {

        IOSDriver driver = Driver.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(implicitTimeOut, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass() throws IOException{
        Driver.getInstance().removeDriver();
    }
}
