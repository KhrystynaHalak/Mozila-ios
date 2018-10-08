package com.mozilla.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabToolbarMenuPage extends BasePage {

    //Elements

    @FindBy(id = "menu-sync")
    private WebElement syncBtn;

    @FindBy(id = "menu-panel-TopSites")
    private WebElement topSitesBtn;

    @FindBy(id = "menu-panel-Bookmarks")
    private WebElement bookmarksBtn;

    @FindBy(id = "menu-panel-ReadingList")
    private WebElement readingListBtn;

    @FindBy(id = "menu-panel-History")
    private WebElement historyBtn;

    @FindBy(id = "menu-panel-Downloads")
    private WebElement downloadsBtn;

    @FindBy(id = "menu-TrackingProtection")
    private WebElement trackProtectionBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='menu-TrackingProtection']/XCUIElementTypeImage")
    private WebElement trackProtectionRdBtn;

    @FindBy(id = "menu-NoImageMode")
    private WebElement hideImgBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NoImageMode']/XCUIElementTypeImage")
    private WebElement hideImgRdBtn;

    @FindBy(id = "menu-NightMode")
    private WebElement nightModeBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='menu-NightMode']/XCUIElementTypeImage")
    private WebElement nightModeRdBtn;

    @FindBy(id = "Settings")
    private WebElement settingsBtn;

    @FindBy(id = "PhotonMenu.close")
    private WebElement closeBtn;

    //Actions

    public void clickSyncBtn() {
        syncBtn.click();
    }

    public void clickTopSitesBtn() {
        topSitesBtn.click();
    }

    public void clickBookmarksBtn() {
        bookmarksBtn.click();
    }

    public void clickReadingListBtn() {
        readingListBtn.click();
    }

    public void clickHistoryBtn() {
        historyBtn.click();
    }

    public void clickDownloadsBtn() { downloadsBtn.click(); }

    public void clickTrackProtectionBtn() {
        trackProtectionBtn.click();
    }

    public void clickHideImgBtn() {
        hideImgBtn.click();
    }

    public void clickNightModeBtn() {
        nightModeBtn.click();
    }

    public void clickSettingsBtn() {
        settingsBtn.click();
    }

    public void enableTrackingProtection() {
        if (trackProtectionRdBtn.getAttribute("name").equals("enabled")) {
            return;
        } else trackProtectionBtn.click();
    }

    public void disableTrackingProtection() {
        if (trackProtectionRdBtn.getAttribute("name").equals("disabled")) {
            return;
        } else trackProtectionBtn.click();
    }

    public String getTrackingProtectionStatus() {
        return trackProtectionRdBtn.getAttribute("name");
    }

    public void enableHideImg() {
        if (hideImgRdBtn.getAttribute("name").equals("enabled")) {
            return;
        } else hideImgBtn.click();
    }

    public void disableHideImg() {
        if (hideImgRdBtn.getAttribute("name").equals("disabled")) {
            return;
        } else hideImgBtn.click();
    }

    public String getHideImgStatus() {

        return hideImgRdBtn.getAttribute("name");
    }

    public void enableNightMode() {
        if (nightModeRdBtn.getAttribute("name").equals("enabled")) {
            return;
        } else nightModeBtn.click();
    }

    public void disableNightMode() {
        if (nightModeRdBtn.getAttribute("name").equals("disabled")) {
            return;
        } else nightModeBtn.click();
    }

    public String getNightModeStatus() {

        return nightModeRdBtn.getAttribute("name");
    }

    public void closeBtnClick() {
        closeBtn.click();
    }

}
