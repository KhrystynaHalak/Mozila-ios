package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    //Elements

    @FindBy(id = "url")
    //@FindBy(xpath = "//XCUIElementTypeTextField[@name='url']")
    private WebElement URLField;

    @FindBy(id = "HomePanels.TopSites")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.TopSites']")
    private WebElement TopSitesBtn;

    @FindBy(id = "HomePanels.BookmarksPage")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.BookmarksPage']")
    private WebElement FauvoritesBtn;

    @FindBy(id = "HomePanels.History")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.History']")
    private WebElement HistoryBtn;

    @FindBy(id = "HomePanels.ReadingList")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.ReadingList']")
    private WebElement ReadingListBtn;

    @FindBy(id = "HomePanels.Downloads")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.Downloads']")
    private WebElement DownloadsBtn;

    @FindBy(id = "TabToolbar.forwardButton")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='TabToolbar.forwardButton']")
    private WebElement MoveForwardBtn;

    @FindBy(id = "TabToolbar.tabsButton")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='TabToolbar.tabsButton']")
    private WebElement TabsBtn;

    @FindBy(id = "TabToolbar.menuButton")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='TabToolbar.menuButton]")
    private WebElement TabToolbarBtn;

    //Actions

    public void enterURL(String URL) {
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
