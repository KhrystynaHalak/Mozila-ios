package com.mozilla.framework.pages;

import com.mozilla.framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HistoryPage extends BasePage {

    TouchAction touchAction;

    //Elements

    @FindBy(xpath = "//*[@name='HistoryPanel.recentlyClosedCell']")
    public WebElement recentlyClosedLabel;

    @FindBy(xpath = "//*[@name='HistoryPanel.syncedDevicesCell']")
    public WebElement syncedDevicesLabel;

    @FindBy(xpath = "//*[@name='History List']/XCUIElementTypeCell")
    public List<WebElement> ItemInHistoryList;

    @FindBy(xpath = "(//*[@name='Delete'])[1]")
    public WebElement deleteBtn;

    //Actions

    public String getRecentlyClosedText() {
        return recentlyClosedLabel.getText();
    }

    public String getSyncedDeviceText() {
        return syncedDevicesLabel.getText();
    }

    public void removeHistoryItem() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        //touchAction.press(ItemInHistoryList.get(0)).moveTo(357, 205).perform();
        //touchAction.press(0, 336).waitAction(1).moveTo(357, 205).release().perform();
        //touchAction.press(PointOption.point(61, 242)).waitAction().moveTo(PointOption.point(16, 243)).release().perform();
        touchAction.longPress(PointOption.point(61, 242)).waitAction().moveTo(PointOption.point(25, 243)).release().perform();

        deleteBtn.click();


    }
}
