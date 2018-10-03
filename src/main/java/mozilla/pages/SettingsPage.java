package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    //Elements
    @FindBy(id = "AppSettingsTableViewController.navigationItem.leftBarButtonItem")
    private WebElement doneLeftUpCornerBtn;

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
        accessor.put("ClearPrivateDataBtn", clearPrivateDataBtn);
        accessor.put("ClosePrivateTabsRdBtn", closePrivateTabsRdBtn);
        accessor.put("TrackingProtectionBtn", trackingProtectionBtn);
        accessor.put("PrivacyPolicyBtn", privacyPolicyBtn);
        accessor.put("SendFeedbackBtn", sendFeedbackBtn);
        accessor.put("SendUsageDataRdBtn", sendUsageDataRdBtn);
        accessor.put("HelpBtn", helpBtn);
        accessor.put("LicensesBtn", licensesBtn);
        accessor.put("YourRightsBtn", yourRightsBtn);
        accessor.put("ToTopBtn", toTopBtn);
        accessor.put("DoneLeftUpCornerBtn", doneLeftUpCornerBtn);
        accessor.put("ShowTourBtn", showTourBtn);
        accessor.put("SignInMoreInfoBtn", signInMoreInfoBtn);
        accessor.put("UserEmailLbl", userEmailLbl);
        accessor.put("UserEmailBtn", userEmailBtn);
    }

    // Actions

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
    public void passcodeForLoginsBtnClick() {
        passcodeForLoginsBtn.click();
    }
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
    public void toTopBtnClick() {
         toTopBtn.click();
    }
    public void doneLeftUpCornerBtnClick() {
        doneLeftUpCornerBtn.click();
    }
    public void signInMoreInfoBtnClick() {
        signInMoreInfoBtn.click();
    }
    public void userEmailLblClick() {
        userEmailLbl.click();
    }
    public void userEmailBtnClick() {
        userEmailBtn.click();
    }

    public String getUserEmailLblText() {
        return userEmailLbl.getText();
    }

    public static String getEmail() {
        return email;
    }

    public String getVersionTxt() {
        return versionTxt.getText();
    }

    public void ScrollTo(String element) {
        toTopBtnClick();

            do {
                touchAction = new TouchAction(Driver.getInstance().getDriver());
                touchAction.longPress(PointOption.point(0, 478)).waitAction().moveTo(PointOption.point(0, 350)).release().perform();
            /*if (yourRightsBtn.isDisplayed() && (!accessor.get(element).isDisplayed())) {
                toTopBtnClick();
            }*/
            } while (!accessor.get(element).isDisplayed());
        }


    public void returnToSettingsBtnClick() {
        if (returnToSettingsBtn.isDisplayed()) {
            returnToSettingsBtn.click();
        }
        else returnToSettingsBtnClick();
    }

    public void takeScreenShot(String name) throws IOException {
        Files.write(Paths.get("/Users/andrew/Desktop/" + name), ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
    }

}



    /*public WebElement getDoneLeftUpCornerBtn() {
        return doneLeftUpCornerBtn;
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


    public WebElement getShowTourBtn() {
        return showTourBtn;
    }

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
    }*/