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

    @FindBy(id = "DisplayThemeOption")
    private WebElement displayBtn;

    @FindBy(id = "TrackingProtection")
    private WebElement trackingProtectionBtn;

    @FindBy(xpath = "//XCUIElementTypeCell[@name='Your Rights']")
    private WebElement yourRightsBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[1]")
    private WebElement signInMoreInfoBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"" + email + "\"]")
    private WebElement userEmailLbl;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[1]")
    private WebElement userEmailBtn;

    @FindBy(xpath = "//XCUIElementTypeTable[@name='AppSettingsTableViewController.tableView']/XCUIElementTypeCell[13]")
    private WebElement toTopBtn;

    @FindBy(id = "FxVersion")
    public WebElement versionTxt;

    @FindBy(id = "ShowTour")
    public WebElement showTourBtn;

    //Actions
    public void doneLeftUpCornerBtnClick() {
        DoneLeftUpCornerBtn.click();
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

    public WebElement getVersionTxt() { return versionTxt; }

    public WebElement getShowTourBtn() { return showTourBtn; }

    public void showTourBtnClick() {
        showTourBtn.click();
    }

    public void ScrollTo(WebElement element) {
        if (!element.isDisplayed()) {
            if (yourRightsBtn.isDisplayed()) {
                toTopBtn.click();
            }
            else touchAction = new TouchAction(Driver.getInstance().getDriver());
            touchAction.longPress(PointOption.point(0, 478)).waitAction().moveTo(PointOption.point(0, 64)).release().perform();


            }
        }
    }


