package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //Elements


    @FindBy(id = "url")
    private WebElement URLField;

    @FindBy(id = "HomePanels.TopSites")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.TopSites']")
    private WebElement TopSitesBtn;

    @FindBy(id = "HomePanels.Bookmarks")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.Bookmarks']")
    private WebElement FauvoritesBtn;

    @FindBy(id = "HomePanels.History")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.History']")
    private WebElement HistoryBtn;

    @FindBy(id = "HomePanels.ReadingList")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.ReadingList']")
    private WebElement ReadingListBtn;

    @FindBy(id = "HomePanels.Downloads")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.Downloads']")
    private WebElement DownloadsBtn;

    @FindBy(id = "TabToolbar.tabsButton")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='TabToolbar.tabsButton']")
    private WebElement TabsBtn;

    @FindBy(id = "TabToolbar.menuButton")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='TabToolbar.menuButton]")
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
