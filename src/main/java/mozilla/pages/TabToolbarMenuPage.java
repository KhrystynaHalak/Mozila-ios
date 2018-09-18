package mozilla.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabToolbarMenuPage extends BasePage {

    // Init Page
    public TabToolbarMenuPage(IOSDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Elements

    //@FindBy(id = "menu-sync")
    @FindBy(xpath = "//*[@name='menu-sync']")
    private WebElement SyncBtn;

    //@FindBy(id = "menu-panel-TopSites")
    @FindBy(xpath = "//*[@name='menu-panel-TopSites']")
    private WebElement TopSitesBtn;

    //@FindBy(id = "menu-panel-BookmarksPage")
    @FindBy(xpath = "//*[@name='menu-panel-BookmarksPage']")
    private WebElement BookmarksBtn;

    //@FindBy(id = "menu-panel-ReadingList")
    @FindBy(xpath = "//[@name='menu-panel-ReadingList']")
    private WebElement ReadingListBtn;

    //@FindBy(id = "menu-panel-History")
    @FindBy(xpath = "//*[@name='menu-panel-History']")
    private WebElement HistoryBtn;

    //@FindBy(id = "menu-panel-Downloads")
    @FindBy(xpath = "//*[@name='menu-panel-Downloads']")
    private WebElement DownloadsBtn;

    //@FindBy(id = "menu-TrackingProtection")
    @FindBy(xpath = "//*[@name='menu-TrackingProtection']")
    private WebElement TrackProtectionBtn;

    //@FindBy(id = "menu-NoImageMode")
    @FindBy(xpath = "//*[@name='menu-NoImageMode']")
    private WebElement HideImgBtn;

    //@FindBy(id = "menu-NightMode")
    @FindBy(xpath = "//*[@name='menu-NightMode']")
    private WebElement NightModeBtn;

    //@FindBy(id = "Settings")
    @FindBy(xpath = "//*[@name='Settings']")
    private WebElement SettingsBtn;

    //@FindBy(id = "PhotonMenu.close")
    @FindBy(xpath = "//*[@name='PhotonMenu.close']")
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
