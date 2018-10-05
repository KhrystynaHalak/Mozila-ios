package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HistoryPage extends BasePage {

    TouchAction touchAction;

    //Elements


    @FindBy(xpath = "//*[@name='HistoryPanel.recentlyClosedCell']")
    public WebElement recentlyClosedLabel;

    private List<WebElement> historyList;

    @FindBy(xpath = "//*[@name=\"HistoryPanel.recentlyClosedCell\"]")
    public WebElement RecentlyClosedLabel;


    @FindBy(xpath = "//*[@name='HistoryPanel.syncedDevicesCell']")
    public WebElement syncedDevicesLabel;


    @FindBy(xpath = "//*[@name='History List']/XCUIElementTypeCell")
    public List<WebElement> ItemInHistoryList;

    @FindBy(xpath = "(//*[@name='Delete'])[1]")
    public WebElement deleteBtn;

    @FindBy(xpath = "(//*[@name=\"Delete\"])[1]")
    public WebElement deleteBBtn;


    //Actions

    public String getRecentlyClosedText() {
        return recentlyClosedLabel.getText();
    }

    public String getSyncedDeviceText() {
        return syncedDevicesLabel.getText();
    }

    public List<WebElement> ItemInHistoryList() {
        historyList = new ArrayList<>();
        try {
            for (int i = 3; ; i++) {
                int n = i;
                historyList.add(Driver.getInstance().getDriver().findElementByXPath("(//*[@name=\"History List\"]/XCUIElementTypeCell)[" + n + "]"));
            }
        }
        catch (Exception e){
            System.out.println("The list is not being filled in anymore");
        }
        return historyList;

    }
    public void removeHistoryItem() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(61, 242)).waitAction().moveTo(PointOption.point(25, 243)).release().perform();


        deleteBtn.click();

    }
}
