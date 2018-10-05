package com.mozilla.framework.pages;

import com.mozilla.framework.utility.Driver;
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
import java.util.Map;

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

    //Actions

    public void dataManagementClick(){
        DataManagementBtn.click();
    }

    public void removeClick() {
        scrollDownAPageTwo();
        RemoveBtn.click();

    }

    public void scrollDownAPageTwo() {
        /*touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(20, 50))
                .waitAction()
                .moveTo(PointOption.point(40, 300))
                //.waitAction()
                .release()
                .perform();*/

        //Driver.getInstance().getDriver().executeScript("arguments[0].scrollIntoView();", DataManagementBtn);

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
        //OKbtn.click();
    }

    public void backToSettingsBtnClick(){
        BackToSettingsBtn.click();
    }

    public void doneBtnClick(){
        DoneBtn.click();
    }

    @FindBy(xpath = "//*[@label=\"Browsing History\"]")
    private WebElement el;

    public HashMap<String, WebElement> getHashMapDataManagement() {

        hashMap = new HashMap<>();

        hashMap.put("Browsing History", el);
        hashMap.put("Cache", Driver.getInstance().getDriver().findElement(By.xpath("//XCUIElementTypeSwitch[@name=\"Cache\"]")));
        hashMap.put("Cookies", Driver.getInstance().getDriver().findElement(By.xpath("//*[@name=\"Cookies\"]")));
        hashMap.put("Offline Website Data", Driver.getInstance().getDriver().findElement(By.xpath("//*[@name=\"Offline Website Data\"]")));
        hashMap.put("Tracking Protection", Driver.getInstance().getDriver().findElement(By.xpath("//*[@name=\"Tracking Protection\"]")));
        hashMap.put("Downloaded Files", Driver.getInstance().getDriver().findElement(By.xpath("//*[@name=\"Downloaded Files\"]")));

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
