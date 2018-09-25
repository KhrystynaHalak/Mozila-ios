package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {
    private static final String email = "20littlejohnny16@gmail.com";

    //Elements
    @FindBy(id = "AppSettingsTableViewController.navigationItem.leftBarButtonItem")
    private WebElement DoneLeftUpCornerBtn;


    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[1]")
    private WebElement signInMoreInfoBtn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\""+email+"\"]")
    private WebElement userEmailLbl;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[1]")
    private WebElement userEmailBtn;

    //Actions
    public void doneLeftUpCornerBtnClick() { DoneLeftUpCornerBtn.click(); }

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
}