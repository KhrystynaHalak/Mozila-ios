package com.mozilla.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShareWithPage extends HomePage {

    //Elements

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"ActivityListView\"]/XCUIElementTypeOther")
    private WebElement page;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Reminders\"]")
    private WebElement remindersBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More\"])[1]")
    private WebElement moreBtn;

    @FindBy(id = "Copy")
    private WebElement copyBtn;

    @FindBy(id = "Print")
    private WebElement printBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Create PDF\"]")
    private WebElement createBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More\"])[2]")
    private WebElement moreBtn2;

    @FindBy(id = "Cancel")
    private WebElement closeBtn;

    //Actions

    public WebElement getPage() {
        return page;
    }

    public WebElement getRemindersBtn() {
        return remindersBtn;
    }

    public WebElement getMoreBtn() {
        return moreBtn;
    }

    public WebElement getCopyBtn() {
        return copyBtn;
    }

    public WebElement getPrintBtn() {
        return printBtn;
    }

    public WebElement getCreateBtn() {
        return createBtn;
    }

    public WebElement getMoreBtn2() {
        return moreBtn2;
    }

    public WebElement getCloseBtn() {
        return closeBtn;
    }
}
