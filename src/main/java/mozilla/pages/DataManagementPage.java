package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.core.util.KeyValuePair;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static framework.utility.Driver.*;

public class DataManagementPage extends BasePage {

    private IOSDriver driver = Driver.getInstance().getDriver();

    TouchAction touchAction;
    Alert alert;
    HashMap<String, WebElement> hashMap;
    //Elements


    //@FindBy(id = "Data Management")
    @FindBy(id = "Data Management")
    private WebElement DataManagementBtn;

    //@FindBy (xpath = "(//*[@name=\"Clear Private Data\"])[2]")
    @FindBy(id = "ClearPrivateData")
    //@FindBy(xpath = "//*[@name=\"ClearPrivateData\"]/XCUIElementTypeStaticText[1]")
    private WebElement RemoveBtn;

    @FindBy(id = "OK")
    private WebElement OKbtn;

    @FindBy(id = "Settings")
    private WebElement BackToSettingsBtn;

    @FindBy(id = "AppSettingsTableViewController.navigationItem.leftBarButtonItem")
    private WebElement DoneBtn;

    @FindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeSwitch")
    private List<WebElement> SwitchBtns;

    //Actions

    public void dataManagementClick(){
        DataManagementBtn.click();
    }

    public void removeClick() {
        scrollDownAPageTwo();
        RemoveBtn.click();

    }

    public void scrollDownAPageTwo() {

        RemoteWebElement element = (RemoteWebElement)RemoveBtn;
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("element", elementID);
        scrollObject.put("toVisible", "not an empty string");
        driver.executeScript("mobile:scroll", scrollObject);

    }

    public void clickOk() {
        alert = Driver.getInstance().getDriver().switchTo().alert();
        alert.accept();
    }

    public void backToSettingsBtnClick(){
        BackToSettingsBtn.click();
    }

    public void doneBtnClick(){
        DoneBtn.click();
    }

    public HashMap<String, WebElement> getHashMapDataManagement() {

        hashMap = new HashMap<>();

        hashMap.put("Browsing History", SwitchBtns.get(0));
        hashMap.put("Cache", SwitchBtns.get(1));
        hashMap.put("Cookies", SwitchBtns.get(2));
        hashMap.put("Offline Website Data", SwitchBtns.get(3));
        hashMap.put("Tracking Protection", SwitchBtns.get(4));
        hashMap.put("Downloaded Files", SwitchBtns.get(5));


        return hashMap;
    }

    public void selectAllRadioBtns() {

        getHashMapDataManagement();

        if(hashMap.get("Browsing History").getAttribute("value").equals("0")) {
            hashMap.get("Browsing History").click();
        }

        if (hashMap.get("Cache").getAttribute("value").equals("0")) {
            hashMap.get("Cache").click();
        }

        if (hashMap.get("Cookies").getAttribute("value").equals("0")) {
            hashMap.get("Cookies").click();
        }

        if (hashMap.get("Offline Website Data").getAttribute("value").equals("0")) {
            hashMap.get("Offline Website Data").click();
        }

        if (hashMap.get("Tracking Protection").getAttribute("value").equals("0")) {
            hashMap.get("Tracking Protection").click();
        }

        if (hashMap.get("Downloaded Files").getAttribute("value").equals("0")) {
            hashMap.get("Downloaded Files").click();
        }

    }

    public boolean checkIfAllEnabled(){
        boolean areAllEnabled = false;

        for(Map.Entry<String, WebElement> entry : hashMap.entrySet()){
            if(entry.getValue().getAttribute("value").equals("1")) {
                areAllEnabled = true;
            }
        }
        return areAllEnabled;
    }

}
