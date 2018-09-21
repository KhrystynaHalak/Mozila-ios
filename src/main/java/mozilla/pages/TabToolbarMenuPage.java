package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabToolbarMenuPage extends BasePage {

    //Elements

    @FindBy(id = "menu-sync")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-sync']")
    private WebElement SyncBtn;

    @FindBy(id = "menu-panel-TopSites")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-panel-TopSites']")
    private WebElement TopSitesBtn;

    @FindBy(id = "menu-panel-Bookmarks")
    //@FindBy(xpath = "//*[@name='Bookmarks']")
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

    @FindBy(xpath = "//XCUIElementTypeCell[@name='menu-TrackingProtection']/XCUIElementTypeImage")
    private WebElement TrackProtectionRDBtn;

    @FindBy(id = "menu-NoImageMode")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NoImageMode']")
    private WebElement HideImgBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NoImageMode']/XCUIElementTypeImage")
    private WebElement HideImgRDBtn;

    @FindBy(id = "menu-NightMode")
    //@FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NightMode']")
    private WebElement NightModeBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NightMode']/XCUIElementTypeImage")
    private WebElement NightModeRDBtn;

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

    public void enableTrackingProtection() {
        if (TrackProtectionRDBtn.getAttribute("name").equals("enabled")) {
            return;
        }
        else TrackProtectionBtn.click();
    }

    public void disableTrackingProtection() {
        if(TrackProtectionRDBtn.getAttribute("name").equals("disabled")) {
            return;
        }
        else TrackProtectionBtn.click();
    }

    public String getTrackingProtectionStatus() {
        return TrackProtectionRDBtn.getAttribute("name");
    }

    public void enableHideImg() {
        if (HideImgRDBtn.getAttribute("name").equals("enabled")) {
            return;
        }
        else HideImgBtn.click();
    }

    public void disableHideImg() {
        if(HideImgRDBtn.getAttribute("name").equals("disabled")) {
            return;
        }
        else HideImgBtn.click();
    }

    public String getHideImgStatus() {

        return HideImgRDBtn.getAttribute("name");
    }

    public void enableNightMode() {
        if (NightModeRDBtn.getAttribute("name").equals("enabled")) {
            return;
        }
        else NightModeBtn.click();
    }

    public void disableNightMode() {
        if(NightModeRDBtn.getAttribute("name").equals("disabled")) {
            return;
        }
        else NightModeBtn.click();
    }

    public String getNightModeStatus() {

        return NightModeRDBtn.getAttribute("name");
    }

    public void closeBtnClick() {
        CloseBtn.click();
    }

}
