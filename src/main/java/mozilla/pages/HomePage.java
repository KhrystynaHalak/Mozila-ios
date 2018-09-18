package mozilla.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // Init Page
    public HomePage(IOSDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Elements

    //@FindBy(id = "url")
    @FindBy(xpath = "//*[@name='url']")
    private WebElement URLField;

    //@FindBy(id = "HomePanels.TopSites")
    @FindBy(xpath = "//*[@name='HomePanels.TopSites']")
    private WebElement TopSitesBtn;

    //@FindBy(id = "HomePanels.BookmarksPage")
    @FindBy(xpath = "//*[@name='HomePanels.BookmarksPage']")
    private WebElement FauvoritesBtn;

    //@FindBy(id = "HomePanels.History")
    @FindBy(xpath = "//*[@name='HomePanels.History']")
    private WebElement HistoryBtn;

    //@FindBy(id = "HomePanels.ReadingList")
    @FindBy(xpath = "//*[@name='HomePanels.ReadingList']")
    private WebElement ReadingListBtn;

    //@FindBy(id = "HomePanels.Downloads")
    @FindBy(xpath = "//*[@name='HomePanels.Downloads']")
    private WebElement DownloadsBtn;

    //@FindBy(id = "TabToolbar.forwardButton")
    @FindBy(xpath = "//*[@name='TabToolbar.forwardButton']")
    private WebElement MoveForwardBtn;

    //@FindBy(id = "TabToolbar.tabsButton")
    @FindBy(xpath = "//*[@name='TabToolbar.tabsButton']")
    private WebElement TabsBtn;

    //@FindBy(id = "TabToolbar.menuButton")
    @FindBy(xpath = "//*[@name='TabToolbar.menuButton]")
    private WebElement TabToolbarBtn;

    //Actions

    public void clickOnURL() {URLField.click();}

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
