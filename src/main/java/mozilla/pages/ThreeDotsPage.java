package mozilla.pages;

import lombok.Getter;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ThreeDotsPage extends BasePage {

    //Elements

    @FindBy(id = "action_share")
    private WebElement shareActionBtn;

    @FindBy(id = "menu-Bookmark")
    private WebElement bookmarkThisPageBtn;

    @FindBy(id = "menu-Bookmark-Remove")
    private WebElement unBookmarkPageBtn;

    @FindBy(id = "menu-Send-to-Device")
    private WebElement sendToDeviceBtn;

    @FindBy(id = "menu-Copy-Link")
    private WebElement copyAdressBtn;

    @FindBy(id = "menu-FindInPage")
    private WebElement findInPageBtn;

    @FindBy(id = "menu-RequestDesktopSite")
    private WebElement requestDesktopSiteBtn;

    @FindBy(id = "action_pin")
    private WebElement pinToTopSitesBtn;

    @FindBy(id = "action_unpin")
    private WebElement unPinTopSitesBtn;

    @FindBy(id = "PhotonMenu.close")
    private WebElement closeBtn;


    //Actions

    public void clickSharePageWithBtn() {
        shareActionBtn.click();
    }

    public void clickBookmarkThisPageBtn() {
        try {
            bookmarkThisPageBtn.click();
        }
        catch (NoSuchElementException e) { clickCloseBtn();}
    }

    public void clickUnBookmarkPageBtn() {
        if (unBookmarkPageBtn.isDisplayed()) {
            unBookmarkPageBtn.click();
        } else clickCloseBtn();
    }

    public void clickSendToDeviceBtn() {
        sendToDeviceBtn.click();
    }

    public void clickCopyAdressBtn() {
        copyAdressBtn.click();
    }

    public void clickFindInPageBtn() {
        findInPageBtn.click();
    }

    public void clickRequestDesktopSiteBtn() {
        requestDesktopSiteBtn.click();
    }

    public void clickPinToTopSitesBtn() {

        try {
            pinToTopSitesBtn.click();
        }
        catch (NoSuchElementException e) { clickCloseBtn();}
    }

    public void clickUnPinTopSitesBtn() {

        try {
            unPinTopSitesBtn.click();
        }
        catch (NoSuchElementException e) { clickCloseBtn();}
    }

    public void clickCloseBtn() {
        closeBtn.click();
    }
}
