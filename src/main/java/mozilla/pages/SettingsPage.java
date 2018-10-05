package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SettingsPage extends BasePage {
    private static final String email = "20littlejohnny16@gmail.com";

    private IOSDriver driver = Driver.getInstance().getDriver();
    TouchAction touchAction;
    WebDriverWait wait;

    //Elements

    @FindBy(id = "AppSettingsTableViewController.navigationItem.leftBarButtonItem")
    private WebElement doneLeftUpCornerBtn;

    @FindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeOther")
    private WebElement menuNameHeader;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Search']")
    private WebElement searchBtn;

    @FindBy(id = "NewTab")
    private WebElement newTabBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Homepage']")
    private WebElement homepageBtn;

    @FindBy(id = "OpenWith.Setting")
    private WebElement mailAppBtn;

    @FindBy(id = "DisplayThemeOption")
    private WebElement displayBtn;

    @FindBy(id = "blockPopups")
    private WebElement blockPopUpRdBtn;

    @FindBy(id = "saveLogins")
    private WebElement saveLoginsRfBtn;

    @FindBy(id = "showClipboardBar")
    private WebElement openCopiedLinksRdBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Logins']")
    private WebElement loginBtn;

    @FindBy(id = "TouchIDPasscode")
    private WebElement passcodeForLoginsBtn;

    @FindBy(id = "Data Management")
    private WebElement dataManagmentBtn;

    @FindBy(id = "ClearPrivateData")
    private WebElement clearPrivateDataBtn;

    @FindBy(id = "settings.closePrivateTabs")
    private WebElement closePrivateTabsRdBtn;

    @FindBy(id = "TrackingProtection")
    private WebElement trackingProtectionBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Privacy Policy']")
    private WebElement privacyPolicyBtn;

    @FindBy(id = "ShowTour")
    private WebElement showTourBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Send Feedback']")
    private WebElement sendFeedbackBtn;

    @FindBy(id = "settings.sendUsageData")
    private WebElement sendUsageDataRdBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Help']")
    private WebElement helpBtn;

    @FindBy(id = "FxVersion")
    private WebElement versionTxt;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Licenses']")
    private WebElement licensesBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Your Rights']")
    private WebElement yourRightsBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name='More Info'])[1]")
    private WebElement signInMoreInfoBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='" + email + "']")
    private WebElement userEmailLbl;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name='More Info'])[1]")
    private WebElement userEmailBtn;

    @FindBy(id = "Settings")
    private WebElement returnToSettingsBtn;

    //Accessors
    HashMap<String, WebElement> accessor = new HashMap<String, WebElement>();

    {
        getElements();
    }
    public void getElements() {
        accessor.put("SearchBtn", searchBtn);
        accessor.put("NewTabBtn", newTabBtn);
        accessor.put("HomePageBtn", homepageBtn);
        accessor.put("MailAppBtn", mailAppBtn);
        accessor.put("DisplayBtn", displayBtn);
        accessor.put("BlockPopUpRdBtn",blockPopUpRdBtn);
        accessor.put("SaveLoginsRfBtn", saveLoginsRfBtn);
        accessor.put("OpenCopiedLinksRdBtn", openCopiedLinksRdBtn);
        accessor.put("LoginBtn", loginBtn);
        accessor.put("PasscodeForLoginsBtn", passcodeForLoginsBtn);
        accessor.put("DataManagmentBtn", dataManagmentBtn);
        accessor.put("ClearPrivateDataBtn", clearPrivateDataBtn);
        accessor.put("ClosePrivateTabsRdBtn", closePrivateTabsRdBtn);
        accessor.put("TrackingProtectionBtn", trackingProtectionBtn);
        accessor.put("PrivacyPolicyBtn", privacyPolicyBtn);
        accessor.put("SendFeedbackBtn", sendFeedbackBtn);
        accessor.put("SendUsageDataRdBtn", sendUsageDataRdBtn);
        accessor.put("HelpBtn", helpBtn);
        accessor.put("LicensesBtn", licensesBtn);
        accessor.put("YourRightsBtn", yourRightsBtn);
        accessor.put("DoneLeftUpCornerBtn", doneLeftUpCornerBtn);
        accessor.put("ShowTourBtn", showTourBtn);
        accessor.put("SignInMoreInfoBtn", signInMoreInfoBtn);
        accessor.put("UserEmailLbl", userEmailLbl);
        accessor.put("UserEmailBtn", userEmailBtn);
    }

    // Actions
    public String getMenuNameHeaderText() { return menuNameHeader.getAttribute("name"); }

    public void searchBtnClick() {
        searchBtn.click();
    }

    public void newTabBtnClick() {
        newTabBtn.click();
    }

    public void homepageBtnClick() {
        homepageBtn.click();
    }

    public void mailAppBtnClick() {
        mailAppBtn.click();
    }

    public void displayBtnClick() {
        displayBtn.click();
    }

    public void blockPopUpRdBtnClick() {
        blockPopUpRdBtn.click();
    }

    public void saveLoginsRdBtnClick() {
        saveLoginsRfBtn.click();
    }

    public void openCopiedLinksRdBtnClick() {
        openCopiedLinksRdBtn.click();
    }

    public void loginBtnClick() {
        loginBtn.click();
    }

    public void passcodeForLoginsBtnClick() { passcodeForLoginsBtn.click(); }

    public void dataManagmentBtnClick() { dataManagmentBtn.click(); }

    public void closePrivateTabsRdBtnClick() {
        closePrivateTabsRdBtn.click();
    }

    public void trackingProtectionBtnClick() {
        trackingProtectionBtn.click();
    }

    public void privacyPolicyBtnClick() {
        privacyPolicyBtn.click();
    }

    public void showTourBtnClick() {
        showTourBtn.click();
    }

    public void sendFeedbackBtnClick() {
        sendFeedbackBtn.click();
    }

    public void sendUsageDataRdBtnClick() {
        sendUsageDataRdBtn.click();
    }

    public void helpBtnClick() {
        helpBtn.click();
    }

    public void licensesBtnClick() {
        licensesBtn.click();
    }

    public void yourRightsBtnClick() {
        yourRightsBtn.click();
    }

    public void doneLeftUpCornerBtnClick() {
        doneLeftUpCornerBtn.click();
    }

    public void signInMoreInfoBtnClick() { signInMoreInfoBtn.click(); }

    public void userEmailLblClick() {
        userEmailLbl.click();
    }

    public void userEmailBtnClick() {
        userEmailBtn.click();
    }

    public String getUserEmailLblText() { return userEmailLbl.getText(); }

    public static String getEmail() {
        return email;
    }

    public String getVersionTxt() {
        return versionTxt.getText();
    }

    public void ScrollTo(String button) {
        RemoteWebElement element = (RemoteWebElement)accessor.get(button);
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("element", elementID);
        scrollObject.put("toVisible", "not an empty string");
        driver.executeScript("mobile:scroll", scrollObject);
        }

    public void returnToSettingsBtnClick() {
        returnToSettingsBtn.click();
    }

    public void takeScreenShot(String name) throws IOException {
        Files.write(Paths.get("/Users/khrystyna/Desktop/" + name), ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
    }

}



