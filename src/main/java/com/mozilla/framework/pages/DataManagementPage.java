package com.mozilla.framework.pages;

import com.mozilla.framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataManagementPage extends BasePage {

    TouchAction touchAction;
    Alert alert;
    //Elements

    //@FindBy(id = "Data Management")
    @FindBy(id = "ClearPrivateData")
    private WebElement DataManagementBtn;

    //@FindBy (xpath = "(//*[@name=\"Clear Private Data\"])[2]")
    //@FindBy(id = "ClearPrivateData")
    @FindBy(xpath = "//*[@name=\"ClearPrivateData\"]/XCUIElementTypeStaticText[1]")
    private WebElement RemoveBtn;

    @FindBy(id = "OK")
    private WebElement OKbtn;

    @FindBy(id = "Settings")
    private WebElement BackToSettingsBtn;

    @FindBy(id = "AppSettingsTableViewController.navigationItem.leftBarButtonItem")
    private WebElement DoneBtn;

    //Actions

    public void dataManagementClick(){
        scrollDownAPageOne();
        DataManagementBtn.click();
    }

    public void removeClick() {
        scrollDownAPageTwo();
        RemoveBtn.click();
    }

    public void scrollDownAPageOne() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(20, 50))
                .waitAction()
                .moveTo(PointOption.point(40, 486))
                //.waitAction()
                .release()
                .perform();

        //Driver.getInstance().getDriver().executeScript("arguments[0].scrollIntoView();", DataManagementBtn);

    }

    public void scrollDownAPageTwo() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(20, 50))
                .waitAction()
                .moveTo(PointOption.point(40, 300))
                //.waitAction()
                .release()
                .perform();

        //Driver.getInstance().getDriver().executeScript("arguments[0].scrollIntoView();", DataManagementBtn);

    }

    public void clickOk() {
        alert = Driver.getInstance().getDriver().switchTo().alert();
        alert.accept();
        //OKbtn.click();
    }

    public void backToSettingsBtnClick(){
        BackToSettingsBtn.click();
    }

    public void doneBtnClick(){
        DoneBtn.click();
    }

    public void refresh() {
        Driver.getInstance().getDriver().navigate().refresh();
    }
}
