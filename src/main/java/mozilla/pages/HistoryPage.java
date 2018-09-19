package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HistoryPage extends BasePage{

    TouchAction touchAction;

    //Elements

    @FindBy(xpath = "//*[@name=\"HistoryPanel.recentlyClosedCell\"]")
    public WebElement RecentlyClosedLabel;

    @FindBy(xpath = "//*[@name=\"HistoryPanel.syncedDevicesCell\"]")
    public WebElement SyncedDevicesLabel;

    @FindBy(tagName = "XCUIElementTypeCell")
    public List<WebElement> ItemInHistoryList;

    //Actions

    public String recentlyClosedText(){
        return RecentlyClosedLabel.getText();
    }

    public String synedDeviceText(){
        return SyncedDevicesLabel.getText();
    }

    public void removeHistoryItem() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        //touchAction.press(ItemInHistoryList.get(0)).moveTo(357, 205).perform();
    }



}
