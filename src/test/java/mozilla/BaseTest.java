package mozilla;

import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import mozilla.pages.*;
import mozilla.pages.HomePage;
import mozilla.pages.ShareWithPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;

public class BaseTest {

    //protected Logger log = Logger.getLogger("WD: ");
    protected final int implicitTimeOut = 50;

    protected HomePage homePage;
    protected HistoryPage historyPage;
    protected AllOtherPages allOtherPages;
    protected TabToolbarMenuPage tabToolbarMenuPage;
    protected BookmarksPage bookmarksPage;
    protected NavigationButtons navigationButtons;
    protected TabsPage tabsPage;
    protected SettingsPage settingsPage;
    protected SyncPage syncPage;
    protected ReadingListPage readingListPage;
    protected ShareWithPage shareWithPage;

    @BeforeClass
    public void beforeClass() {
        homePage = new HomePage();
        historyPage = new HistoryPage();
        allOtherPages = new AllOtherPages();
        tabToolbarMenuPage = new TabToolbarMenuPage();
        bookmarksPage = new BookmarksPage();
        navigationButtons = new NavigationButtons();
        tabsPage = new TabsPage();
        shareWithPage = new ShareWithPage();
        syncPage = new SyncPage();
        readingListPage = new ReadingListPage();

        IOSDriver driver = Driver.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(implicitTimeOut, TimeUnit.SECONDS);
        driver.resetApp();

    }

    @AfterClass
    public void afterClass() throws IOException {
        //Driver.getInstance().getDriver().resetApp();
        Driver.getInstance().removeDriver();
    }
}