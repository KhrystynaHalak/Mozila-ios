package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOtherPages extends HomePage {

    //Elements
    @FindBy(xpath = "//*[@name='Go']")
    private WebElement KeyBoardGoBtn;

    @FindBy(id = "TabLocationView.pageOptionsButton")
    private WebElement threeDotsBtn;

    @FindBy(id = "action_share")
    private WebElement ShareActionBtn;

    @FindBy(id = "menu-Bookmark")
    private WebElement BookmarkThisPageBtn;

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

    @FindBy(id = "ProtonMenu.close")
    private WebElement CloseBtn;

    @FindBy(xpath = "//*[@name=\"TabLocationView.readerModeButton\"]")
    private WebElement BookingListBtn;

    @FindBy(id = "ReaderModeBarView.listStatusButton")
    private WebElement AddToBookingListBtn;


    //Actions
    public void keyBoardGoBtnClick() {
        KeyBoardGoBtn.click();
    }

    public void threeDotsBtnClick() {
        threeDotsBtn.click();
    }

    public void sharePageWithBtnClick() {
        ShareActionBtn.click();
    }

    public void bookmarkThisPageBtnClick() {
        BookmarkThisPageBtn.click();
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

    public void markAsBookingListItem() {BookingListBtn.click();}

    public void addToBookingListClick() {AddToBookingListBtn.click();}

}
