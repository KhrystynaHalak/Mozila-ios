package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy(id = "url")
    //@FindBy(xpath = "//XCUIElementTypeTextField[@name='url']")
    private WebElement URLField;

    @FindBy(id = "HomePanels.TopSites")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.TopSites']")
    private WebElement TopSitesBtn;

    @FindBy(id = "HomePanels.Bookmarks")
    //@FindBy(xpath = "//XCUIElementTypeButton[@name='HomePanels.Bookmarks']")
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

    public void EnterURL(String URL) {
        URLField.sendKeys(URL);
    }

    public void TopSitesBtnClick() {
        TopSitesBtn.click();
    }

    public void FauvoritesBtnClick() {
        FauvoritesBtn.click();
    }

    public void HistoryBtnClick() {
        HistoryBtn.click();
    }

    public void ReadingListBtnClick() {
        ReadingListBtn.click();
    }

    public void DownloadsBtnClick() {
        DownloadsBtn.click();
    }

    public void MoveForwardBtnClick() {
        MoveForwardBtn.click();
    }

    public void TabsBtnClick() {
        TabsBtn.click();
    }

    public void TabToolbarBtnClick() {
        TabToolbarBtn.click();
    }

}
