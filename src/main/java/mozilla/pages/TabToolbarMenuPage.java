package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabToolbarMenuPage {

    //Elements

    @FindBy(id = "menu-sync")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-sync']")
    private WebElement SyncBtn;

    @FindBy(id = "menu-panel-TopSites")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-panel-TopSites']")
    private WebElement TopSitesBtn;

    @FindBy(id = "menu-panel-BookmarksPage")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-panel-BookmarksPage']")
    private WebElement BookmarksBtn;

    @FindBy(id = "menu-panel-ReadingList")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-panel-ReadingList']")
    private WebElement ReadingListBtn;

    @FindBy(id = "menu-panel-History")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-panel-History']")
    private WebElement HistoryBtn;

    @FindBy(id = "menu-panel-Downloads")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-panel-Downloads']")
    private WebElement DownloadsBtn;

    @FindBy(id = "menu-TrackingProtection")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-TrackingProtection']")
    private WebElement TrackProtectionBtn;

    @FindBy(id = "menu-NoImageMode")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NoImageMode']")
    private WebElement HideImgBtn;

    @FindBy(id = "menu-NightMode")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NightMode']")
    private WebElement NightModeBtn;

    @FindBy(id = "Settings")
    //@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Settings']")
    private WebElement SettingsBtn;

    @FindBy(id = "PhotonMenu.close")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='PhotonMenu.close']")
    private WebElement CloseBtn;

    //Actions

    public void syncBtnClick() {
        SyncBtn.click();
    }

    public void topSitesBtnClick() {
        TopSitesBtn.click();
    }

    public void bookmarksBtnClick() {
        BookmarksBtn.click();
    }

    public void readingListBtnClick() {
        ReadingListBtn.click();
    }

    public void historyBtnClick() {
        HistoryBtn.click();
    }

    public void downloadsBtnClick() {
        DownloadsBtn.click();
    }

    public void trackProtectionBtnClick() {
        TrackProtectionBtn.click();
    }

    public void hideImgBtnClick() {
        HideImgBtn.click();
    }

    public void nightModeBtnClick() {
        NightModeBtn.click();
    }

    public void settingsBtnClick() {
        SettingsBtn.click();
    }

    public void closeBtnClick() {
        CloseBtn.click();
    }

}
