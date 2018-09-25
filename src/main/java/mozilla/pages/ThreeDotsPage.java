package mozilla.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThreeDotsPage extends BasePage {

    //Elements

    @FindBy(id = "action_share")
    private WebElement ShareActionBtn;

    @FindBy(id = "menu-Bookmark")
    private WebElement BookmarkThisPageBtn;

    @FindBy(id = "menu-Bookmark-Remove")
    private WebElement UnBookmarkPageBtn;

    @FindBy(id = "menu-Send-to-Device")
    private WebElement SendToDeviceBtn;

    @FindBy(id = "menu-Copy-Link")
    private WebElement CopyAdressBtn;

    @FindBy(id = "menu-FindInPage")
    private WebElement FindInPageBtn;

    @FindBy(id = "menu-RequestDesktopSite")
    private WebElement RequestDesktopSiteBtn;

    @FindBy(id = "action_pln")
    private WebElement PinToTopSitesBtn;

    @FindBy(id = "PhotonMenu.close")
    private WebElement CloseBtn;


    //Actions

    public void sharePageWithBtnClick() {
        ShareActionBtn.click();
    }

    public void bookmarkThisPageBtnClick() {
        try {
            BookmarkThisPageBtn.click();
        }
        catch (NoSuchElementException e) { closeBtnClick();}
    }

    public void unBookmarkPageBtnClick() {
        if (UnBookmarkPageBtn.isDisplayed()) {
            UnBookmarkPageBtn.click();
        } else closeBtnClick();
    }

    public void sendToDeviceBtnClick() {
        SendToDeviceBtn.click();
    }

    public void copyAdressBtnClick() {
        CopyAdressBtn.click();
    }

    public void findInPageBtnClick() {
        FindInPageBtn.click();
    }

    public void requestDesktopSiteBtnClick() {
        RequestDesktopSiteBtn.click();
    }

    public void pinToTopSitesBtnClick() {
        PinToTopSitesBtn.click();
    }

    public void closeBtnClick() {
        CloseBtn.click();
    }
}
