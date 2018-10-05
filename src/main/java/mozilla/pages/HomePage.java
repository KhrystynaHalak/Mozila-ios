package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //Elements

    @FindBy(id = "url")
    private WebElement urlField;

    @FindBy(id = "HomePanels.TopSites")
    private WebElement topSitesBtn;

    @FindBy(id = "HomePanels.Bookmarks")
    private WebElement fauvoritesBtn;

    @FindBy(id = "HomePanels.History")
    private WebElement historyBtn;

    @FindBy(id = "HomePanels.ReadingList")
    private WebElement readingListBtn;

    @FindBy(id = "HomePanels.Downloads")
    private WebElement downloadsBtn;

    @FindBy(id = "TabToolbar.tabsButton")
    private WebElement tabsBtn;

    @FindBy(id = "TabToolbar.menuButton")
    private WebElement tabToolbarBtn;

    //Actions

    public void enterURL(String URL) {
        urlField.sendKeys(URL);
    }

    public void cleanURL(){
        urlField.clear();
    }

    public void pressGobutton(){
        IOSDriver iosDriver= Driver.getInstance().getDriver();
        iosDriver.context("NATIVE_APP");
        iosDriver.getKeyboard().sendKeys(Keys.ENTER);
        iosDriver.context("NATIVE_APP_INSTRUMENTED");
    }

    public void clickTopSitesBtn() {
        topSitesBtn.click();
    }

    public void clickFauvoritesBtn() {
        fauvoritesBtn.click();
    }

    public void clickHistoryBtn() {
        historyBtn.click();
    }

    public void clickReadingListBtn() {
        readingListBtn.click();
    }

    public void clickDownloadsBtn() {
        downloadsBtn.click();
    }

    public void clickTabsBtn() {
        tabsBtn.click();
    }

    public void tabToolbarBtnClick() {
        tabToolbarBtn.click();
    }

    public String getMainSiteAddress() {

        try {
            String fullURL = urlField.getText();
            String[] arrSplitOne = fullURL.split("/");
            String[] arrSplitTwo = arrSplitOne[0].split("[.]");
            return arrSplitTwo[1];
        }
        catch (Exception e) {
            return null;
        }

    }
}
