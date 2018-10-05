package com.mozilla.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirefoxAccountPage extends BasePage{

    //Elements

    @FindBy(id = "Manage")
    private WebElement manageBtn;

    @FindBy(id = "sync.engine.bookmarks.enabled")
    private WebElement bookmarksChBox;

    @FindBy(id = "sync.engine.history.enabled")
    private WebElement historyChBox;

    @FindBy(id = "sync.engine.tabs.enabled")
    private WebElement openTabsChBox;

    @FindBy(id = "sync.engine.passwords.enabled")
    private WebElement loginsChBox;

    @FindBy(id = "DeviceNameSettingTextField")
    private WebElement deviceNameTxtField;

    @FindBy(/*id = "SignOut", */xpath = "//XCUIElementTypeCell[@name='SignOut']")
    private WebElement singOutBtn;

    @FindBy(id = "Cancel")
    private WebElement cancelBtn;

    @FindBy(id = "Disconnect")
    private WebElement disconnectBtn;

    //Actions

    public WebElement getManageBtn() {
        return manageBtn;
    }

    public WebElement getBookmarksChBox() {
        return bookmarksChBox;
    }

    public WebElement getHistoryChBox() {
        return historyChBox;
    }

    public WebElement getOpenTabsChBox() {
        return openTabsChBox;
    }

    public WebElement getLoginsChBox() {
        return loginsChBox;
    }

    public WebElement getDeviceNameTxtField() {
        return deviceNameTxtField;
    }

    public WebElement getSingOutBtn() {
        return singOutBtn;
    }

    public WebElement getCancelBtn() {
        return cancelBtn;
    }

    public WebElement getDisconnectBtn() {
        return disconnectBtn;
    }
}
