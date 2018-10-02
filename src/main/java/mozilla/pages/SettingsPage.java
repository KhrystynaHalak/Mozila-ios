package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {
    private static final String email = "20littlejohnny16@gmail.com";

    private IOSDriver driver = Driver.getInstance().getDriver();
    TouchAction touchAction;

    //Elements
    @FindBy(id = "AppSettingsTableViewController.navigationItem.leftBarButtonItem")
    private WebElement DoneLeftUpCornerBtn;

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

    @FindBy(xpath = "//XCUIElementTypeTable[@name='AppSettingsTableViewController.tableView']/XCUIElementTypeCell[13]")
    private WebElement toTopBtn;

    @FindBy(id = "Settings")
    private WebElement returnToSettingsBtn;


    //Accessors

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getNewTabBtn() {
        return newTabBtn;
    }

    public WebElement getHomepageBtn() {
        return homepageBtn;
    }

    public WebElement getMailAppBtn() {
        return mailAppBtn;
    }

    public WebElement getDisplayBtn() {
        return displayBtn;
    }

    public WebElement getBlockPopUpRdBtn() {
        return blockPopUpRdBtn;
    }

    public WebElement getSaveLoginsRfBtn() {
        return saveLoginsRfBtn;
    }

    public WebElement getOpenCopiedLinksRdBtn() {
        return openCopiedLinksRdBtn;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getPasscodeForLoginsBtn() {
        return passcodeForLoginsBtn;
    }

    public WebElement getClearPrivateDataBtn() {
        return clearPrivateDataBtn;
    }

    public WebElement getClosePrivateTabsRdBtn() {
        return closePrivateTabsRdBtn;
    }

    public WebElement getTrackingProtectionBtn() {
        return trackingProtectionBtn;
    }

    public WebElement getPrivacyPolicyBtn() {
        return privacyPolicyBtn;
    }

    public WebElement getSendFeedbackBtn() {
        return sendFeedbackBtn;
    }

    public WebElement getSendUsageDataRdBtn() {
        return sendUsageDataRdBtn;
    }

    public WebElement getHelpBtn() {
        return helpBtn;
    }

    public WebElement getLicensesBtn() {
        return licensesBtn;
    }

    public WebElement getYourRightsBtn() {
        return yourRightsBtn;
    }

    public WebElement getToTopBtn() {
        return toTopBtn;
    }


    public static String getEmail() {
        return email;
    }

    public WebElement getDoneLeftUpCornerBtn() {
        return DoneLeftUpCornerBtn;
    }

    public WebElement getSignInMoreInfoBtn() {
        return signInMoreInfoBtn;
    }

    public WebElement getUserEmailLbl() {
        return userEmailLbl;
    }

    public WebElement getUserEmailBtn() {
        return userEmailBtn;
    }

    public WebElement getVersionTxt() {
        return versionTxt;
    }

    public WebElement getShowTourBtn() {
        return showTourBtn;
    }


    // Actions

    public void doneLeftUpCornerBtnClick() {
        DoneLeftUpCornerBtn.click();
    }

    public void showTourBtnClick() {
        showTourBtn.click();
    }

    public void ScrollTo(WebElement element) {

        toTopBtn.click();
        do {
            touchAction = new TouchAction(Driver.getInstance().getDriver());
            touchAction.longPress(PointOption.point(0, 478)).waitAction().moveTo(PointOption.point(0, 350)).release().perform();
        } while (!element.isDisplayed());
    }

    public void returnToSettingsBtnClick() {
        returnToSettingsBtn.click();
    }
}
