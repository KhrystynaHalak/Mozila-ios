package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import mozilla.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //Elements

    @FindBy(id = "url")
    private WebElement URLField;

    @FindBy(id = "HomePanels.TopSites")
    private WebElement TopSitesBtn;

    @FindBy(id = "HomePanels.Bookmarks")
    private WebElement FauvoritesBtn;

    @FindBy(id = "HomePanels.History")
    private WebElement HistoryBtn;

    @FindBy(id = "HomePanels.ReadingList")
    private WebElement ReadingListBtn;

    @FindBy(id = "HomePanels.Downloads")
    private WebElement DownloadsBtn;

    @FindBy(id = "TabToolbar.tabsButton")
    private WebElement TabsBtn;

    @FindBy(id = "TabToolbar.menuButton")
    private WebElement TabToolbarBtn;

    //Actions

    public void enterURL(String URL) {
        URLField.sendKeys(URL);
    }

    public void cleanURL(){
        URLField.clear();
    }

    public void pressGobutton(){
        IOSDriver iosDriver= Driver.getInstance().getDriver();
        iosDriver.context("NATIVE_APP");
        iosDriver.getKeyboard().sendKeys(Keys.ENTER);
        //Driver.getInstance().getDriver().hideKeyboard("PRESS_KEY", "Done");
        iosDriver.context("NATIVE_APP_INSTRUMENTED");
    }

    public void topSitesBtnClick() {
        TopSitesBtn.click();
    }

    public void fauvoritesBtnClick() {
        FauvoritesBtn.click();
    }

    public void historyBtnClick() {
        HistoryBtn.click();
    }

    public void readingListBtnClick() {
        ReadingListBtn.click();
    }

    public void downloadsBtnClick() {
        DownloadsBtn.click();
    }

    public void tabsBtnClick() {
        TabsBtn.click();
    }

    public void tabToolbarBtnClick() {
        TabToolbarBtn.click();
    }

}
