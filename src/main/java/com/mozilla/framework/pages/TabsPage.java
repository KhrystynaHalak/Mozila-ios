package com.mozilla.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabsPage extends BasePage {

    //Elements
    @FindBy(id = "TabTrayController.removeTabsButton")
    private WebElement deleteTabBtn;

    @FindBy(id = "TabTrayController.addTabButton")
    private WebElement addNewTabBtn;

    @FindBy(id = "TabTrayController.maskButton")
    private WebElement privateBrowsingBtn;

    @FindBy(id = "TabTrayController.deleteButton.closeAll")
    private WebElement closeAllTabsBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name='Fennec (andrew)']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement cancelBtn;

    //Actions
    public void clickDeleteTabBtn() {
        deleteTabBtn.click();
    }

    public void clickAddNewTabBtn() {
        addNewTabBtn.click();
    }

    public void clickPrivateBrowsingBtn() {
        privateBrowsingBtn.click();
    }

    public void clickCloseAllTabsBtn() {
        closeAllTabsBtn.click();
    }

    public void clickCancelBtn() {
        cancelBtn.click();
    }

}
