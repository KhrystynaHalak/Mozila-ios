package mozilla.pages;

import framework.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{

    //Elements


    @FindBy(id = "url")
    //@FindBy(xpath = "//*[@name='url']")
    //@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Fennec (khrystyna)\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public WebElement URLField;

    @FindBy(xpath = "//*[@name='HomePanels.TopSites']")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.TopSites']")
    private WebElement TopSitesBtn;

    @FindBy(xpath = "//*[@name='HomePanels.BookmarksPage']")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.BookmarksPage']")
    private WebElement FauvoritesBtn;

    //@FindBy(id = "HomePanels.History")
    @FindBy(xpath = "//*[@name='HomePanels.History']")
    private WebElement HistoryBtn;

    @FindBy(xpath = "//*[@name='HomePanels.ReadingList']")
    //@FindBy(xpath = "/*[@name='HomePanels.ReadingList']")
    private WebElement ReadingListBtn;

    @FindBy(xpath = "//*[@name='HomePanels.Downloads']")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.Downloads']")
    private WebElement DownloadsBtn;

    @FindBy(xpath = "//*[@name='TabToolbar.forwardButton']")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='TabToolbar.forwardButton']")
    private WebElement MoveForwardBtn;

    @FindBy(xpath = "//*[@name='TabToolbar.tabsButton']")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='TabToolbar.tabsButton']")
    private WebElement TabsBtn;

    //@FindBy(xpath = "//*[@name='TabToolbar.menuButton]")
    @FindBy(id = "TabToolbar.menuButton")
    private WebElement TabToolbarBtn;

    //Actions

    public void enterURL(String URL) {
        //URLField.click();

        URLField.sendKeys(URL);
    }

    public void topSitesBtnClick() {
        TopSitesBtn.click();
    }

    public void fauvoritesBtnClick() {
        FauvoritesBtn.click();
    }

    public void historyBtnClick() {
        HistoryBtn.click();
    }

    public void readingListBtnClick() {
        ReadingListBtn.click();
    }

    public void downloadsBtnClick() {
        DownloadsBtn.click();
    }

    public void moveForwardBtnClick() {
        MoveForwardBtn.click();
    }

    public void tabsBtnClick() {
        TabsBtn.click();
    }

    public void tabToolbarBtnClick() {
        TabToolbarBtn.click();
    }

}
